package com.dbhelp.model.login;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kim.sesame.common.result.AbstractResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 验证码返回结果
 *
 * @author EleAdmin
 * @since 2021-08-30 17:35:16
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@ApiModel(description = "验证码返回结果")
public class CaptchaResult extends AbstractResponse {

    @ApiModelProperty("图形验证码base64数据")
    private String base64;

    @ApiModelProperty("验证码文本")
    private String text;

}
