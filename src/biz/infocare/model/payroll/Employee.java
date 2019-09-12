package biz.infocare.model.payroll;

import java.util.Objects;
import java.util.UUID;

import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.swagger.annotations.ApiModelProperty;

public class Employee {

	  @JsonProperty("employeeID")
	  private UUID employeeID;
	  
	  @JsonProperty("firstName")
	  private String firstName;

	  
	  @JsonProperty("lastName")
	  private String lastName;
	  
	  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
	  @JsonProperty("dateOfBirth")
	  private OffsetDateTime dateOfBirth;
	  
	  public enum GenderEnum {
		    F("F"),
		    
		    M("M");  
		   
		    private String value;

		  	GenderEnum(String value) {
		      this.value = value;
		    }

		    @JsonValue
		    public String getValue() {
		      return value;
		    }

		    @Override
		    public String toString() {
		      return String.valueOf(value);
		    }

		    @JsonCreator
		    public static GenderEnum fromValue(String text) {
		      for (GenderEnum b : GenderEnum.values()) {
		        if (String.valueOf(b.value).equals(text)) {
		          return b;
		        }
		      }
		      throw new IllegalArgumentException("Unexpected value '" + text + "'");
		    }
		  }

		  
	  @JsonProperty("gender")
	  private GenderEnum gender;

	  @JsonProperty("email")
	  private String email;
	  
	  @JsonProperty("phoneNumber")
	  private String phoneNumber;
	  
	  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
	  @JsonProperty("startDate")
	  private OffsetDateTime startDate;
	  	
	  @JsonProperty("address")
	  private Address address;
	  
	  @JsonProperty("payRunCalendarID")
	  private UUID payRunCalendarID;
	  
	  @JsonProperty("payrollCalendarID")
	  private UUID payRollCalendarID;	  
	  
	  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
	  @JsonProperty("updatedDateUTC")
	  private OffsetDateTime updatedDateUTC;
	  
	  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
	  @JsonProperty("createDateUTC")
	  private OffsetDateTime createDateUTC;
	  
	  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
	  @JsonProperty("endDate")
	  private OffsetDateTime endDate;

	  public Employee employeeID(UUID employeeID) {
	    this.employeeID = employeeID;
	    return this;
	  }

	   /**
	   * The Xero identifier for an employee e.g. 297c2dc5-cc47-4afd-8ec8-74990b8761e9
	   * @return employeeID
	  **/
	  @ApiModelProperty(value = "The Xero identifier for an employee e.g. 297c2dc5-cc47-4afd-8ec8-74990b8761e9")
	  public UUID getEmployeeID() {
	    return employeeID;
	  }

	  public void setEmployeeID(UUID employeeID) {
	    this.employeeID = employeeID;
	  }
	  

	  public Employee firstName(String firstName) {
	    this.firstName = firstName;
	    return this;
	  }

	   /**
	   * First name of an employee (max length &#x3D; 255)
	   * @return firstName
	  **/
	  @ApiModelProperty(value = "First name of an employee (max length = 255)")
	  public String getFirstName() {
	    return firstName;
	  }

	  public void setFirstName(String firstName) {
	    this.firstName = firstName;
	  }

	  public Employee lastName(String lastName) {
	    this.lastName = lastName;
	    return this;
	  }

	   /**
	   * Last name of an employee (max length &#x3D; 255)
	   * @return lastName
	  **/
	  @ApiModelProperty(value = "Last name of an employee (max length = 255)")
	  public String getLastName() {
	    return lastName;
	  }

	  public void setLastName(String lastName) {
	    this.lastName = lastName;
	  }
	  
	  /**
	   * Get dateOfBirth
	   * @return dateOfBirth
	  **/
	  @ApiModelProperty(value = "")
	  public OffsetDateTime getDateOfBirth() {
	    return dateOfBirth;
	  }

	  public void setDateOfBirth(OffsetDateTime dateOfBirth) {
	    this.dateOfBirth = dateOfBirth;
	  }
	  
	  
	  /**
	   * Email of an employee (max length &#x3D; 255)
	   * @return lastName
	  **/
	  @ApiModelProperty(value = "Email of an employee (max length = 255)")
	  public String getEmail() {
	    return lastName;
	  }

	  public void setEmail(String email) {
	    this.email = email;
	  }
	  
	  /**
	   * Phone Number (max length &#x3D; 255)
	   * @return lastName
	  **/
	  @ApiModelProperty(value = "Phone number of an employee (max length = 255)")
	  public String getPhoneNumber() {
	    return phoneNumber;
	  }

