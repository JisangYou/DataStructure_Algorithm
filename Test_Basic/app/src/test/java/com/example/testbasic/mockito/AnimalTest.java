package com.example.testbasic.mockito;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.timeout;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class AnimalTest {
    @Mock
    Animal animal;

    /**
     * Mock 객체 생성!
     */
    @Test
    public void mockTest() {
        MockitoAnnotations.initMocks(this);
        // 아래 코드로도 Mock 객체 생성 가능
        // Animal animal = mock(Animal.class);
        // assertTrue(animal != null); }

    }

    @Test
    public void mockTest2() {
        Animal animal = mock(Animal.class);
        assertTrue(animal != null);
        when(animal.getAge()).thenReturn(30);
        when(animal.getName()).thenReturn("참새");
        when(animal.getFly()).thenReturn(true);
        assertTrue(animal.getAge() == 30);
        assertTrue(animal.getName().equals("참새"));

        // 맞는 경우
        assertTrue(animal.getFly() == true);
        // 틀린 경
        assertTrue(animal.getFly() == false);
    }

    @Test
    public void mockTest3() {
        Animal animal = mock(Animal.class);
        List<String> animalList = new ArrayList<>();
        animalList.add("호랑이");
        animalList.add("코끼리");
        animalList.add("독수리");
        when(animal.getAnimalList()).thenReturn(animalList);
        assertNotNull(animalList);
        assertEquals(animalList.size(), 3);
        System.out.println(animal.getAnimalList().get(1));
    }

    /**
     * doThrow()를 통한 예외 발생
     * eq -> 정확히라는 의미.
     */
    @Test
    public void mockTest4() {
        // animal.setAge(20)에서 예외!
        Animal animal = mock(Animal.class);
        doThrow(new RuntimeException()).when(animal).setAge(eq(20));
        animal.setAge(203);
        animal.setAge(3);
        animal.setAge(23);
        animal.setAge(2);
        animal.setAge(333);
        animal.setAge(20);
    }

    @Test
    public void mockTest5() {
        Animal animal = mock(Animal.class);
        animal.setName("참새");
        // n번 호출했는지 체크
        verify(animal, times(1)).setName(any(String.class)); // success
        // 호출 안했는지 체크
        verify(animal, never()).getName(); // success
        verify(animal, never()).setName(eq("호랑이")); // success
        verify(animal, never()).setName(eq("참새")); // fail
        // 최소한 1번 이상 호출했는지 체크
        verify(animal, atLeastOnce()).setName(any(String.class)); // success
        // 2번 이하 호출 했는지 체크
        verify(animal, atMost(2)).setName(any(String.class)); // success /
        // / 2번 이상 호출 했는지 체크
        verify(animal, atLeast(2)).setName(any(String.class)); // fail
        // 지정된 시간(millis)안으로 메소드를 호출 했는지 체크
        verify(animal, timeout(100)).setName(any(String.class)); // success
        // 지정된 시간(millis)안으로 1번 이상 메소드를 호출 했는지 체크
        verify(animal, timeout(100).atLeast(1)).setName(any(String.class)); // success

    }
}