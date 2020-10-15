package com.wimdeblauwe.so.embeddableelementcollection;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.OrderColumn;
import java.util.List;

@Embeddable
public class Doubles {
    @ElementCollection
    @OrderColumn
    private List<Double> doubles;

    public List<Double> getDoubles() {
        return doubles;
    }

    public void setDoubles(List<Double> doubles) {
        this.doubles = doubles;
    }
}
