package kakaoLoginTest.controller;

import kakaoLoginTest.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequiredArgsConstructor
@Slf4j
public class kakaoLoginController {
    private final UserService userService;

    @GetMapping("/index")
    public String index() {
        return "loginForm";
    }
}
