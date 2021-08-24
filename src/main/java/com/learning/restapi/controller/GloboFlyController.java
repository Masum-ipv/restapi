package com.learning.restapi.controller;

import com.learning.restapi.model.City;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class GloboFlyController {

    String message = "Black Friday! Get 50% cash back on saving your first spot.";
    List<City> cityList = new ArrayList<City>((Collection<? extends City>) Arrays.asList(
            new City("Mumbai", "Mumbai is a densely populated city on India’s west coast.", "India"),
            new City("Melbourne", "Melbourne is the coastal capital of the southeastern Australian state of Victoria.", "Australia"),
            new City("Washington DC", "Washington, DC, the U.S. capital, is a compact city on the Potomac River, bordering the states of Maryland and Virginia.", "USA"),
            new City("New Delhi", "New Delhi is the capital of India and an administrative district of the National Capital Territory of Delhi.", "India"),
            new City("Tokyo", "Tokyo, Japan’s busy capital, mixes the ultramodern and the traditional, from neon-lit skyscrapers to historic temples.", "Japan")
    ));


    @GetMapping(value = "/messages", produces = "application/json")
    public String getMessage() {
        System.out.println(message);
        return JSONObject.quote(message);
    }

    @GetMapping(value = "/destination", produces = "application/json")
    public List<City> getDestination() {
        return cityList;
    }

    @GetMapping(value = "/destination/{id}", produces = "application/json")
    public City getParticularDestination(@PathVariable String id) {
        return cityList.get(Integer.parseInt(id));
    }

    @PostMapping(value = "/destination", produces = "application/json")
    public City addDestination(@RequestBody City newCity) {
        cityList.add(newCity);
        return newCity;
    }

    @PutMapping(value = "/destination/{id}", produces = "application/json")
    public City updateParticularDestination(@RequestBody City updatedCity, @PathVariable String id) {
        cityList.set(Integer.parseInt(id), updatedCity);
        return updatedCity;
    }

    @DeleteMapping(value = "/destination/{id}", produces = "application/json")
    public City removeParticularDestination(@PathVariable String id) {
        return cityList.remove(Integer.parseInt(id));
    }
}
