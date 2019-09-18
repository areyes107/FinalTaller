package org.angelreyes.controller;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.angelreyes.ejb.CategoriaFacadeLocal;
import org.angelreyes.model.Categoria;

@Named 
@ViewScoped 
public class CategoriaController implements Serializable{
    
    @EJB 
    private CategoriaFacadeLocal categoriaEJB; //Acá hacemos la inyección 
    private Categoria categoria;
    
    @PostConstruct 
    public void onit(){
        categoria = new Categoria();
    }
    
    public void registrar(){
        try{
            categoriaEJB.create(categoria);
        }catch(Exception e){
            
        }
        
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
