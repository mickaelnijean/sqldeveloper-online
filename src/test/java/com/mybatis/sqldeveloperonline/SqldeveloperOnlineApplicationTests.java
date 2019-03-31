package com.mybatis.sqldeveloperonline;

import com.mybatis.sqldeveloperonline.controller.RestController;
import com.mybatis.sqldeveloperonline.repository.Users;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SqldeveloperOnlineApplicationTests {

	@Autowired
	RestController controller;

	@Test
	public void shouldGetDataWithOneParameter() {
		List<Users> byFirstName = controller.getByFirstName("Conor");

		Assert.assertTrue(byFirstName.size()==1);
	}

	@Test
	public void shouldgetDataWith2PArameterEvenTableName() {
		List<Users> byFirstName = controller.getByTableNameAndConstraint("USERS","FIRST_NAME = 'Conor'");

		Assert.assertTrue(byFirstName.size()==1);
	}

	@Test
	public void shouldgetDataWith2ParameterEvenTableNameAndReturnTypeGlobal() {
		List<Map<String,String>> byFirstName = controller.getByTableNameAndConstraintWithAbstractType("USERS","FIRST_NAME = 'Conor'");

		Assert.assertTrue(byFirstName.size()==1);
	}

	@Test
	public void shouldFailedParameterDontExist() {
		List<Map<String,String>> byFirstName = controller.getByTableNameAndConstraintWithAbstractType("USERS","FIRST_NAME = 'Conor'");

		Assert.assertTrue(byFirstName.size()==1);
	}

}
