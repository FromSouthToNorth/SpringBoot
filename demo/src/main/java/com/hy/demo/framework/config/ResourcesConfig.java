package com.hy.demo.framework.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 通用配置
 */
@Configuration
public class ResourcesConfig implements WebMvcConfigurer
{

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {

    }

    /**
     * 自定义拦截规则
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {

    }

    /**
     * 跨域配置
     */
    @Override
    public void addCorsMappings(CorsRegistry registry)
    {
                // 设置允许跨域的路径
        registry.addMapping("/**")
                // 设置允许跨域请求的域名
                .allowedOrigins("*")
                // 是否允许证书
                .allowCredentials(true)
                // 设置允许的header属性
                .allowedHeaders("*")
                // 设置允许的方法
                .allowedMethods("*");
    }
}
