package com.yuhangma.controller;

import com.yuhangma.entity.Test;
import com.yuhangma.repository.TestRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;

/**
 * @author XinAnzzZ
 * @date 2018/8/31 10:44
 */
@Controller
public class TestController {

    @GetMapping(value = {"/", ""})
    public String test() {
        return "test";
    }

    @PostMapping("/blog/deploy")
    public void blogDeploy() {
        try {
            String filePath = "/docker/sh/deploy_blog.sh";
            Process ps = Runtime.getRuntime().exec(filePath);
            ps.waitFor();

            BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            String result = sb.toString();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/ok")
    @ResponseBody
    public Date ok() {
        return new Date();
    }

    @Resource
    private TestRepository testRepository;

    @GetMapping("/test/date")
    @ResponseBody
    public Test test01() {
        Test test = new Test();
        Test save = testRepository.save(test);
        return testRepository.findById(save.getId()).orElseThrow(RuntimeException::new);
    }

    @GetMapping("/test/save/date")
    @ResponseBody
    public void testDate() {
        Test test = testRepository.findById(2).orElseThrow(RuntimeException::new);
        System.out.println(new Date());
        test.setDate(new Date());
        testRepository.save(test);
    }
}
