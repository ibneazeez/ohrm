package in.co.psoft.hrm.appname.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import in.co.psoft.hrm.bone.spring.AntPathMatcherUtils;
import in.co.psoft.hrm.bone.spring.RequestScopedComponent;
import in.co.psoft.hrm.bone.spring.RequestUtils;

@RequestScopedComponent("navbarBean")
public class NavbarBean {
    
    @Autowired
    private HttpServletRequest request;
    
    private String requestPath; 
    
    private String activeMenuItem;
    
    public String getActiveMenuItem() {
        if (activeMenuItem == null) {
            activeMenuItem = resolveActiveMenuItem();
        }
        
        return activeMenuItem;
    }

    private String resolveActiveMenuItem() {
        if (pathMatches("/;/index.*")) {
            return "home";
        } else if (pathMatches("/cities/**")) {
            return "cities";
        }
        
        return "unknown";
    }
    
    private boolean pathMatches(String pathPattern) {
        if (requestPath == null) {
            requestPath = RequestUtils.getOriginatingRequestPath(request);
        }
        
        return AntPathMatcherUtils.matches(pathPattern, requestPath);
    }
    
}
