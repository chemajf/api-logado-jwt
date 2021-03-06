package com.saga.demo.jwt.security;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.saga.demo.jwt.usuario.Usuario;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

import static com.saga.demo.jwt.security.Constants.*;

public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private AuthenticationManager authenticationManager;

    public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
            throws AuthenticationException {
        try {
            Usuario credenciales = new ObjectMapper().readValue(request.getInputStream(), Usuario.class);

            return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    credenciales.getUsername(), credenciales.getPassword(), new ArrayList<>()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
                                            Authentication auth) throws IOException, ServletException {


        String strJson = "{\"id\":14818, \"nombre\":\"La oficina mas chula del mundo\"}";
        JsonNode jsonNode = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            jsonNode = objectMapper.readTree(strJson);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<String, Object> map = new HashMap<>();
        map.put("perona", "humana");
        map.put("oficina", jsonNode);

        String token = Jwts.builder()
                .setClaims(map)
                .setIssuedAt(new Date())
                .setIssuer(ISSUER_INFO)
                .setSubject(((User) auth.getPrincipal()).getUsername())
                .setId("Identificador único del token incluso entre diferente proveedores de servicio")
                .setExpiration(calculateExpirationDate())
                .signWith(SignatureAlgorithm.HS512, SUPER_SECRET_KEY).compact();
        response.addHeader(HEADER_AUTHORIZACION_KEY, TOKEN_BEARER_PREFIX + " " + token);
    }

    /**
     * Calcula el tiempo de expiración del TOKEN
     *
     * @return
     */
    private Date calculateExpirationDate() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.add(GregorianCalendar.MINUTE, TOKEN_EXPIRATION_TIME_MINUTES);
        return new Date(gregorianCalendar.getTimeInMillis());
    }
}
