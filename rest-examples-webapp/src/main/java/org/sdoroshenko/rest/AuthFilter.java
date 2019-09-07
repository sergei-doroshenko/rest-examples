package org.sdoroshenko.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * An authentication filter.
 */
@Component
public class AuthFilter extends GenericFilterBean {

    private static final Logger logger = LoggerFactory.getLogger(AuthFilter.class);

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String pathInfo = httpServletRequest.getPathInfo();
        logger.info("AuthFilter intercept: {}", pathInfo);
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
