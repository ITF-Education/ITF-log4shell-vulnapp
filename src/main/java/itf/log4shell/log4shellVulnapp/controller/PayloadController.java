package itf.log4shell.log4shellVulnapp.controller;

import org.springframework.web.bind.annotation.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpServletRequest;

@RestController
public class PayloadController {
    private static final Logger logger = LogManager.getLogger("vulnapp");

    @GetMapping("/")
    public String testPayload(HttpServletRequest req) {
        logger.info("payload: " + req.getParameter("payload"));
        return "ITF said hi!";
    }
}
