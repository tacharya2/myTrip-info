package com.findMyTrip.myTrip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecordLocatorController {

    @Autowired
    private RecordLocatorService recordLocatorService;

    //http://localhost:8085/myTrip
    @RequestMapping(method= RequestMethod.GET, value="/myTrip", produces={"application/json"})
    public RecordLocator myTrip() {
        return recordLocatorService.newRecord();
    }

    //http://localhost:8085/saveMyTrip
    @RequestMapping(method= RequestMethod.POST, value="/saveMyTrip", produces={"application/json"})
    public RecordLocator saveMyTrip(@RequestBody RecordLocator recordLocator) {
        return recordLocatorService.saveTrip(recordLocator);
    }
}