/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import java.util.ArrayList;

/**
 *
 * @author JEAN PAUL
 */
public class Municipio {

    int idmunicipio;
    String nombre;
    String Latitud;
    String longitud;
    String PolLAt;
    String PolLong;

// ArrayList<Tipobiomasa> biomasas=new ArrayList<>();
    public Municipio(int idmunicipio, String nombre, String Latitud, String longitud, String PolLAt, String PolLong) {
        this.idmunicipio = idmunicipio;
        this.nombre = nombre;
        this.Latitud = Latitud;
        this.longitud = longitud;
        this.PolLAt = PolLAt;
        this.PolLong = PolLong;
    }

}
