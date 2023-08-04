package by.academy.lesson21.diagram;

import java.util.Date;
import java.util.Objects;

public class CreditCard implements Payment {
	String issuer;
	Long CardNO;
	Date expiryDate;

	public CreditCard() {
		super();
	}

	public CreditCard(String issuer, Long cardNO, Date expiryDate) {
		super();
		this.issuer = issuer;
		CardNO = cardNO;
		this.expiryDate = expiryDate;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public Long getCardNO() {
		return CardNO;
	}

	public void setCardNO(Long cardNO) {
		CardNO = cardNO;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CardNO, expiryDate, issuer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditCard other = (CreditCard) obj;
		return Objects.equals(CardNO, other.CardNO) && Objects.equals(expiryDate, other.expiryDate)
				&& Objects.equals(issuer, other.issuer);
	}

	@Override
	public void authorise(Double amount) {
		System.out.println("Authorise with CreditCard");
	}

	@Override
	public String toString() {
		return "CreditCard [issuer=" + issuer + ", CardNO=" + CardNO + ", expiryDate=" + expiryDate + "]";
	}
}
