package com.teamProject.lostArkProject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.teamProject.lostArkProject.**.mapper") // 모든 기능별 하위 패키지의 mapper를 스캔

public class LostArkProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(LostArkProjectApplication.class, args);
	}

}
