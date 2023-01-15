//3 Написати програму, яка вираховує середнє арифметичне всіх елементів у масиві з 10 випадкових чисел.
package ua.hillel.nikolaieva.homework4;
import java.util.Random;
import java.util.Arrays;

public class FindArrayAverageValue {

    public static void main(String[] args) {

        int [] randomArray = new int [10];
        int avg;

        fillTheArrayWithRandomValues(randomArray);
        System.out.println(Arrays.toString(randomArray));

        avg = getAverage(randomArray);
        System.out.println(avg);
    }

    public static void fillTheArrayWithRandomValues (int [] randomArray) {
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = random.nextInt(100);
        }
    }

    public static int getAverage (int [] randomArray){
        int i = 0;
        int total = 0;
        while (i < randomArray.length) {
            total = total + randomArray[i];
            i++;
        }
        return total / randomArray.length;
    }

}

