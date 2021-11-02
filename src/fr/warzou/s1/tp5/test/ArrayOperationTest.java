package fr.warzou.s1.tp5.test;

import fr.warzou.s1.tp5.main.ArrayOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationTest {

	@Test
	public void testCloneArray() {
        Object[] array1 = { 1, 0, 6, 8, 6, 9, 2, 2, 6 };
        Object[] array2 = ArrayOperation.cloneArray(array1);
		assertArrayEquals(array1, array2); // Vérifie que les deux tableaux array1 et array2 sont identiques
        assertNotSame(array1, array2); // Vérifie qu'il s'agit de deux tableaux différents en mémoire
	}

	@Test
	public void testExtract() {
		Object[] array1 = { 1, 0, 6, 8, 6, 9, 2, 2, 6 };
		Object[] array2 = ArrayOperation.extract(array1, 3, 6);
		Object[] subArray = { 8, 6, 9, 2 };
		assertArrayEquals(subArray, array2); // Vérifie que les deux tableaux subArray et array2 sont identiques
	}

	@Test
	public void testConcat() {
        Object[] array1 = { 1, 0, 6, 8, 6, 9, 2, 2, 6 };
        Object[] array2 = { 5, 6, 9, 4, 1, 5, 6, 8, 4, 5 };
        Object[] array3 = { 1, 0, 6, 8, 6, 9, 2, 2, 6, 5, 6, 9, 4, 1, 5, 6, 8, 4, 5 };
        Object[] t_complet = ArrayOperation.concat(array1, array2);
		assertArrayEquals(array3, t_complet); // Vérifie que les deux tableaux t_complet et array3 sont identiques
	}

	@Test
	public void testFusion() {
        Object[] array1 = { 1, 0, 6, 8, 9 };
        Object[] array2 = { 5, 6, 9 };
        Object[] array3 = {};

        Object[] array4 = { 1, 5, 0, 6, 6, 9, 8, 9 };
        Object[] array5 = { 5, 1, 6, 0, 9, 6, 8, 9 };
        Object[] array6 = { 1, 0, 6, 8, 9 };
        Object[] array7 = { 5, 6, 9 };
        Object[] array8 = { 5, 5, 6, 6, 9, 9 };

		assertArrayEquals(array4, ArrayOperation.fusion(array1, array2));
		assertArrayEquals(array5, ArrayOperation.fusion(array2, array1));
		assertArrayEquals(array6, ArrayOperation.fusion(array1, array3));
		assertArrayEquals(array7, ArrayOperation.fusion(array3, array2));
		assertArrayEquals(array8, ArrayOperation.fusion(array2, array2));
	}

}