package Example_Studying;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] index = { 4, 1, 3, 5, 2, 9, 6, 8, 7 };
		int i, j, temp;

		for (i = 1; i < index.length; i++) {
			temp = index[i];

			for (j = i; j > 0; j--) {
				if (index[j - 1] > temp) {
					index[j] = index[j - 1];
					if (j == 1) {
						index[j - 1] = temp;
						break;
					}
				} else {
					index[j] = temp;
					break;
				}
			}

		}
		for (i = 0; i < index.length; i++) {
			System.out.print(index[i] + " ");
		}
	}

}
