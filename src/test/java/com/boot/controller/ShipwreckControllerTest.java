package com.boot.controller;

import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ShipwreckControllerTest {

    @InjectMocks
    private ShipwreckController shipwreckController;

    @Mock
    private ShipwreckRepository shipwreckRepository;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void list() throws Exception {
    }

    @Test
    public void create() throws Exception {
    }

    @Test
    public void testShipwreckGet() throws Exception {
        Shipwreck sw = new Shipwreck();
        sw.setId(1L);
        when(shipwreckRepository.findOne(1L)).thenReturn(sw);

        Shipwreck wreck = shipwreckController.get(1L);
        verify(shipwreckRepository).findOne(1L);
        //assertEquals(1L,wreck.getId().longValue());
        assertThat(wreck.getId(), is(1L));
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void delete() throws Exception {
    }

}