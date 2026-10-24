# Programação Orientada a Objetos em Java

Este diretório (`src`) contém implementações práticas em Java desenvolvidas para demonstrar e consolidar os pilares fundamentais da **Programação Orientada a Objetos** e recursos avançados da linguagem utilizando o **OpenJDK 17**.


## Estrutura de Pacotes

O código está organizado da seguinte forma: 

banco: Domínio bancário aplicando Herança, Interfaces e Ordenação
colecao: Estruturas customizadas aplicando Tipos Genéricos (Generics)

```text
src/
├── banco/
│   ├── Conta.java
│   ├── ContaPoupanca.java
│   └── TestarOrdenacao.java
│
└── colecao/
    ├── GenericCollection.java
    └── TestarGenericCollection.java
```

---

## Conceitos de POO e Java Aplicados

### 1. Pacote `banco`
* **Abstração e Encapsulamento:** A classe `Conta` encapsula atributos críticos como `saldo` e `numero`, expondo comportamentos controlados através de métodos públicos como `deposito()` e `saque()`.
* **Herança (`extends`):** A classe `ContaPoupanca` estende `Conta`, reutilizando toda a lógica de negócio estrutural da classe pai e adicionando novas especializações.
* **Polimorfismo e Contratos (`Comparable`):** Implementação da interface nativa `Comparable<ContaPoupanca>` para definir um critério de ordenação customizado de dois níveis (ordena por número da conta e desempatada pelo saldo).

### 2. Pacote `colecao`
* **Tipos Genéricos (Generics `<T>`):** Criação de uma estrutura de dados (`GenericCollection`) reutilizável e independente de tipo. Demonstra como reaproveitar algoritmos mantendo a segurança de tipos (*type safety*) em tempo de compilação, permitindo criar coleções exclusivas de `String`, `Integer` ou objetos de negócio.

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
