package com.github.nikingale.algorithms.searching;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Nikhil Ingale 08-01-2021
 */

public class SearchTest {

    int[] input = {10, 20, 30, 40, 50, 60, 70, 80, 90};
    int key = 30;
    int expected = 2;

    @Test
    public void testLinearSearch() {
        LinearSearch search = new LinearSearch();
        int actual = search.linearSearch(input, key);
        Assert.assertEquals(expected, actual);

        actual = search.linearSearch(input, 1000);
        Assert.assertEquals(-1, actual);
    }

    @Test
    public void testLinearSearchRecursive() {
        LinearSearchRecursive search = new LinearSearchRecursive();
        int actual = search.linearSearchRecursive(input, key, 0);
        Assert.assertEquals(expected, actual);

        actual = search.linearSearchRecursive(input, 1000, 0);
        Assert.assertEquals(-1, actual);
    }

    @Test
    public void testBinarySearch() {
        BinarySearch search = new BinarySearch();
        int actual = search.binarySearch(input, key);
        Assert.assertEquals(expected, actual);

        actual = search.binarySearch(input, 1000);
        Assert.assertEquals(-1, actual);
    }

    @Test
    public void testBinarySearchRecursive() {
        BinarySearchRecursive search = new BinarySearchRecursive();
        int actual = search.binarySearchRecursive(input, key, 0, input.length - 1);
        Assert.assertEquals(expected, actual);

        actual = search.binarySearchRecursive(input, 1000, 0, input.length - 1);
        Assert.assertEquals(-1, actual);
    }

}