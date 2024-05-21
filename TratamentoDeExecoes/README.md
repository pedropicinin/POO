# Sistema de Controle de Estoque com Tratamento de Exceção em Java
Este projeto implementa um sistema de controle de estoque simples utilizando conceitos de Orientação a Objetos e tratamento de exceções em Java.

# Classes:
        Produto:
            Atributos: nome (String), quantidade (int), preco (double)
            Métodos:
                retirarDoEstoque(int quantidade): Diminui a quantidade de produtos em estoque, lançando a exceção customizada EstoqueInsuficienteException caso a quantidade a ser retirada seja maior que a disponível.
                adicionarAoEstoque(int quantidade): Aumenta a quantidade de produtos em estoque, lançando a exceção customizada QuantidadeInvalidaException caso a quantidade a ser adicionada seja negativa.
        Estoque:
            Atributos: produtos (List<Produto>)
            Métodos:
                adicionarProduto(Produto produto): Adiciona um novo produto ao estoque.
                removerProduto(String nomeProduto): Remove um produto do estoque pelo nome, lançando a exceção customizada ProdutoNaoEncontradoException caso o produto não seja encontrado.
                buscarProduto(String nomeProduto): Retorna o objeto Produto correspondente ao nome fornecido, lançando a exceção customizada ProdutoNaoEncontradoException caso o produto não seja encontrado.
        Exceções Customizadas:
            EstoqueInsuficienteException: Lançada quando a quantidade a ser retirada do estoque é maior que a disponível.
            QuantidadeInvalidaException: Lançada quando a quantidade a ser adicionada ao estoque é negativa.
            ProdutoNaoEncontradoException: Lançada quando um produto não é encontrado no estoque.
            
# Funcionamento:
      1. O sistema permite ao usuário adicionar novos produtos ao estoque, informando o nome, a quantidade inicial e o preço.
      2. O usuário pode retirar produtos do estoque, informando o nome do produto e a quantidade desejada.
      3. O sistema trata as seguintes exceções:
          EstoqueInsuficienteException: Exibe uma mensagem informando que a quantidade solicitada não está disponível em estoque.
          QuantidadeInvalidaException: Exibe uma mensagem informando que a quantidade informada é inválida.
          ProdutoNaoEncontradoException: Exibe uma mensagem informando que o produto não foi encontrado no estoque.
      4. O sistema exibe o estoque atualizado após cada operação.
      
# Exemplo de Uso:
      // Criando um produto
      Produto produto1 = new Produto("Camiseta", 10, 20.00);
      
      // Criando o estoque
      Estoque estoque = new Estoque();
      
      // Adicionando o produto ao estoque
      estoque.adicionarProduto(produto1);
      
      // Tentando retirar uma quantidade maior do que a disponível
      try {
          produto1.retirarDoEstoque(15);
      } catch (EstoqueInsuficienteException e) {
          System.out.println("Erro: " + e.getMessage()); 
      }
      
      // Exibindo o estoque atualizado
      System.out.println(estoque.getProdutos());
