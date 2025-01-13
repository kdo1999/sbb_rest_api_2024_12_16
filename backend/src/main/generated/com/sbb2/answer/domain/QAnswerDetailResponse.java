package com.sbb2.answer.domain;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.sbb2.answer.domain.QAnswerDetailResponse is a Querydsl Projection type for AnswerDetailResponse
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QAnswerDetailResponse extends ConstructorExpression<AnswerDetailResponse> {

    private static final long serialVersionUID = -638268884L;

    public QAnswerDetailResponse(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> content, com.querydsl.core.types.Expression<String> username, com.querydsl.core.types.Expression<Long> questionId, com.querydsl.core.types.Expression<java.time.LocalDateTime> createdAt, com.querydsl.core.types.Expression<java.time.LocalDateTime> modifiedAt, com.querydsl.core.types.Expression<Long> voterCount, com.querydsl.core.types.Expression<Boolean> isVoter) {
        super(AnswerDetailResponse.class, new Class<?>[]{long.class, String.class, String.class, long.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, long.class, boolean.class}, id, content, username, questionId, createdAt, modifiedAt, voterCount, isVoter);
    }

}

