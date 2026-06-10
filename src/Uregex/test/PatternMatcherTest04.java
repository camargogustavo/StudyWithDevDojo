package Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \\d = Tudo 1ue for digito
        // \\D = Tudo que nao for digito
        // \s = Tras todos os espacos em branco \t \r \n \f
        // \S = Todos os caracteres  excluindo os brancos
        // \w = Tudo que for de a-ZA-Z digitos, _(underscore)
        // \W = Tudo que nao for incluso no \w
        // [] = Busca os caracteres que estao dentro das chaves
        // ? Zero ou uma ocorrencia
        // * Zero ou mais
        // + Uma ou mais
        // {n,m} de n até m
        // () agrupamento
        // |  o(v|c)o
        // $ fim da linha
        // . é o caracter coringa 1.3 = 123, 133, 1@3, 1A3

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "gustavo@hotmail.com, alana31@gmail.com, test@mail.com.br, #@!zoro@gmail.com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:   "+texto);
        System.out.println("indice:  0123456789");
        System.out.println("regex:    "+regex);
        System.out.println("POsicoes encontradas: ");

        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
//        //colocaer 0X para numero
//        int numeroHexa = 0X59F86A;
//        System.out.println(numeroHexa);


    }
}
