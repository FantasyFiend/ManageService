package cn.siwangyin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/** Created by zwy on 2017/5/3.
 */
@SpringBootApplication
@EnableEurekaClient
public class ManageService {

    public static void main(String[] args) {
        SpringApplication.run(ManageService.class, args);
    }
}
