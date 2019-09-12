package biz.infocare.model.payroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

public class Employees {
	
	  private List<Employee> employees = null;

	  public Employees employees(List<Employee> employees) {
	    this.employees = employees;
	    return this;
	  }

	  public Employees addEmployeesItem(Employee employeesItem) {
	    if (this.employees == null) {
	      this.employees = new ArrayList<Employee>();
	    }
	    this.employees.add(employeesItem);
	    return this;
	  }

	   /**
	   * Get employees
	   * @return employees
	  **/
	  @ApiModelProperty(value = "")
	  public List<Employee> getEmployees() {
	    return employees;
	  }

	  public void setEmployees(List<Employee> employees) {
	    this.employees = employees;
	  }


	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    Employees employees = (Employees) o;
	    return Objects.equals(this.employees, employees.employees);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(employees);
	  }


	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class Employees {\n");
	    
	    sb.append("    employees: ").append(toIndentedString(employees)).append("\n");
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
