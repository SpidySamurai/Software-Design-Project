/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.demo;

import com.proyecto.abstractfactory.FactoryElectronica;
import com.proyecto.abstractfactory.FactoryHeladeria;
import com.proyecto.abstractfactory.FactoryRelojeria;
import com.proyecto.base.Articulo;
import com.proyecto.base.CentroComercial;
import com.proyecto.base.Cliente;
import com.proyecto.base.Tienda;
import com.proyecto.entidades.electronica.Celular;
import com.proyecto.entidades.electronica.Laptop;
import com.proyecto.entidades.electronica.SmartBand;
import com.proyecto.entidades.electronica.Tablet;
import com.proyecto.entidades.electronica.Teclado;
import com.proyecto.entidades.heladeria.HeladoChocolate;
import com.proyecto.entidades.heladeria.HeladoCombinado;
import com.proyecto.entidades.heladeria.HeladoFresa;
import com.proyecto.entidades.heladeria.HeladoOreo;
import com.proyecto.entidades.heladeria.HeladoVainilla;
import com.proyecto.entidades.relojeria.Cronometro;
import com.proyecto.entidades.relojeria.Despertador;
import com.proyecto.entidades.relojeria.RelojPared;
import com.proyecto.entidades.relojeria.RolexDaytona;
import com.proyecto.entidades.relojeria.RolexSubmariner;

/**
 *
 * @author Javier
 */
public class SetupMemoria {

    public SetupMemoria() {
        generarMemoria();
    }

    private CentroComercial generarMemoria() {
        //Setup de memoria
        //Centro comercial, que igual implementa singleton :)
        CentroComercial centroComercial = CentroComercial.getInstance();
        //Clientes que estan en el centro comercial
        Cliente jose = new Cliente("Jose");
        Cliente eduardo = new Cliente("Eduardo");
        Cliente enrique = new Cliente("Enrique");
        Cliente gener = new Cliente("Gener");
        //Simulamos la entrada de todos los clientes
        centroComercial.entrarCliente(jose);
        centroComercial.entrarCliente(eduardo);
        centroComercial.entrarCliente(enrique);
        centroComercial.entrarCliente(gener);

        //Tiendas pertenecientes al centro comercial
        Tienda heladeria = new FactoryHeladeria().crearTienda();
        Tienda relojeria = new FactoryRelojeria().crearTienda();
        Tienda electronica = new FactoryElectronica().crearTienda();

        //Simulamos que estan en alguna tienda esto para desplegar la lista y su ubicación
//        jose.setTiendaActual(heladeria);
//        enrique.setTiendaActual(electronica);
//        gener.setTiendaActual(relojeria);
//
//        heladeria.entrarCliente(jose);
//        electronica.entrarCliente(enrique);
//        relojeria.entrarCliente(gener);
        centroComercial.añadirTienda(heladeria);
        centroComercial.añadirTienda(relojeria);
        centroComercial.añadirTienda(electronica);
        //Set de articulos en la tienda
        //Electronica
        Articulo celular = new Celular();
        Articulo celular1 = new Celular();
        Articulo celular2 = new Celular();
        Articulo laptop = new Laptop();
        Articulo laptop1 = new Laptop();
        Articulo smartBand = new SmartBand();
        Articulo smartBand1 = new SmartBand();
        Articulo tablet = new Tablet();
        Articulo tablet1 = new Tablet();
        Articulo teclado = new Teclado();

        Articulo rolexDaytone = new RolexDaytona();
        Articulo rolexSubmariner = new RolexSubmariner();
        Articulo relojPared = new RelojPared();
        Articulo relojPared1 = new RelojPared();
        Articulo despertador = new Despertador();
        Articulo despertador1 = new Despertador();
        Articulo cronometro = new Cronometro();

        Articulo heladoChocolate = new HeladoChocolate();
        Articulo heladoChocolate1 = new HeladoChocolate();
        Articulo heladoCombinado = new HeladoCombinado();
        Articulo heladoCombinado1 = new HeladoCombinado();
        Articulo heladoFresa = new HeladoFresa();
        Articulo heladoFresa1 = new HeladoFresa();
        Articulo heladoOreo = new HeladoOreo();
        Articulo heladoVainilla = new HeladoVainilla();

        electronica.añadirProductoTienda(celular);
        electronica.añadirProductoTienda(celular1);
        electronica.añadirProductoTienda(celular2);
        electronica.añadirProductoTienda(laptop);
        electronica.añadirProductoTienda(laptop1);
        electronica.añadirProductoTienda(smartBand);
        electronica.añadirProductoTienda(smartBand1);
        electronica.añadirProductoTienda(tablet);
        electronica.añadirProductoTienda(tablet1);
        electronica.añadirProductoTienda(teclado);

        heladeria.añadirProductoTienda(heladoChocolate);
        heladeria.añadirProductoTienda(heladoChocolate1);
        heladeria.añadirProductoTienda(heladoCombinado);
        heladeria.añadirProductoTienda(heladoCombinado1);
        heladeria.añadirProductoTienda(heladoFresa);
        heladeria.añadirProductoTienda(heladoFresa1);
        heladeria.añadirProductoTienda(heladoOreo);
        heladeria.añadirProductoTienda(heladoVainilla);

        relojeria.añadirProductoTienda(rolexDaytone);
        relojeria.añadirProductoTienda(rolexSubmariner);
        relojeria.añadirProductoTienda(relojPared);
        relojeria.añadirProductoTienda(relojPared1);
        relojeria.añadirProductoTienda(despertador);
        relojeria.añadirProductoTienda(despertador1);
        relojeria.añadirProductoTienda(cronometro);

        return centroComercial;
    }

}
