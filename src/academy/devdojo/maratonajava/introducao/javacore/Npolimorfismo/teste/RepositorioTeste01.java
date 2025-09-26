package academy.devdojo.maratonajava.introducao.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.introducao.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.introducao.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.introducao.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTeste01 {
    public static void main(String[] args) {
        //usando o mesmo tipo e objeto
        RepositorioBancoDeDados repositorioBancoDeDados = new RepositorioBancoDeDados();
        repositorioBancoDeDados.salvar();

        //usando a mesma variavel de referencia: usando a interface como "pai" classe generica
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

        Repositorio repositorio1 = new RepositorioArquivo();
        repositorio1.salvar();

    }
}
