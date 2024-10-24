package com.example.lab8;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class HasCityTest {

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
    public void hasCityTest() {
        list = MockCityList();
        City city = new City("Calgary", "AB");
        assertFalse(list.hasCity(city)); // list does not have city prior to adding it
        list.addCity(city);
        assertTrue(list.hasCity(city));  // list should now have city
    }
}
