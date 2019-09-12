package biz.infocare.model.payroll;

import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReimbursementLine {
	
	@JsonProperty("reimbursementTypeID")
	private UUID reimbursementTypeID;
	
	@JsonProperty("amount")
	private Double amount;
	
	@JsonProperty("description")
	private String description;	
	
	public UUID getReimbursementTypeID() {
		return reimbursementTypeID;
	}

	public void setReimbursementTypeID(UUID reimbursementTypeID) {
		this.reimbursementTypeID = reimbursementTypeID;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ReimbursementLine reimbursementLine = (ReimbursementLine) o;
		return Objects.equals(this.reimbursementTypeID, reimbursementLine.reimbursementTypeID)			
				&& Objects.equals(this.amount, reimbursementLine.amount)
				&& Objects.equals(this.description, reimbursementLine.description);
	}

	@Override
	public int hashCode() {
		return Objects.hash(reimbursementTypeID,amount,description);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ReimbursementLine {\n");
		sb.append("    reimbursementTypeID: ").append(toIndentedString(reimbursementTypeID)).append("\n");
		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");	
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
