package com.avicit;

import com.avicit.bean.Employee;
import com.avicit.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    EmployeeMapper employeeMapper;

	@Test
	public void contextLoads() {
	}

    /**
     * 测试redis操作字符串
     */
	@Test
    public void test01(){
	    //stringRedisTemplate.opsForValue().append("msg","helloword");
        String msg = stringRedisTemplate.opsForValue().get("msg");
        System.out.println(msg);
    }


    /**
     * 测试redis操作对象
     */
    @Test
    public void test02(){
        Employee employee = employeeMapper.getEmpById(1);
        redisTemplate.opsForValue().set("emp-01",employee);

    }

}
