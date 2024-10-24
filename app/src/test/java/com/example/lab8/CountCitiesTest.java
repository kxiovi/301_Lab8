package com.example.lab8;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class CountCitiesTest {

    private CustomList list;

    /**
     * create a mock list for my citylist
     * @return a mock city list
     */
    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void countCitiesTest() {
        list = MockCityList();
        City city = new City("Surrey", "BC");
        assertEquals(0, list.countCities());
        list.addCity(city);
        assertTrue(list.hasCity(city)); // list does have city
        assertEquals(1, countCities());
        list.deleteCity(city);
        assertFalse(list.hasCity(city));  // list has 0 cities
        list.addCity(new City ("Vancouver", "BC"));
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(2, countCities());
    }
}
