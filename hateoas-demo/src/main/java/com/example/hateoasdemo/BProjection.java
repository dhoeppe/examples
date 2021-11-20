package com.example.hateoasdemo;

import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(types = B.class, name = "BProjection")
public interface BProjection {
    String getName();
    
    Set<A> getAs();
}
