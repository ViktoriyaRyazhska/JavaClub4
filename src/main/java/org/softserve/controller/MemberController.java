package org.softserve.controller;

import org.softserve.model.Member;
import org.softserve.service.MemberService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("member", new Member());
    return "create-member";
    }

}
