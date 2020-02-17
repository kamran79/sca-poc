package nz.co.telco.poc.scawebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.eureka.ConditionalOnRibbonAndEurekaEnabled;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class ScaWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScaWebServiceApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return  new RestTemplate();
	}
}
