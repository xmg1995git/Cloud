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
public class NacosMain8882
{
    public static void main( String[] args )
    {

        SpringApplication.run(NacosMain8882.class, args);
    }
}
