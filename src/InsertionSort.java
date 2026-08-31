public class InsertionSort <T extends Comparable<T>>{
    public T[] sort(T[] array){
        for(int i = 1; i<array.length;i++){
            T valorAtual = array[i];

            int j = i - 1;
            while(j>=0 && array[j].compareTo(valorAtual) > 0){
                array[j+1] = array[j];
                j--;
            }
            array[j + 1] = valorAtual;
        }
        return array;
    }
}