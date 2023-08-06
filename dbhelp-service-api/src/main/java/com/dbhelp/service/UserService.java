package com.dbhelp.service;

import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.json.JSONUtil;
import com.dbhelp.model.base.BaseUserRequest;
import com.dbhelp.model.login.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    public UserVo getUserInfo(BaseUserRequest req) {
        String fileContent = ResourceUtil.readUtf8Str("data/menulist.json");
        return UserVo.builder()
                .authorities(JSONUtil.parseArray(fileContent))
                .build();
    }

}
