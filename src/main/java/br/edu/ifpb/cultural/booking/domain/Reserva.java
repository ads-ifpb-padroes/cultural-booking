package br.edu.ifpb.cultural.booking.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@SequenceGenerator(name = "reserva_seq", sequenceName = "atracao_seq", allocationSize = 1, initialValue = 1)
public class Reserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reserva_seq")
    private Long codigo;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Cliente cliente;
    @OneToMany
    private List<Acento> acentos;

    {
        this.acentos = new ArrayList<>();
    }

    public Reserva() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
        Reserva reserva = (Reserva) o;
        return Objects.equals(codigo, reserva.codigo) &&
                cliente.equals(reserva.cliente) &&
                acentos.equals(reserva.acentos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, cliente, acentos);
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "codigo=" + codigo +
                ", cliente=" + cliente +
                ", acentos=" + acentos +
                '}';
    }
}
