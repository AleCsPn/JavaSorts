import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.time.LocalDate;

public class App {
    private static Integer[] gerarVetorAleatorio(int n) {
        //Random random = new Random();
        Integer[] vetor = new Integer[n];

        for (int i = 0; i < n; i++) {
        //  vetor[i] = random.nextInt(n * 10);
            vetor[i] = (int) (Math.random() * 100);
        }
        return vetor;
    } 
    public static void main(String[] args) {
        int n = 50000;
        long inicio, fim, tempo;
        Integer[] numerosQuickSort = gerarVetorAleatorio(n);

        System.out.println("Vetor gerado:"+ Arrays.toString(numerosQuickSort));
        QuickSort<Integer> quickSort = new QuickSort<>();
        System.out.println("\n *** Quick Sort ***");
        inicio = System.currentTimeMillis();
        quickSort.sort(numerosQuickSort);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        //System.out.println("Vetor ordenado:"+ Arrays.toString(numerosQuickSort));
        System.out.println("Comparacoes QuickSort:"+quickSort.getContaComparacoes());
        System.out.println("Trocas QuickSort:"+quickSort.getContaTrocas());
        System.out.println("Tempo(ms) do QuickSort:"+tempo+" ms");

        Busca<Integer> busca = new Busca<>();
        int valExiste = numerosQuickSort[n/2];
        int valInexistente = 150;
        System.out.println("Busca Linear ");
        int pos = busca.linear(numerosQuickSort, valExiste);
        System.out.println("Valor: "+valExiste+" posicao "+pos);
        System.out.println("Comparacoes:"+ busca.getContaComparacoes());

        System.out.println("Busca Linear - inexistente");
        pos = busca.linear(numerosQuickSort, valInexistente);
        System.out.println("Valor: "+valInexistente+" posicao "+pos);
        System.out.println("Comparacoes:"+ busca.getContaComparacoes());

        System.out.println("Busca Binaria");
        pos = busca.binaria(numerosQuickSort, valExiste);
        System.out.println("Valor "+ valExiste + " posicao:"+pos);
        System.out.println("Comparacoes:"+ busca.getContaComparacoes());   

        System.out.println("Busca Binaria  - Inexistente");
        pos = busca.binaria(numerosQuickSort, valInexistente);
        System.out.println("Valor "+ valInexistente + " posicao:"+pos);
        System.out.println("Comparacoes:"+ busca.getContaComparacoes());

    }
    
    /*
     * / public static Pessoa[] vetorDePessoas() {
     * return new Pessoa[] {
     * new Pessoa("João", LocalDate.of(1990, 1, 1)),
     * new Pessoa("Ana", LocalDate.of(1992, 2, 2)),
     * new Pessoa("Maria", LocalDate.of(1995, 5, 5)),
     * new Pessoa("Pedro", LocalDate.of(1993, 4, 4)),
     * new Pessoa("Lucas", LocalDate.of(1991, 6, 6)),
     * new Pessoa("Carlos", LocalDate.of(1988, 3, 3)),
     * new Pessoa("Ana", LocalDate.of(1985, 2, 2))
     * };
     * }
     * 
     * public static void main(String[] args) {
     * BubbleSort<Pessoa> bubbleSortPessoas = new BubbleSort<>();
     * Pessoa[] pessoas = vetorDePessoas();
     * ComparadorData comparadorData = new ComparadorData();
     * 
     * Comparator<Pessoa> comparadorNomeData = (p1, p2) -> {
     * int compNome = p1.getNome().compareTo(p2.getNome());
     * if (compNome != 0) {
     * return compNome;
     * }
     * return p1.getDataNascimento().compareTo(p2.getDataNascimento());
     * };
     * 
     * bubbleSortPessoas.sort(pessoas, comparadorNomeData);
     * for (Pessoa p : pessoas) {
     * System.out.println(p);
     * }
     * }
    */
    /*   int n = 200000;
       Integer[] numeros = gerarVetorAleatorio(n);
       BubbleSort<Integer> bubbleSort = new BubbleSort<>();
       //System.out.println("Vetor original: "+ Arrays.toString(args));

       bubbleSort.sort(numeros);
       //System.out.println("Vetor organizado: "+ Arrays.toString(args));
    */  
}
