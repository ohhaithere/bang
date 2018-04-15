package com.bang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by johnnyGrimes on 23/02/2018.
 */
@SpringBootApplication
@EnableEurekaClient
public class Asuka {

    public static void main(String[] args) {
        SpringApplication.run(Asuka.class, args);
    }
}
