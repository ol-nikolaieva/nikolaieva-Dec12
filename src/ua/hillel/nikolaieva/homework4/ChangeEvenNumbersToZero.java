//2 Написати програму, яка в масиві випадкових чисел замінює всі парні числа на 0 і виводить отриманий масив на екран
package ua.hillel.nikolaieva.homework4;
import java.util.Random;
import java.util.Arrays;

public class ChangeEvenNumbersToZero {

    public static void main(String[] args) {

        int [] randomArray = new int [10];
        int avg;

        fillTheArrayWithRandomValues(randomArray);
        //System.out.println(Arrays.toString(randomArray));

        changeAllEvenNumbersToZero(randomArray);
        System.out.println(Arrays.toString(randomArray));

    }

    public static void fillTheArrayWithRandomValues (int [] randomArray) {
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = random.nextInt(100);
        }
    }

    public static void changeAllEvenNumbersToZero (int [] randomArray){

        for (int i = 0; i < randomArray.length; i++){
            if (randomArray[i] % 2 == 0) {
                randomArray[i] = 0;
            }
        }
    }


}
