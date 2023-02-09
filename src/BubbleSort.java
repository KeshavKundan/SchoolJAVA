 

public class BubbleSort {
	public int[] sort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = 0; j < arr.length - 1 - i; j++)
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
		return arr;
	}
    public static void main(String args[]) {
        int x[] = {45,75,12,54,78,23,58,32};
        for (int i =0; i <8; i++)
        System.out.println(new BubbleSort().sort(x)[i]);
    }
}