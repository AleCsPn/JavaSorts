import java.util.*;
public class BubbleSort<T extends Comparable<T>> {
    private long contaComparacoes;
    private long contaTrocas;

    public long getContaComparacoes() {
        return contaComparacoes;
    }


    public long getContaTrocas() {
        return contaTrocas;
    }

    private void troca(T[] array, int i, int j) {
    T temp = array[i];
    array[i] = array[j];
    array[j] = temp;
    contaTrocas++;
    }

    public T[] sort(T[] array, Comparator<T> comparator) {
    int n = array.length;

    //a variavel 'fase' equivale a 'i', mas foi nomeada assim para ficar mais intuitivo
    for (int fase = 1; fase < n; fase++) {
        //'j' controla as comparações
        // 'j - fase' evita comparações desnecessárias que seriam causadas por apenas por 'fase'
        for (int j = 0; j < n - fase; j++) {
            contaComparacoes++;
            if (comparator.compare(array[j], array[j + 1]) > 0){
                troca(array,j,j+1);
            }
        }
    }

    return array;
    }//fim sort

    public T[] sort(T[] array) {
        return sort(array, (a, b) -> ((Comparable<T>) a).compareTo(b));
    }//expressão lambda para acessar o comparador personalizado de uma classe


    public T[] sortVerbose(T[] array, Comparator<T> comparator) {
    int n = array.length;

    
    for (int fase = 1; fase < n; fase++) {
        System.out.println("Fase " + fase + ": " + Arrays.toString(array));
        for (int j = 0; j < n - fase; j++) {
            System.out.println("Comparando: " + array[j] + " e "+ array[j+1]);
            if (comparator.compare(array[j], array[j + 1]) > 0){
                System.out.println("Trocando: "+ array[j]+" e " +array[j+1]);
                troca(array,j,j+1);
                System.out.println("\n");
            }else{
                System.out.println("Não foi necessária troca entre: "+array[j]+" e "+array[j+1]);
                System.out.println("\n");
            }
        }
    }

    return array;
    }//fim sort

    public T[] sortVerbose(T[] array) {
        return sortVerbose(array, (a, b) -> ((Comparable<T>) a).compareTo(b));
    }//expressão lambda para acessar o comparador personalizado de uma classe
}
