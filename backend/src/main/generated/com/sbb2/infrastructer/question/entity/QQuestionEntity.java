package com.sbb2.infrastructer.question.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QQuestionEntity is a Querydsl query type for QuestionEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QQuestionEntity extends EntityPathBase<QuestionEntity> {

    private static final long serialVersionUID = -2132141814L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QQuestionEntity questionEntity = new QQuestionEntity("questionEntity");

    public final com.sbb2.common.util.QBaseEntity _super = new com.sbb2.common.util.QBaseEntity(this);

    public final ListPath<com.sbb2.infrastructer.answer.entity.AnswerEntity, com.sbb2.infrastructer.answer.entity.QAnswerEntity> answerEntityList = this.<com.sbb2.infrastructer.answer.entity.AnswerEntity, com.sbb2.infrastructer.answer.entity.QAnswerEntity>createList("answerEntityList", com.sbb2.infrastructer.answer.entity.AnswerEntity.class, com.sbb2.infrastructer.answer.entity.QAnswerEntity.class, PathInits.DIRECT2);

    public final com.sbb2.infrastructer.member.entity.QMemberEntity author;

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedAt = _super.modifiedAt;

    public final StringPath subject = createString("subject");

    public final SetPath<com.sbb2.infrastructer.voter.entity.VoterEntity, com.sbb2.infrastructer.voter.entity.QVoterEntity> voterEntitySet = this.<com.sbb2.infrastructer.voter.entity.VoterEntity, com.sbb2.infrastructer.voter.entity.QVoterEntity>createSet("voterEntitySet", com.sbb2.infrastructer.voter.entity.VoterEntity.class, com.sbb2.infrastructer.voter.entity.QVoterEntity.class, PathInits.DIRECT2);

    public QQuestionEntity(String variable) {
        this(QuestionEntity.class, forVariable(variable), INITS);
    }

    public QQuestionEntity(Path<? extends QuestionEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QQuestionEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QQuestionEntity(PathMetadata metadata, PathInits inits) {
        this(QuestionEntity.class, metadata, inits);
    }

    public QQuestionEntity(Class<? extends QuestionEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.author = inits.isInitialized("author") ? new com.sbb2.infrastructer.member.entity.QMemberEntity(forProperty("author")) : null;
    }

}

