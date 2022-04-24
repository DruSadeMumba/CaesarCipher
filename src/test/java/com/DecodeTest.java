package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeTest {
    @Test
    void zeroIsAValidEncryptionKey(){
        var decode = new Decode();
        assertEquals(0, decode.decodeKey(0));
    }
    @Test
    void twentyFiveIsAValidEncryptionKey(){
        var decode = new Decode();
        assertEquals(25, decode.decodeKey(25));
    }
    @Test
    void negativeOneIsIllegalArgumentException(){
        var decode = new Decode();
        assertThrows(IllegalArgumentException.class, () ->{
            decode.decodeKey(-1 );
        });
    }
    @Test
    void twentySixIsIllegalArgumentException(){
        var decode = new Decode();
        assertThrows(IllegalArgumentException.class, () ->{
            decode.decodeKey(26 );
        });
    }

}