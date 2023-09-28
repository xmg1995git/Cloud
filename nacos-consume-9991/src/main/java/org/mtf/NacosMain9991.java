package org.mtf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@EnableFeignClients(basePackages = {"org.mtf.feignApi"})
@EnableDiscoveryClient
@SpringBootApplication
public class NacosMain9991
{
    public static void main( String[] args )
    {
        SpringApplication.run(NacosMain9991.class, args);
    }
}
