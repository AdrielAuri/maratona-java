package OOP.polimorfismo.service;

import OOP.polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando na Memória");
    }
}
