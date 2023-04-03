package com.multi.shop.review.exception;

import com.multi.shop.global.exception.exception.ErrorCode;
import lombok.Getter;

@Getter
public enum ReviewErrorCode implements ErrorCode {
    REVIEW_NOT_EXIST(400, "REVIEW_01", "존재하지 않는 리뷰입니다.");

    private final int statusCode;
    private final String errorCode;
    private final String message;

    ReviewErrorCode(int statusCode, String errorCode, String message) {
        this.statusCode = statusCode;
        this.errorCode = errorCode;
        this.message = message;
    }
}
