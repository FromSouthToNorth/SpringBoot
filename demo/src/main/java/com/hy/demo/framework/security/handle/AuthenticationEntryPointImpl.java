package com.hy.demo.framework.security.handle;

import com.alibaba.fastjson.JSON;
import com.hy.demo.common.constant.HttpStatus;
import com.hy.demo.common.core.domain.AjaxResult;
import com.hy.demo.common.utils.ServletUtils;
import com.hy.demo.common.utils.StringUtils;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

/**
 * 认证失败处理类 返回未授权
 */
@Component
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint, Serializable
{
    private static final long serialVersionUID  = -8970718410437077606L;

    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse
            httpServletResponse, AuthenticationException e) throws IOException, ServletException
    {
        // 返回状态码 401
        int code = HttpStatus.UNAUTHORIZED;
        // 提示消息
        String msg = StringUtils.format("请求访问：{}，认证失败，无法访问系统资源", httpServletRequest.getRequestURI());
        ServletUtils.renderString(httpServletResponse, JSON.toJSONString(AjaxResult.error(code, msg)));
    }
}
