package com.bupt.auth.dao;

import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bupt.app.auth.dao.UserMapper;
import com.bupt.app.auth.model.User;
import com.bupt.app.auth.model.UserExample;
import com.bupt.app.auth.model.UserExample.Criteria;

public class UserMapperTest     extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public UserMapperTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( UserMapperTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testUserMapper()
    {
		ApplicationContext aContext = new FileSystemXmlApplicationContext("src/main/resources/com/bupt/config/applicationContext.xml");
		UserMapper userMapper = aContext.getBean(UserMapper.class);
		User user = new User();
		user.setLoginname("张三");
		user.setPassword("18");
		userMapper.insert(user);
		
		UserExample ue = new UserExample();
		Criteria criteri = ue.createCriteria();
		criteri.andLoginnameEqualTo("张三");
		List<User> resultUserExcample = userMapper.selectByExample(ue);
		System.out.println(resultUserExcample.get(0));
		assertTrue(resultUserExcample!=null&&resultUserExcample.size()>0);
    }
}
