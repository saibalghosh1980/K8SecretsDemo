package com.oup.k8secretdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class K8SecretsDemo {
    
	@Value("${enc.com.oup.cheekysecret}")
    private String cheekysecret;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(K8SecretsDemo.class, args);

	}
	
	@Bean
	public CommandLineRunner commandLineRunner2(ApplicationContext ctx) {
		return args->{
			//System.setProperty("jasypt.encryptor.password", "ghosh");
			
			for(int iCounter=0;iCounter<10;iCounter++) {
			System.out.println(cheekysecret);
			Thread.sleep(5000);
			}
			
		};
	}

}
