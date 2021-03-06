package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To8Then8() {
        int result = Max.max(2, 8);
        assertThat(result, is(8));
    }

    @Test
    public void whenMax4To4Then4() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax1234Then4() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax1479Then9() {
        int result = Max.max(1, 4, 7, 9);
        assertThat(result, is(9));
    }
    @Test
    public void whenMax123Then3() {
        int result = Max.max(1, 2, 3);
        assertThat(result, is(3));
    }
}