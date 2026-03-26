public class Carro extends Veiculo{
    private int quantidadeRodas;
    
    public Carro(String placa, String modelo, double valorHora, double cupomDesconto, int rodas){
        super(modelo, placa, valorHora, cupomDesconto);
        this.quantidadeRodas = rodas;
        System.out.println("Quantidade de rodas: " + rodas);
    }
    
    @Override
    public void quantasRodas(){
        System.out.println("Possui 4 rodas!");
    }

    public int getQuantidadeRodas(){
        return this.quantidadeRodas;
    }
}