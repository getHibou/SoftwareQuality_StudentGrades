import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalcularMedias{
    @Test
    public void calcularMediaNormal(){ // Teste de médias para o código principal
        double nota1 = 8.3;
        double nota2 = 7.2;
        double nota3 = 10;

        double resultadoEsperado = 8.5;
        double resultadoTeste = Main.calcularMedia(nota1, nota2, nota3);
        assertEquals(resultadoEsperado, resultadoTeste, 0.01);
    }
    @Test
    public void calcularMediaZero(){ //Teste geral para ver se a calculadora funciona, não têm ligação com as notas
        double nota1 = 0.0;
        double nota2 = 0.0;
        double nota3 = 0.0;

        double resultadoEsperado = 0.0;
        double resultadoTeste = Main.calcularMedia(nota1, nota2, nota3);
        assertEquals(resultadoEsperado, resultadoTeste, 0.01);
    }
    @Test
    public void calcularMediaNegativa(){ //Teste geral para ver se a calculadora funciona, não têm ligação com as notas
        double nota1 = -6.5;
        double nota2 = -9.7;
        double nota3 = -8.4;

        double resultadoEsperado = -8.2;
        double resultadoTeste = Main.calcularMedia(nota1, nota2, nota3);
        assertEquals(resultadoEsperado, resultadoTeste, 0.01);
    }
}