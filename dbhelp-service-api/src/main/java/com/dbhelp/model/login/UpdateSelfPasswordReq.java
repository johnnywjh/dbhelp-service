package com.dbhelp.model.login;

import com.dbhelp.model.base.BaseUserRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@ApiModel(description = "修改密码")
public class UpdateSelfPasswordReq  extends BaseUserRequest {

    @ApiModelProperty("原始密码")
    @NotBlank(message = "原始密码不能为空")
    private String oldPassword;

    @ApiModelProperty("新密码")
    @NotBlank(message = "新密码不能为空")
    private String password;

}
