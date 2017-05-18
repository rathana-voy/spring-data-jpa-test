package org.hrd.kotlin.kotlin;

import org.hrd.kotlin.kotlin.configurations.JpaConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages = "org.hrd.kotlin.kotlin")
public class KotlinApplication {

	public static void main(String[] args) {
		SpringApplication.run(KotlinApplication.class, args);
	}
}