	  public void setPhoneNumber(String phoneNumber) {
	    this.phoneNumber = phoneNumber;
	  }
	  
	  @ApiModelProperty(value = "The Xero identifier for an pay run calendar e.g. 297c2dc5-cc47-4afd-8ec8-74990b8761e9")
	  public UUID getPayRunCalendarID() {
	    return payRunCalendarID;
	  }

	  public void setPayRunCalendarID(UUID payRunCalendarID) {
	    this.payRunCalendarID = payRunCalendarID;
	  }
	  
	  @ApiModelProperty(value = "The Xero identifier for an pay run calendar e.g. 297c2dc5-cc47-4afd-8ec8-74990b8761e9")
	  public UUID getPayrollCalendarID() {
	    return payRollCalendarID;
	  }

	  public void setPayrollCalendarID(UUID payrollCalendarID) {
	    this.payRollCalendarID = payrollCalendarID;
	  }

	  public Employee updatedDateUTC(OffsetDateTime updatedDateUTC) {
	    this.updatedDateUTC = updatedDateUTC;
	    return this;
	  }

	   /**
	   * Get updatedDateUTC
	   * @return updatedDateUTC
	  **/
	  @ApiModelProperty(value = "")
	  public OffsetDateTime getUpdatedDateUTC() {
	    return updatedDateUTC;
	  }

	  public void setUpdatedDateUTC(OffsetDateTime updatedDateUTC) {
	    this.updatedDateUTC = updatedDateUTC;
	  }

	  /**
	   * Get createDateUTC
	   * @return createDateUTC
	  **/
	  @ApiModelProperty(value = "")
	  public OffsetDateTime getCreateDateUTCC() {
	    return createDateUTC;
	  }

	  public void setCreateDateUTC(OffsetDateTime createDateUTC) {
	    this.createDateUTC = createDateUTC;
	  }
	  
	  /**
	   * Get StartDate
	   * @return startDate
	  **/
	  @ApiModelProperty(value = "")
	  public OffsetDateTime getStartDate() {
	    return startDate;
	  }

	  public void setStartDate(OffsetDateTime startDate) {
	    this.startDate = startDate;
	  }
	  
	  /**
	   * Get Address
	   * @return Address
	  **/
	  @ApiModelProperty(value = "")
	  public Address getAddress() {
	    return address;
	  }

	  public void setAddress(Address address) {
	    this.address = address;
	  }
	  
	  /**
	   * Get EndDate
	   * @return endDate
	  **/
	  @ApiModelProperty(value = "")
	  public OffsetDateTime getEndDate() {
	    return endDate;
	  }

	  public void setEndDate(OffsetDateTime endDate) {
	    this.endDate = endDate;
	  }
	  
	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    Employee employee = (Employee) o;
	    return Objects.equals(this.employeeID, employee.employeeID) &&	       
	        Objects.equals(this.firstName, employee.firstName) &&
	        Objects.equals(this.lastName, employee.lastName) &&
	        Objects.equals(this.dateOfBirth, employee.dateOfBirth)&&
	        Objects.equals(this.email, employee.email)&&
	        Objects.equals(this.phoneNumber, employee.phoneNumber)&&
	        Objects.equals(this.startDate, employee.startDate)&&
	        Objects.equals(this.address, employee.address)&&
	        Objects.equals(this.payRunCalendarID, employee.payRunCalendarID)&&
	        Objects.equals(this.payRollCalendarID, employee.payRollCalendarID)&&
	        Objects.equals(this.updatedDateUTC, employee.updatedDateUTC)&&
	        Objects.equals(this.createDateUTC, employee.createDateUTC) &&
	        Objects.equals(this.endDate, employee.endDate);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(employeeID, firstName, lastName,dateOfBirth,email,phoneNumber,startDate,address,payRunCalendarID,
	    		payRollCalendarID,updatedDateUTC,createDateUTC,endDate);
	  }


	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class Employee {\n");
	    
	    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");	   
	    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
	    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
	    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
	    sb.append("    email: ").append(toIndentedString(email)).append("\n");
	    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
	    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
	    sb.append("    address: ").append(toIndentedString(address)).append("\n");
	    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
	    sb.append("    payRunCalendarID: ").append(toIndentedString(payRunCalendarID)).append("\n");
	    sb.append("    payRollCalendarID: ").append(toIndentedString(payRollCalendarID)).append("\n");
	    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
	    sb.append("    createDateUTC: ").append(toIndentedString(createDateUTC)).append("\n");
	    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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


