package model;

public class Record {
	private int score;
	private int[] disNum=new int[7];
	private int disSum;
	private int moreThanThree;
	private int verticalNum,horizontalNum;
	private int comboNum;
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int[] getDisNum() {
		return disNum;
	}
	public void setDisNum(int[] disNum) {
		this.disNum = disNum;
	}
	public int getDisSum() {
		return disSum;
	}
	public void setDisSum(int disSum) {
		this.disSum = disSum;
	}
	public int getMoreThanThree() {
		return moreThanThree;
	}
	public void setMoreThanThree(int moreThanThree) {
		this.moreThanThree = moreThanThree;
	}
	public int getVerticalNum() {
		return verticalNum;
	}
	public void setVerticalNum(int verticalNum) {
		this.verticalNum = verticalNum;
	}
	public int getComboNum() {
		return comboNum;
	}
	public void setComboNum(int comboNum) {
		this.comboNum = comboNum;
	}
	public int getHorizontalNum() {
		return horizontalNum;
	}
	public void setHorizontalNum(int horizontalNum) {
		this.horizontalNum = horizontalNum;
	}
}
