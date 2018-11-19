package main.java.com.github.com.murillodesu.dto.dtos;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "EnderecoLinha")
public class EnderecoLinhaDto {
    private EnderecoDto endereco;
    private String linha;
    private int ordem;

    public EnderecoDto getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoDto endereco) {
        this.endereco = endereco;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }
}
