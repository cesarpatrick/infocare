package biz.infocare.model.payroll;

import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeductionLine {
	
	@JsonProperty("deductionTypeID")
	private UUID deductionTypeID;
	
	@JsonProperty("amount")
	private Double amount;

	public UUID getDeductionTypeID() {
		return deductionTypeID;
	}

	public void setDeductionTypeID(UUID deductionTypeID) {
		this.deductionTypeID = deductionTypeID;
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
		DeductionLine deductionLine = (DeductionLine) o;
		return Objects.equals(this.deductionTypeID, deductionLine.deductionTypeID)			
				&& Objects.equals(this.amount, deductionLine.amount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(deductionTypeID,amount);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeductionLine {\n");
		sb.append("    deductionTypeID: ").append(toIndentedString(deductionTypeID)).append("\n");
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
