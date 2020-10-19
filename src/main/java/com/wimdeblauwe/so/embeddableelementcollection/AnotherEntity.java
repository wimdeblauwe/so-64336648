package com.wimdeblauwe.so.embeddableelementcollection;

import io.github.wimdeblauwe.jpearl.AbstractEntity;

import javax.persistence.Entity;

@Entity
public class AnotherEntity extends AbstractEntity<AnotherEntityId> {
    protected AnotherEntity() {
    }

    public AnotherEntity(AnotherEntityId id) {
        super(id);
    }
}
