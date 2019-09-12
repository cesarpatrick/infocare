package biz.infocare.model.payroll;

import java.util.Objects;
import java.util.UUID;

import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.swagger.annotations.ApiModelProperty;

public class Employment {
	
	 @JsonProperty("payRunCalendarID")
	 private UUID payRunCalendarID;
	  
	 @JsonProperty("payrollCalendarID")
	 private UUID payRollCalendarID;
	 
	 @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
	 @JsonProperty("startDate")
	 private OffsetDateTime startDate;
	 
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
	 
	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    Employment employment = (Employment) o;
	    return Objects.equals(this.payRunCalendarID, employment.payRunCalendarID)&&
	        Objects.equals(this.payRollCalendarID, employment.payRollCalendarID)&&
	        Objects.equals(this.startDate, employment.startDate);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(payRunCalendarID,payRollCalendarID,startDate);
	  }


	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class Employment {\n");	    
	    sb.append("    payRunCalendarID: ").append(toIndentedString(payRunCalendarID)).append("\n");
	    sb.append("    payRollCalendarID: ").append(toIndentedString(payRollCalendarID)).append("\n");
	    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
	  
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
