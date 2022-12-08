package org.openapitools;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class OpenApiGeneratorApplicationTests {

    @Test
    void contextLoads() {
        assertEquals(1,1);
    }

    @Test
    void compareLists() {
        String[] expected = new String[]{"a", "b", "c"};
        String[] actual = new String[]{"a", "b", "c"};
        assertEquals(expected, actual);
    }

}
