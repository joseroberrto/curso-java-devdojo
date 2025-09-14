package academy.devdojo.maratonajava.introducao.javacore.Kenumeraação.dominio;

public enum TipoPessoa {
    PESSOA_FISICA(1),
    PESSOA_JURITICA(2);

    public final int VALOR;//colocando atributos na enumeração

    TipoPessoa(int valor){//sobrescrevendo o construtor da enumeração
        this.VALOR = valor;
    }

    }
