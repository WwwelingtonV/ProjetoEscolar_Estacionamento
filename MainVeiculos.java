//Arquivo Main
public class MainVeiculos{
    public static void main(String[] args){
        Veiculos v1 = new Veiculos();
        v1.tipo = true;
        v1.clienteFidelizado = true;
        v1.horasEstacionado = 12.00;
        Double valorTotal1 = v1.saidaDoVeiculo();
        
        System.out.println("Dados do 1º Carro: ");
        System.out.println("Tipo de Veículo: " + v1.tipo);
        System.out.println("Cliente é Fidelizado? " + v1.clienteFidelizado);
        System.out.println("Horas que o cliente ficou estacionado: " + v1.horasEstacionado);
        System.out.println("Valor final a ser pago: " + valorTotal1 + "\n");
        
        
        
        Veiculos v2 = new Veiculos();
        v2.tipo = true;
        v2.clienteFidelizado = false;
        v2.horasEstacionado = 03.00;
        Double valorTotal2 = v2.saidaDoVeiculo();
        
        System.out.println("Dados do 2º Carro: ");
        System.out.println("Tipo de Veículo: " + v2.tipo);
        System.out.println("Cliente é Fidelizado? " + v2.clienteFidelizado);
        System.out.println("Horas que o cliente ficou estacionado: " + v2.horasEstacionado);
        System.out.println("Valor final a ser pago: " + valorTotal2 + "\n");
        
        
        
        Veiculos v3 = new Veiculos();
        v3.tipo = false;
        v3.clienteFidelizado = true;
        v3.horasEstacionado = 07.50; //7h e 30min
        Double valorTotal3 = v3.saidaDoVeiculo();
        
        System.out.println("Dados do 3º Carro: ");
        System.out.println("Tipo de Veículo: " + v3.tipo);
        System.out.println("Cliente é Fidelizado? " + v3.clienteFidelizado);
        System.out.println("Horas que o cliente ficou estacionado: " + v3.horasEstacionado);
        System.out.println("Valor final a ser pago: " + valorTotal3 + "\n");
        
        
        
        Veiculos v4 = new Veiculos();
        v4.tipo = false;
        v4.clienteFidelizado = false;
        v4.horasEstacionado = 28.00;
        Double valorTotal4 = v4.saidaDoVeiculo();
        
        System.out.println("Dados do 4º Carro: ");
        System.out.println("Tipo de Veículo: " + v4.tipo);
        System.out.println("Cliente é Fidelizado? " + v4.clienteFidelizado);
        System.out.println("Horas que o cliente ficou estacionado: " + v4.horasEstacionado);
        System.out.println("Valor final a ser pago: " + valorTotal4 + "\n");
    }
}