package itf.log4shell.log4shellVulnapp.controller;

import org.springframework.web.bind.annotation.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/")
public class PayloadController {
    private static final Logger logger = LogManager.getLogger("vulnapp");

    public String testPayload(@RequestParam(value = "payload")String payload) {
        logger.info("payload: " + payload);
        return "ITF said hi!";
    }
}
