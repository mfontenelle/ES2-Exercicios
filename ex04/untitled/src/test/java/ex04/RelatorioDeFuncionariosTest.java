package ex04;
import org.junit.jupiter.api.test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
class RelatorioDeFuncionariosTest {
    @Test
    void testSemFuncionariosNoBanco(){
        FuncionarioDAO funcDaoMock = mock(FuncionarioDAO.class);
        ReceitaFederal RFMock = mock(ReceitaFederal.class);
        RelatorioDeFuncionarios rel = new RelatorioDeFuncionarios(funcDaoMock);
        rel.setRf(RFMock);

        when(funcDaoMock.getFuncionariosBy(categoria:"Dev"))
            .thenReturn(fakeList);

        int resposta = rel.getFuncComCPFBloqueado(categoria:"Dev");
        assertEquals(expected: 0, resposta);
    }
}