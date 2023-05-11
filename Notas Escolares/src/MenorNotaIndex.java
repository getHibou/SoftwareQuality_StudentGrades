import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MenorNotaIndex{
    @Test
    public void testMenorNotaIndex(){ //Pega a nota mais baixa dentre as que estão no vetor
        double[][] notas = {{7.0, 8.0, 9.0}, {5.0, 4.0, 6.0}, {5.0, 6.0, 5.0, 10.0}};
        int[] indicesEsperados = {0, 1, 0};
        for (int i = 0; i < notas.length; i++) {
            int indexCalculado = Main.menorNotaIndex(notas[i]);
            assertEquals(indicesEsperados[i], indexCalculado);
        }
    }
}