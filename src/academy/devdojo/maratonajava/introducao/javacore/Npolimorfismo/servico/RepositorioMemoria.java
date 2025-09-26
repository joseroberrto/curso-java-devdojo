
package academy.devdojo.maratonajava.introducao.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.introducao.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

        @Override
        public void salvar() {
            System.out.println("Salvando em memoria");
        }
}
