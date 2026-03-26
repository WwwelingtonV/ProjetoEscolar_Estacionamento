public class Principal {
    public static void main(String[] args) {
        
        // Definimos as variaveis de preco da tabela do estacionamento
        double precoCarro = 20.0;
        double precoMoto = 10.0;

        // --- INSTANCIA 1: CARRO ---
        // Passamos os valores especificos no Construtor
        Veiculo c1 = new Carro("SUV Jeep", "ABC-1234", precoCarro, 5.0, 4);
        
        c1.registrarEntrada(13); // Entrou as 13h
        c1.finalizarHospedagem(16); // Ficou 3 horas -> (3 * 20) - 5 = 55.00
        c1.imprimirRelatorio();


        // --- INSTANCIA 2: MOTO ---
        // A moto usa a mesma classe, mas com preco e cupom diferentes
        Veiculo m1 = new Moto("Honda CB500", "XYZ-9999", precoMoto, 2.0, 2);
        
        m1.registrarEntrada(10); // Entrou as 10h
        m1.finalizarHospedagem(12); // Ficou 2 horas -> (2 * 10) - 2 = 18.00
        m1.imprimirRelatorio();

        Veiculo m2 = new Moto("Yamaha 9090", "R15-123", precoMoto, 2.0, 2);
        
        m2.registrarEntrada(5); // Entrou as 10h
        m2.finalizarHospedagem(17); // Ficou 2 horas -> (2 * 10) - 2 = 18.00
        m2.imprimirRelatorio();


        // --- TESTE DE SEGURANCA ---
        // Tentando finalizar um veiculo que ja saiu
        c1.finalizarHospedagem(20);
    }
}