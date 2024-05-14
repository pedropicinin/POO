# Atividade Polimorfismo

Os super-heróis são personagens fictícios dotados de poderes sobre-humanos. Criados pela imaginação do homem, eles estão sempre em alerta para proteger o mundo dos ataques de mentes cruéis que pretendem dominar o nosso planeta.  

 Cada super-herói tem uma origem interessante. Alguns, como o Incrível Hulk, o Capitão América e o Homem de Ferro, surgiram em laboratórios, e eram pessoas comuns antes de adquirirem seus superpoderes a partir de acidentes ou experiências com raios-gama, reações químicas e estudos científicos nos campos da física, engenharia e biologia. Outros, como o Super-Homem e o Lanterna-Verde, vieram de outros planetas. Existem ainda aqueles que se originaram da mitologia grega, romana ou nórdica, como é o caso do Thor e a Mulher-Maravilha.  

Os primeiros super-heróis apareceram entre 1930 e 1960, e o desenho em  quadrinhos foi o principal veículo de divulgação em massa, antes da chegada da televisão. As principais empresas do ramo são a Hanna-Barbera, produtora da afamada Liga da Justiça (Super-amigos, 1973) e a Marvel, criadora de dezenas de personagens "vivos" até hoje. Em quase todas as histórias inventadas, o super-herói é chamado para resolver um problema ou enfrentar ameaças de um vilão com um plano maligno. O vilão também é munido de superpoderes mas dificilmente consegue vencer o super-herói, pois os poderes deste são mais fortes.  

1. Construa uma classe chamada Superpoder, com a seguinte estrutura: 
Atributos privados 

        o nome: String 
        o categoria: int 

Métodos públicos 

        o getNome() 
          retorna o nome do poder 
        o getCategoria() 
          retorna a categoria do poder 
Construtor público 

        o Superpoder(String nome, int categoria)  
          Recebe o nome do poder e a categoria e atribui ao objeto. 
         
2. Construa uma classe denominada Personagem, com a seguinte estrutura: 
Atributos privados 

        o nome: String 
        o nomeVidaReal: String 
        o poderes: vetor de 4 elementos do tipo Superpoder 

Métodos públicos 

        o void adicionaSuperpoder(Superpoder sp) recebe um superpoder como parâmetro e coloca-o no vetor ‘poderes’. Um super-herói ou vilão pode ter, no máximo, 4 poderes. 
         
        o int getPoderTotal() retorna a soma de poderes do super-herói. O poder total é calculado percorrendo-se o vetor ‘poderes’ e somando-se a categoria de cada poder. 
         
Construtor público 

        o Personagem (String nome, String nomeVidaReal) Recebe os nomes do personagem e atribui ao objeto. 
         
3. Construa uma classe chamada  SuperHeroi, que descende da classe Personagem, com a seguinte estrutura: 
Construtor público 

        o SuperHeroi(String nome, String nomeVidaReal) Recebe os dois parâmetros e repassa para a classe base, Personagem. 

Redefinição do método da classe base 

        o int getPoderTotal() Acrescenta um inflator de 10% aos poderes do personagem super-herói. 

4. Construa uma classe chamada Vilao, que descende da classe Personagem, com a seguinte estrutura: 
 
Atributos 

        o tempoDePrisao: int 
Construtor 

        o Vilao(String nome, String nomeVidaReal, int tempoDePrisao) Recebe os três parâmetros e repassa dois deles para a classe base, Personagem. 
 
5. Construa uma classe chamada Confronto, com a seguinte estrutura: 
Métodos públicos 

        o int executar (SuperHeroi superheroi, Vilao vilao) o método recebe um super-herói e um vilão como parâmetros e decide quem é o vencedor da batalha. O método deve retornar: 
        •  1 se o super-herói ganha a batalha 
        •  2 se o vilão ganha a batalha 
        •  0 se houver empate. 
 
O vencedor será aquele que tiver mais poder (use o método getPoderTotal() para saber qual é o poder de cada um). 
 
6. Construa uma classe chamada  Jogo, com a função  main. Nessa função, faça o seguinte: 

          a) crie um objeto da classe SuperHeroi e um objeto da classe Vilao.  
          b) crie os superpoderes a atribua-os ao objetos SuperHeroi e Vilao.


