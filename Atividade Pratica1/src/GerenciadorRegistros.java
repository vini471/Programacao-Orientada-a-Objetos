import java.util.List;
import java.util.ArrayList;

public class GerenciadorRegistros {
    private List<RegistroFilmes> Registros;

    public GerenciadorRegistros() {
        Registros = new ArrayList<>();
    }

    public void AdicionaRegistro(RegistroFilmes r) {
        Registros.add(r);
    }

    public List<RegistroFilmes> ObterGerenciadorRegistros() {
        return Registros;
    }

    public RegistroFilmes FilmeMaiorValor() {
        double MaiorValorFilme = Double.MIN_VALUE;
        RegistroFilmes FilmeValorMais = null;
        for (RegistroFilmes a : Registros) {
            if (a.getValorFilme() > MaiorValorFilme) {
                MaiorValorFilme = a.getValorFilme();
                FilmeValorMais = a;
            }
        }
        return FilmeValorMais;
    }

}
