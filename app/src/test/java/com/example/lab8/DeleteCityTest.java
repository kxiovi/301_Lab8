package com.example.lab8;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class DeleteCityTest {

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
    public void deleteCityTest() {
        list = MockCityList();
        City city = new City("Charlottetown", "PE");
        list.addCity(city);
        assertTrue(list.hasCity(city)); // list does have city
        list.deleteCity(city);
        assertFalse(list.hasCity(city));  // list should not have city
    }
}
