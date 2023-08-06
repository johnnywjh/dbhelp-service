package com.dbhelp.controller;


import com.dbhelp.model.base.BaseUserRequest;
import com.dbhelp.model.login.*;
import com.wf.captcha.SpecCaptcha;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kim.sesame.common.annotation.ReqParamsCheck;
import kim.sesame.common.result.ApiResult;
import kim.sesame.common.web.annotation.IgnoreLoginCheck;
import kim.sesame.common.web.controller.AbstractWebController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Api(tags = "MainController 主应用")
@Slf4j
@RequestMapping("/api")
@RestController
public class MainController extends AbstractWebController {

//    @Autowired
//    private SysUserService sysUserService;

    @ApiOperation(value = "图形验证码")
    @IgnoreLoginCheck
    @GetMapping("/captcha")
    public ApiResult<CaptchaResult> captcha() {
        SpecCaptcha specCaptcha = new SpecCaptcha(130, 48, 5);
        return success(new CaptchaResult(specCaptcha.toBase64(), specCaptcha.text().toLowerCase()));
    }

    @ApiOperation(value = "登录")
    @IgnoreLoginCheck
    @ReqParamsCheck
    @PostMapping("/login")
    public ApiResult<UserLoginResp> login(@RequestBody UserLoginReq req, HttpServletRequest request) {
//        return success(sysUserService.login(req,request));
        return success(UserLoginResp.builder().access_token("xxx").build());
    }

    @ApiOperation("获取登录用户信息")
    @ReqParamsCheck
    @GetMapping("/auth/user")
    public ApiResult<UserVo> userInfo(BaseUserRequest req) {
//        Long userId = UserContext.getUserContext().getUser().getUserId();
//        return success(sysUserService.getByIdRel(userId.toString()));
        return success(new UserVo());
    }

//    @ApiOperation("修改自己密码")
//    @ReqParamsCheck
//    @PostMapping("/auth/password")
//    public ApiResult<?> updatePassword(@RequestBody UpdateSelfPasswordReq req) {
//        sysUserService.updateSelfPassword(req);
//        return success();
//    }

}