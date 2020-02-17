package nz.co.telco.poc.scawebservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/web")
public class WebServiceResource {

    @Autowired
	private RestTemplate restTemplate;

    @RequestMapping("/savedata/")
    public int saveData()
    {
        return 0;
    }

    @RequestMapping("/companydata/{companyId}")
    public List getDataByID(@PathVariable("companyId") String companyId)
    {
        Object[] forObject = restTemplate.getForObject("http://SCA-SERVICE/getcompany/" + companyId, Object[].class);

        return null;
    }
}
