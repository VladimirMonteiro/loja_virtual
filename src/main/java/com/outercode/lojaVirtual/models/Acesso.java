package com.outercode.lojaVirtual.models;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

import java.io.Serial;
import java.util.Objects;


@Entity
@Table(name = "acesso")
@SequenceGenerator(name = "seq_acesso", sequenceName = "seq_acesso", initialValue = 1, allocationSize = 1)
public class Acesso implements GrantedAuthority {
    @Serial
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_acesso")
    private Long id;

    @Column(nullable = false)
    private String descricao; // Acesso ROLE_ADMIN ou Role_Secretario



    @Override
    public String getAuthority() {
        return this.descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Acesso acesso)) return false;
        return Objects.equals(getId(), acesso.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
