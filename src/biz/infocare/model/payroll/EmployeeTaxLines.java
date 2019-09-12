package biz.infocare.model.payroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

public class EmployeeTaxLines {
	
	  private List<EmployeeTaxLine> employeeTaxLines = null;

	  public EmployeeTaxLines employeeTaxLines(List<EmployeeTaxLine> employeeTaxLines) {
	    this.employeeTaxLines = employeeTaxLines;
	    return this;
	  }

	  public EmployeeTaxLines addEmployeeTaxLineItem(EmployeeTaxLine employeeTaxLineItem) {
	    if (this.employeeTaxLines == null) {
	      this.employeeTaxLines = new ArrayList<EmployeeTaxLine>();
	    }
	    this.employeeTaxLines.add(employeeTaxLineItem);
	    return this;
	  }

	   /**
	   * Get EarningsLines
	   * @return EarningsLines
	  **/
	  @ApiModelProperty(value = "")
	  public List<EmployeeTaxLine> getEmployeeTaxLines() {
	    return employeeTaxLines;
	  }

	  public void setEmployeeTaxLines(List<EmployeeTaxLine> employeeTaxLines) {
	    this.employeeTaxLines = employeeTaxLines;
	  }


	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    EmployeeTaxLines employeeTaxLines = (EmployeeTaxLines) o;
	    return Objects.equals(this.employeeTaxLines, employeeTaxLines.employeeTaxLines);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(employeeTaxLines);
	  }


	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class EmployeeTaxLines {\n");
	    
	    sb.append("    employeeTaxLines: ").append(toIndentedString(employeeTaxLines)).append("\n");
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
