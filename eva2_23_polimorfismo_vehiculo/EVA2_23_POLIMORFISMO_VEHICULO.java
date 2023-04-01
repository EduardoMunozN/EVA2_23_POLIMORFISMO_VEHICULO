/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_23_polimorfismo_vehiculo;

/**
 *
 * @author eduar
 */
public class EVA2_23_POLIMORFISMO_VEHICULO {

    public static void main(String[] args) {
        Automovil auto = new Automovil("Tesla",0,"X", 2021);
        cambiarVelocidad(auto, 20);
        Bicicleta bici = new Bicicleta("Montaña", "xx", 0, "Harley Davidson");
        cambiarVelocidad(bici, 100);
        
        //Clase Objetc <---  
        Object obj = auto;
    }
    public static void cambiarVelocidad(DatosVehiculo vehi, int vel){
        vehi.acelerar(vel);
        vehi.tablero();
    }
}

interface DatosVehiculo{
    void acelerar(int cambio);
    void tablero();
}


class Vehiculo{
    protected int velocidad;
    private String marca;

    public Vehiculo() {
        this.velocidad = 0;
        this.marca = "-----";
    }

    public Vehiculo(int velocidad, String marca) {
        this.velocidad = velocidad;
        this.marca = marca;
    }
    
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    //La velocidad se modifica con acelerar.
    public int getVelocidad() {
        return velocidad;
    }
    
}




class Automovil extends Vehiculo implements DatosVehiculo{
    private String modelo;
    private int año;

    public Automovil() {
        super();
        this.modelo = "-----";
        this.año = 0;
    }

    public Automovil(String marca,int velocidad, String modelo, int año) {
        super(velocidad, marca);
        this.modelo = modelo;
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public void acelerar(int cambio) {
        int cambioVel = velocidad + cambio;
        if((cambioVel)>=0){//Aceptar sólo velocidades positivas
        velocidad += cambio;//velocidad = velocidad + cambio. ESTO ES UN ACUMULADOR
        }
    }

    @Override
    public void tablero() {
        System.out.println("Velocidad del automovil: "+getVelocidad());
    }
    
    
}
class Bicicleta extends Vehiculo implements DatosVehiculo{
    private String tipos;//Montaña, pista
    private String rodada;//tipo de llanta

    public Bicicleta() {
        super();
        this.tipos = "-----";
        this.rodada = "-----";
    }

    public Bicicleta(String tipos, String rodada, int velocidad, String marca) {
        super(velocidad, marca);
        this.tipos = tipos;
        this.rodada = rodada;
    }

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    public String getRodada() {
        return rodada;
    }

    public void setRodada(String rodada) {
        this.rodada = rodada;
    }

    @Override
    public void acelerar(int cambio) {
        int cambioVel = velocidad + cambio;
        if((cambioVel)>=0){//Aceptar sólo velocidades positivas
        velocidad += cambio;//velocidad = velocidad + cambio. ESTO ES UN ACUMULADOR
        }
    }

    @Override
    public void tablero() {
         System.out.println("Velocidad de la bicileta es: "+getVelocidad());
    }
    
    
}