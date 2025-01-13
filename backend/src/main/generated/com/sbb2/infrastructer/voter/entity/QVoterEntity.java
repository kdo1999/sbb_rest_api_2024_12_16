package com.sbb2.infrastructer.voter.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QVoterEntity is a Querydsl query type for VoterEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QVoterEntity extends EntityPathBase<VoterEntity> {

    private static final long serialVersionUID = -2021434716L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QVoterEntity voterEntity = new QVoterEntity("voterEntity");

    public final com.sbb2.infrastructer.answer.entity.QAnswerEntity answerEntity;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.sbb2.infrastructer.member.entity.QMemberEntity memberEntity;

    public final com.sbb2.infrastructer.question.entity.QQuestionEntity questionEntity;

    public QVoterEntity(String variable) {
        this(VoterEntity.class, forVariable(variable), INITS);
    }

    public QVoterEntity(Path<? extends VoterEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QVoterEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QVoterEntity(PathMetadata metadata, PathInits inits) {
        this(VoterEntity.class, metadata, inits);
    }

    public QVoterEntity(Class<? extends VoterEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.answerEntity = inits.isInitialized("answerEntity") ? new com.sbb2.infrastructer.answer.entity.QAnswerEntity(forProperty("answerEntity"), inits.get("answerEntity")) : null;
        this.memberEntity = inits.isInitialized("memberEntity") ? new com.sbb2.infrastructer.member.entity.QMemberEntity(forProperty("memberEntity")) : null;
        this.questionEntity = inits.isInitialized("questionEntity") ? new com.sbb2.infrastructer.question.entity.QQuestionEntity(forProperty("questionEntity"), inits.get("questionEntity")) : null;
    }

}

