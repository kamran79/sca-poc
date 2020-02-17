package nz.co.telco.poc.service;
import  nz.co.telco.poc.model.CompanySchedule;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PersistanceServiceImpl implements  PersistanceService {
    public int insertCompanyData(CompanySchedule companySchedule)
    {
        return 0;
    }
    public List<CompanySchedule> getCompanyData(Long companyId)
    {
        CompanySchedule companySchedule1 = new CompanySchedule();
        companySchedule1.setCompanyID(1L);
        companySchedule1.setCompanyName("ABC");
        return Collections.singletonList(companySchedule1);
    }
}