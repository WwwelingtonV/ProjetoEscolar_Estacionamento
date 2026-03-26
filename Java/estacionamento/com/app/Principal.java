package com.app;

import com.model.*;


public class Principal {
    public static void main(String[] args) {
        
        // Definimos as variaveis de preco da tabela do estacionamento
        double precoCarro = 20.0;
        double precoMoto = 10.0;

        // --- INSTANCIA 1: CARRO ---
        // Passamos os valores especificos no Construtor
        Carro c1 = new Carro("ABC-1234", "SUV Jeep", precoCarro, 5.0, 4);
        
        c1.registrarEntrada(13); // Entrou as 13h
        c1.finalizarHospedagem(16); // Ficou 3 horas -> (3 * 20) - 5 = 55.00
        c1.emitirSom();
        c1.ligar();
        c1.validarPlaca("ABC-1234");
        c1.imprimirRelatorio();


        // --- INSTANCIA 2: MOTO ---
        // A moto usa a mesma classe, mas com preco e cupom diferentes
        Moto m1 = new Moto("XYZ-9999", "Honda CB500", precoMoto, 2.0, 2);
        
        m1.registrarEntrada(10); // Entrou as 10h
        m1.finalizarHospedagem(12); // Ficou 2 horas -> (2 * 10) - 2 = 18.00
        m1.emitirSom();
        m1.ligar();
        m1.validarPlaca("XYZ-9999");
        m1.imprimirRelatorio();

        Moto m2 = new Moto("R15-123", "Yamaha 9090", precoMoto, 2.0, 2);
        
        m2.registrarEntrada(5); // Entrou as 10h
        m2.finalizarHospedagem(17); // Ficou 2 horas -> (2 * 10) - 2 = 18.00
        m2.emitirSom();
        m2.ligar();
        m2.validarPlaca("R15-123");
        m2.imprimirRelatorio();


        // --- TESTE DE SEGURANCA ---
        // Tentando finalizar um veiculo que ja saiu
        c1.finalizarHospedagem(20);
    }
}