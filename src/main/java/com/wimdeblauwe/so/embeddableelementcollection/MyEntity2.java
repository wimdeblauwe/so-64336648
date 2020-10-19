package com.wimdeblauwe.so.embeddableelementcollection;

import io.github.wimdeblauwe.jpearl.AbstractEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyEntity2 extends AbstractEntity<MyEntity2Id> {

    @Embedded
    private Doubles doubles;

    protected MyEntity2() {
    }

    public MyEntity2(MyEntity2Id id, Doubles doubles) {
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
