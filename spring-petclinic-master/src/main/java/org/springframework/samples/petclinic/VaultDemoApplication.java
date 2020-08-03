//package org.springframework.samples.petclinic;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import lombok.extern.slf4j.Slf4j;
//
//@SpringBootApplication
//@EnableConfigurationProperties(SecretStuffConfig.class)
//@Slf4j
//public class VaultDemoApplication implements CommandLineRunner {
//	public VaultDemoApplication(SecretStuffConfig secretStuffConfig) {
//		this.secretStuffConfig = secretStuffConfig;
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(VaultDemoApplication.class, args);
////	}
//
//	private final SecretStuffConfig secretStuffConfig;
//
//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("secret username: " + secretStuffConfig.getUser());
//		System.out.println("secret password: " + secretStuffConfig.getPassword());
//		System.out.println("secret car: " + secretStuffConfig.getCar());
//
//	}
//
//}
