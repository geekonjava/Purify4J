package com.github.geekonjava.matcher.custom;

import com.github.geekonjava.matcher.Matcher;

public class IsNull implements Matcher {

  @Override
  public boolean match(Object value) {
    return value == null;
  }

}
