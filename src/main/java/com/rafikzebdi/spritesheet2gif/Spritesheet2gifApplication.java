package com.rafikzebdi.spritesheet2gif;

import com.rafikzebdi.spritesheet2gif.configuration.FileStorageProperties;
import com.rafikzebdi.spritesheet2gif.service.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class Spritesheet2gifApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spritesheet2gifApplication.class, args);
	}
}
