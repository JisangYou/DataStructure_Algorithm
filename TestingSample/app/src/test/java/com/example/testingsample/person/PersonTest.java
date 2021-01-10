package com.example.testingsample.person;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PersonTest {
    @Test
    public void test() {
        Person p = mock(Person.class);
        assertTrue(p != null);

        when(p.getName()).thenReturn("jay");
        when(p.getAge()).thenReturn(27);

        assertTrue("jay".equals(p.getName()));
        assertTrue(27 == p.getAge());
    }
}
