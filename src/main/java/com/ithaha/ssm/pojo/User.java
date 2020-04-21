package com.ithaha.ssm.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "tb_user")
public class User {
    // ID
    @Id //主键
    @KeySql(useGeneratedKeys = true) //开启自增主键返回功能
    private Long id;
    // 用户名
    private String userName;
    // 密码
    private String password;
    // 姓名
    private String name;
    // 年龄
    private Integer age;
    // 性别 1: 男 2: 女
    private Short sex;
    // 出生日期
    private Date birthday;
    // 备注
    private String note;
    // 创建时间
    private Date created;
    // 修改时间
    private Date updated;
}
