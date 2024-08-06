package org.soomgo.soomgo_project.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
@Log4j2
@RequestMapping("/soomgo")
public class TestController {

    @GetMapping("/basic")
    public void basic() {
        log.info("basic=================");
    }

    @GetMapping("/req")
    public String getReqPage(Model model) {
        log.info("getReqPage");
        return "req";
    }

    @PostMapping("/req")
    public String postReqPage(@RequestParam(value = "date", required = false) String[] date) {
        log.info(Arrays.toString(date));
        return "redirect:/soomgo/test";
    }


    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
