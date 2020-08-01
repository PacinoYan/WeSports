package cn.weidea.wesports.entity;


import cn.weidea.wesports.enums.ErrorCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 通用返回对象
 *
 * @author L99
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> implements Serializable {

    private static final long serialVersionUID = 2745260992031618742L;
    /**
     * 错误码 正确返回 200
     */
    private Integer errorCode = 200;

    /**
     * 错误信息 正确返回空字符串
     */
    private String errorMessage = "";

    /**
     * 返回值对象
     */
    private T data;


    /**
     * 正确响应构造函数
     *
     * @param data
     */
    public CommonResult(T data) {
        this.data = data;
    }

    /**
     * 空响应
     *
     * @return
     */
    public static CommonResult success() {
        return new CommonResult();
    }

    /**
     * 带响应的成功请求
     *
     * @param data
     * @return
     */
    public static<T> CommonResult success(T data) {
        return new CommonResult<>(data);
    }

    /**
     * 用于前端正确码有要求时
     * @param errorCode
     * @param data
     * @return
     */
    public static CommonResult success(int errorCode, Object data) {
        return new CommonResult<>(errorCode, "", data);
    }

    /**
     * 错误响应
     *
     * @param errorMessage
     * @return
     */
    public static CommonResult failure(Integer code, String errorMessage) {

        return new CommonResult<>(code, errorMessage, null);
    }

    /**
     * 通过错误码枚举构造错误响应
     *
     * @param errorCodeEnum 错误码枚举
     * @return
     */
    public static CommonResult failure(ErrorCodeEnum errorCodeEnum) {
        return new CommonResult<>(errorCodeEnum.getCode(), errorCodeEnum.getDesc(), null);
    }

}
