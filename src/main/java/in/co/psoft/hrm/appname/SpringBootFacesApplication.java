package in.co.psoft.hrm.appname;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.faces.application.ProjectStage;
import javax.faces.application.ViewHandler;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;

import org.apache.catalina.Context;
import org.ocpsoft.rewrite.annotation.config.AnnotationConfigProvider;
import org.primefaces.util.Constants;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.ServletContextInitializer;
import org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.context.web.NonEmbeddedServletContainerFactory;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sun.faces.config.FacesInitializer;

import in.co.psoft.hrm.bone.jsf.FacesViewScope;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class SpringBootFacesApplication extends SpringBootServletInitializer {
    
    public static void main(String[] args) throws Exception {
        SpringApplicationBuilder application = new SpringApplicationBuilder(SpringBootFacesApplication.class);
        customize(application);
        application.run(args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        application.sources(SpringBootFacesApplication.class);
        customize(application);
        return application;
    }
    
    private static void customize(SpringApplicationBuilder application) {
        application.showBanner(false);
    }
    
	@Bean
	public static CustomScopeConfigurer customScopeConfigurer() {
		CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.setScopes(Collections.<String, Object>singletonMap(
                FacesViewScope.NAME, new FacesViewScope()));
		return configurer;
	}
	
	@Bean
	public ServletContextInitializer servletContextCustomizer() {
	    return new ServletContextInitializer() {
            @Override
            public void onStartup(ServletContext sc) throws ServletException {
                // OCPsoft Rewrite
                // We do not scan packages (as it doesn't work on embedded Tomcat)
                // See RewriteConfigurationProvider.class on how the rules are obtained
                sc.setInitParameter(AnnotationConfigProvider.CONFIG_BASE_PACKAGES, "none");
                
                
                // Mojarra JSF
                // TODO: set correct stage
                sc.setInitParameter(ProjectStage.PROJECT_STAGE_PARAM_NAME, ProjectStage.Development.name());
                // constant found from WebConfiguration.BooleanWebContextInitParameter.FaceletsSkipComments 
                sc.setInitParameter(ViewHandler.FACELETS_SKIP_COMMENTS_PARAM_NAME, "true");
                // disables *.xhtml mapping for we will use it to pipe the Faces requests through MVC
                sc.setInitParameter("javax.faces.DISABLE_FACESSERVLET_TO_XHTML", "true");
                
                // PrimeFaces
                sc.setInitParameter(Constants.ContextParams.THEME, "bootstrap");
                sc.setInitParameter(Constants.ContextParams.FONT_AWESOME, "true");
            }
	    };
	}
    
	/**
	 * This bean is only needed when running with embedded Tomcat.
	 */
    @Bean
    @ConditionalOnMissingBean(NonEmbeddedServletContainerFactory.class)
    @ConditionalOnWebApplication
    public EmbeddedServletContainerFactory embeddedServletContainerFactory() {
        TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
        
        tomcat.addContextCustomizers(new TomcatContextCustomizer() {
            @Override
            public void customize(Context context) {
                // register Rewrite
                context.addServletContainerInitializer(new RewriteInitializer(),
                        getServletContainerInitializerHandlesTypes(RewriteInitializer.class));
                
                // register FacesInitializer
                context.addServletContainerInitializer(new FacesInitializer(),
                        getServletContainerInitializerHandlesTypes(FacesInitializer.class));
                
                // register additional mime-types that Spring Boot doesn't register
                context.addMimeMapping("eot", "application/vnd.ms-fontobject");
                context.addMimeMapping("ttf", "application/x-font-ttf");
                context.addMimeMapping("woff", "application/x-font-woff");
            }
        });
        
        return tomcat;
    }
    
    /*
    private void addSciBeforeAll(Context context, ServletContainerInitializer sci, Set<Class<?>> classes) {
        Field field = ReflectionUtils.findField(context.getClass(), "initializers");
        field.setAccessible(true);
        try {
            @SuppressWarnings({ "rawtypes", "unchecked" })
            Map<ServletContainerInitializer, Set<Class<?>>> mapOrig = (LinkedHashMap) field.get(context);
            Map<ServletContainerInitializer, Set<Class<?>>> mapUpdated = new LinkedHashMap<>();
            mapUpdated.put(sci, classes);
            mapUpdated.putAll(mapOrig);
            field.set(context, mapUpdated);
        } catch (IllegalAccessException e) {
            throw Throwables.propagate(e);
        }
    }
    */
    
    @SuppressWarnings("rawtypes")
    private Set<Class<?>> getServletContainerInitializerHandlesTypes(Class<? extends ServletContainerInitializer> sciClass) {
        HandlesTypes annotation = sciClass.getAnnotation(HandlesTypes.class);
        if (annotation == null) {
            return Collections.emptySet();
        }
        
        Class[] classesArray = annotation.value();
        Set<Class<?>> classesSet = new HashSet<Class<?>>(classesArray.length);
        for (Class clazz: classesArray) {
            classesSet.add(clazz);
        }
        
        return classesSet;
    }
	
}
