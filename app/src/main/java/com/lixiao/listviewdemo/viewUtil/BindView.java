package com.lixiao.listviewdemo.viewUtil;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Administrator on 2016/4/1.
 */
@Retention(RetentionPolicy.CLASS)
public @interface BindView {
    int resId();
    String bindMethod() default "";


}
