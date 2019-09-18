package org.angelreyes.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.angelreyes.model.Persona;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T17:14:24")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> clave;
    public static volatile SingularAttribute<Usuario, String> tipo;
    public static volatile SingularAttribute<Usuario, Boolean> estado;
    public static volatile SingularAttribute<Usuario, Persona> codigoUsuario;
    public static volatile SingularAttribute<Usuario, String> usuario;

}