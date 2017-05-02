package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class VendorItemPackagePolicyDto   {
  
  private Integer maximumBuyForPersonPeriod = null;
  private Integer maximumBuyForPerson = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("maximumBuyForPersonPeriod")
  @com.fasterxml.jackson.annotation.JsonProperty("maximumBuyForPersonPeriod")
  public Integer getMaximumBuyForPersonPeriod() {
    return maximumBuyForPersonPeriod;
  }
  
  /**
   **/
  public void setMaximumBuyForPersonPeriod(Integer maximumBuyForPersonPeriod) {
    this.maximumBuyForPersonPeriod = maximumBuyForPersonPeriod;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("maximumBuyForPerson")
  @com.fasterxml.jackson.annotation.JsonProperty("maximumBuyForPerson")
  public Integer getMaximumBuyForPerson() {
    return maximumBuyForPerson;
  }
  
  /**
   **/
  public void setMaximumBuyForPerson(Integer maximumBuyForPerson) {
    this.maximumBuyForPerson = maximumBuyForPerson;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorItemPackagePolicyDto vendorItemPackagePolicyDto = (VendorItemPackagePolicyDto) o;
    return Objects.equals(this.maximumBuyForPersonPeriod, vendorItemPackagePolicyDto.maximumBuyForPersonPeriod) &&
        Objects.equals(this.maximumBuyForPerson, vendorItemPackagePolicyDto.maximumBuyForPerson);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumBuyForPersonPeriod, maximumBuyForPerson);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorItemPackagePolicyDto {\n");
    
    sb.append("    maximumBuyForPersonPeriod: ").append(toIndentedString(maximumBuyForPersonPeriod)).append("\n");
    sb.append("    maximumBuyForPerson: ").append(toIndentedString(maximumBuyForPerson)).append("\n");
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

  public static VendorItemPackagePolicyDtoBuilder builder() {
    return new VendorItemPackagePolicyDtoBuilder();
  }

  public static class VendorItemPackagePolicyDtoBuilder {

    private Integer maximumBuyForPersonPeriod = null;
    private Integer maximumBuyForPerson = null;
    

    VendorItemPackagePolicyDtoBuilder() {
    }

    /**
     **/
    public VendorItemPackagePolicyDtoBuilder maximumBuyForPersonPeriod(Integer maximumBuyForPersonPeriod) {
      this.maximumBuyForPersonPeriod = maximumBuyForPersonPeriod;
      return this;
    }

    /**
     **/
    public VendorItemPackagePolicyDtoBuilder maximumBuyForPerson(Integer maximumBuyForPerson) {
      this.maximumBuyForPerson = maximumBuyForPerson;
      return this;
    }


    public VendorItemPackagePolicyDto build() {
      VendorItemPackagePolicyDto vendorItemPackagePolicyDto = new VendorItemPackagePolicyDto();
      vendorItemPackagePolicyDto.setMaximumBuyForPersonPeriod(this.maximumBuyForPersonPeriod);
      vendorItemPackagePolicyDto.setMaximumBuyForPerson(this.maximumBuyForPerson);
      return vendorItemPackagePolicyDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorItemPackagePolicyDtoBuilder {\n");
      
      sb.append("    maximumBuyForPersonPeriod: ").append(toIndentedString(maximumBuyForPersonPeriod)).append("\n");
      sb.append("    maximumBuyForPerson: ").append(toIndentedString(maximumBuyForPerson)).append("\n");
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
}

