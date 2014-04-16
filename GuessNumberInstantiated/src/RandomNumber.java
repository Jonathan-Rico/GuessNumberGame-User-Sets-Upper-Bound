public class RandomNumber {
	public int GetANumber(int high) {
		int x =	(int) (1 + Math.random() * high);
		return x;
	}
	public int GetANumber_Between_1_and_10 () {
	int notUsed =	(int) (1 + Math.random() * 10);
	return notUsed;
	}
}
