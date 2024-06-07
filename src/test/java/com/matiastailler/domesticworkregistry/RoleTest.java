package com.matiastailler.domesticworkregistry;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RoleTest {

    @Test
    public void testRoleEnumValues() {
        assertEquals(Role.NANNY, Role.valueOf("NANNY"));
        assertEquals(Role.HOUSE_KEEPER, Role.valueOf("HOUSE_KEEPER"));
    }
}

