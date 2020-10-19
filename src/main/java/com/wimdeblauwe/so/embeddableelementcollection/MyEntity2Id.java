package com.wimdeblauwe.so.embeddableelementcollection;

import io.github.wimdeblauwe.jpearl.AbstractEntityId;

public class MyEntity2Id extends AbstractEntityId<Long> {
    protected MyEntity2Id() {
    }

    public MyEntity2Id(Long id) {
        super(id);
    }
}
