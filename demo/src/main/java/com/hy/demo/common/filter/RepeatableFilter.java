package com.hy.demo.common.filter;

import com.hy.demo.common.utils.StringUtils;
import org.springframework.http.MediaType;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 *  Repeatable 过滤器
 */
public class RepeatableFilter implements Filter
{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        ServletRequest requestWrapper = null;
        if (servletRequest instanceof HttpServletRequest && StringUtils.equalsAnyIgnoreCase(servletRequest.getContentType(),
                MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE))
        {
            requestWrapper = new RepeatedlyRequestWrapper((HttpServletRequest) servletRequest, servletResponse);
        }
        if (null == requestWrapper)
        {
            filterChain.doFilter(servletRequest, servletResponse);
        }
        else
        {
            filterChain.doFilter(requestWrapper, servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
