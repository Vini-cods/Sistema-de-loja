# Sistema de Loja - Java

Um sistema básico de loja desenvolvido em Java que permite gerenciar produtos, carrinho de compras e vendas.

## 📋 Funcionalidades

- **Gerenciamento de Produtos**: Criação de produtos com nome, descrição e preço
- **Carrinho de Compras**: Adicionar e remover produtos do carrinho
- **Cálculo de Vendas**: Calcular o valor total dos produtos no carrinho

## 🗂️ Estrutura do Projeto

### Classes Principais

#### `Produto`
Representa um produto da loja com os seguintes atributos:
- `nome`: Nome do produto
- `descricao`: Descrição detalhada do produto
- `preco`: Preço do produto (double)

**Métodos principais:**
- Construtores (padrão e parametrizado)
- Getters e Setters para todos os atributos

#### `Carrinho`
Gerencia uma coleção de produtos selecionados pelo cliente.

**Métodos principais:**
- `adicionar(Produto p)`: Adiciona um produto ao carrinho
- `remover(String nome)`: Remove um produto do carrinho pelo nome
- `getProdutos()`: Retorna a lista de produtos no carrinho

#### `Venda`
Processa a finalização da compra e cálculo do valor total.

**Métodos principais:**
- `TotalPreco()`: Calcula e exibe o valor total dos produtos no carrinho

#### `Main`
Classe principal que demonstra o funcionamento do sistema.

## 🚀 Como Executar

1. **Pré-requisitos:**
   - Java JDK 8 ou superior instalado
   - IDE Java (IntelliJ IDEA, Eclipse, VS Code, etc.) ou compilador Java

2. **Compilação:**
   ```bash
   javac *.java
   ```

3. **Execução:**
   ```bash
   java Main
   ```

## 💡 Exemplo de Uso

```java
// Criando produtos
Produto p1 = new Produto("Chaveiro Seja Forte e Corajosa", "Madeira, cordão, adesivo", 15.90);
Produto p2 = new Produto("Terço Mães que Oram pelos Filhos", "cordão, netals e adesivo resinado", 32.90);

// Criando carrinho e adicionando produtos
Carrinho c = new Carrinho();
c.adicionar(p1);
c.adicionar(p2);

// Removendo produto
c.remover("Chaveiro Seja Forte e Corajosa");

// Calculando total da venda
Venda v = new Venda(c);
v.TotalPreco();
```

## 📤 Saída Esperada

```
Produto Chaveiro Seja Forte e Corajosa foi adicionado no carrinho!
Produto Terço Mães que Oram pelos Filhos foi adicionado no carrinho!
2
O produto Chaveiro Seja Forte e Corajosa foi removido do carrinho!
O total da conta foi R$: 32.9
```


## 📝 Estrutura de Arquivos

```
projeto/
├── Carrinho.java
├── Main.java
├── Produto.java
├── Venda.java
└── README.md
```
