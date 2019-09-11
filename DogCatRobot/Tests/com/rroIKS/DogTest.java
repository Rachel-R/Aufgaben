package com.rroIKS;
import org.junit.Test;
import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void checkMakeDogBark() {
        Dog puppy = new Dog("Subject 2");
        String result = puppy.makeSound();
        assertEquals("Wuff", result);
    }
}
