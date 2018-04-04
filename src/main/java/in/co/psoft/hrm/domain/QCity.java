package in.co.psoft.hrm.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;
import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QCity is a Querydsl query type for City
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCity extends EntityPathBase<City> {

    private static final long serialVersionUID = -2105416075L;

    public static final QCity city = new QCity("city");

    public final StringPath country = createString("country");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath map = createString("map");

    public final StringPath name = createString("name");

    public final StringPath state = createString("state");

    public QCity(String variable) {
        super(City.class, forVariable(variable));
    }

    public QCity(Path<? extends City> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCity(PathMetadata<?> metadata) {
        super(City.class, metadata);
    }

}

