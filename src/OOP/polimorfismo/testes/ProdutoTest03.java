package OOP.polimorfismo.testes;

import OOP.polimorfismo.repositorio.Repositorio;
import OOP.polimorfismo.service.RepositorioArquivo;

public class ProdutoTest03 {
    static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
