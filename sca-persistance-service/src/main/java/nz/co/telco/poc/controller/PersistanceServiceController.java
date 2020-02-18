package nz.co.telco.poc.controller;

import nz.co.telco.poc.model.CompanySchedule;
import nz.co.telco.poc.service.PersistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/data")
public class PersistanceServiceController {

    @Autowired
	private RestTemplate restTemplate;
    @Autowired
    private PersistanceService persistanceService;

    @RequestMapping("/savecompany/")
    public int saveCompanyData()
    {
        CompanySchedule companySchedule = new CompanySchedule();
        return persistanceService.insertCompanyData(companySchedule);
    }

    @RequestMapping("/getcompany/{companyId}")
    public List<CompanySchedule> getCompanyData(@PathVariable("companyId") String companyId)
    {
       return persistanceService.getCompanyData(Long.parseLong(companyId));
    }
}
