package com.dbhelp.model.base;

import kim.sesame.common.req.BaseRequest;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseUserRequest extends BaseRequest {

//    @NotNull(message = "未登录")
    private String loginUserId;

}
