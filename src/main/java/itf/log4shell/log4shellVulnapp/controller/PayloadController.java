package itf.log4shell.log4shellVulnapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PayloadController {
    private static final Logger logger = LogManager.getLogger("vulnapp");

    @GetMapping()
    public String getMain(@) {
        return "index";
    }

    @PostMapping()
    public String postMain(HttpServletRequest req) {
        logger.info("(username: " + req.getParameter("username") + ")");
        return "hello " + req.getParameter("username");
    }
}
