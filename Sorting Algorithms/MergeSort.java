package SortingAlgorithms;

public class MergeSort{
    public static void merge(int[] array, int[] arrayEsquerda, int[] arrayDireita){
        int tamanhoEsquerdo = arrayEsquerda.length;
        int tamanhoDireito = arrayDireita.length;
        int d = 0, e = 0, i = 0;

        while(e < tamanhoEsquerdo && d < tamanhoDireito){
            if(arrayEsquerda[e] < arrayDireita[d]){
                array[i] = arrayEsquerda[e];
                e++;
            } else {
                array[i] = arrayDireita[d];
                d++;
            }
            i++;
        }

        while(e < tamanhoEsquerdo){
            array[i] = arrayEsquerda[e];
            i++;
            e++;
        }

        while(d < tamanhoDireito){
            array[i] = arrayDireita[d];
            i++;
            d++;
        }

    }

    public static void mergeSort(int[] array){
        int tamanhoArray = array.length;
        if(tamanhoArray <= 1){
            return;
        }

        int meio = tamanhoArray/2;

        int[] arrayEsquerda = new int[meio];
        int[] arrayDireita = new int[tamanhoArray - meio];

        int j = 0;

        for(int i = 0; i < tamanhoArray; i++){
            if(i < meio){
                arrayEsquerda[i] = array[i];
            } else {
                arrayDireita[j] = array[i];
                j++;
            }

        }

        mergeSort(arrayEsquerda);
        mergeSort(arrayDireita);
        merge(array, arrayEsquerda, arrayDireita);
    }

    public static void main(String[] args) {
        int[] array = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        mergeSort(array);

        for(int n:array){
            System.out.print(n + " ");
        }
    }
}
