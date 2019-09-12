package biz.infocare.model.payroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

public class EarningsLines {
		
	  private List<EarningsLine> earningsLines = null;

	  public EarningsLines earningsLines(List<EarningsLine> earningsLines) {
	    this.earningsLines = earningsLines;
	    return this;
	  }

	  public EarningsLines addEarningsLineItem(EarningsLine earningsLineItem) {
	    if (this.earningsLines == null) {
	      this.earningsLines = new ArrayList<EarningsLine>();
	    }
	    this.earningsLines.add(earningsLineItem);
	    return this;
	  }

	   /**
	   * Get EarningsLines
	   * @return EarningsLines
	  **/
	  @ApiModelProperty(value = "")
	  public List<EarningsLine> getEarningsLines() {
	    return earningsLines;
	  }

	  public void setEarningsLines(List<EarningsLine> earningsLines) {
	    this.earningsLines = earningsLines;
	  }


	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    EarningsLines earningsLines = (EarningsLines) o;
	    return Objects.equals(this.earningsLines, earningsLines.earningsLines);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(earningsLines);
	  }


	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class PayRuns {\n");
	    
	    sb.append("    payRuns: ").append(toIndentedString(earningsLines)).append("\n");
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
