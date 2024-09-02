package springsecurity.security;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomeController {

    @GetMapping("/")
    public String security(HttpServletRequest request) {
        return "welcome to Telusko" + request.getSession().getId();
    }
}
