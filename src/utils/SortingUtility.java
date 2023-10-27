package utils;

import models.Shape;

/**
 * Utility class containing various sorting algorithms for sorting arrays of Shape objects.
 * 
 * Authors: Group 3, Isaac, Jayden, David
 */
public class SortingUtility {

    /**
     * Bubble Sort Algorithm: Repeatedly steps through the list, compares adjacent items 
     * and swaps them if they are in the wrong order. The pass through the list is repeated 
     * until the list is sorted.
     */
    public static void bubbleSort(Shape[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    Shape temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Insertion Sort Algorithm: It builds the final sorted array one item at a time.
     * It is much less efficient on large lists than more advanced algorithms such as quicksort or merge sort.
     */
    public static void insertionSort(Shape[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            Shape key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /**
     * Selection Sort Algorithm: The algorithm divides the input list into two parts:
     * a sorted sublist of items which is built up from left to right and remains 
     * where it is and a sublist of the remaining unsorted items.
     */
    public static void selectionSort(Shape[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[min_idx]) < 0) {
                    min_idx = j;
                }
            }
            Shape temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * Merge Sort Algorithm: A Divide and Conquer algorithm. It divides the input array 
     * into two halves, calls itself for the two halves, and then merges the two sorted halves.
     */
    public static void mergeSort(Shape[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private static void merge(Shape[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        Shape[] L = new Shape[n1];
        Shape[] R = new Shape[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    /**
     * Quick Sort Algorithm: A Divide and Conquer algorithm. It works by selecting a 'pivot' 
     * element from the array and partitioning the other elements into two sub-arrays, 
     * according to whether they are less than or greater than the pivot.
     */
    public static void quickSort(Shape[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(Shape[] arr, int low, int high) {
        Shape pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;
                Shape temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Shape temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    /**
     * Heap Sort Algorithm: This algorithm divides its input into a sorted and an unsorted region,
     * and iteratively shrinks the unsorted region by extracting the largest element and moving 
     * that to the sorted region.
     */
    public static void heapSort(Shape[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            Shape temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    private static void heapify(Shape[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l].compareTo(arr[largest]) > 0) {
            largest = l;
        }

        if (r < n && arr[r].compareTo(arr[largest]) > 0) {
            largest = r;
        }

        if (largest != i) {
            Shape swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
}
