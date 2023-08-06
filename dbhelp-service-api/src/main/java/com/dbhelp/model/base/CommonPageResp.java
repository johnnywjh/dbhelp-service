package com.dbhelp.model.base;

import kim.sesame.common.result.AbstractResponse;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommonPageResp<T> extends AbstractResponse {

    private List<T> list;
    private long total;

}
