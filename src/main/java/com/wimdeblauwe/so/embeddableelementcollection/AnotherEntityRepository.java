package com.wimdeblauwe.so.embeddableelementcollection;

import org.springframework.data.repository.CrudRepository;

public interface AnotherEntityRepository extends CrudRepository<AnotherEntity, Long> {
}
