package com.example.hateoasdemo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class B {
    @Id
    @GeneratedValue
    private Long identifier;
    
    private String name;
    
    @ManyToMany
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<A> as = new HashSet<>();
}
