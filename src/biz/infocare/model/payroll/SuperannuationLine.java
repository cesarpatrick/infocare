package biz.infocare.model.payroll;

import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SuperannuationLine {
	
	@JsonProperty("superannuationTypeID")
	private UUID superannuationTypeID;
	
	@JsonProperty("amount")
	private Double amount;
	
	@JsonProperty("percentage")
	private Integer percentage;
	
	public UUID getSuperannuationTypeID() {
		return superannuationTypeID;
	}

	public void setSuperannuationTypeID(UUID superannuationTypeID) {
		this.superannuationTypeID = superannuationTypeID;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Integer getPercentage() {
		return percentage;
	}

	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SuperannuationLine superannuationLine = (SuperannuationLine) o;
		return Objects.equals(this.superannuationTypeID, superannuationLine.superannuationTypeID)			
				&& Objects.equals(this.amount, superannuationLine.amount)
				&& Objects.equals(this.percentage, superannuationLine.percentage);
	}

	@Override
	public int hashCode() {
		return Objects.hash(superannuationTypeID,amount,percentage);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SuperannuationLine {\n");
		sb.append("    superannuationTypeID: ").append(toIndentedString(superannuationTypeID)).append("\n");
		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");		
		sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");	
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
	
}
