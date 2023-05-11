import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TresEQuatroNotas{
    @Test
    public void testTresNotas() {
        double nota1 = 8.0;
        double nota2 = 7.5;
        double nota3 = 9.0;
        double mediaEsperada = 8.17;
        double delta = 0.01;

        double mediaCalculada = Main.calcularMedia(nota1, nota2, nota3);
        assertEquals(mediaEsperada, mediaCalculada, delta);
    }

    @Test
    public void testQuatroNotas() {
        double nota1 = 8.0;
        double nota2 = 3.5;
        double nota3 = 9.0;
        double nota4 = 7.0;
        double mediaEsperada = 8;
        double delta = 0.01;

        double mediaCalculada = Main.calcularMedia(nota1, nota2, nota3, nota4);
        assertEquals(mediaEsperada, mediaCalculada, delta);
    }
}
