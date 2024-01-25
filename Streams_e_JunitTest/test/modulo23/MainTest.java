package modulo23;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static modulo23.Main.retornaApenasMulheres;

public class MainTest {

    @Test
    public void testeRetornaApenasMulheres() {
        List<String> nomesDasMulheres =
                retornaApenasMulheres("Amanda-F,Angel-M,Alana-F,Gabriel-M");

        List<String> nomesDasMulheresResultadoCorreto = new ArrayList<>();
        nomesDasMulheresResultadoCorreto.add("Amanda");
        nomesDasMulheresResultadoCorreto.add("Alana");

        Assert.assertEquals(nomesDasMulheresResultadoCorreto, nomesDasMulheres);
    }

}
