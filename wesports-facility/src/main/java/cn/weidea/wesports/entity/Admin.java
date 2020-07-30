package cn.weidea.wesports.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 管理员
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

    private int id;

    private String username;

    private String password;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date lastLoginTime;

}