package com.wimdeblauwe.so.embeddableelementcollection;

import org.springframework.data.repository.CrudRepository;

public interface MyEntityRepository extends CrudRepository<MyEntity, Long> {
}
