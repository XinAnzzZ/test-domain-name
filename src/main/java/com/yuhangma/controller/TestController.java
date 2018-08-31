package com.yuhangma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author XinAnzzZ
 * @date 2018/8/31 10:44
 */
@Controller
public class TestController {

    @GetMapping("/")
    public String test() {

        return "test";
    }
}
