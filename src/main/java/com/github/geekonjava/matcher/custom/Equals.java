package com.github.geekonjava.matcher.custom;

import com.github.geekonjava.matcher.Matcher;

public class Equals implements Matcher {

  private final Object value;

  public Equals(Object value) {
    this.value = value;
  }

  @Override
  public boolean match(Object anotherValue) {
    return value.equals(anotherValue);
  }

}
