package io.swagger.petstore.models.pet;

import java.util.Objects;
import java.util.StringJoiner;

public class PetNotFoundModel {

    private Integer code;
    private String type, message;

    public PetNotFoundModel(Integer code, String type, String message) {
        this.code = code;
        this.type = type;
        this.message = message;
    }

    public PetNotFoundModel() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
