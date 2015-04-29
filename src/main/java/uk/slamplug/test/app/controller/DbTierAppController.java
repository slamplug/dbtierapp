package uk.slamplug.test.app.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.slamplug.test.app.db.CustomerDB;

@Controller
@SuppressWarnings("UnusedDeclaration")
@RequestMapping("/db")
public class DbTierAppController {

    private static final Logger logger = LoggerFactory.getLogger(DbTierAppController.class);

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String getCustomerDetails(@PathVariable("id") long id) throws IOException {
        logger.info("getCustomerDetails, id {" + id + "}");
        return new ObjectMapper().writer().withDefaultPrettyPrinter().
                writeValueAsString(new CustomerDB().getCustomerDetails(id));
    }
}
