package com.example;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingCollectorExample {

  public static void main(String[] args) {
    /**
     * Every element passed to the resulting collector is processed by both downstream
     * collectors, then their results are merged using the specified merge function
     * into the final result.
     */
    double mean = Stream.of(1, 2, 3, 4, 5).collect(
        Collectors.teeing(
            Collectors.summingDouble(i -> i),
            Collectors.counting(),
            (sum, counting) -> sum / counting
        )
    );

    // 15/5 = 3
    System.out.println(mean);

  }

}
