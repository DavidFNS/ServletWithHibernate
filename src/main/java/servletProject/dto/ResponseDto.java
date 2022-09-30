package servletProject.dto;

import lombok.Builder;

@Builder
public class ResponseDto<NBA> {
    private Integer code;
    private String message;
    private boolean success;
    private NBA data;

    public ResponseDto(Integer code, String message, boolean success, NBA data) {
        this.code = code;
        this.message = message;
        this.success = success;
        this.data = data;
    }

    public ResponseDto(Integer code, String message, boolean success) {
        this.code = code;
        this.message = message;
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return success;
    }

    public NBA getData() {
        return data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setData(NBA data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                " code: " + code + ",\n" +
                " message: " + message + ",\n" +
                " success: " + success + ",\n" +
                " data: " + data + "\n" +
                "} ";
    }
}
