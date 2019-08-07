package com.revature.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.discovery.EurekaClient;

@Service
public class ExternalService {

	@Autowired
	private EurekaClient eurekaClient;
	
	public void exampleRestCall() {
		//no longer need to hardcode in URL:port for RestTemplates
		eurekaClient.getApplication("other-api").getInstances().get(0).getHostName();
		eurekaClient.getApplication("other-api").getInstances().get(0).getPort();
		//then we just construct our RestTemplate with these
	}
	
}
