package com.example.oldCompanySystem.Config;


import com.example.oldCompanySystem.bl.AttendancePort;
import com.example.oldCompanySystem.bl.ErpPort;
import com.example.oldCompanySystem.bl.OrderPort;
import com.example.oldCompanySystem.bl.PersonnelPort;
import com.example.oldCompanySystem.blImpl.AttendancePortImpl;
import com.example.oldCompanySystem.blImpl.ErpPortImpl;
import com.example.oldCompanySystem.blImpl.OrderPortImpl;
import com.example.oldCompanySystem.blImpl.PersonnelPortImpl;
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
    OrderPort orderPort(){return new OrderPortImpl();}
    @Bean
    PersonnelPort personnelPort(){return new PersonnelPortImpl();
    }
    @Bean
    AttendancePort attendancePort(){return new AttendancePortImpl();
    }
    @Bean
    ErpPort erpPort(){return new ErpPortImpl();}

    @Bean(name = "orderPortEndpoint")
    public Endpoint endpoint1() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), orderPort());
        endpoint.publish("/order");
        return endpoint;
    }

    @Bean(name = "personnelPortEndpoint")
    public Endpoint endpoint2() {
        org.apache.cxf.jaxws.EndpointImpl endpoint = new EndpointImpl(springBus(), personnelPort());
        endpoint.publish("/personnel");
        return endpoint;
    }

    @Bean(name = "attendancePortEndpoint")
    public Endpoint endpoint3() {
        org.apache.cxf.jaxws.EndpointImpl endpoint = new EndpointImpl(springBus(), attendancePort());
        endpoint.publish("/attendance");
        return endpoint;
    }

    @Bean(name = "erpPortEndpoint")
    public Endpoint endpoint4() {
        org.apache.cxf.jaxws.EndpointImpl endpoint = new EndpointImpl(springBus(), erpPort());
        endpoint.publish("/erp");
        return endpoint;
    }
}
