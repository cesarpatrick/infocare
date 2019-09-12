package biz.infocare.model.payroll;

import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LeaveAccrualLine {
	
	@JsonProperty("leaveTypeID")
	private UUID leaveTypeID;
	
	@JsonProperty("lumberOfUnits")
	private Integer numberOfUnits;
	
	public UUID getLeaveTypeID() {
		return leaveTypeID;
	}

	public void setLeaveTypeID(UUID leaveTypeID) {
		this.leaveTypeID = leaveTypeID;
	}

	public Integer getNumberOfUnits() {
		return numberOfUnits;
	}

	public void setNumberOfUnits(Integer numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LeaveAccrualLine leaveAccrualLine = (LeaveAccrualLine) o;
		return Objects.equals(this.leaveTypeID, leaveAccrualLine.leaveTypeID)			
				&& Objects.equals(this.numberOfUnits, leaveAccrualLine.numberOfUnits);
	}

	@Override
	public int hashCode() {
		return Objects.hash(leaveTypeID,numberOfUnits);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LeaveAccrualLine {\n");
		sb.append("    leaveTypeID: ").append(toIndentedString(leaveTypeID)).append("\n");
		sb.append("    numberOfUnits: ").append(toIndentedString(numberOfUnits)).append("\n");		
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
