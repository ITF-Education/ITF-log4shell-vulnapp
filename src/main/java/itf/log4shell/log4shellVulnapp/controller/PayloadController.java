package itf.log4shell.log4shellVulnapp.controller;

import org.springframework.web.bind.annotation.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "remoteTest")
public class PayloadController {
    private static final Logger logger = LogManager.getLogger("vulnapp");

    @GetMapping()
    public String GetPayload(
            @RequestHeader("User-Agent")String UserAgent
    ) {
        logger.info("(GET|Header)User-Agent: " + UserAgent);
        return "(GET)ITF said h1!";
    }

    @PostMapping()
    public String PostPayload(@RequestBody PayloadParams payloadParams) {
        logger.info("(POST|Body)payload= " + payloadParams.getPayload());
        return "(POST)ITF said h1!";
    }

}
