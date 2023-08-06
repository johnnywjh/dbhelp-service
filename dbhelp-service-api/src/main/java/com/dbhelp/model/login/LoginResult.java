package com.dbhelp.model.login;

import com.dbhelp.model.base.LoginUserVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kim.sesame.common.result.AbstractResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 登录返回结果
 *
 * @author EleAdmin
 * @since 2021-08-30 17:35:16
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@ApiModel(description = "登录返回结果")
public class LoginResult extends AbstractResponse {

    @ApiModelProperty("access_token")
    private String access_token;

    @ApiModelProperty("用户信息")
    private LoginUserVo user;

}
