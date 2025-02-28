/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.umbra.airports.service;

import br.dev.umbra.airports.DTO.AirportMinDTO;
import br.dev.umbra.airports.entities.Airport;
import br.dev.umbra.airports.repositories.AirportRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sesidevb
 */
@Service
public class AirportService {
    
    @Autowired
    private AirportRepository airportRepository;
    
    public List<Airport> findAll() {
        
        List<Airport> result = airportRepository.findAll();
        return result;
        
    }
    
    /**
     * Retorno DTO Airports filtrado por cidade.
     * @param city
     * @return
     */
    public List<Airport> findByCity(String city) {
        List<Airport> result = airportRepository.findByCityIgnoreCase(city);
        return result;
    }
    
    /**
     * Retorna DTO AirportsMinDTO filtrado por country (país).
     * @param country
     * @return
     */
    public List<AirportMinDTO> findByCountry(String country) {
        List<Airport> resultAirport = airportRepository.findByCountryIgnoreCase(country);
        
        List<AirportMinDTO> resultDTO = resultAirport.stream()
                .map(x -> new AirportMinDTO(x)).toList();
        
        return resultDTO;
    }
    
}
