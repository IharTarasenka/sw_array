package com.soft_swiss.array_task.readers;

import com.soft_swiss.array_task.custom_exceptions.NoLineInFileException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ArrayReader {

    public static String[] readArrayFromFile(String path) {
        return readArrayFromFile(new File(path));
    }

    public static String[] readArrayFromFile(File file) {
        try {
            return Files.lines(file.toPath()).findFirst().orElseThrow(() -> new NoLineInFileException("Now Line in file")).split(" ");
        } catch (IOException e) {
            throw new RuntimeException("Problem with I/O " + e.getMessage());
        } catch (NoLineInFileException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException("Something wrong.");
        }
    }
}
