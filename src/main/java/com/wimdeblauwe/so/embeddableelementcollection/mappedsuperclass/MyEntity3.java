package com.wimdeblauwe.so.embeddableelementcollection.mappedsuperclass;

import io.github.wimdeblauwe.jpearl.AbstractEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class MyEntity3 extends AbstractEntity<MyEntity3Id> {

    @Embedded
    private Doubles doubles;

    protected MyEntity3() {
    }

    public MyEntity3(MyEntity3Id id, Doubles doubles) {
        super(id);
        this.doubles = doubles;
    }

    public Doubles getDoubles() {
        return doubles;
    }

    public void setDoubles(Doubles doubles) {
        this.doubles = doubles;
    }
}
