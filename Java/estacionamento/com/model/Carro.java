package com.model;

import com.app.Validavel;

public class Carro extends Veiculo implements Validavel{
    private int quantidadeRodas;
    
    public Carro(String placa, String modelo, double valorHora, double cupomDesconto, int rodas){
        super(modelo, placa, valorHora, cupomDesconto);
        this.quantidadeRodas = rodas;
        System.out.println("Quantidade de rodas: " + rodas);
    }

    //Método da interface pagavel
    @Override
    public boolean validarPlaca(String placa){
        int qtdCaracteres = placa.length();
        if (qtdCaracteres == 7){
            System.out.println("Placa de 7 Caracteres!");
            return true;
        }else{
            System.out.println("Placa Falsa!");
            return false;
        }
    }
    
    @Override
    public void quantasRodas(){
        System.out.println("Possui 4 rodas!");
    }

    //Executando o método abstrato emitir som da classe Veiculo
    @Override
    public void emitirSom(){
        System.out.println("Vrum Vrum!");
    }

    public int getQuantidadeRodas(){
        return this.quantidadeRodas;
    }
}