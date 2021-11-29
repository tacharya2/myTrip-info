package com.findMyTrip.myTrip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordLocatorService {

    @Autowired
    private RecordLocatorRepo recordLocatorRepo;

    public RecordLocator newRecord(){
        RecordLocator recordLocator = new RecordLocator();
        recordLocator.setConfirmationCode("SKMILP");
        recordLocator.setFirstName("Tek");
        recordLocator.setLastName("Acharya");
        return recordLocator;
    }
    public RecordLocator saveTrip(RecordLocator recordLocator){
        return recordLocatorRepo.save(recordLocator);
    }

    public RecordLocator findAllRecord(){
        return (RecordLocator) recordLocatorRepo.findAll();
    }
}