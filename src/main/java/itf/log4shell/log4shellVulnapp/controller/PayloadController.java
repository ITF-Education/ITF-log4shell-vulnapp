package itf.log4shell.log4shellVulnapp.controller;

import org.springframework.web.bind.annotation.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;

@RestController
@RequestMapping(value = "remoteTest")
public class PayloadController {
    private static final Logger logger = LogManager.getLogger("vulnapp");

    @GetMapping()
    public String GetPayload(
            @RequestHeader("User-Agent")String UserAgent
    ) {
        logger.info("(GET|Header)User-Agent: " + UserAgent.getClass().getName());
        return "(GET)ITF said h1!";
    }

    @PostMapping()
    public String PostPayload(HttpServletRequest req) {
        logger.info("(POST|Body)payload=" + req.getParameter("payload"));
        return "(POST)ITF said h1!";
    }

}
