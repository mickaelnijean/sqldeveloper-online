package com.mybatis.sqldeveloperonline;

import com.mybatis.sqldeveloperonline.repository.DataModel;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(DataModel.class)
@MapperScan("com.mybatis.sqldeveloperonline.repository")
@SpringBootApplication
public class SqldeveloperOnlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqldeveloperOnlineApplication.class, args);
	}

}
