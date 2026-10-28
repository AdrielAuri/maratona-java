package OOP.enumeracao.testes;

import OOP.enumeracao.dominio.Cliente;
import OOP.enumeracao.dominio.TipoCliente;
import OOP.enumeracao.dominio.TipoPagamento;

public class ClienteTest {
    static void main(String[] args) {
        Cliente cliente1 = new Cliente("Adriel", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akyrann", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);


        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));


        // valueOf é usado para comparação e value é usado para percorrer
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
