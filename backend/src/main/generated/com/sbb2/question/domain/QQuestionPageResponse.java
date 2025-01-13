package com.sbb2.question.domain;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.sbb2.question.domain.QQuestionPageResponse is a Querydsl Projection type for QuestionPageResponse
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QQuestionPageResponse extends ConstructorExpression<QuestionPageResponse> {

    private static final long serialVersionUID = 1668111802L;

    public QQuestionPageResponse(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> subject, com.querydsl.core.types.Expression<String> content, com.querydsl.core.types.Expression<String> author, com.querydsl.core.types.Expression<java.time.LocalDateTime> createdAt, com.querydsl.core.types.Expression<java.time.LocalDateTime> modifiedAt, com.querydsl.core.types.Expression<Long> answerCount) {
        super(QuestionPageResponse.class, new Class<?>[]{long.class, String.class, String.class, String.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, long.class}, id, subject, content, author, createdAt, modifiedAt, answerCount);
    }

}

