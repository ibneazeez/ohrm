package in.co.psoft.hrm.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;
import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = -2105416075L;

    public static final QUser user = new QUser("user");

    public final StringPath firstName = createString("firstName");
    
    public final StringPath middleName = createString("middleName");

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
    
    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
    	        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata<?> metadata) {
        super(User.class, metadata);
    }

}

