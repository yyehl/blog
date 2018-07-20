package com.xxx.blog.web;

import com.xxx.blog.dao.po.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    class ReMsg {
        private String msg;
        private User user;
        public ReMsg(String msg, User user) {
            this.msg = msg;
            this.user = user;
        }
    }

    @RequestMapping(path = "/register", method = RequestMethod.POST)
    public ReMsg register(@RequestParam("name") String name,
                          @RequestParam("password") String password) {
        // 先看用户名是否已存在，存在则直接返回


        // 确认为新注册用户名，添加用户


        return new ReMsg("1", new User());
    }



}
