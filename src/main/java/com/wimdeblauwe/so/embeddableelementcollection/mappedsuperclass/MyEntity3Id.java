package com.wimdeblauwe.so.embeddableelementcollection.mappedsuperclass;

import io.github.wimdeblauwe.jpearl.AbstractEntityId;

public class MyEntity3Id extends AbstractEntityId<Long> {
    protected MyEntity3Id() {
    }

    public MyEntity3Id(Long id) {
        super(id);
    }
}
