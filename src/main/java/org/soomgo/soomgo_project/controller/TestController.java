package org.soomgo.soomgo_project.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.soomgo.soomgo_project.domain.RequestVO;
import org.soomgo.soomgo_project.service.RequestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

@Controller
@Log4j2
@RequiredArgsConstructor // 의존성 주입
@RequestMapping("/test")
public class TestController {
    private final RequestService requestService;

    @GetMapping("/list")
    public void listAll(
            @ModelAttribute("vo") RequestVO vo,
            Model model) {
        model.addAttribute("list", new String[]{"AA", "BB", "CC"});
    }


















/*
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
    public String postReqPage(
            @ModelAttribute RequestVO requestVO
    ) {
        log.info(requestVO.toString());
        requestService.register(requestVO);
//        rttr.addAttribute("date", date);
        log.info("req_sub : " + requestVO.getReq_sub());
        return "redirect:/soomgo/test";
    }


    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/list")
    public void listAll(Model model) {

        log.info("listAll==================");
        List<RequestVO> requestVOS = requestService.selectAll();
        model.addAttribute("requestVOS", requestVOS);
    }
*/
}
