package colecao;

import java.util.ArrayList;
import java.util.List;

public class GenericCollection<T> {
    private List<T> itens;

    public GenericCollection() {
        this.itens = new ArrayList<>();
    }

    public void adicionar(T item) {
        System.out.println("Adicionando: " + item);
        this.itens.add(item);
    }

    public boolean remover(T item) {
        System.out.println("Removendo: " + item);
        return this.itens.remove(item);
    }

    public T obter(int indice) {
        if (indice >= 0 && indice < this.itens.size()) {
            return this.itens.get(indice);
        }
        throw new IndexOutOfBoundsException("Índice inválido: " + indice);
    }

    public int tamanho() {
        return this.itens.size();
    }

    public List<T> listarTodos() {
        return new ArrayList<>(this.itens); 
    }
}
