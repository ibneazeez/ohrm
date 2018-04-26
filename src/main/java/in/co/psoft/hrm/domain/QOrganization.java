package in.co.psoft.hrm.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;
import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QOrganization is a Querydsl query type for Organization
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOrganization extends EntityPathBase<Organization> {

    private static final long serialVersionUID = -2105416075L;

    public static final QOrganization organization = new QOrganization("organization");

    public final StringPath firstName = createString("firstName");
    
    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastName = createString("lastName");
    
   public final StringPath country = createString("country");
    
    public final StringPath userRole = createString("userRole");

    public final StringPath userName = createString("userName");
    
    public final StringPath password = createString("password");
    
    public final StringPath status = createString("status");
    
    public final NumberPath<Integer> organizationId = createNumber("organizationId", Integer.class);
    
    public final StringPath employeeId = createString("employeeId");
    
    public final StringPath employeePhoto = createString("employeePhoto");
    
    public final StringPath gender = createString("gender");
    
    public final StringPath maritalStatus = createString("maritalStatus");
    
    public final StringPath dob = createString("dob");
    
    public final StringPath createdAt = createString("createdAt");
    
   public QOrganization(String variable) {
        super(Organization.class, forVariable(variable));
    }

    public QOrganization(Path<? extends Organization> path) {
    	        super(path.getType(), path.getMetadata());
    }

    public QOrganization(PathMetadata<?> metadata) {
        super(Organization.class, metadata);
    }

}

