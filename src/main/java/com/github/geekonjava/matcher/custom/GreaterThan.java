package com.github.geekonjava.matcher.custom;

import com.github.geekonjava.matcher.Matcher;

public class GreaterThan implements Matcher {

  private final Number value;

  public GreaterThan(Number value) {
    this.value = value;
  }

  @Override
  public boolean match(Object matchValue) {
    if (matchValue == null) {
      return false;
    }
    return ((Number) matchValue).doubleValue() > value.doubleValue();
  }

}
