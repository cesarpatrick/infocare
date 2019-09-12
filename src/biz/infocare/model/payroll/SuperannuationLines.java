package biz.infocare.model.payroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

public class SuperannuationLines {
		
	 private List<SuperannuationLine> superannuationLines = null;

	  public SuperannuationLines superannuationLines(List<SuperannuationLine> superannuationLines) {
	    this.superannuationLines = superannuationLines;
	    return this;
	  }

	  public SuperannuationLines addSuperannuationLineItem(SuperannuationLine superannuationLineItem) {
	    if (this.superannuationLines == null) {
	      this.superannuationLines = new ArrayList<SuperannuationLine>();
	    }
	    this.superannuationLines.add(superannuationLineItem);
	    return this;
	  }

	   /**
	   * Get EarningsLines
	   * @return EarningsLines
	  **/
	  @ApiModelProperty(value = "")
	  public List<SuperannuationLine> getSuperannuationLines() {
	    return superannuationLines;
	  }

	  public void setSuperannuationLines(List<SuperannuationLine> superannuationLines) {
	    this.superannuationLines = superannuationLines;
	  }


	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    SuperannuationLines superannuationLines = (SuperannuationLines) o;
	    return Objects.equals(this.superannuationLines, superannuationLines.superannuationLines);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(superannuationLines);
	  }


	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class SuperannuationLines {\n");
	    
	    sb.append("    superannuationLines: ").append(toIndentedString(superannuationLines)).append("\n");
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
