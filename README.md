# Programação Orientada a Objetos em Java

Este diretório (`src`) contém implementações práticas em Java desenvolvidas para demonstrar e consolidar os pilares fundamentais da **Programação Orientada a Objetos** e recursos avançados da linguagem utilizando o **OpenJDK 17**.


## Estrutura de Pacotes

O código está organizado da seguinte forma: 

banco: Domínio bancário aplicando Herança, Interfaces e Ordenação
colecao: Estruturas customizadas aplicando Tipos Genéricos (Generics)

```text
src/
├── LICENSE
├── README.md
├── banco
│   ├── Conta.java
│   ├── ContaPoupanca.java
│   └── TestarOrdenacao.java
├── colecao
│   ├── GenericCollection.java
│   └── TestarGenericCollection.java
├── conjunto
│   ├── SetTest.java
│   └── TestarSetTest.java
├── hashmap
│   ├── HashMapTest.java
│   └── TestarHashMapTest.java
├── hashtable
│   ├── HashTableTest.java
│   └── TestarHashTableTest.java
├── treemap
│   ├── TestarTreeMapTest.java
│   └── TreeMapTest.java
└── treesorted
    ├── SortedSetTest.java
    └── TestarSortedSetTest.java
```

---

## Conceitos de POO e Java Aplicados

### 1. Pacote `banco`
* **Abstração e Encapsulamento:** A classe `Conta` encapsula atributos críticos como `saldo` e `numero`, expondo comportamentos controlados através de métodos públicos como `deposito()` e `saque()`.
* **Herança (`extends`):** A classe `ContaPoupanca` estende `Conta`, reutilizando toda a lógica de negócio estrutural da classe pai e adicionando novas especializações.
* **Polimorfismo e Contratos (`Comparable`):** Implementação da interface nativa `Comparable<ContaPoupanca>` para definir um critério de ordenação customizado de dois níveis (ordena por número da conta e desempatada pelo saldo).

### 2. Pacote `colecao`
* **Tipos Genéricos (Generics `<T>`):** Criação de uma estrutura de dados (`GenericCollection`) reutilizável e independente de tipo. Demonstra como reaproveitar algoritmos mantendo a segurança de tipos (*type safety*) em tempo de compilação, permitindo criar coleções exclusivas de `String`, `Integer` ou objetos de negócio.

### 3. Pacote `conjunto`
* **Set:** O construtor `SetTest()` demonstra o uso da interface `Set` por meio da implementação `HashSet` para eliminar elementos duplicados de uma coleção. Inicialmente, o array colors é convertido em uma lista utilizando `Arrays.asList()`. Em seguida, o método `printNonDuplicates()` cria um `HashSet` a partir dessa lista, removendo automaticamente os valores repetidos, como a segunda ocorrência de "branco". Os elementos únicos são então percorridos e exibidos no console. Como o `HashSet` não mantém a ordem de inserção nem realiza ordenação dos elementos, as cores podem ser apresentadas em uma sequência diferente da original. Esse exemplo evidencia uma das principais aplicações de conjuntos em Java: garantir a unicidade dos elementos armazenados.

### 4. Pacote `hashmap`
O construtor `HashMapTest()` demonstra o uso da classe `HashMap` para armazenar pares de chave e valor, associando um código numérico ao nome de uma instituição de ensino. O método `printHashMap()` percorre todos os elementos do mapa e exibe suas chaves e valores utilizando um Iterator. Já o método `getByIndex()` recupera e apresenta o valor correspondente a uma chave específica, enquanto `removeByIndex()` localiza e remove um elemento com base em sua chave. Por fim, o programa exibe o conteúdo do HashMap antes e depois da remoção, evidenciando operações básicas de inserção, consulta, iteração e exclusão em uma estrutura de mapeamento do Java. Entre as principais características do HashMap estão: armazenamento de chaves únicas, acesso rápido aos valores, possibilidade de valores repetidos, ausência de ordenação dos elementos e eficiência para operações de busca, inserção e remoção. Por essas características, é amplamente utilizado em situações que exigem associação de identificadores a informações, como cadastros de usuários, produtos, alunos, configurações e tabelas de consulta.

### 5. Pacote `hashtable`
* O construtor `HashTableTest()` demonstra o uso da classe `Hashtable`, uma estrutura de dados que armazena informações no formato chave-valor, permitindo a recuperação rápida dos dados por meio de uma chave única. No exemplo, são cadastradas instituições de ensino utilizando chaves do tipo String, e o método `printHashtable()` percorre todos os elementos da tabela utilizando um objeto `Enumeration`, exibindo cada par chave-valor armazenado. Em seguida, algumas entradas são atualizadas por meio do método `put()`, substituindo os valores associados às chaves já existentes, e o conteúdo da tabela é exibido novamente para evidenciar a alteração. Entre **as principais características** do `Hashtable` estão a não permissão de chaves ou valores nulos `(null)`, a sincronização nativa para acesso concorrente entre múltiplas threads e a utilização de chaves únicas. Por essas características, era amplamente utilizado em aplicações que exigiam compartilhamento seguro de dados entre processos concorrentes, embora atualmente seja comum o uso de alternativas mais modernas, como HashMap e ConcurrentHashMap, dependendo do cenário de utilização.

### 6. Pacote `treehmap`
* O construtor `TreeMapTest()` demonstra o uso da classe `TreeMap`, uma estrutura de dados que armazena informações no formato chave-valor, semelhante ao HashMap, porém mantendo as chaves sempre ordenadas em ordem natural (crescente) ou conforme um critério de comparação definido. No exemplo, são cadastradas instituições de ensino utilizando números inteiros como chaves. O método `printTreeMap()` percorre e exibe todos os pares armazenados, `getByIndex()` recupera o valor associado a uma chave específica e `removeByIndex()` remove um elemento do mapa. Após a remoção, o conteúdo é exibido novamente para evidenciar a alteração. Entre **as principais características** do `TreeMap` estão a manutenção automática da ordenação das chaves, a impossibilidade de chaves duplicadas e o suporte a operações de navegação e pesquisa ordenada. Por essas características, é amplamente utilizado em situações que exigem dados organizados, como rankings, catálogos, relatórios ordenados, sistemas de agenda, índices e consultas em que a ordem dos elementos é importante.

### 7. Pacote `treesorted`
* **TreeSet:** O método construtor `SortedSetTest()` demonstra o uso da classe `TreeSet`, que implementa a interface `SortedSet` e mantém seus elementos ordenados automaticamente. Inicialmente, o código cria um conjunto a partir do array de cores, eliminando valores duplicados (como "branco") e organizando os elementos em ordem alfabética. Em seguida, utiliza o método headSet("laranja", true) para obter todos os elementos até "laranja", inclusive, e o método tailSet("laranja", true) para recuperar os elementos a partir de "laranja", também incluindo esse valor. Os resultados são exibidos pelo método `printSet()`. Por fim, os métodos `first()` e `last()` retornam, respectivamente, o primeiro e o último elemento do conjunto ordenado, evidenciando as operações de navegação e consulta disponíveis em coleções ordenadas do Java.


---

## Como Compilar e Executar via Terminal (CLI)

### Executar os testes do Pacote `banco`:
```bash
javac -d bin src/banco/*.java && java -cp bin banco.TestarOrdenacao
```

### Executar os testes do Pacote `colecao`:
```bash
javac -d bin src/colecao/*.java && java -cp bin colecao.TestarGenericCollection


```
