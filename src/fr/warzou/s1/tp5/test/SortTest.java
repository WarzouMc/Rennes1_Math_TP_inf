package fr.warzou.s1.tp5.test;

import fr.warzou.s1.tp5.main.Sort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    @Test
    void sort() {
        int[] array1 = { 2, 5, 6, 6 };
		int[] array2 = { 1, 2, 3, 4, 5 };
		int[] array3 = { 1, 2, 2, 3, 4, 5, 5, 6, 6 };

		assertArrayEquals(array3, Sort.sort(array1, array2));
    }
}