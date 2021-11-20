package com.example.hateoasdemo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = AProjection.class)
public interface ARepository extends PagingAndSortingRepository<A, Long> {
}
