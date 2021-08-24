package com.mszlu.blog.common.app;

import java.lang.annotation.*;
// type代表可以放在类上，method表示可以放在方法上
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAnnotation {

    String module() default "";

    String operator() default "";
}
