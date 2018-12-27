package com.yuhangma.entity.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author XinAnzzZ
 * @date 2018/12/27 19:08
 */
@Data
public class ResultVO implements Serializable {

    private static final long serialVersionUID = 801773109931859283L;

    private Integer code;

    private String msg;

    private Object data;

    private ResultVO(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ResultVO success() {
        return new ResultVO(200, "success", null);
    }
}
