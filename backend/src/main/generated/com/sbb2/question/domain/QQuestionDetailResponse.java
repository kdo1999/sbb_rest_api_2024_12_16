package com.sbb2.question.domain;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.sbb2.question.domain.QQuestionDetailResponse is a Querydsl Projection type for QuestionDetailResponse
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QQuestionDetailResponse extends ConstructorExpression<QuestionDetailResponse> {

    private static final long serialVersionUID = -819927300L;

    public QQuestionDetailResponse(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> subject, com.querydsl.core.types.Expression<String> content, com.querydsl.core.types.Expression<String> author, com.querydsl.core.types.Expression<java.time.LocalDateTime> createdAt, com.querydsl.core.types.Expression<java.time.LocalDateTime> modifiedAt, com.querydsl.core.types.Expression<? extends java.util.List<com.sbb2.answer.domain.AnswerDetailResponse>> answerList, com.querydsl.core.types.Expression<Long> voterCount, com.querydsl.core.types.Expression<Boolean> isVoter) {
        super(QuestionDetailResponse.class, new Class<?>[]{long.class, String.class, String.class, String.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, java.util.List.class, long.class, boolean.class}, id, subject, content, author, createdAt, modifiedAt, answerList, voterCount, isVoter);
    }

}

