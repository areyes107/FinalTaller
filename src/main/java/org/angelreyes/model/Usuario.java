package org.angelreyes.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario implements Serializable{    
    
    @Id
    @OneToOne
    @JoinColumn(name="codigoPersona", nullable = false)
    private Persona codigoUsuario;
    
    @Column(name="usuario")
    private String usuario;
    
    @Column(name="clave")
    private String clave;
    
    @Column(name="tipo")
    private String tipo;
    
    @Column(name="estado")
    private boolean estado =true;

    public Persona getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Persona codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }
    

    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.codigoUsuario);
        return hash;
    }
    
    

    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.codigoUsuario != other.codigoUsuario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "codigoUsuario=" + codigoUsuario + '}';
    }
    
    
    
}
