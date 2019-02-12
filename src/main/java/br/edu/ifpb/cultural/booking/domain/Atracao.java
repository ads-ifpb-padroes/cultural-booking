package br.edu.ifpb.cultural.booking.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@SequenceGenerator(name = "atracao_seq", sequenceName = "atracao_seq", allocationSize = 1, initialValue = 1)
public class Atracao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "atracao_seq")
    private Long id;
    @Column(length = 200, nullable = false, unique = true)
    private String titulo;
    private BigDecimal valor;
    @Column(nullable = false, unique = true)
    private LocalDateTime inicio;
    @Column(nullable = false, unique = true)
    private LocalDateTime fim;
    @Column(nullable = false)
    private int duracao;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "atracao_id")
    private List<Acento> acentos;

    {
        this.acentos = new ArrayList<>();
    }

    public Atracao() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public List<Acento> getAcentos() {
        return acentos;
    }

    public void setAcentos(List<Acento> acentos) {
        this.acentos = acentos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atracao atracao = (Atracao) o;
        return duracao == atracao.duracao &&
                Objects.equals(id, atracao.id) &&
                titulo.equals(atracao.titulo) &&
                valor.equals(atracao.valor) &&
                inicio.equals(atracao.inicio) &&
                fim.equals(atracao.fim) &&
                Objects.equals(acentos, atracao.acentos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, valor, inicio, fim, duracao, acentos);
    }

    @Override
    public String toString() {
        return "Atracao{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", valor=" + valor +
                ", inicio=" + inicio +
                ", fim=" + fim +
                ", duracao=" + duracao +
                ", acentos=" + acentos +
                '}';
    }
}