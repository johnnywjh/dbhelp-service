package com.dbhelp.service;

import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;
import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.json.JSONUtil;
import com.dbhelp.config.BaseConfig;
import com.dbhelp.model.base.BaseUserRequest;
import com.dbhelp.model.login.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import java.io.File;

@Slf4j
@Service
public class UserService implements ApplicationRunner {

    static final String FILE_NAME = "dbdata/menu.json";
    static String menuJson = "";

    @Autowired
    private BaseConfig baseConfig;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String basePath = baseConfig.getBasePath() + "/" + FILE_NAME;
        File f = new File(basePath);
        if (f.exists()) {
            FileReader fileReader = new FileReader(basePath);
            menuJson = fileReader.readString();
            log.info("菜单文件存在 读取文件成功: {}", basePath);
        } else {
            menuJson = ResourceUtil.readUtf8Str(FILE_NAME);
            FileWriter writer = new FileWriter(basePath);
            writer.write(menuJson);
            log.info("菜单文件不存在 创建文件成功: {}", basePath);
        }
        log.info("\n菜单json数据读取\n{}", JSONUtil.toJsonPrettyStr(menuJson));
        // 写入到磁盘文件

    }

    public UserVo getUserInfo(BaseUserRequest req) {
        return UserVo.builder()
                .authorities(JSONUtil.parseArray(menuJson))
                .build();
    }

}
