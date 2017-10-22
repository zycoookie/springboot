package me.coookie.springboot.web.util;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter4;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

/**
 * Created by cookie on 2017/10/5.
 */
@Configuration
public class HttpMessageConverterConfigure {
    @Bean
    public HttpMessageConverters customConverters() {
        HttpMessageConverter<?> jsonMessageConverer = new FastJsonHttpMessageConverter4();
        return new HttpMessageConverters(jsonMessageConverer);
    }
}
