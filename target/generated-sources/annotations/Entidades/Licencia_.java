package Entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-20T05:01:31")
@StaticMetamodel(Licencia.class)
public class Licencia_ extends Tramite_ {

    public static volatile SingularAttribute<Licencia, Date> vigencia;
    public static volatile SingularAttribute<Licencia, Date> fechaExpedicion;
    public static volatile SingularAttribute<Licencia, String> discapacitado;
    public static volatile SingularAttribute<Licencia, String> anios;

}