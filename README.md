# Stackoverflow question 64336648

This repo has a reproducable testcase for the question at https://stackoverflow.com/questions/64336648/moving-elementcollection-to-embeddable-class-not-working

## MyEntity

The `MyEntity`, `MyEntityRepository` and `MyEntityRepositoryTest` show the use of `@ElementCollection` without embedding.

When running the `MyEntityRepositoryTest`, we see that Hibernate inserts the double values into the database (as it should be):

```
Hibernate: insert into my_entity (id) values (?)
Hibernate: insert into my_entity_doubles (my_entity_id, doubles_order, doubles) values (?, ?, ?)
Hibernate: insert into my_entity_doubles (my_entity_id, doubles_order, doubles) values (?, ?, ?)
```

## MyEntity2

This is similar to `MyEntity`, but now using embedding via the `Doubles` class.

Running `MyEntity2RepositoryTest` shows:

```
Hibernate: insert into my_entity2 (id) values (?)
```

There are no inserts done to `my_entity2_doubles` as I would expect.
