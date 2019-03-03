package com.github.geekonjava.query.specification.custom;

import com.github.geekonjava.query.criteria.Criteria;
import com.github.geekonjava.query.specification.Specification;

public class AndSpecification<T> implements Specification<T> {

  @Override
  public boolean match(T item, Criteria<T> one, Criteria<T> other) {
    return one.match(item) && other.match(item);
  }

}
