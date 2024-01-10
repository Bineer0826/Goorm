package hello.hellospring.controller;


import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired //memberservice를 객체 공유하듯이 가져다 연결
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
