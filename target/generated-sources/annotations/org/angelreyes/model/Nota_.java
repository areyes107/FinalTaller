package org.angelreyes.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.angelreyes.model.Categoria;
import org.angelreyes.model.Persona;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T17:14:24")
@StaticMetamodel(Nota.class)
public class Nota_ { 

    public static volatile SingularAttribute<Nota, Date> fecha;
    public static volatile SingularAttribute<Nota, String> comentarioAdmin;
    public static volatile SingularAttribute<Nota, Persona> persona;
    public static volatile SingularAttribute<Nota, Categoria> categoria;
    public static volatile SingularAttribute<Nota, String> encabezado;
    public static volatile SingularAttribute<Nota, String> valorizacion;
    public static volatile SingularAttribute<Nota, Integer> codigoNota;
    public static volatile SingularAttribute<Nota, String> cuerpo;

}