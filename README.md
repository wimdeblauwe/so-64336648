# Stackoverflow question 64336648

This repo has a reproducable testcase for the question at https://stackoverflow.com/questions/64336648/moving-elementcollection-to-embeddable-class-not-working

## `noembed` package

The `MyEntity`, `MyEntityRepository` and `MyEntityRepositoryTest` show the use of `@ElementCollection` without embedding.

When running the `MyEntityRepositoryTest`, we see that Hibernate inserts the double values into the database (as it should be):

```
Hibernate: insert into my_entity (id) values (?)
Hibernate: insert into my_entity_doubles (my_entity_id, doubles_order, doubles) values (?, ?, ?)
Hibernate: insert into my_entity_doubles (my_entity_id, doubles_order, doubles) values (?, ?, ?)
```

## `embed` package

This is similar to `MyEntity`, but now using embedding via the `Doubles` class.

Running `MyEntity2RepositoryTest` shows:

```
Hibernate: insert into my_entity2 (id) values (?)
Hibernate: insert into my_entity2_doubles (my_entity2_id, doubles_order, doubles) values (?, ?, ?)
Hibernate: insert into my_entity2_doubles (my_entity2_id, doubles_order, doubles) values (?, ?, ?)
```

Which is also correct.

## `mappedsuperclass` package

This uses an abstract superclass called `AbstractEntity` that is mapped as `@MappedSuperClass`.

Running `MyEntity3RepositoryTest` shows:

```
Hibernate: insert into my_entity3 (id) values (?)
```

And the test fails because the doubles are not stored by Hibernate.
