package itf.log4shell.log4shellVulnapp.controller;

import itf.log4shell.log4shellVulnapp.model.PayloadVO;
import org.springframework.web.bind.annotation.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/")
public class PayloadController {
    private static final Logger logger = LogManager.getLogger("vulnapp");

    @RequestMapping(method = RequestMethod.GET)
    public String testPayload(PayloadVO payloadVO) {
        logger.info("payload: " + payloadVO.getPayload());
        return "ITF said hi!";
    }
}
