package com.github.geekonjava.matcher.custom;

import com.github.geekonjava.matcher.Matcher;

public class Not implements Matcher {

  private final Matcher matcher;

  public Not(Matcher matcher) {
    this.matcher = matcher;
  }

  @Override
  public boolean match(Object value) {
    return !matcher.match(value);
  }

}
