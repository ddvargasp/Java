package peluqueriaCanina.logica;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import peluqueriaCanina.logica.Propietario;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-05-01T18:25:18")
@StaticMetamodel(Mascota.class)
public class Mascota_ { 

    public static volatile SingularAttribute<Mascota, String> raza;
    public static volatile SingularAttribute<Mascota, String> color;
    public static volatile SingularAttribute<Mascota, String> alergico;
    public static volatile SingularAttribute<Mascota, String> observaciones;
    public static volatile SingularAttribute<Mascota, Propietario> unPropietario;
    public static volatile SingularAttribute<Mascota, Integer> numCliente;
    public static volatile SingularAttribute<Mascota, String> nombre;
    public static volatile SingularAttribute<Mascota, String> atencionEspecial;

}