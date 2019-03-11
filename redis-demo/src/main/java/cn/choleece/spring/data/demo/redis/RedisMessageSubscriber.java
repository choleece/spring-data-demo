package cn.choleece.spring.data.demo.redis;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author choleece
 * @date 2019/3/11
 */
@Service
public class RedisMessageSubscriber implements MessageListener {

    public static List<String> messageList = new ArrayList<>();

    @Override
    public void onMessage(Message message, @Nullable byte[] pattern) {
        messageList.add(message.toString());
        System.out.println("received message: " + message.toString());
    }
}
