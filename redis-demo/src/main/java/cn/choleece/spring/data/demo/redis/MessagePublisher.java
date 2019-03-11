package cn.choleece.spring.data.demo.redis;

/**
 *
 * @author choleece
 * @date 2019/3/11
 */
public interface MessagePublisher {
    void publish(String message);
}
