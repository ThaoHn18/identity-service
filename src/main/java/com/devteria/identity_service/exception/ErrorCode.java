package com.devteria.identity_service.exception;

public enum ErrorCode {
    USER_EXISTED(1002,"User existed"),
    USER_NOT_FOUND(1002,"User existed"),
    UNCATEGORIZED_EXCEPTION(999,"Uncategoried error"),
    USERNAME_INVALID(1003, "User must be 3 characters"),
    PASSWORD_INVALID(1004,"Password invalid"),
    INVALID_KEY(1005,"Invalid_key"),
    ;

    private int code;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
