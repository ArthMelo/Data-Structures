package SortingAlgorithms;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        int n = array.length, valor;

        for(int i = 1; i < n; i++){
            valor = array[i]; //inserir o array[i] no array[1,...,i-1]
            int j = i-1;
            while(j >= 0 && array[j] > valor ){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = valor;
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        insertionSort(array);
        for(int n : array){
            System.out.print(n + " ");
        }
    }
}
