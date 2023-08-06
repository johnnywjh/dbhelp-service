package com.dbhelp.model.base;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasePageRequest extends BaseUserRequest {

    /**
     * 页面索引
     */
    @ApiModelProperty(value = "页面索引", required = true, example = "1")
    @Min(1)
    private int pageNum;

    /**
     * 每页展示数量
     */
    @ApiModelProperty(value = "每页展示数量", required = true, example = "10")
    @Range(min = 1, max = 100)
    private int pageSize;


}
