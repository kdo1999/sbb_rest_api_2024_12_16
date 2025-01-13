package com.sbb2.infrastructer.answer.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAnswerEntity is a Querydsl query type for AnswerEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAnswerEntity extends EntityPathBase<AnswerEntity> {

    private static final long serialVersionUID = -61159814L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAnswerEntity answerEntity = new QAnswerEntity("answerEntity");

    public final com.sbb2.common.util.QBaseEntity _super = new com.sbb2.common.util.QBaseEntity(this);

    public final com.sbb2.infrastructer.member.entity.QMemberEntity author;

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedAt = _super.modifiedAt;

    public final com.sbb2.infrastructer.question.entity.QQuestionEntity questionEntity;

    public final SetPath<com.sbb2.infrastructer.voter.entity.VoterEntity, com.sbb2.infrastructer.voter.entity.QVoterEntity> voterEntitySet = this.<com.sbb2.infrastructer.voter.entity.VoterEntity, com.sbb2.infrastructer.voter.entity.QVoterEntity>createSet("voterEntitySet", com.sbb2.infrastructer.voter.entity.VoterEntity.class, com.sbb2.infrastructer.voter.entity.QVoterEntity.class, PathInits.DIRECT2);

    public QAnswerEntity(String variable) {
        this(AnswerEntity.class, forVariable(variable), INITS);
    }

    public QAnswerEntity(Path<? extends AnswerEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAnswerEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAnswerEntity(PathMetadata metadata, PathInits inits) {
        this(AnswerEntity.class, metadata, inits);
    }

    public QAnswerEntity(Class<? extends AnswerEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.author = inits.isInitialized("author") ? new com.sbb2.infrastructer.member.entity.QMemberEntity(forProperty("author")) : null;
        this.questionEntity = inits.isInitialized("questionEntity") ? new com.sbb2.infrastructer.question.entity.QQuestionEntity(forProperty("questionEntity"), inits.get("questionEntity")) : null;
    }

}

