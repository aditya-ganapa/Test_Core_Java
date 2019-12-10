package OOPS;

public abstract class q5_Card {
	protected String holderName;
	protected String cardNumber;
	protected String expityDate;
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpityDate() {
		return expityDate;
	}
	public void setExpityDate(String expityDate) {
		this.expityDate = expityDate;
	}
	public q5_Card(String holderName, String cardNumber, String expityDate) {
		super();
		this.holderName = holderName;
		this.cardNumber = cardNumber;
		this.expityDate = expityDate;
	}
}
class q5_MembershipCard extends q5_Card {
	private int rating;
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public q5_MembershipCard(String holderName, String cardNumber, String expityDate, int rating) {
		super(holderName, cardNumber, expityDate);
		this.rating = rating;
	}
}
class q5_PaybackCard extends q5_Card {
	private int pointsEarned;
	private double totalAmount;
	public int getPointsEarned() {
		return pointsEarned;
	}
	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public q5_PaybackCard(String holderName, String cardNumber, String expityDate, int pointsEarned,
			double totalAmount) {
		super(holderName, cardNumber, expityDate);
		this.pointsEarned = pointsEarned;
		this.totalAmount = totalAmount;
	}
}