package biz.infocare.model.payroll;

import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeTaxLine {
	
	@JsonProperty("taxLineID")
	private UUID taxLineID;
	
	@JsonProperty("globalTaxTypeID")
	private Integer globalTaxTypeID;
	
	@JsonProperty("amount")
	private Double amount;
	
	@JsonProperty("manualAdjustment")
	private boolean manualAdjustment;
	
	public UUID getTaxLineID() {
		return taxLineID;
	}

	public void setTaxLineID(UUID taxLineID) {
		this.taxLineID = taxLineID;
	}

	public Integer getGlobalTaxTypeID() {
		return globalTaxTypeID;
	}

	public void setGlobalTaxTypeID(Integer globalTaxTypeID) {
		this.globalTaxTypeID = globalTaxTypeID;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public boolean isManualAdjustment() {
		return manualAdjustment;
	}

	public void setManualAdjustment(boolean manualAdjustment) {
		this.manualAdjustment = manualAdjustment;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		EmployeeTaxLine employeeTaxLine = (EmployeeTaxLine) o;
		return Objects.equals(this.taxLineID, employeeTaxLine.taxLineID)			
				&& Objects.equals(this.globalTaxTypeID, employeeTaxLine.globalTaxTypeID)
				&& Objects.equals(this.amount, employeeTaxLine.amount)
				&& Objects.equals(this.manualAdjustment, employeeTaxLine.manualAdjustment);
	}

	@Override
	public int hashCode() {
		return Objects.hash(taxLineID,globalTaxTypeID,amount);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EmployeeTaxLine {\n");
		sb.append("    taxLineID: ").append(toIndentedString(taxLineID)).append("\n");
		sb.append("    globalTaxTypeID: ").append(toIndentedString(globalTaxTypeID)).append("\n");		
		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");	
		sb.append("    manualAdjustment: ").append(toIndentedString(manualAdjustment)).append("\n");
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
