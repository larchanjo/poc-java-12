package com.example;

public class SwitchExpressionExample {

  public static void main(String[] args) {
    System.out.println(javaReleaseDate(12));
    System.out.println(javaReleaseDate(13));
    System.out.println(javaReleaseDate(5));
  }

  public static String javaReleaseDate(final int version) {
    return switch (version) {
      case 12 -> "19.3";
      case 13 -> "19.9";
      default -> "Unknown versin";
    };
  }

}
