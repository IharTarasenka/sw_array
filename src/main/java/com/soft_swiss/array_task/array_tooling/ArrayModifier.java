package com.soft_swiss.array_task.array_tooling;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ArrayModifier {

    public static <T> List<T> concatArray(T[] array1, T[] array2) {
        return Stream.concat(Stream.of(array1), Stream.of(array2)).collect(toList());
    }

    public static <T extends String> List<Integer> listToInt(List<T> list) {
        return list.stream().map(Integer::parseInt).collect(toList());
    }

    public static <T> List<T> distinctList(List<T> list) {
        return list.stream().distinct().collect(toList());
    }

    public static <T> List<T> sortList(List<T> list) {
        return list.stream().sorted().collect(toList());
    }
}
