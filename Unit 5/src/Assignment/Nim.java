package Assignment;

public class Nim {
	static int stones;			// global variable stones

	public Nim(){stones = (int) (Math.random()*16+15);}
	
	/* return stones
	 * pre: nothing
	 * post: the value of stones
	 */
	public int getStones() {return stones;}
	
	/* determines if the entry is valid
	 * pre: the input value
	 * post: boolean 
	 */
	public boolean isValidEntry(int i) {
		if (i < 4 && i > 0 && i <= stones) {
			return true;
		}
		return false;
	}
	/* performs the computers turn
	 * pre: nothing
	 * post: the amount of stones the user drew
	 */
	public int drawStones() {
		int a = (int) (Math.random() * 2 + 1);
		turn(a);
		return a;
	}
	
	/* determines if turn is valid
	 * pre: int i
	 * post: boolean being valid
	 */
	public boolean turn(int i) {
		if (isValidEntry(i)) {
			stones -= i;
			return true;
		}
		return false;
	}
}
