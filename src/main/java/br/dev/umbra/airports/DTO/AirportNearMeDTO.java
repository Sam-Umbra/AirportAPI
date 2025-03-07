/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.umbra.airports.DTO;

import br.dev.umbra.airports.projections.AirportNearMeProjection;

/**
 *
 * @author sesidevb
 */
public class AirportNearMeDTO {
    private long id;
    private String name;
    private String city;
    private String iataCode;
    private double latitude;
    private double longitude;
    private double altitude;
    private double distanciaKM;
    private double distanciaNM; //Nautical Miles

    public AirportNearMeDTO() {
    }

    /**
     * Construtor
     * Recebe uma interface AirportNearMeProjection como parâmetro
     * e mapeia para um AirportNearMeDTO objeto.
     * @param airportProjection 
     */
    public AirportNearMeDTO(AirportNearMeProjection airportProjection) {
        this.id = airportProjection.getId();
        this.name = airportProjection.getName();
        this.city = airportProjection.getCity();
        this.iataCode = airportProjection.getIataCode();
        this.latitude = airportProjection.getLatitude();
        this.longitude = airportProjection.getLongitude();
        this.altitude = airportProjection.getAltitude();
        this.distanciaKM = airportProjection.getDistanciaKM();
        this.distanciaNM = airportProjection.getDistanciaNM();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getIataCode() {
        return iataCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public double getDistanciaKM() {
        return Math.round(distanciaKM);
    }
    
    public double getDistanciaNM() {
        return Math.round(distanciaNM);
    }
    
}
