package com.dbhelp.model.login;

import kim.sesame.common.req.BaseRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class UserLoginReq extends BaseRequest {

    /**
     * 账号
     */
    @NotBlank(message = "账号不能为空")
    private String username;
    /**
     * 手机号码
     */
//    @NotNull(message = "账号不能为空")
    private String phone;
    /**
     * 密码
     */
    @NotBlank(message = "密码不能为空")
    private String password;

}
