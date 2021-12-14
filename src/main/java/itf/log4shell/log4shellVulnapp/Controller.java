package itf.log4shell.log4shellVulnapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class Controller {
    private static final Logger logger = LogManager.getLogger("vulnapp");

    @GetMapping("/")
    public String index(@RequestHeader("X-Api-Version") String apiV) {
        logger.info("Api version = " + apiV);
        return "index";
    }
}
