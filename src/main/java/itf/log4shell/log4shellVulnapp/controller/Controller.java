package itf.log4shell.log4shellVulnapp.controller;

import org.springframework.web.bind.annotation.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/")
public class Controller {
    private static final Logger logger = LogManager.getLogger("vulnapp");

    @RequestMapping(method = RequestMethod.GET)
    public String index(
            @RequestParam String payload,
            @RequestHeader("Host") String Host,
            @RequestHeader("User-Agent") String UserAgent,
            @RequestHeader("X-Api-Version") String ApiVersion
    ) {
        logger.info("Host:" + Host);
        logger.info("User-Agent:" + UserAgent);
        logger.info("Api version:" + ApiVersion);
        return "ITF said hi!";
    }
}
