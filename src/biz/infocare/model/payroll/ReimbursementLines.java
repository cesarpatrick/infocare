package biz.infocare.model.payroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

public class ReimbursementLines {
		 
	  private List<ReimbursementLine> reimbursementLines = null;

	  public ReimbursementLines reimbursementLines(List<ReimbursementLine> reimbursementLines) {
	    this.reimbursementLines = reimbursementLines;
	    return this;
	  }

	  public ReimbursementLines addReimbursementLineItem(ReimbursementLine reimbursementLineItem) {
	    if (this.reimbursementLines == null) {
	      this.reimbursementLines = new ArrayList<ReimbursementLine>();
	    }
	    this.reimbursementLines.add(reimbursementLineItem);
	    return this;
	  }

	   /**
	   * Get EarningsLines
	   * @return EarningsLines
	  **/
	  @ApiModelProperty(value = "")
	  public List<ReimbursementLine> getReimbursementLines() {
	    return reimbursementLines;
	  }

	  public void setReimbursementLines(List<ReimbursementLine> reimbursementLines) {
	    this.reimbursementLines = reimbursementLines;
	  }


	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    ReimbursementLines deductionLines = (ReimbursementLines) o;
	    return Objects.equals(this.reimbursementLines, deductionLines.reimbursementLines);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(reimbursementLines);
	  }


	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class ReimbursementLine {\n");
	    
	    sb.append("    reimbursementLines: ").append(toIndentedString(reimbursementLines)).append("\n");
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
