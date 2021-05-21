package com;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest{
    Television television;
    @BeforeEach
    void setUp() {
        television = new Television();
    }

    @AfterEach
    void tearDown() {
        television = null;
    }

    @Test

    public void testThatTelevisionIsOffByDefault(){
        assertFalse(television.getOn());

    }

    @Test
    void testThatTelevisionIsNotOnByDefault(){
        assertTrue(!television.getOn());
    }

    @Test
    void testThatTelevisionCanBeTurnedOn(){
        //when
        television.setOn(true);

        //assert
        assertTrue(television.getOn());
    }

    @Test
    void testThatTelevisionCanTurnOff(){

        television.setOn(true);

        assertTrue(television.getOn());

        television.setOn(false);
        assertFalse(television.getOn());
    }

    @Test
    void testThatVolumeIsZeroWhenTelevisionIsOff() {

        television.setOn(false);
        assertFalse(television.getOn());

        //given
        assertEquals(0, television.getVolume());

    }

    @Test
    void testThatChannelIsZeroWhenTelevisionIsOn() {

        television.setOn(true);
        assertTrue(television.getOn());

        assertEquals(0, television.getChannel());
    }

    @Test
    void testThatVolumeIncreases() {

        television.setOn(true);
        assertEquals(0, television.getVolume());

        television.increaseVolume();
        assertEquals(1, television.getVolume());

        television.increaseVolume();
        assertEquals(2, television.getVolume());

    }

    @Test

        void testThatVolumeDecreases() {
        television.setOn(true);
        assertTrue(television.getOn());

        television.increaseVolume();
        assertEquals(1, television.getVolume());
        television.increaseVolume();
        assertEquals(2,television.getVolume());

        television.decreaseVolume();
        assertEquals(1,television.getVolume());

    }

    @Test

    void testThatChannelChangesInAscendingNotation() {
        television.setOn(true);
        assertFalse(!television.getOn());

        television.increaseChannel();
        assertEquals(1,television.getChannel());

        television.increaseChannel();
        assertEquals(2, television.getChannel());

    }


}
