import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("SORTOWANIE PRZEZ WYBOR ! OKOKOK");
        System.out.println("1 jesli wylosowac");
        System.out.println("2 jesli wpisac");
        String wybor = scanner.nextLine();
        System.out.println("Wpisz rozmiar tablicy");
        int sizeArray = scanner.nextInt();
        double[] doubleArray = new double[sizeArray];
        if(wybor.equals("1")){
            System.out.println("podaj liczbe maksymalna");
            int min = scanner.nextInt();
            System.out.println("podaj liczbe minimalna");
            int max = scanner.nextInt();
            for(int i = 0;i < sizeArray; i++){
                doubleArray[i] = (double) (int) (Math.random() * ((max-min)+ min));
            }
        }else{
            System.out.println("Wpisz kolejno "+(sizeArray)+ " liczb oddzielonych spacjami\n");
            for(int i = 0;i < sizeArray;i++){
               doubleArray[i] = scanner.nextDouble();
               scanner.nextLine();
            }

        }
            for (double itr : doubleArray) System.out.println(itr + ", ");


            System.out.println("posortowana tablica");
            for (double itr : SelectionSort(doubleArray)) System.out.println(itr + ", ");
            SelectionSort(doubleArray);


    }


    public static double[] SelectionSort(double[] array){

        for(int i = 0;i<array.length ;i++){
             int tempIdx = i;
            for(int j= i + 1;j< array.length;j++){
                if(array[j]<array[tempIdx]){
                    tempIdx = j;
                }
                double temp = array[tempIdx];
                array[tempIdx] = array[i];
                array[i] = temp;
            }
        }


        return array;
    }


}