package main.java.com.github.com.murillodesu.dto.dtos;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TipoEleitoral")
public class TipoEleitoralDto {

    private IdentificadorDto identificador;

    private int zona;

    private int sessao;

    public IdentificadorDto getIdentificador() {
        return identificador;
    }

    public void setIdentificador(IdentificadorDto identificador) {
        this.identificador = identificador;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public int getSessao() {
        return sessao;
    }

    public void setSessao(int sessao) {
        this.sessao = sessao;
    }
}
