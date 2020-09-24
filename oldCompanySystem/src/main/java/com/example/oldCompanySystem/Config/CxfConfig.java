package com.example.oldCompanySystem.Config;


import com.example.oldCompanySystem.bl.OrderPort;
import com.example.oldCompanySystem.blImpl.OrderPortImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.xml.ws.Endpoint;

@Configuration
@EnableAutoConfiguration
public class CxfConfig {

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    OrderPort orderPort() {
        return new OrderPortImpl();
    }

    @Bean(name = "orderPortEndpoint")
    public Endpoint endpoint1() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), orderPort());
        endpoint.publish("/order");
        return endpoint;
    }
}
