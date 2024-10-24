package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    /**
     *This gets give of the list
     * @return size of cities
    */
    public int getCount(){

        return cities.size();
    }

    /*
    This adds the city object to the list.
    For the first phase, this will be empty
    @param city
    */
    public void addCity(City city){

    }

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
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }
}
