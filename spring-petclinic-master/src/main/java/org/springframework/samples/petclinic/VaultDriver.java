//package org.springframework.samples.petclinic;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.sql.DriverManager;
//import java.text.ParseException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Properties;
//import java.util.Scanner;
//
//import org.apache.tomcat.util.json.JSONParser;
//
//import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Cache.Connection;
//
//import com.bettercloud.vault.SslConfig;
//import com.bettercloud.vault.Vault;
//import com.bettercloud.vault.VaultConfig;
//import com.bettercloud.vault.VaultException;
//import com.bettercloud.vault.response.AuthResponse;
//import com.bettercloud.vault.response.DatabaseResponse;
//import com.bettercloud.vault.response.LogicalResponse;
//import com.bettercloud.vault.api.Seal;
//import com.bettercloud.vault.api.database.DatabaseCredential;
//import com.bettercloud.vault.api.database.DatabaseRoleOptions;
//import com.bettercloud.vault.api.pki.RoleOptions;
//import com.bettercloud.vault.response.SealResponse;
//import com.bettercloud.vault.rest.Rest;
//import com.bettercloud.vault.rest.RestResponse;
//
//
//public class VaultDriver {
//
//	public static void main(String[] args) throws  ParseException, VaultException, IOException {
//		
////		Scanner sc = new Scanner(System.in);
////		System.out.println("Enter the Vault Token");
////		String Token = sc.next();
////		System.out.println("Enter the Vault Address");
////		String Address = sc.next(); 
//		
//		File sslCertificate = new File("spring.jks");
//		VaultConfig config =new VaultConfig()
//                    .address("https://ec2-34-221-22-45.us-west-2.compute.amazonaws.com:8200")
//                    .token("s.TcO4eyhdNXX5MR46b8mDyx9M")
//                    .build()
//                    .sslConfig(new SslConfig().verify(true).trustStoreFile(sslCertificate).build());
//        Vault vault = new Vault(config);
//    //Writing secrets in Vault 
//        final Map<String, Object> secrets = new HashMap<String, Object>();
//        secrets.put("b.username", "root");
//        secrets.put("password", "12345");
//        final LogicalResponse writeResponse = vault.logical()
//                .write("secret/database", secrets);
//       
//     //Getting secrets from Vault    
//        String username = vault.logical()
//	            .read("secret/spring-petclinic")
//	            .getData().get("spring.datasource.username");
//	     String password = vault.logical()
//		            .read("secret/spring-petclinic")
//		            .getData().get("spring.datasource.password");
//	     String url = vault.logical()
//		            .read("secret/spring-petclinic")
//		            .getData().get("spring.datasource.url");
//	     Properties properties = new Properties();
//	        properties.put("spring.datasource.username", username);
//	        properties.put("spring.datasource.username", password);
//	        properties.put("spring.datasource.username", url);
//		System.out.println("Username is " +username);
//		System.out.println("Password is " + password);
//		System.out.println("Password is " + url);
//		
//		
//	}       
//}