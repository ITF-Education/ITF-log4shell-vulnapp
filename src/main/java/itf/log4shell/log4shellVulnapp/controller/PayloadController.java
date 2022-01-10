package itf.log4shell.log4shellVulnapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PayloadController {
    private static final Logger logger = LogManager.getLogger("vulnapp");

    @GetMapping("")
    public String index() {
        return "index";
    }

    @GetMapping("/signin")
    public String GetSigninPage() {
        return "signin";
    }

    @PostMapping("/signin")
    public String PostSigninPage(HttpServletRequest req) {
        logger.info("Sign in request (username:" + req.getParameter("username") + ", password:" + req.getParameter("password") + ")");
        return "signin";
    }
}
