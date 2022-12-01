import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

import static java.lang.Math.random;

public class ArrayMaker {
    int sum = 0;
    String[][] array1;

    public String[][] makeArray(int firstSize, int secondSize) throws MyArrayDataException, MyArraySizeException {
        if (firstSize != 4 || secondSize != 4) {
            throw new MyArraySizeException("Массив должен быть 4 на 4");
        }
        String[][] array1 = new String[firstSize][secondSize];
        for (int j = 0; j < array1.length; j++) {
            for (int i = 0; i < array1.length; i++) {
                Random random = new Random();
                array1[i][j] = String.valueOf(random.nextInt(3));
            }
        }
        System.out.println("Cоздан массив с размером " + firstSize + " на " + secondSize + " и заполнен случайными значениями");
        array1[2][2] = "re";
        int[][] numbers = new int[array1.length][array1.length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                try {
                numbers[i][j] = Integer.parseInt(array1[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("В ячейке" +"["+ i+ "]"+ "[ "+j + "]" +  "не числовое значение, оэтому сделаем ему принудительно 7 ");
                    array1[i][j] = "7";
                    numbers[i][j] = Integer.parseInt(array1[i][j]);
                }

                sum = sum + numbers[i][j];
            }
            System.out.println(numbers[1][1] + numbers[1][2]);

        }
        System.out.println(sum);
        System.out.println(Arrays.deepToString(numbers));
        return array1;
    }

        @Override
        public String toString () {
            return "ArrayMaker{" +
                    "sum=" + sum +
                    "array1" + '}';
        }
    }




