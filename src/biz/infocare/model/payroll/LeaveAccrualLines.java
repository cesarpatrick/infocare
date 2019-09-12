package biz.infocare.model.payroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

public class LeaveAccrualLines {
	
	  private List<LeaveAccrualLine> leaveAccrualLines = null;

	  public LeaveAccrualLines leaveAccrualLines(List<LeaveAccrualLine> leaveAccrualLines) {
	    this.leaveAccrualLines = leaveAccrualLines;
	    return this;
	  }

	  public LeaveAccrualLines addLeaveAccrualLineItem(LeaveAccrualLine leaveAccrualLineItem) {
	    if (this.leaveAccrualLines == null) {
	      this.leaveAccrualLines = new ArrayList<LeaveAccrualLine>();
	    }
	    this.leaveAccrualLines.add(leaveAccrualLineItem);
	    return this;
	  }

	   /**
	   * Get EarningsLines
	   * @return EarningsLines
	  **/
	  @ApiModelProperty(value = "")
	  public List<LeaveAccrualLine> getLeaveAccrualLines() {
	    return leaveAccrualLines;
	  }

	  public void setLeaveAccrualLines(List<LeaveAccrualLine> leaveAccrualLines) {
	    this.leaveAccrualLines = leaveAccrualLines;
	  }


	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    LeaveAccrualLines leaveAccrualLines = (LeaveAccrualLines) o;
	    return Objects.equals(this.leaveAccrualLines, leaveAccrualLines.leaveAccrualLines);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(leaveAccrualLines);
	  }


	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class Leave Accrual Lines {\n");
	    
	    sb.append("    leaveAccrualLines: ").append(toIndentedString(leaveAccrualLines)).append("\n");
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
