package SortingAlgorithms;

public class BubbleSort {
    public static void bubbleSort(int[] array){
        int n = array.length, aux;
        boolean trocou;
        for(int j = n-1; j > 0; j--){
            trocou = false;
            for(int i = 0; i < j; i++){
                if(array[i]>array[i+1]){
                    aux = array[i];
                    array[i] = array[i+1];
                    array[i+1] = aux;
                    trocou = true;
                }
            }
            if(!trocou){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {3,2,1,4,5,6};
        bubbleSort(array);
        for(int n : array){
            System.out.print(n + " ");
        }
    }
}
