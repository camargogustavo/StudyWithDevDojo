package Jmodificadorfinal.test;

import Jmodificadorfinal.domain.Carro;
import Jmodificadorfinal.domain.Comprador;
import Jmodificadorfinal.domain.Mclaren;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMTIE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("gustavo");
        System.out.println(carro.COMPRADOR);
        Mclaren mclaren = new Mclaren();
        mclaren.setNome("Senna");
        mclaren.imprime();

    }
}
