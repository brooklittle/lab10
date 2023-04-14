package cis285_lab10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestSelectionSort {

	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}
	public TestSelectionSort() {
		
	}
	public void testPositive() {
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		
		int [] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;
	}
	
	public void testNegative() {
		int[] arr1 = new int[5];
		arr1[0] = -8;
		arr1[1] = 9;
		arr1[2] = -7;
		arr1[3] = 10;
		arr1[4] = -2;
		
		int [] Sortedarr = new int[5];
		Sortedarr[0] = -8;
		Sortedarr[1] = -7;
		Sortedarr[2] = -2;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;
	}
	
	public void testMixed() {
		int[] arr2 = new int[5];
		arr2[0] = -8;
		arr2[1] = 10;
		arr2[2] = 5;
		arr2[3] = 6;
		arr2[4] = 11;
		
		int [] Sortedarr = new int[5];
		Sortedarr[0] = -8;
		Sortedarr[1] = 5;
		Sortedarr[2] = 6;
		Sortedarr[3] = 10;
		Sortedarr[4] = 11;
	}
	
	public void testDuplicates() {
		int[] arr2 = new int[5];
		arr2[0] = 15;
		arr2[1] = 10;
		arr2[2] = 10;
		arr2[3] = 12;
		arr2[4] = 15;
		
		int [] Sortedarr = new int[5];
		Sortedarr[0] = 10;
		Sortedarr[1] = 10;
		Sortedarr[2] = 12;
		Sortedarr[3] = 15;
		Sortedarr[4] = 15;
	}

}
