package io.camp.review.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReview is a Querydsl query type for Review
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReview extends EntityPathBase<Review> {

    private static final long serialVersionUID = -707807858L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReview review = new QReview("review");

    public final io.camp.audit.QBaseEntity _super = new io.camp.audit.QBaseEntity(this);

    public final io.camp.campsite.model.entity.QCampsite campsite;

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<io.camp.image.model.Image, io.camp.image.model.QImage> images = this.<io.camp.image.model.Image, io.camp.image.model.QImage>createList("images", io.camp.image.model.Image.class, io.camp.image.model.QImage.class, PathInits.DIRECT2);

    public final BooleanPath isDeleted = createBoolean("isDeleted");

    public final ListPath<io.camp.like.model.Like, io.camp.like.model.QLike> likes = this.<io.camp.like.model.Like, io.camp.like.model.QLike>createList("likes", io.camp.like.model.Like.class, io.camp.like.model.QLike.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedAt = _super.modifiedAt;

    public final io.camp.user.model.QUser user;

    public QReview(String variable) {
        this(Review.class, forVariable(variable), INITS);
    }

    public QReview(Path<? extends Review> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReview(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReview(PathMetadata metadata, PathInits inits) {
        this(Review.class, metadata, inits);
    }

    public QReview(Class<? extends Review> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.campsite = inits.isInitialized("campsite") ? new io.camp.campsite.model.entity.QCampsite(forProperty("campsite")) : null;
        this.user = inits.isInitialized("user") ? new io.camp.user.model.QUser(forProperty("user")) : null;
    }

}

