//Exercicio JAVA

//Projeto de um sistema para controle de estacionamento
//Deve controlar a entrada de veículos e a cobrança
//Armazenar informações do veículo para identificação
//Diferenciar se o veículo ainda está ocupando a vaga
//Calcular a cobrança do estacionamento através de preço fixo por hora



//Arquivo chamado "Veiculos.java"
public class Veiculos{
    Boolean tipo, clienteFidelizado; //Confirmar se cliente possui carro ou moto (Carro = True) e identificar se cliente é fidelizado/true
    Double horasEstacionado; //Confirmar quantas horas o cliente ficou horasEstacionado
    Double valorPorHoraCarro = 10.00, valorPorHoraMoto = 05.00; //Valores por horas de tipos carro ou moto (true ou false)
    Double valorBrutoCarro, valorBrutoMoto, descontoFidelizadoCarro, descontoFidelizadoMoto;
    
    public Double saidaDoVeiculo(){
        if (tipo == true && clienteFidelizado == true){ //Cliente possui um carro e é fidelizado (Desconto de carro)
            valorBrutoCarro = valorPorHoraCarro * horasEstacionado;
            descontoFidelizadoCarro = (valorBrutoCarro * 10) / 100;
            return valorBrutoCarro - descontoFidelizadoCarro;
        }else if(tipo == true && clienteFidelizado == false){ //CLiente possui um carro e não é fidelizado (Sem desconto)
            valorBrutoCarro = (valorPorHoraCarro * horasEstacionado);
            return valorBrutoCarro;
        }else if(tipo == false && clienteFidelizado == true){ //Cliente possui uma moto e é fidelizado (Desconto de moto)
            valorBrutoMoto = valorPorHoraMoto * horasEstacionado;
            descontoFidelizadoMoto = (valorBrutoMoto * 05) / 100;
            return valorBrutoMoto - descontoFidelizadoMoto;
        }else if(tipo == false && clienteFidelizado == false){ //Cliente possui uma moto e não é fidelizado (Sem desconto)
            valorBrutoMoto = (valorPorHoraMoto * horasEstacionado);
            return valorBrutoMoto;
        }else{
            return 0.0;
        }
    }
}