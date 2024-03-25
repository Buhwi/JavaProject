package q02;

public class Grade {
	public int score1;
	public int score2;
	public int score3;
	
	public Grade(int score1, int score2, int score3) {
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
		}
	
	public double average() {
		return ((double)score1 + score2 + score3)/3;
	}
}
