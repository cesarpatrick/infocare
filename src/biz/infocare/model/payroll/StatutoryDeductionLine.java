package biz.infocare.model.payroll;

import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StatutoryDeductionLine {

	@JsonProperty("statutoryDeductionTypeID")
	private UUID statutoryDeductionTypeID;

	
	@JsonProperty("amount")
	private Double amount;

	public UUID getStatutoryDeductionTypeID() {
		return statutoryDeductionTypeID;
	}


	public void setStatutoryDeductionTypeID(UUID statutoryDeductionTypeID) {
		this.statutoryDeductionTypeID = statutoryDeductionTypeID;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		StatutoryDeductionLine statutoryDeductionLine = (StatutoryDeductionLine) o;
		return Objects.equals(this.statutoryDeductionTypeID, statutoryDeductionLine.statutoryDeductionTypeID)			
				&& Objects.equals(this.amount, statutoryDeductionLine.amount);
			
	}

	@Override
	public int hashCode() {
		return Objects.hash(statutoryDeductionTypeID,amount);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class StatutoryDeductionLine {\n");
		sb.append("    statutoryDeductionTypeID: ").append(toIndentedString(statutoryDeductionTypeID)).append("\n");
		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
