/**
 * Created by User on 19.09.2016.
 */
public class labw03 implements var05 {
    public double logika(double d1, double d2, double d3){
        double min;
        double rez1 = 0;
        if ((d1 <= d2) && (d1 <= d3)){
            min = d1;
        }else if((d2 <= d1) && (d2 <= d3)){
            min = d2;
        }else if((d3 <= d1) && (d3 <= d2)){
            min = d3;
        }else{
            min = d1;
        }
        if (min < 0){
            rez1 = 0;
        }else{
            rez1 = 1;
        }
        return rez1;
    }
    public void poka(int N){
        int[] mas1;
        int sum = 0;
        int ost;
        int del;
        int k = 0;
        mas1 = new int[10];
        if (N > 0){
            for (int i = 0; i < 10; i++){
                double del2 = Math.floor(N / 10);
                del = (int)del2;
                ost = N % 10;
                if (del >= 1 ){
                    mas1[i] = ost;
                    N = del;
                    k++;
                }else{
                    mas1[i] = ost;
                    N = 0;
                }
                sum = sum + mas1[i];
            }
            k = k + 1;
            System.out.println("Сумма цифр:" + sum);
            System.out.println("Количество цифр:" + k);
        }else{
            System.out.println("Error!");
        }
    }
    public void massivy(double[] A){
        int s = 0;
        for (int i = 2; i < A.length; i++){
            if (((A[i - 2] <= A[i-1]) && (A[i - 1] > A[i])) || ((A[i - 1] <= A[i]) && (i == A.length - 1))) {
                s++;
            }
        }
        System.out.println("Количество участков в массиве A, на которых его\nэлементы монотонно возрастают: " + s);
    }
}