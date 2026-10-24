package colecao;

public class TestarGenericCollection {
    public static void main(String[] args) {
        
        System.out.println("=== Testando Coleção de Strings ===");
        GenericCollection<String> nomes = new GenericCollection<>();
        
        nomes.adicionar("C++");
        nomes.adicionar("C#");
        nomes.adicionar("Python");
        nomes.adicionar("Java");
        nomes.adicionar("VsCode");

        for (String nome : nomes.listarTodos()) {
            System.out.println("Item: " + nome);
        }
        System.out.println("Total de itens: " + nomes.tamanho());

        nomes.remover("VsCode");
        for (String nome : nomes.listarTodos()) {
            System.out.println("Item: " + nome);
        }
        System.out.println("Total de itens: " + nomes.tamanho());

        System.out.println("\n=== Testando Coleção de Inteiros ===");
        GenericCollection<Integer> numeros = new GenericCollection<>();
        
        numeros.adicionar(10);
        numeros.adicionar(20);
        numeros.adicionar(30);

        numeros.remover(20);

        for (Integer num : numeros.listarTodos()) {
            System.out.println("Número: " + num);
        }
        System.out.println("Total de números: " + numeros.tamanho());



    }
}