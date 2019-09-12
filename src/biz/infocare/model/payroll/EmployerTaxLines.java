package biz.infocare.model.payroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

public class EmployerTaxLines {
	
	  private List<EmployerTaxLine> employerTaxLines = null;

	  public EmployerTaxLines employerTaxLines(List<EmployerTaxLine> employerTaxLines) {
	    this.employerTaxLines = employerTaxLines;
	    return this;
	  }

	  public EmployerTaxLines addEmployerTaxLineItem(EmployerTaxLine employerTaxLineItem) {
	    if (this.employerTaxLines == null) {
	      this.employerTaxLines = new ArrayList<EmployerTaxLine>();
	    }
	    this.employerTaxLines.add(employerTaxLineItem);
	    return this;
	  }

	   /**
	   * Get EarningsLines
	   * @return EarningsLines
	  **/
	  @ApiModelProperty(value = "")
	  public List<EmployerTaxLine> getEmployerTaxLines() {
	    return employerTaxLines;
	  }

	  public void setEmployerTaxLines(List<EmployerTaxLine> employerTaxLines) {
	    this.employerTaxLines = employerTaxLines;
	  }


	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    EmployerTaxLines employeeTaxLines = (EmployerTaxLines) o;
	    return Objects.equals(this.employerTaxLines, employeeTaxLines.employerTaxLines);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(employerTaxLines);
	  }


	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class EmployerTaxLines {\n");
	    
	    sb.append("    employerTaxLines: ").append(toIndentedString(employerTaxLines)).append("\n");
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
