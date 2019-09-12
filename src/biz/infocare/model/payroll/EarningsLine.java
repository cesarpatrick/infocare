package biz.infocare.model.payroll;

import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EarningsLine {
	
	@JsonProperty("earningsLineID")
	private UUID earningsLineID;
	
	@JsonProperty("earningsRateID")
	private UUID earningsRateID;
	
	@JsonProperty("ratePerUnit")
	private Integer ratePerUnit;
	
	@JsonProperty("numberOfUnits")
	private Integer numberOfUnits;
	
	@JsonProperty("isAverageDailyPayRate")
	private boolean isAverageDailyPayRate;	
	
	@JsonProperty("fixedAmount")
	private Double fixedAmount;
		
	@JsonProperty("isSystemGenerated")
	private boolean isSystemGenerated;

	public UUID getEarningsLineID() {
		return earningsLineID;
	}

	public void setEarningsLineID(UUID earningsLineID) {
		this.earningsLineID = earningsLineID;
	}

	public UUID getEarningsRateID() {
		return earningsRateID;
	}

	public void setEarningsRateID(UUID earningsRateID) {
		this.earningsRateID = earningsRateID;
	}

	public Integer getRatePerUnit() {
		return ratePerUnit;
	}

	public void setRatePerUnit(Integer ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}

	public Integer getNumberOfUnits() {
		return numberOfUnits;
	}

	public void setNumberOfUnits(Integer numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}

	public boolean isAverageDailyPayRate() {
		return isAverageDailyPayRate;
	}

	public void setAverageDailyPayRate(boolean isAverageDailyPayRate) {
		this.isAverageDailyPayRate = isAverageDailyPayRate;
	}

	public Double getFixedAmount() {
		return fixedAmount;
	}

	public void setFixedAmount(Double fixedAmount) {
		this.fixedAmount = fixedAmount;
	}

	public boolean isSystemGenerated() {
		return isSystemGenerated;
	}

	public void setSystemGenerated(boolean isSystemGenerated) {
		this.isSystemGenerated = isSystemGenerated;
	}	
	
	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		EarningsLine earningsLine = (EarningsLine) o;
		return Objects.equals(this.earningsLineID, earningsLine.earningsLineID)
				&& Objects.equals(this.earningsRateID, earningsLine.earningsRateID)
				&& Objects.equals(this.ratePerUnit, earningsLine.ratePerUnit)
				&& Objects.equals(this.numberOfUnits, earningsLine.numberOfUnits)
				&& Objects.equals(this.isAverageDailyPayRate, earningsLine.isAverageDailyPayRate)
				&& Objects.equals(this.fixedAmount, earningsLine.fixedAmount)
				&& Objects.equals(this.isSystemGenerated, earningsLine.isSystemGenerated);
	}

	@Override
	public int hashCode() {
		return Objects.hash(earningsLineID,earningsRateID,ratePerUnit,numberOfUnits,isAverageDailyPayRate,fixedAmount,isSystemGenerated);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EarningsLine {\n");
		sb.append("    earningsLineID: ").append(toIndentedString(earningsLineID)).append("\n");
		sb.append("    earningsRateID: ").append(toIndentedString(earningsRateID)).append("\n");
		sb.append("    ratePerUnit: ").append(toIndentedString(ratePerUnit)).append("\n");
		sb.append("    numberOfUnits: ").append(toIndentedString(numberOfUnits)).append("\n");
		sb.append("    isAverageDailyPayRate: ").append(toIndentedString(isAverageDailyPayRate)).append("\n");
		sb.append("    fixedAmount: ").append(toIndentedString(fixedAmount)).append("\n");
		sb.append("    isSystemGenerated: ").append(toIndentedString(isSystemGenerated)).append("\n");	
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
