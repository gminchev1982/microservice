package com.minchev.demodb.db;
import javax.persistence.*;

@Entity
@Table(name = "roles")
public class RoleEntity    {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private String authority;

    public RoleEntity() {
    }

    public RoleEntity(String authority) {
        this.authority = authority;

    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
