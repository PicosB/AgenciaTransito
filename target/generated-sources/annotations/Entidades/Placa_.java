package Entidades;

import Entidades.Vehiculo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-05-03T11:40:19")
@StaticMetamodel(Placa.class)
public class Placa_ extends Tramite_ {

    public static volatile SingularAttribute<Placa, String> codigo;
    public static volatile SingularAttribute<Placa, Vehiculo> veh;
    public static volatile SingularAttribute<Placa, Date> fechaEmision;
    public static volatile SingularAttribute<Placa, Date> fechaRecepcion;

}