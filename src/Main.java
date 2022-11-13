import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Создать массив длиной в 20, записать в массив случайные значения роста от (170 до 220).
        Сколько из них имеет рост больше 180 см, но меньше 190 см? Подсчитать, вывести эти значения и
        вывести их (баскетболистов чей рост больше 180, но меньше 190) средний рост
         */
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();



        int numbers[]= new int[20];
        for (int i=0;i< numbers.length;i++){
            numbers[i]=random.nextInt(220-170+1)+170;
            System.out.println(numbers[i]);
        }
        int count=0;
        int generalSum=0;
        int sum=0;
       for (int i=0;i< numbers.length;i++){
           generalSum+=numbers[i];
           if (numbers[i]>180 && numbers[i]<190){
               sum+=numbers[i];
                count++;
           }
       }
        System.out.println("Средний рост всех баскетболистов = "+generalSum/20+" см");
        System.out.println("Средний рост между 180 и 190 = "+sum/count+" см");

        /*
          Заполните массив случайными числами в интервале от 0 до 100 включительно
          и подсчитайте отдельно среднее значение всех элементов, которые <50,
          и среднее значение всех элементов, которые ≥50.
         */

        int array[]=new int[20];

        for (int i=0;i<20;i++){
            array[i]=random.nextInt(101);
        }
        int countLess=0;
        int countMore=0;
        int sumLess50=0;
        int sumMore50=0;
        for (int i=0;i<20;i++){
            System.out.println(array[i]);
        }

        for (int i=0;i<20;i++){
            if(array[i]<50){
                countLess++;
                sumLess50+=array[i];
            }else {
                countMore++;
                sumMore50+=array[i];
            }
        }
        System.out.println("Среднее арифметическое значение элементов [0, 49] = "+sumLess50/countLess);
        System.out.println("Среднее арифметическое значение элементов [50, 100] = "+sumMore50/countMore);

    }
}
