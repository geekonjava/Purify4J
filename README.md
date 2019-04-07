
## Why use Purify4J? ![Purify4J](https://img.shields.io/badge/Maven-Purify4J-green.svg)
If you want to iterate over a collection is a easiest way to filtering, mapping and ordering. It is a cool way to manipulate collections in Java.
![enter image description here](https://i.ibb.co/0q50xmK/purify4j.png)

## How it works?
It's easy to use. Just add `import static com.github.geekonjava.Refination.*;` in your class and that's it!
## How to use this?
### 1 - For Filter

First you need a Collection. Here we create a Animal List, and we called it animals.

    List<Animal> animals;

Later you goes add a lot of animals in this list.

Now, you want to take  _all_  cats, it's easy for Purify4J! In this case, name is a method (`animal.name()`).

    from(animals).where("name", eq("Cat")).all();

Or, would the  _first_  animal with 2 year old? Easy too!

    from(animals).where("age", eq(2)).first();

### 2 - For Advance Filter

You can be more specific in your query, adding more specifications, like  _and_  and  _or_.

    from(animals).where("name", eq("Lion")).and("age", eq(2)).all();
    from(animals).where("name", eq("Dog")).or("age", eq(5)).all();

### 3 - For Matching

There are other matchers to be precise!

    eq("Cat")
    eqIgnoreCase("Cat")
    contains("og")
    greaterThan(3)
    lessThan(10)
    isNull()

Or a special matcher, called  _not_.

    not(eq("Bird"))
    not(contains("at"))
    not(isNull())

### 4 - For Ordering

Order is a very interesting feature to sort your collection.

    from(animals).where("name", eq("Cat")).orderBy("age").all();

    from(animals).where("age", eq(5)).orderBy("name", Order.DESC).first();

You can use just order, without filter.

    from(animals).orderBy("name");

Hope you like this library and useful for you!
