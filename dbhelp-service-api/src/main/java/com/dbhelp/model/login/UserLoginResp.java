package com.dbhelp.model.login;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kim.sesame.common.result.AbstractResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@ApiModel(description = "登录返回结果")
public class UserLoginResp extends AbstractResponse {

    @ApiModelProperty("access_token")
    private String access_token;

}
