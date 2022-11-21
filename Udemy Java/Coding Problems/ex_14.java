class Main {
	public static void main(String[] args) {
		System.out.println(sumOdd(13,13));
	}

	public static Boolean isOdd(int number) {
		return (number > 0 && number % 2 != 0);
	}

	public static int sumOdd(int start, int end) {
		if(end>=start && start >0 && end>0){
		int sum = 0;
		for (int i = start; i <= end; i++) {
			if (isOdd(i)) {
				sum = sum + i;
			}
		}
		return sum;
		}
		return -1;
	}

}