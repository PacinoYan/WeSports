package cn.weidea.wesports.enums;

/**
 * 错误码枚举定义
 *
 * @author L99
 */
public enum ErrorCodeEnum {

    SUCCESS(200, "成功"),

    // 用户名与密码不匹配
    MISMATCH(400, "账户名与密码不匹配，请重新输入"),

    NODATA(1000, "数据库查询结果为空，请确认查询参数"),

    CREATE_FAIL(1001, "创建失败"),

    DELECT_FAIL(1002, "删除失败"),

    ID_ERROR(1003, "ID不存在"),

    // 用户更新个人信息失败
    UPDATE_PERSONAL_DATA_FAIL(400, "用户更新个人信息失败"),

    // 注册用户失败
    REGISTER_USER_FAIL(400, "用户注册失败"),

    // 短信发送失败
    SMS_SEND_FAIL(400, "短信发送失败");

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String desc;

    ErrorCodeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
