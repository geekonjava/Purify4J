package com.github.geekonjava.query.specification;

import com.github.geekonjava.query.criteria.Criteria;

public interface Specification<T> {

  boolean match(T item, Criteria<T> one, Criteria<T> other);

}
