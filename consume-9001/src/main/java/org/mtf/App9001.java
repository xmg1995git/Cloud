package org.mtf;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @EnableFeignClients(clients = {TestApi.class})
 */
@EnableHystrix
@EnableFeignClients(basePackages = {"org.mtf.feignApi"})
@EnableDiscoveryClient
@SpringBootApplication
public class App9001 {

    public static void main( String[] args )
    {
        SpringApplication.run(App9001.class, args);
    }
}
