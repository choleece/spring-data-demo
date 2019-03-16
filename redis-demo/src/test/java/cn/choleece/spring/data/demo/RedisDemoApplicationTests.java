package cn.choleece.spring.data.demo;

import cn.choleece.spring.data.demo.redis.RedisMessagePublisher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisDemoApplicationTests {
	@Autowired
	private RedisTemplate redisTemplate;
	@Autowired
	private RedisMessagePublisher redisMessagePublisher;

	@Test
	public void contextLoads() {
		redisTemplate.opsForValue().set("gender", "M");
		System.out.println(redisTemplate.opsForValue().get("gender"));
	}

	@Test
	public void testRedisPubSub() {
		redisMessagePublisher.publish("hello world, I am choleece");
	}

}
