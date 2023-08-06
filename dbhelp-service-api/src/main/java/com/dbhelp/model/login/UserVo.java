package com.dbhelp.model.login;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import kim.sesame.common.req.PrintFriendliness;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class UserVo extends PrintFriendliness {
    /**
     * 用户id
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;
    /**
     * 账号
     */
    private String username;
    /**
     * 昵称
     */
    private String name;
    /**
     * 密码版本
     */
    private String pwdVersion;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 状态, 0正常, 1冻结
     */
    private Integer status;
    /**
     * 是否删除, 0否, 1是
     */
    private Boolean deleted;

    private String nickname;
}
