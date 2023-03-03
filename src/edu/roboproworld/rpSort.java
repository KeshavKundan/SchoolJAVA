package edu.roboproworld;

public class rpSort {
	public void bubble(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					arr[j] = arr[j] + arr[j + 1];
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] = arr[j] - arr[j + 1];
				}
			}
		}
	}

	public void selection(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[index] < arr[j])
					index = j;
			arr[index] = arr[index] + arr[i];
			arr[i] = arr[index] - arr[i];
			arr[index] = arr[index] - arr[i];
		}
	}

	public void insertion(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			while (j >= 0 && arr[j] > arr[j + 1]) {
				arr[j] = arr[j] + arr[j + 1];
				arr[j + 1] = arr[j] - arr[j + 1];
				arr[j] = arr[j] - arr[j + 1];
				j--;
			}
		}
	}

	public void merge(int arr[], int l, int r) {
		if (l >= r)
			return;
		int m = l + (r - l) / 2, merged[] = new int[r - l + 1], i1 = l, i2 = m + 1, x = 0;
		merge(arr, l, m);
		merge(arr, m + 1, r);
		while (i1 <= m && i2 <= r)
			if (arr[i1] <= arr[i2])
				merged[x++] = arr[i1++];
			else
				merged[x++] = arr[i2++];
		while (i1 <= m)
			merged[x++] = arr[i1++];
		while (i2 <= r)
			merged[x++] = arr[i2++];
		for (int i = 0, j = l; i < merged.length; i++, j++)
			arr[j] = merged[i];
	}

	public int[] primeNum(int arr[]) {
		int P[] = new int[arr.length], i = 0, j = 0, c;
		for (; i < 10; i++) {
			c = 0;
			for (int f = 2; f < arr[i]; f++)
				if (arr[i] % f == 0)
					c++;
			if (!(c > 0))
				P[j++] = arr[i];
		}
		return P;
	}

	public int[] compositeNum(int arr[]) {
		int C[] = new int[arr.length], i = 0, k = 0, c;
		for (; i < 10; i++) {
			c = 0;
			for (int f = 2; f < arr[i]; f++)
				if (arr[i] % f == 0)
					c++;
			if (c > 0)
				C[k++] = arr[i];
		}
		return C;
	}
}
