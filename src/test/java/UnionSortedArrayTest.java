import com.soft_swiss.array_task.custom_exceptions.NoLineInFileException;
import lombok.NoArgsConstructor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static com.soft_swiss.array_task.util.ArrayUtil.getMultipleArray;

@NoArgsConstructor
public class UnionSortedArrayTest {

    @DataProvider
    public Object[] validData() {
        return new Object[][]{
                {"Lists aren't equal(dublicated value)",
                        "src\\test\\resources\\testArray\\positive\\base_array.txt",
                        "src\\test\\resources\\testArray\\positive\\base_array_1.txt",
                        Arrays.asList(0, 1, 2, 3, 4, 10, 40)},
                {"Lists aren't equal(Negative value)",
                        "src\\test\\resources\\testArray\\positive\\base_array.txt",
                        "src\\test\\resources\\testArray\\positive\\array_with_negative_value.txt",
                        Arrays.asList(-10, 0, 1, 2, 3, 4, 40)},
        };
    }

    @Test(dataProvider = "validData")
    public static void positiveTest(String description, String pathOne, String pathSecond, List<Integer> expected) {
        List<Integer> actualValue = getMultipleArray(pathOne, pathSecond);
        Assert.assertEquals(actualValue, expected, description);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public static void integerConvertNegativeTest() {
        String pathOne = "src\\test\\resources\\testArray\\positive\\base_array.txt";
        String pathSecond = "src\\test\\resources\\testArray\\negative\\array_with_incorrect_int.txt";
        getMultipleArray(pathOne, pathSecond);
    }

    @Test(expectedExceptions = RuntimeException.class, expectedExceptionsMessageRegExp = "Problem with I/O .*")
    public static void incorrectPathToFileNegativeTest() {
        String pathOne = "src\\test\\resources\\testArray\\positive\\base_array.txt";
        String pathSecond = "src\\test\\resources\\testArray\\neg\\array_with_incorrect_int.txt";
        getMultipleArray(pathOne, pathSecond);
    }

    @Test(expectedExceptions = NoLineInFileException.class, expectedExceptionsMessageRegExp = "Now Line in file")
    public static void emptyFileNegativeTest() {
        String pathOne = "src\\test\\resources\\testArray\\positive\\base_array.txt";
        String pathSecond = "src\\test\\resources\\testArray\\negative\\array_empty.txt";
        getMultipleArray(pathOne, pathSecond);
    }
}
