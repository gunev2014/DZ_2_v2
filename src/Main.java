import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws MyArraySizeException {
        ArrayMaker arr = new ArrayMaker();

        try {
            arr.makeArray(3, 4);
        } catch (MyArraySizeException e) {
            System.out.println("Массив должен быть 4 на 4 ");
            System.out.println("Автоматическая замена размера на 4 на 4  ");
            arr.makeArray(4, 4);


        }
    }
}

