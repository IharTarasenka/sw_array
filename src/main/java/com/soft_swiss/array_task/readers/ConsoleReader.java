package com.soft_swiss.array_task.readers;

import java.util.Scanner;

public class ConsoleReader {

    public static String readValue(String description) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(description);
        return scanner.next();
    }
}
