package com.wimdeblauwe.so.embeddableelementcollection;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyEntity2 {
    @Id
    private long id;

    @Embedded
    private Doubles doubles;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Doubles getDoubles() {
        return doubles;
    }

    public void setDoubles(Doubles doubles) {
        this.doubles = doubles;
    }
}
