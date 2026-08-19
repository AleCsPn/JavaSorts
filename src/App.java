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
    public static void main(String[] args) throws Exception{
        int n = 50000;
        Integer[] numeros = gerarVetorAleatorio(n);
        Integer[] numerosBubble = numeros.clone();
        
        //System.out.println("Vetor gerado: "+Arrays.toString(numeros));
        SelectionSort selectionSort = new SelectionSort<>();
        BubbleSort bubbleSort = new BubbleSort<>();

        long inicio = System.currentTimeMillis();
        selectionSort.sort(numeros);
        long fim = System.currentTimeMillis();

        System.out.println("Tempo SelectionSort = " + (fim - inicio) + " ms");
        //System.out.println("Vetor ordenado:"+Arrays.toString(numeros));
        System.out.println("Comparações SelectionSort: "+selectionSort.getContaComparacoes());
        System.out.println("Trocas SelectionSort: "+selectionSort.getContaTrocas());
        
        long incioBS = System.currentTimeMillis();
        bubbleSort.sort(numerosBubble);
        long fimBS = System.currentTimeMillis();
        System.out.println("Tempo BubbleSort = "+ (fimBS - incioBS)+" ms");
        System.out.println("Comparações BubbleSort: "+bubbleSort.getContaComparacoes());
        System.out.println("Trocas BubbleSort: "+bubbleSort.getContaTrocas());
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
