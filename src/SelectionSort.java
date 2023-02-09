 

// Java program for implementation of Selection Sort
class SelectionSort {
    int[] sort(int arr[]) {
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < arr.length - 1; i++) {
            // Find the minimum element in unsorted array
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            // Swap the found minimum element with the first element
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
    public static void main(String args[]) {
        int x[] = {45,75,12,54,78,23,58,32};
        for (int i =0; i <8; i++)
        System.out.println(new SelectionSort().sort(x)[i]);
    }
}