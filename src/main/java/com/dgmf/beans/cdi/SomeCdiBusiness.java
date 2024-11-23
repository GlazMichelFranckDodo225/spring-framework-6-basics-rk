package com.dgmf.beans.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

// @Component
@Named
public class SomeCdiBusiness {
    // @Autowired
    @Inject
    SomeCdiDao someCdiDao;

    public SomeCdiDao getSomeCDIDAO() {
        return someCdiDao;
    }

    public void setSomeCDIDAO(SomeCdiDao someCDIDAO) {
        this.someCdiDao = someCDIDAO;
    }
}
