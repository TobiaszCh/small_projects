package com.tasks.newer.camel_casing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CamelCasingTest {

    @Test
    public void tests() {
        assertEquals( "camel Casing", CamelCasing.camelCase("camelCasing"));
        assertEquals(  "camel Casing Test", CamelCasing.camelCase("camelCasingTest"));
        assertEquals(  "camelcasingtest", CamelCasing.camelCase("camelcasingtest"));
    }

}