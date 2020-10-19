package com.wimdeblauwe.so.embeddableelementcollection;

import javax.persistence.*;
import java.util.List;

@Embeddable
public class Doubles {
    @ManyToOne(fetch = FetchType.LAZY)
    private AnotherEntity anotherEntity;

    @ElementCollection
    @OrderColumn
    private List<Double> doubles;

    protected Doubles() {
    }

    public Doubles(AnotherEntity anotherEntity, List<Double> doubles) {
        this.doubles = doubles;
    }

    public List<Double> getDoubles() {
        return doubles;
    }

    public void setDoubles(List<Double> doubles) {
        this.doubles = doubles;
    }
}
