package com.example.soap.config;

import com.example.soap.services.CompteSoapService;
import jakarta.xml.ws.Endpoint;
import lombok.AllArgsConstructor;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class CxfConfig {


    private  CompteSoapService compteSoapService;
    private  Bus bus;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, compteSoapService);
        endpoint.publish("/WS");
        return endpoint;
    }
}
