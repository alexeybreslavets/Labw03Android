import java.util.Scanner;
/**
 * Created by User on 19.09.2016.
 */
public class proverka {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        labw03 test = new labw03();
        System.out.print("Введите первое дробное число для\nпроверки метода logika(): ");
        double d1 = in.nextDouble();
        System.out.print("\nВведите второе дробное число для\nпроверки метода logika(): ");
        double d2 = in.nextDouble();
        System.out.print("\nВведите третье дробное число для\nпроверки метода logika(): ");
        double d3 = in.nextDouble();
        double rez1 = test.logika(d1,d2,d3);
        System.out.println("\n Результат работы метода (ноль, если наименьшее\nчисло - отрицательное, и один - в остальных случаях): " + rez1);
        System.out.print("\nВведите целое число N (N>0)\nдля проверки метода poka(): ");
        int N = in.nextInt();
        test.poka(N);
        System.out.println("\n\n\t\tПроверка метода massivy()");
        System.out.print("Введите количество єлементов будущего массива: ");
        int n = in.nextInt();
        double[] A;
        A = new double[n];
        System.out.println("Введите элементы массива через энтер: ");
        for (int i = 0; i < A.length; i++)
        {
            A[i] = in.nextDouble();
        }
        test.massivy(A);
    }
}
