package SortingAlgorithms;

public class SelectionSort {
    public static void selectionSort(int[] array){
        int n = array.length, temp = 0, pos = 0;
        for(int i = 0; i < n-1; i++){
            int min_index = i;
            for(int j = i + 1; j < n; j++){
                if(array[j] < array[min_index]){
                    min_index = j;
                }
            }

            temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }

    }

    public static void main(String[] args){
        int[] array = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        selectionSort(array);
        for(int n : array){
            System.out.println(n + " ");
        }

    }
}
