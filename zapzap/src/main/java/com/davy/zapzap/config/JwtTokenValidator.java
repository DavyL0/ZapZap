package com.davy.zapzap.config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

/**
 * Project: ZapZap
 * Package: com.davy.zapzap.config
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 15/08/2025
 * Time: 13:48
 * <p>
 */
public class JwtTokenValidator extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String jwt = request.getHeader("Authorization");
    }

}
