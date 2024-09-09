
# Nutrelli

## Descrição

Nutrelli é um sistema de gerenciamento de produtos, pedidos e clientes. Este projeto utiliza Java com JPA para persistência de dados e Swing para a interface gráfica.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

```
src/main/java/com/nutrelli/
├── model/
│   ├── Cliente.java
│   ├── Produto.java
│   └── ProdutoCategoria.java
├── dao/
│   ├── ClienteDAO.java
│   ├── ClienteRepository.java
│   ├── ProdutoDAO.java
│   ├── ProdutoRepository.java
│   └── ProdutoCategoriaDAO.java
├── util/
│   └── JPAUtil.java
└── view/
├── Dashboard.java
├── EditarProduto.java
├── EditarPedido.java
├── Login.java
└── UISettings.java
```

## Requisitos

- Java 11 ou superior
- Maven

## Configuração

1. Clone o repositório:
    ```sh
    git clone https://github.com/marcosarl1/nutrelli.git
    cd nutrelli
    ```

2. Compile o projeto usando Maven:
    ```sh
    mvn clean install
    ```

3. Execute a aplicação:
    ```sh
    mvn exec:java -Dexec.mainClass="com.nutrelli.Main"
    ```

## Funcionalidades

- **Gerenciamento de Produtos**: Adicionar, editar, deletar e buscar produtos.
- **Gerenciamento de Pedidos**: Adicionar, editar, deletar e buscar pedidos.
- **Gerenciamento de Clientes**: Adicionar, editar, deletar e buscar clientes.

## Estrutura de Pacotes

- **`com.nutrelli.model`**: Contém as classes de entidade.
- **`com.nutrelli.dao`**: Contém as classes DAO e interfaces de repositório.
- **`com.nutrelli.util`**: Contém classes utilitárias.
- **`com.nutrelli.view`**: Contém as classes relacionadas à interface gráfica.

## Contribuição

Nutrelli é um projeto pessoal desenvolvido para fins de aprendizado. Sugestões e melhorias são sempre bem-vindas! Se tiver alguma ideia ou encontrar um problema, sinta-se à vontade para abrir uma issue ou entrar em contato diretamente comigo. Estou ansioso para aprender e discutir novas ideias! 😊
