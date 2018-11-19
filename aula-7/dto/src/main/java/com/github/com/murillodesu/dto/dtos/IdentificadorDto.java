package main.java.com.github.com.murillodesu.dto.dtos;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "Identificador")
public class IdentificadorDto{

    private String id;

    private IndividuoDto individuo;

    private String designacao;

    private int area;

    private String emissor;

    private Date data;

    private CodigoDescricaoStringDto tipo;

    private CodigoDescricaoDto certidaoTipo;

    public String getId() {
        return id;
    }

    public CodigoDescricaoDto getCertidaoTipo() {
        return certidaoTipo;
    }

    public void setCertidaoTipo(CodigoDescricaoDto certidaoTipo) {
        this.certidaoTipo = certidaoTipo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IndividuoDto getIndividuo() {
        return individuo;
    }

    public void setIndividuo(IndividuoDto individuo) {
        this.individuo = individuo;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public CodigoDescricaoStringDto getTipo() {
        return tipo;
    }

    public void setTipo(CodigoDescricaoStringDto tipo) {
        this.tipo = tipo;
    }
}
