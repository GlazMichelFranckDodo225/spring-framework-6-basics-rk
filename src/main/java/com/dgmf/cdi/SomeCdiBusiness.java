package com.dgmf.cdi;

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
