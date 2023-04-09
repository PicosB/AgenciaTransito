package Entidades;

import Entidades.Vehiculo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-08T18:51:36")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, String> numTelefono;
    public static volatile SingularAttribute<Clientes, String> fechaNacimiento;
    public static volatile SingularAttribute<Clientes, String> apellidoP;
    public static volatile ListAttribute<Clientes, Vehiculo> listaVehiculos;
    public static volatile SingularAttribute<Clientes, String> apellidoM;
    public static volatile SingularAttribute<Clientes, Integer> id;
    public static volatile SingularAttribute<Clientes, String> RFC;
    public static volatile SingularAttribute<Clientes, String> nombres;

}