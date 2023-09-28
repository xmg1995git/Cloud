package org.mtf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosGateway6661
{
    public static void main( String[] args )
    {

        SpringApplication.run(NacosGateway6661.class, args);
    }
}
