Nome: Gustavo de Camargo Monteiro
Idade: 19
Contato: gustavoprofissional@gmail.com
Estado: SSP-Interior

### Construtores

Construtores{são inicializadores dos objts} sempres sao inicializados primeiro que os metados. Forçam voce a seguir algumas regras. Dentro do contrutor a sintaxe this(), somente ela nesse modelo pode ser usada para chamar um construtor

Se for chamar um construtor dentro de um construtor, ela sempre deve ocupar a primeira linha, Ex; this()

### Blocos de Inicialização de Instancia ou Bloco de Incialização não estatico

É executado antes do construtor

Pois ele é executado toda vez que o objeto é executado

Bascimanete em qualquert lugar da classe, mas geralmente voce abre e fecha chaves

### Modificador Static

Modificador static basicamente ele pertence junto a classe do arquivo, ou seja, parou de pertencer ao objeto. Irá fazer o atribuito pertencer a classe e todos os objetos irão compartilhar o mesmo valor.

### Metado static

Usando o static pode exister a possibilidade de nao exister um espaco em memoria

*this.velocidadeLimite = velocidadeLimite; Náo pode usar this do metado static void, this se refere ao objeto, pois existe a possibilidade de nao ter o objeto criado em memoria.*

Metodo estatico nao pode acessar variaveis de instancias

Utilizando static pode nao acessar atributos de instancia

## Heranca

Herenca utilizada da forma incorreta pode prejudicar seu codigo

Nao existe herenca de multilas classes, mas isso muda ao falar de interface

Se existe um construtor na class mae, nao precisa de construtor na subclasses. Agora que voce passar um construtor na subclasse voce tem que alterar o codigo, ou seja, chamar o construtor em outras classes



SOBRE OS CONCEITOS QUE ESTÃO ACIMA

// 0 - Bloco de inicializaçao estatico da superclass é executado quando a JVM carregar a superclass
    // 2 - Bloco de inicializaçao estatico da subclass é executado quando a JVM carregar a subclass
    // 3 - Aloca espaço em memoria para o objeto da superclasse
    // 4 - Cada atributo da superclass é criado e inicializado com valores default ou o que for passsado na classe superclass
    // 5 - Bloco de inicialização da superclass é executado na ordem que aparace
    // 6 - Construtor da superclasse é executado
    // 7 - Alocado espaço em memoria para o objeto da subclass
    // 8 - Cada atributo da subclass é criado e inicializado com valores default ou o que for passsado
    // 9 - Bloco de inicialização da subclass é executado na ordem em que aparece
    // 10 - Construtor da subclasse é executado

O QUE ESPERAR NA SAIDA DO CODIGO USANDO ESSE CONCEITOS

Dentro do bloco inicializacao static de superclasse
Dentro do bloco inicializacao static de subclass
Dentro do bloco de inicializacao de superclasse 1
Dentro do bloco de inicializacao de superclasse 2
Dentro do ccnstrutor de superclasse 1
Dentro do bloco de inicializacao de subclass 1
Dentro do bloco de inicializacao de subclass 2
Dentro do construtor de subclass
