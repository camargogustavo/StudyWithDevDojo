package Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \\d = Tudo 1ue for digito
        // \\D = Tudo que nao for digito
        // \s = Tras todos os espacos em branco \t \r \n \f
        // \S = Todos os caracteres  excluindo os brancos
        // \w = Tudo que for de a-ZA-Z digitos, _(underscore)
        // \W = Tudo que nao for eincluso no \w
        // [] = Busca os caracteres que estao dentro das chaves
        // ? Zero ou uma ocorrencia
        // * Zero ou mais
        // + Uma ou mais
        // {n,m} de n até m
        // () agrupamento
        // |  o(v|c)o
        // $ fim da linha
        // . é o caracter coringa 1.3 = 123, 133, 1@3, 1A3

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
//        String texto = "abaaba";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
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
