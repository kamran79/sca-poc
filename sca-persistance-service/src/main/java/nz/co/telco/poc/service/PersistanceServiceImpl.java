package nz.co.telco.poc.service;
import  nz.co.telco.poc.model.CompanySchedule;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class PersistanceServiceImpl implements  PersistanceService {
    public int insertCompanyData(CompanySchedule companySchedule)
    {
//        insert query
        return 0;
    }
    public List<CompanySchedule> getCompanyData(Long companyId)
    {
        CompanySchedule companyScheduleLocal = new CompanySchedule();
        companyScheduleLocal.setCompanyID(1L);
        companyScheduleLocal.setCompanyName("ABC");
        companyScheduleLocal.setCompanyID(1L);
        companyScheduleLocal.setDate(new Date());
        companyScheduleLocal.setToTime(new Date());
        companyScheduleLocal.setFromTime(new Date());
        companyScheduleLocal.setDescription("XYZ");
        return Collections.singletonList(companyScheduleLocal);
    }
}