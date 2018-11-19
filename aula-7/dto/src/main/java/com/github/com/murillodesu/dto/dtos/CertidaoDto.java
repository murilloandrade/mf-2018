package main.java.com.github.com.murillodesu.dto.dtos;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Certidao")
public class CertidaoDto {

    private IdentificadorDto identificador;

    private CodigoDescricaoDto tipo;

    private String cartorio;

    private int livro;

    private int folha;

    private int termo;

    public IdentificadorDto getIdentificador() {
        return identificador;
    }

    public void setIdentificador(IdentificadorDto identificador) {
        this.identificador = identificador;
    }

    public CodigoDescricaoDto getTipo() {
        return tipo;
    }

    public void setTipo(CodigoDescricaoDto tipo) {
        this.tipo = tipo;
    }

    public String getCartorio() {
        return cartorio;
    }

    public void setCartorio(String cartorio) {
        this.cartorio = cartorio;
    }

    public int getLivro() {
        return livro;
    }

    public void setLivro(int livro) {
        this.livro = livro;
    }

    public int getFolha() {
        return folha;
    }

    public void setFolha(int folha) {
        this.folha = folha;
    }

    public int getTermo() {
        return termo;
    }

    public void setTermo(int termo) {
        this.termo = termo;
    }
}
