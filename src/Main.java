import produtos.Caderno;
import produtos.Caneta;
import produtos.Estoque;
import produtos.Produto;


public class Main {
    public static void main(String args[]) {
        Produto produto = new Caderno();
        produto = new Caneta();

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());

        Estoque<Caderno> estoqueCaderno = new Estoque<>();
        estoqueCaderno.adicionar( new Caderno());
    }
}


//    Criar classes Conta Corrente e Poupanca
//Atributos:
//        numeroConta (int): Número da conta bancária.
//        saldo (double): Saldo atual da conta bancária.
//
//        Métodos:
//        depositar(double valor): Adiciona o valor especificado ao saldo da conta.
//        sacar(double valor): Subtrai o valor especificado do saldo da conta (se houver saldo suficiente).
//
//        Cria uma outra classe GerenciadorContas, implemente o método transferir(T origem, T destino, double valor)
//        que transfere um valor da conta de origem para a conta de destino,
//        verificando se há saldo suficiente na conta de origem.
