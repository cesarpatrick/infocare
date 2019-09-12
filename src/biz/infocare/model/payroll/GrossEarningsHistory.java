package biz.infocare.model.payroll;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GrossEarningsHistory {

	 @JsonProperty("daysPaid")
	 private Integer daysPaid;
	  
	 @JsonProperty("unpaidWeeks")
	 private Integer unpaidWeeks;

	public Integer getDaysPaid() {
		return daysPaid;
	}

	public void setDaysPaid(Integer daysPaid) {
		this.daysPaid = daysPaid;
	}

	public Integer getUnpaidWeeks() {
		return unpaidWeeks;
	}

	public void setUnpaidWeeks(Integer unpaidWeeks) {
		this.unpaidWeeks = unpaidWeeks;
	}
	 
	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GrossEarningsHistory grossEarningsHistory = (GrossEarningsHistory) o;
		return Objects.equals(this.daysPaid, grossEarningsHistory.daysPaid)
				&& Objects.equals(this.unpaidWeeks, grossEarningsHistory.unpaidWeeks);
	}

	@Override
	public int hashCode() {
		return Objects.hash(daysPaid,unpaidWeeks);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GrossEarningsHistory {\n");
		sb.append("    daysPaid: ").append(toIndentedString(daysPaid)).append("\n");
		sb.append("    unpaidWeeks: ").append(toIndentedString(unpaidWeeks)).append("\n");
		
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
