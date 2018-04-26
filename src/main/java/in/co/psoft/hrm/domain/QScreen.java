package in.co.psoft.hrm.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;
import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QScreen is a Querydsl query type for Screen
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QScreen extends EntityPathBase<Screen> {

    private static final long serialVersionUID = -2105416075L;

    public static final QScreen screen = new QScreen("screen");

    public final StringPath name = createString("name");
    
    public final NumberPath<Long> id = createNumber("id", Long.class);

  
    public final NumberPath<Integer> organizationId = createNumber("organizationId", Integer.class);
    
    public final StringPath createdAt = createString("createdAt");
    
   public QScreen(String variable) {
        super(Screen.class, forVariable(variable));
    }

    public QScreen(Path<? extends Screen> path) {
    	        super(path.getType(), path.getMetadata());
    }

    public QScreen(PathMetadata<?> metadata) {
        super(Screen.class, metadata);
    }

}

