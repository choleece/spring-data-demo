package cn.choleece.spring.data.demo.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;

/**
 * Created by choleece on 2019/3/11.
 */
public class RedisMessagePublisher implements MessagePublisher {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private ChannelTopic channelTopic;

    public RedisMessagePublisher() {
    }

    public RedisMessagePublisher(RedisTemplate redisTemplate, ChannelTopic channelTopic) {
        this.redisTemplate = redisTemplate;
        this.channelTopic = channelTopic;
    }

    @Override
    public void publish(String message) {
        redisTemplate.convertAndSend(channelTopic.getTopic(), message);
    }
}
