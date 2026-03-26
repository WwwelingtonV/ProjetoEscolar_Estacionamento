public class Principal {
    public static void main(String[] args) {
        
        // Definimos as variaveis de preco da tabela do estacionamento
        double precoCarro = 0.0;
        double precoMoto = 10.0;

        // --- INSTANCIA 1: CARRO ---
        // Passamos os valores especificos no Construtor
        Veiculo carro = new Veiculo("SUV Jeep", "ABC-1234", precoCarro, 5.0);
        
        carro.registrarEntrada(13); // Entrou as 13h
        carro.finalizarHospedagem(16); // Ficou 3 horas -> (3 * 20) - 5 = 55.00
        carro.imprimirRelatorio();


        // --- INSTANCIA 2: MOTO ---
        // A moto usa a mesma classe, mas com preco e cupom diferentes
        Veiculo moto = new Veiculo("Honda CB500", "XYZ-9999", precoMoto, 0.0);
        
        moto.registrarEntrada(10); // Entrou as 10h
        moto.finalizarHospedagem(12); // Ficou 2 horas -> (2 * 10) - 2 = 18.00
        moto.imprimirRelatorio();


        // --- TESTE DE SEGURANCA ---
        // Tentando finalizar um veiculo que ja saiu
        carro.finalizarHospedagem(20);
    }
}