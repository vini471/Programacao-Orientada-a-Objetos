public class RegistroFilmes {
    private String NomeFilme, NomeCliente, AnoLancamento;
    private double ValorFilme;

    public String getNomeFilme() {
        return NomeFilme;
    }

    public void setNomeFilme(String NomeFilme) {
        if (NomeFilme == null || NomeFilme.isBlank()) {
            throw new IllegalArgumentException("Nome de filme invlido!");
        } else {
            this.NomeFilme = NomeFilme;
        }
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String NomeCliente) {
        if (NomeCliente == null || NomeCliente.isBlank()) {
            throw new IllegalArgumentException("Nome de cliente inválido!");
        } else {
            this.NomeCliente = NomeCliente;
        }
    }

    public String getAnoLancamento() {
        return AnoLancamento;
    }

    public void setAnoLancamento(String AnoLancamento) {
        if (AnoLancamento == null) {
            throw new IllegalArgumentException("Data invalida!");
        } else {
            this.AnoLancamento = AnoLancamento;
        }
    }

    public Double getValorFilme() {
        return ValorFilme;
    }

    public void setValorFilme(double ValorFilme) {
        if (0 > ValorFilme) {
            throw new IllegalArgumentException("Valor de filme inválido");
        } else {
            this.ValorFilme = ValorFilme;
        }
    }

    public RegistroFilmes(String NomeFilme, String AnoLancamento, String NomeCliente, Double ValorFilme) {
        setNomeFilme(NomeFilme);
        setAnoLancamento(AnoLancamento);
        setNomeCliente(NomeCliente);
        setValorFilme(ValorFilme);
    }

}
