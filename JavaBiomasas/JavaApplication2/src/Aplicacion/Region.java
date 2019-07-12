/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

/**
 *
 * @author JEAN PAUL
 */
public class Region {

    int camiones;
    double distancia;
    double costotransporte;
    double costooperacion;
    double costomantenimiento;
    double costofinanciero;
    double ventadigestato;
    double ventaenergia;
    double energiaproducida;
    double potenciaproducida;
    double volumendigestor;
    double biogasproducido;
    String nombreregion;

    Region(String nregion, float bgproducido, float voldigestor, float pproducida, float eproducida, float venergia, float vdigestato, float cfinanciero, float cmantenimiento, float coperacion, float ctransporte, float distancia, int camiones) {
        nombreregion = nregion;
        biogasproducido = bgproducido;
        volumendigestor = voldigestor;
        potenciaproducida = pproducida;
        energiaproducida = eproducida;
        ventaenergia = venergia;
        ventadigestato = vdigestato;
        costofinanciero = cfinanciero;
        costomantenimiento = cmantenimiento;
        this.camiones = camiones;
        this.distancia = distancia;
        costotransporte = ctransporte;
        costooperacion = coperacion;

    }

}
