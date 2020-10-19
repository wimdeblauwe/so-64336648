package com.wimdeblauwe.so.embeddableelementcollection.noembed;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OrderColumn;
import java.util.List;

@Entity
public class MyEntity {
  @Id
  private long id;

  @ElementCollection
  @OrderColumn
  private List<Double> doubles;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public List<Double> getDoubles() {
    return doubles;
  }

  public void setDoubles(List<Double> doubles) {
    this.doubles = doubles;
  }
}
