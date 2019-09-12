package biz.infocare.model.payroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

public class StatutoryDeductionLines {
		 
	  private List<StatutoryDeductionLine> statutoryDeductionLines = null;

	  public StatutoryDeductionLines statutoryDeductionLines(List<StatutoryDeductionLine> statutoryDeductionLines) {
	    this.statutoryDeductionLines = statutoryDeductionLines;
	    return this;
	  }

	  public StatutoryDeductionLines addStatutoryDeductionLineItem(StatutoryDeductionLine statutoryDeductionLineItem) {
	    if (this.statutoryDeductionLines == null) {
	      this.statutoryDeductionLines = new ArrayList<StatutoryDeductionLine>();
	    }
	    this.statutoryDeductionLines.add(statutoryDeductionLineItem);
	    return this;
	  }

	
	  @ApiModelProperty(value = "")
	  public List<StatutoryDeductionLine> getStatutoryDeductionLines() {
	    return statutoryDeductionLines;
	  }

	  public void setStatutoryDeductionLines(List<StatutoryDeductionLine> statutoryDeductionLines) {
	    this.statutoryDeductionLines = statutoryDeductionLines;
	  }


	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    StatutoryDeductionLines deductionLines = (StatutoryDeductionLines) o;
	    return Objects.equals(this.statutoryDeductionLines, deductionLines.statutoryDeductionLines);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(statutoryDeductionLines);
	  }


	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class StatutoryDeductionLines {\n");	    
	    sb.append("    statutoryDeductionLines: ").append(toIndentedString(statutoryDeductionLines)).append("\n");
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
