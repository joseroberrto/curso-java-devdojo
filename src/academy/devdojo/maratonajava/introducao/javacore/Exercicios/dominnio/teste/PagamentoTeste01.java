package academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.teste;

import academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.dominio.*;
import java.util.Scanner;

public class PagamentoTeste01 {
    public static void main(String[] args) {
        int opcao=1 , valor=0,escolhaPagamento=0 ,totalCompra =0;
        Scanner scan = new Scanner(System.in);
        Compra compra = new Compra();
        TipoPagamento tipoPagamento = null ;
        Pagamento pagamento;

        while (opcao != 0){
            System.out.println("1 - Valor da compra");
            System.out.println("2 - Forma de pagamento");
            System.out.println("0 - Finalizar compra");
            System.out.print(">>>Digite sua opcao: ");
            opcao = scan.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("Digite o valor da compra: ");
                    valor = scan.nextInt();
                    totalCompra += valor;
                    break;
                case 2:
                    System.out.println("1 - PIX\n 2-CARTAOCREDITO" );
                    System.out.print(">>Digite sua escolha: ");
                    escolhaPagamento = scan.nextInt();
                    switch (escolhaPagamento){
                        case 1:
                            tipoPagamento = TipoPagamento.PIX;
                            break;
                        case 2 :
                            tipoPagamento = TipoPagamento.CARTAOCREDITO;
                            break;
                        default:
                            System.out.println("Forma de pagamento não aceito,tente outra forma");
                            break;

                    }
                default:
                    System.out.println("Opcao invalida.Tente novamente");
                    break;

            }


        }

        if(tipoPagamento == TipoPagamento.CARTAOCREDITO){
            pagamento = new CartaoCredito();
            compra.finalizarCompra(pagamento,totalCompra);
        }
        if (tipoPagamento == TipoPagamento.PIX){
            pagamento = new Pix();
            compra.finalizarCompra(pagamento,totalCompra);
        }


    }
}
