package com.example;

import java.util.Optional;
import java.util.UUID;

public class StringMethodExample {

  public static void main(String[] args) {
    String someString = UUID.randomUUID().toString();
    System.out.println(someString.indent(5));

    String transformResult = someString.transform(String::toUpperCase);
    System.out.println(transformResult);

    Optional<String> optionalString = someString.describeConstable();
    System.out.println(optionalString);
  }

}