package in.co.psoft.hrm.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;
import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QUserPermissions is a Querydsl query type for UserPermissions
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUserPermissions extends EntityPathBase<UserPermissions> {

    private static final long serialVersionUID = -2105416075L;

    public static final QUserPermissions userPermissions = new QUserPermissions("userPermissions");

    public final NumberPath<Long> id = createNumber("id", Long.class);
    public final NumberPath<Long> organizationId = createNumber("organizationId", Long.class);
    public final NumberPath<Long> roleId = createNumber("roleId", Long.class);

    public final StringPath canRead = createString("canRead");
    
    public final StringPath canWrite = createString("canWrite");
    
    public final StringPath canDelete = createString("canDelete");

    public final StringPath createdAt = createString("createdAt");
    
   public QUserPermissions(String variable) {
        super(UserPermissions.class, forVariable(variable));
    }

    public QUserPermissions(Path<? extends UserPermissions> path) {
    	        super(path.getType(), path.getMetadata());
    }

    public QUserPermissions(PathMetadata<?> metadata) {
        super(UserPermissions.class, metadata);
    }

}

