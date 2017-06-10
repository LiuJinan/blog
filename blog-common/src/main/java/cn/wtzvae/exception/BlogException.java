package cn.wtzvae.exception;

/**
 * 所有其他自定义异常都要继承BlogException
 * Created by LiuJinan on 2017/6/10.
 */
public class BlogException extends RuntimeException {

    public BlogException(Object obj){
        super(obj.toString());
    }

}
