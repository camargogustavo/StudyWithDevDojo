package Oexception.execption.test;

import Oexception.execption.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
    private static void logar() throws LoginInvalidoException{
        Scanner input = new Scanner(System.in);
        String usernameDB = "goku";
        String senhaDB = "1234";

        System.out.println("Usuario: ");
        String usuarioDigitado = input.nextLine();
        System.out.println("senha: ");
        String senhaDigitado = input.nextLine();

        if (!usernameDB.equals(usuarioDigitado) || !senhaDB.equals(senhaDigitado)){
            throw new LoginInvalidoException("Usuario ou senha invalidos");
        }

        System.out.println("Usuario logado com sucesso");
    }
}
