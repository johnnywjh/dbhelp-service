package com.dbhelp.model.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.Size;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="公共删除请求类")
public class CommonDelReq<T> extends BaseUserRequest {

    @ApiModelProperty(value = "ids", required = true)
    @Size(min = 1,message = "id不能为空post")
    private List<T> ids;

}