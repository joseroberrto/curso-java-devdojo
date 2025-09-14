package academy.devdojo.maratonajava.introducao.javacore.Kenumeraação.dominio;

public enum TipoPagamento {
    CARTAO_CREDITO{
        @Override
        public double calcularDesconto(double valor) {//sobrescrevendo o meódo criado fora do escopo dos tipos
            return valor * 0.1;
        }
    },CARTAOD_DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public double calcularDesconto(double valor){//criação do metódo na enumeração
        return 0;
    }


}
