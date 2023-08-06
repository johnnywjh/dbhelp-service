package com.dbhelp.model.login;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kim.sesame.common.req.BaseRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@ApiModel(description = "修改密码")
public class UpdatePasswordReq extends BaseRequest {

    @ApiModelProperty("用户id")
    @NotNull(message = "用户id不能为空")
    private Long userId;

    @ApiModelProperty("新密码")
    @NotBlank(message = "新密码不能为空")
    private String password;

}
