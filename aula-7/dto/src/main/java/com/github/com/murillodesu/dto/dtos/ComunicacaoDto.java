package main.java.com.github.com.murillodesu.dto.dtos;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Comunicado")
public class ComunicacaoDto{

    private IndividuoDto individuo;

    private CodigoDescricaoAlternativaDto meio;

    private CodigoDescricaoDto preferencia;

    private String detalhe;

    private CodigoDescricaoAlternativaDto uso;

    public IndividuoDto getIndividuo() {
        return individuo;
    }

    public void setIndividuo(IndividuoDto individuo) {
        this.individuo = individuo;
    }

    public CodigoDescricaoAlternativaDto getMeio() {
        return meio;
    }

    public void setMeio(CodigoDescricaoAlternativaDto meio) {
        this.meio = meio;
    }

    public CodigoDescricaoDto getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(CodigoDescricaoDto preferencia) {
        this.preferencia = preferencia;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public CodigoDescricaoAlternativaDto getUso() {
        return uso;
    }

    public void setUso(CodigoDescricaoAlternativaDto uso) {
        this.uso = uso;
    }
}
