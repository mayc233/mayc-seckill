package org.seckill.exception;

/**
 * 秒杀相关业务异常
 * Created by MACHENIKE on 2016/7/15.
 */
public class SeckillException extends RuntimeException{
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
