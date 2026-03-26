public class Moto extends Veiculo{
    private int quantidadeRodas;
    private boolean estaEstacionado;
    private String modelo;
    private int horaEntrada;
    private double valorHora;
    private double cupomDesconto;
    private double valorUltimoPagamento;
    private String placa;
    
    public Moto(String placa, String modelo, double valorHora, double cupomDesconto, int rodas){
        super(modelo, placa, valorHora, cupomDesconto);
        this.quantidadeRodas = rodas;
        this.estaEstacionado = false;
        this.modelo  = modelo;
        this.valorHora = valorHora;
        this.cupomDesconto = cupomDesconto;
        this.placa = placa;
        System.out.println("Quantidade de rodas: " + rodas);
    }
    
    @Override
    public void quantasRodas(){
        System.out.println("Possui 2 rodas!");
    }

    public int getQuantidadeRodas(){
        return this.quantidadeRodas;
    }

    // METODO 1: Registra entrada
    @Override
    void registrarEntrada(int hora) {
        this.horaEntrada = hora;
        this.estaEstacionado = true;
        System.out.println(">>> Entrada: " + modelo + " (Placa: " + placa + ") as " + hora + "h.");
    }

    // METODO 2: Valida e calcula a saída
    @Override
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

        if(tempoPermanencia <= 2){
            total = total / 2;
        }
        
        if (total < 0){
            total = 0;
        }

        this.valorUltimoPagamento = total;
        this.estaEstacionado = false;
        return total;
    }

    // METODO 3: Relatorio
    @Override
    void imprimirRelatorio() {
        System.out.println("--- RELATORIO: " + modelo + " ---");
        System.out.println("Tabela Preco/Hora: R$ " + valorHora);
        System.out.println("Desconto aplicado: R$ " + cupomDesconto);
        System.out.println("VALOR TOTAL PAGO: R$ " + valorUltimoPagamento);
        System.out.println("------------------------------\n");
    }

    public double getValorUltimoPagamento(){
        return this.valorUltimoPagamento;
    }
}