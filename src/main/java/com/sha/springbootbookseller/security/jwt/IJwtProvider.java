package com.sha.springbootbookseller.security.jwt;

import com.sha.springbootbookseller.security.UserPrincipal;
import io.jsonwebtoken.Claims;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface IJwtProvider {
    String generateToken(UserPrincipal auth);

    Authentication getAuthentication(HttpServletRequest request);

    boolean validateToken(HttpServletRequest request);

    Claims extractClaims(HttpServletRequest request);
}
