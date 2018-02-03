package Sort;

public class bubble {

	public static void main(String[] args) {
		int[] index = { 8, 4, 7, 3, 1, 6, 5, 2 };
		int i, j, temp;

		for (i = 0; i < index.length - 1; i++) {
			for (j = 0; j < index.length - 1 - i; j++) {
				if (index[j] > index[j + 1]) {
					temp = index[j];
					index[j] = index[j + 1];
					index[j + 1] = temp;
				}
			}
		}

		for (i = 0; i < index.length; i++) {
			System.out.print(index[i] + " ");
		}

	}

}

//개념 및 시간 복잡도 추가하기