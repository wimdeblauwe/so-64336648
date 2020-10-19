package com.wimdeblauwe.so.embeddableelementcollection.mappedsuperclass;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.OrderColumn;
import java.util.List;

@Embeddable
public class Doubles {
    @ElementCollection
    @OrderColumn
    private List<Double> doubles;

    protected Doubles() {
    }

    public Doubles(List<Double> doubles) {
        this.doubles = doubles;
    }

    public List<Double> getDoubles() {
        return doubles;
    }

    public void setDoubles(List<Double> doubles) {
        this.doubles = doubles;
    }
}
