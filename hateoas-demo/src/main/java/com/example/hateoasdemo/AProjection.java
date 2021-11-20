package com.example.hateoasdemo;

import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(types = A.class, name = "AProjection")
public interface AProjection {
    String getName();
    
    Set<BProjection> getBs();
}
