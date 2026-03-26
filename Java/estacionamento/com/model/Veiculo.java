package com.model;

abstract class Veiculo {
    // ATRIBUTOS
    private String placa;
    private String modelo;
    protected double valorHora; // Cada objeto tera seu proprio valor aqui
    private int horaEntrada;
    private double cupomDesconto;
    private boolean estaEstacionado;
    private double valorUltimoPagamento;

    //Método padrão
    public void ligar(){
        System.out.println("O Veículo está ligado");
    }

    //Método abstrato
    public abstract void emitirSom();
    
    public void quantasRodas(){
        System.out.println("Genérico!");
    }
    
    // CONSTRUTOR (Aula 04): Define os valores especificos na criacao
    public Veiculo(String modelo, String placa, double valorHora, double cupomDesconto) {
        this.modelo = modelo;
        this.placa = placa;
        this.estaEstacionado = false; // Comeca fora do patio
        
        setValorHora(valorHora);
        setCupomDesconto(cupomDesconto);
    }
    
    public Veiculo(String modelo, String placa) {
        this.modelo = "WWW-000";
        this.placa = placa;
    }
    
    

    // METODO 1: Registra entrada
    public void registrarEntrada(int hora) {
        this.horaEntrada = hora;
        this.estaEstacionado = true;
        System.out.println(">>> Entrada: " + modelo + " (Placa: " + placa + ") as " + hora + "h.");
    }

    // METODO 2: Valida e calcula a saída
    public double finalizarHospedagem(int horaSaida) {
        if (!estaEstacionado) {
            System.out.println("ERRO: O veiculo " + modelo + " nao esta no patio!");
            return 0.0;
        }

        if (horaSaida < horaEntrada) {
            System.out.println("ERRO: Hora de saida invalida para " + modelo);
            return 0.0;
        }

        int tempoPermanencia = horaSaida - horaEntrada;
        // Aqui o calculo usa o valorHora especifico deste objeto (Carro ou Moto)
        double total = (tempoPermanencia * this.valorHora) - this.cupomDesconto;

        if (total < 0) total = 0;

        this.valorUltimoPagamento = total;
        this.estaEstacionado = false;
        return total;
    }

    // METODO 3: Relatorio
    public void imprimirRelatorio() {
        System.out.println("--- RELATORIO: " + modelo + " ---");
        System.out.println("Tabela Preco/Hora: R$ " + valorHora);
        System.out.println("Desconto aplicado: R$ " + cupomDesconto);
        System.out.println("VALOR TOTAL PAGO: R$ " + valorUltimoPagamento);
        System.out.println("------------------------------\n");
    }
    
    //GETTERS
    public String getPlaca(){
        return this.placa;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public double getValorHora(){
        return this.valorHora;
    }
    
    public double getCupomDesconto(){
        return this.cupomDesconto;
    }
    
    public boolean getEstaEstacionado(){
        return this.estaEstacionado;
    }
    
    //SETTERS
    public void setValorHora(double valorH){
        if(valorH > 0.0){
            this.valorHora = valorH;
        }else{
            System.out.println("Erro. O valor da hora deve ser maior que 0.");
        }
    }
    
    public void setCupomDesconto(double desconto){
        if(desconto > 0.0 && desconto < 50.0){
            this.cupomDesconto = desconto;
        }else{
            System.out.println("Valor de desconto inválido.");
        }
    }
    
}