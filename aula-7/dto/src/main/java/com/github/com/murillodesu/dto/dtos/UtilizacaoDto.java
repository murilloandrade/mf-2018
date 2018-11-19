package main.java.com.github.com.murillodesu.dto.dtos;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "Utilizacao")
public class UtilizacaoDto{
    private NomeDto nome;
    private CodigoDescricaoAlternativaDto uso;
    private IdentificadorDto identificador;
    private Date dataInicio;
    private Date dataFinal;

    public NomeDto getNome() {
        return nome;
    }

    public void setNome(NomeDto nome) {
        this.nome = nome;
    }

    public CodigoDescricaoAlternativaDto getUso() {
        return uso;
    }

    public void setUso(CodigoDescricaoAlternativaDto uso) {
        this.uso = uso;
    }

    public IdentificadorDto getIdentificador() {
        return identificador;
    }

    public void setIdentificador(IdentificadorDto identificador) {
        this.identificador = identificador;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
}
