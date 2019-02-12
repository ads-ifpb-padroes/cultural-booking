package br.edu.ifpb.cultural.booking.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@SequenceGenerator(name = "acento_seq", sequenceName = "acento_seq", allocationSize = 1, initialValue = 1)
public class Acento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acento_seq")
    private Long codigo;
    @Column(length = 15, nullable = false, unique = true)
    private String localizacao;
    @ManyToOne
    private Atracao atracao;

    public Acento() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Atracao getAtracao() {
        return atracao;
    }

    public void setAtracao(Atracao atracao) {
        this.atracao = atracao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Acento acento = (Acento) o;
        return codigo == acento.codigo &&
                localizacao.equals(acento.localizacao) &&
                atracao.equals(acento.atracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, localizacao, atracao);
    }

    @Override
    public String toString() {
        return "Acento{" +
                "codigo=" + codigo +
                ", localizacao='" + localizacao + '\'' +
                ", atracao=" + atracao +
                '}';
    }
}
