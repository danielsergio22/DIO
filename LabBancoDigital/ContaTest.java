package DIO.LabBancoDigital;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaTest {
    @Test
    void testNumeroDaConta() {
        Cliente cliente1 = new Cliente();
        Conta conta1 = new ContaCorrente(cliente1);
        Assertions.assertNotNull(conta1.numero);

        Cliente cliente2 = new Cliente();
        Conta conta2 = new ContaCorrente(cliente2);
        Assertions.assertNotNull(conta2.numero);
    }
}
