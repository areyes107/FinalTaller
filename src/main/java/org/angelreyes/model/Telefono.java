package org.angelreyes.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="telefono")
public class Telefono implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoTelefono;
    
    @Column(name="numero")
    private String numero;
    
    @ManyToOne
    @JoinColumn(name="codigoPersona", nullable = false)
    private Persona persona;

    public int getCodigoTelefono() {
        return codigoTelefono;
    }

    public void setCodigoTelefono(int codigoTelefono) {
        this.codigoTelefono = codigoTelefono;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.codigoTelefono;
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
        final Telefono other = (Telefono) obj;
        if (this.codigoTelefono != other.codigoTelefono) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Telefono{" + "codigoTelefono=" + codigoTelefono + '}';
    }
    
    
    
    
}
