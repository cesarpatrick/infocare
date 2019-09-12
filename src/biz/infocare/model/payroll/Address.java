package biz.infocare.model.payroll;


import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Address
 */

public class Address {
	
  @JsonProperty("addressLine1")
  private String addressLine1;

  
  @JsonProperty("addressLine2")
  private String addressLine2;
  
  @JsonProperty("city")
  private String city;

  
  @JsonProperty("suburb")
  private String suburb;

  @JsonProperty("countryName")
  private String countryName;
  
  @JsonProperty("postalCode")
  private String postalCode;

  public Address addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * max length &#x3D; 500
   * @return addressLine1
  **/
  @ApiModelProperty(value = "max length = 500")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public Address addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * max length &#x3D; 500
   * @return addressLine2
  **/
  @ApiModelProperty(value = "max length = 500")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

   /**
   * max length &#x3D; 255
   * @return city
  **/
  @ApiModelProperty(value = "max length = 255")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address suburb(String suburb) {
    this.suburb = suburb;
    return this;
  }

   /**
   * max length &#x3D; 255
   * @return suburb
  **/
  @ApiModelProperty(value = "max length = 255")
  public String getSuburb() {
    return suburb;
  }

  public void setSuburb(String suburb) {
    this.suburb = suburb;
  }

  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * max length &#x3D; 50
   * @return postalCode
  **/
  @ApiModelProperty(value = "max length = 50")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Address countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

   /**
   * max length &#x3D; 50, [A-Z], [a-z] only
   * @return country
  **/
  @ApiModelProperty(value = "max length = 50, [A-Z], [a-z] only")
  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.addressLine1, address.addressLine1) &&
        Objects.equals(this.addressLine2, address.addressLine2) && 
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.suburb, address.suburb) &&
        Objects.equals(this.countryName, address.countryName) &&
        Objects.equals(this.postalCode, address.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2,city, suburb,countryName, postalCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    suburb: ").append(toIndentedString(suburb)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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

