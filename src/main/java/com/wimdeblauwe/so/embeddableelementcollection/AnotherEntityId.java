package com.wimdeblauwe.so.embeddableelementcollection;

import io.github.wimdeblauwe.jpearl.AbstractEntityId;

public class AnotherEntityId extends AbstractEntityId<Long> {
    protected AnotherEntityId() {
    }

    public AnotherEntityId(Long id) {
        super(id);
    }
}
