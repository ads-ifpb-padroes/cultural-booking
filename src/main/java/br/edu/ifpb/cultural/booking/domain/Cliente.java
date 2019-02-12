package br.edu.ifpb.cultural.booking.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@SequenceGenerator(name = "cliente_seq", sequenceName = "cliente_seq", allocationSize = 1, initialValue = 1)
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_seq")
    private Long id;
    @Column(length = 11, nullable = false, unique = true)
    private String cpf;
    @Column(length = 150, nullable = false)
    private String nome;
    @Column(length = 70, nullable = false)
    private String email;

    public Cliente() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id) &&
                cpf.equals(cliente.cpf) &&
                nome.equals(cliente.nome) &&
                email.equals(cliente.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cpf, nome, email);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
