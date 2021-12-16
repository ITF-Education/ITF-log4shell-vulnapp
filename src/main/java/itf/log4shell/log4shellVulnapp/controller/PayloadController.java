package itf.log4shell.log4shellVulnapp.controller;

import org.springframework.web.bind.annotation.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpServletRequest;

@RestController
public class PayloadController {
    private static final Logger logger = LogManager.getLogger("vulnapp");

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String PostPayload(HttpServletRequest req) {
        System.out.println("\nPayload=" + req.getParameter("payload") + "\n");
        logger.info("payload: " + req.getParameter("payload"));
        return "ITF said hi!";
    }
}
