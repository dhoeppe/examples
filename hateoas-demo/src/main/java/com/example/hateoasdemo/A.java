package com.example.hateoasdemo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.server.core.Relation;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class A {
    @Id
    @GeneratedValue
    private Long identifier;
    
    private String name;
    
    private String projectAway;
    
    @ManyToMany(mappedBy = "as")
    @EqualsAndHashCode.Exclude
    private Set<B> bs = new HashSet<>();
    
}
