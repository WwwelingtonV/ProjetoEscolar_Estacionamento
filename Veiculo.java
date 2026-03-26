public class Veiculo {
    // ATRIBUTOS
    private String placa;
    private String modelo;
    private double valorHora; // Cada objeto tera seu proprio valor aqui
    private int horaEntrada;
    private double cupomDesconto;
    private boolean estaEstacionado;
    private double valorUltimoPagamento;

    // CONSTRUTOR (Aula 04): Define os valores especificos na criacao
    public Veiculo(String modelo, String placa, double valorHora, double cupom) {
        this.modelo = modelo;
        this.placa = placa;
        this.estaEstacionado = false; // Comeca fora do patio
        
        setValorHora(valorHora); //Pra chamar o setter
        setCupomDesconto(cupomDesconto); //Pra chamar o setter
    }

    // METODO 1: Registra entrada
    void registrarEntrada(int hora) {
        this.horaEntrada = hora;
        this.estaEstacionado = true;
        System.out.println(">>> Entrada: " + modelo + " (Placa: " + placa + ") as " + hora + "h.");
    }

    // METODO 2: Valida e calcula a saída
    double finalizarHospedagem(int horaSaida) {
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
    void imprimirRelatorio() {
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
    public void setValorHora(double valorHora){
        if(valorHora > 0.0){
            this.valorHora = valorHora;
        }else{
            System.out.println("Erro. O valor da hora deve ser maior que 0.");
        }
    }
    
    public void setCupomDesconto(double cupomDesconto){
        if(cupomDesconto > 0.0 && cupomDesconto < 50.0){
            this.cupomDesconto = cupomDesconto;
        }else{
            System.out.println("Valor de desconto inválido.");
        }
    }
    
}