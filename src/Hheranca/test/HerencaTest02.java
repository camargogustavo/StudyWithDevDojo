package Hheranca.test;

import Hheranca.domain.Funcinario;

public class HerencaTest02 {
    // 0 - Bloco de inicializaçao estatico da super classe é executado quando a JVM carregar a superclasse
    // 2 - Bloco de inicializaçao estatico da sub classe é executado quando a JVM carregar a classe filha
    // 3 - Aloca em memoria para o objeto da superclasse
    // 4 - Cada atributo da superclasse Pai é criado e inicializado com valores default ou o que for passsado na classe Pai
    // 5 - Bloco de inicialização da super classe é executado na ordem que aparace
    // 6 - Construtor da superclasse é execuitado
    // 7 - Alocado espaco em memoria para o objeto da subclass
    // 8 - Cada atributo da subclass é criado e inicializado com valores default ou o que for passsado
    // 9 - Bloco de inicialização da subclass é executado na ordem em que aparece
    // 10 - Construtor da subclasse é executado
    public static void main(String[] args) {
        Funcinario f = new Funcinario("Gustavo");
    }
}
