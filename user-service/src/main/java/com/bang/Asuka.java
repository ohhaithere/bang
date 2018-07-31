package com.bang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * Created by johnnyGrimes on 23/02/2018.
 */
@SpringBootApplication
public class Asuka {

    public static void main(String[] args) {
        SpringApplication.run(Asuka.class, args);
    }

}
