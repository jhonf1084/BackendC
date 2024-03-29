package com.example.BackendC.Seguridad;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.io.IOException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.util.Collections;

public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {

        AuthCredentials authCredentials = new AuthCredentials();
         try{
             authCredentials = new ObjectMapper().readValue(request.getReader(), AuthCredentials.class);

         } catch (IOException | java.io.IOException ignored){
         }


        UsernamePasswordAuthenticationToken usernamePAT = new UsernamePasswordAuthenticationToken(
                authCredentials.getcorreoUsuario(),
                authCredentials.getContrasena(),
                Collections.emptyList()
        );

        return getAuthenticationManager().authenticate(usernamePAT);
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request,
                                            HttpServletResponse response,
                                            FilterChain chain,
                                            Authentication authResult) throws java.io.IOException, ServletException {
       UserDetailsImpl userDetails=  (UserDetailsImpl) authResult.getPrincipal();
       String token = TokenUtils.createToken(userDetails.getNombres(), userDetails.getUsername());

       response.addHeader("Autorizacion","Bearer " + token);
       response.addHeader("Content-Type","application/json");
       response.getWriter().write("{\"token\": \""+token+"\"}");
       response.getWriter().flush();


        super.successfulAuthentication(request, response, chain, authResult);
    }
}
