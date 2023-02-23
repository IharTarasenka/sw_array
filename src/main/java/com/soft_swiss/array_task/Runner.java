package com.soft_swiss.array_task;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.soft_swiss.array_task.readers.ConsoleReader.readValue;
import static com.soft_swiss.array_task.util.ArrayUtil.getMultipleArray;

public class Runner {

    private static final String GET_PATH = "Get path for %s file: ";

    public static void main(String[] args) {
        Integer iOb1 = 100;
        Integer iOb2 = 100;
        System.out.println(iOb1 == iOb2);

        Integer iOb11 = 128;
        Integer iOb22 = 128;
        System.out.println(iOb11 == iOb22);

        Integer iOb3 = Integer.valueOf(120);
        Integer iOb4 = Integer.valueOf(120);
        System.out.println(iOb3 == iOb4);

        Integer iOb5 = 200;
        Integer iOb6 = 200;
        System.out.println(iOb5 == iOb6);
//        List<Integer> combineArray = getMultipleArray(readValue(String.format(GET_PATH, "first")), readValue(String.format(GET_PATH, "second")));
//        System.out.println(combineArray);

        // будем искать URL
//        String regexp = "^(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?$";
//        String url = "http://habrahabr.ru/post/260767/";
//
//        Pattern pattern = Pattern.compile(regexp);
//        Matcher matcher = pattern.matcher(url);
    }
}
