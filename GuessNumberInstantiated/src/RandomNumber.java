public class RandomNumber {
	public int GetANumber(int high) {
		int x =	(int) (1 + Math.random() * high);
		return x;
	}
}
