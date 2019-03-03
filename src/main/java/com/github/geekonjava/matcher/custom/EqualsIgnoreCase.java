package com.github.geekonjava.matcher.custom;

import com.github.geekonjava.matcher.Matcher;

public class EqualsIgnoreCase implements Matcher {

  private final String value;

  public EqualsIgnoreCase(String value) {
    this.value = value;
  }

  @Override
  public boolean match(Object anotherValue) {
    return (value).equalsIgnoreCase((String) anotherValue);
  }

}
