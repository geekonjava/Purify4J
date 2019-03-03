package com.github.geekonjava;

import java.util.Collection;

import com.github.geekonjava.matcher.Matcher;
import com.github.geekonjava.matcher.custom.Contains;
import com.github.geekonjava.matcher.custom.Equals;
import com.github.geekonjava.matcher.custom.EqualsIgnoreCase;
import com.github.geekonjava.matcher.custom.GreaterThan;
import com.github.geekonjava.matcher.custom.IsNull;
import com.github.geekonjava.matcher.custom.LessThan;
import com.github.geekonjava.matcher.custom.Not;
import com.github.geekonjava.query.Query;

public class Refination {

  public static <T> Query<T> from(Collection<T> collection) {
    return new Query<T>(collection);
  }

  public static Matcher eq(Object value) {
    return new Equals(value);
  }

  public static Matcher contains(String value) {
    return new Contains(value);
  }

  public static Matcher eqIgnoreCase(String value) {
    return new EqualsIgnoreCase(value);
  }

  public static Matcher not(Matcher matcher) {
    return new Not(matcher);
  }

  public static Matcher greaterThan(Number value) {
    return new GreaterThan(value);
  }

  public static Matcher lessThan(Number value) {
    return new LessThan(value);
  }

  public static Matcher isNull() {
    return new IsNull();
  }

}
