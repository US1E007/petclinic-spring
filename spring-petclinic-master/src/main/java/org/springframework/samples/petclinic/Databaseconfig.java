package org.springframework.samples.petclinic;

//import javax.sql.DataSource;
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
//import org.springframework.boot.context.properties.ConfigurationProperties;
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
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@RefreshScope
//@Configuration
//public class Databaseconfig {
//
//	@RefreshScope
//	@Bean
//    public static DataSource getDataSource() throws VaultException {
//		
//		File sslCertificate = new File("spring.jks");
//		VaultConfig config =new VaultConfig()
//                    .address("https://ec2-34-221-22-45.us-west-2.compute.amazonaws.com:8200")
//                    .token("s.TcO4eyhdNXX5MR46b8mDyx9M")
//                    .build()
//                    .sslConfig(new SslConfig().verify(true).trustStoreFile(sslCertificate).build());
//        Vault vault = new Vault(config);
//        
//        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//        
//        String username = vault.logical()
//	            .read("secret/spring-petclinic")
//	            .getData().get("spring.datasource.username");
//	     String password = vault.logical()
//		            .read("secret/spring-petclinic")
//		            .getData().get("spring.datasource.password");
//	     String url = vault.logical()
//		            .read("secret/spring-petclinic")
//		            .getData().get("spring.datasource.url");
//        
//        dataSourceBuilder.url(url);
//        dataSourceBuilder.username(username);
//        dataSourceBuilder.password(password);
//        System.out.println(password);
//        return dataSourceBuilder.build();
//    }
//	
//}
