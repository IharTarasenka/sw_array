package com.soft_swiss.array_task.util;

import java.util.List;

import static com.soft_swiss.array_task.array_tooling.ArrayModifier.*;
import static com.soft_swiss.array_task.readers.ArrayReader.readArrayFromFile;

public class ArrayUtil {

    public static List<Integer> getMultipleArray(String pathFirstFile, String pathSecondFile) {
        String[] array1 = readArrayFromFile(pathFirstFile);
        String[] array2 = readArrayFromFile(pathSecondFile);
        List<Integer> list = listToInt(concatArray(array1, array2));
        return sortList(distinctList(list));
    }
}
