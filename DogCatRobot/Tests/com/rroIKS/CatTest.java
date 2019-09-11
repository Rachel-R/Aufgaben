package com.rroIKS;
import org.junit.Test;
import static org.junit.Assert.*;

public class CatTest {
    @Test
    public void checkMakeCatMeow() {
        Cat kitten = new Cat("Subject 1");
        String result = kitten.makeSound();
        assertEquals("Meow", result);
    }
}
