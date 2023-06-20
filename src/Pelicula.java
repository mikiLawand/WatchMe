
public class Pelicula {

    String titulo;
    String categoria;
    Integer lancamento;
    Integer duracao;
    String genero;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getLancamento() {
        return lancamento;
    }

    public void setLancamento(Integer lancamento) {
        this.lancamento = lancamento;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Pelicula(String titulo, String categoria, Integer lancamento, Integer duracao, String genero) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.lancamento = lancamento;
        this.duracao = duracao;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pelicula [titulo=" + titulo + ", categoria=" + categoria + ", anoLancamento=" + lancamento
                + ", duracao=" + duracao + ", genero=" + genero + "]";
    }

}
