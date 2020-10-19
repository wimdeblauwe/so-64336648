package com.wimdeblauwe.so.embeddableelementcollection.embed;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("embedMyEntity2Repository")
public interface MyEntity2Repository extends CrudRepository<MyEntity2, Long> {
}
