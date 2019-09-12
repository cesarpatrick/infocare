package biz.infocare.model.payroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

public class DeductionLines {
		 
	  private List<DeductionLine> deductionLines = null;

	  public DeductionLines deductionLines(List<DeductionLine> deductionLines) {
	    this.deductionLines = deductionLines;
	    return this;
	  }

	  public DeductionLines addDeductionLinesItem(DeductionLine deductionLineItem) {
	    if (this.deductionLines == null) {
	      this.deductionLines = new ArrayList<DeductionLine>();
	    }
	    this.deductionLines.add(deductionLineItem);
	    return this;
	  }

	   /**
	   * Get EarningsLines
	   * @return EarningsLines
	  **/
	  @ApiModelProperty(value = "")
	  public List<DeductionLine> getDeductionLines() {
	    return deductionLines;
	  }

	  public void setDeductionLines(List<DeductionLine> deductionLines) {
	    this.deductionLines = deductionLines;
	  }


	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    DeductionLines deductionLines = (DeductionLines) o;
	    return Objects.equals(this.deductionLines, deductionLines.deductionLines);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(deductionLines);
	  }


	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class DeductionLines {\n");
	    
	    sb.append("    deductionLines: ").append(toIndentedString(deductionLines)).append("\n");
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
