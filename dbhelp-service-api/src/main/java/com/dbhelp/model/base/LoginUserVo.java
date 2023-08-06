package com.dbhelp.model.base;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import kim.sesame.common.req.PrintFriendliness;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class LoginUserVo extends PrintFriendliness {

    /**
     * userid
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long userId;
    /**
     * 账号
     */
    private String username;
    /**
     * 名称
     */
    private String nickname;
    /**
     * 手机
     */
    private String phone;


}
