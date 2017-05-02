package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class VendorItemPolicyDto   {
  
  private Boolean optionMustBought = null;
  private Integer maximumBuyForPersonPeriod = null;
  private Integer maximumBuyForPerson = null;
  private Date autoFinishedAt = null;
  private Boolean autoFinished = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("optionMustBought")
  @com.fasterxml.jackson.annotation.JsonProperty("optionMustBought")
  public Boolean getOptionMustBought() {
    return optionMustBought;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isOptionMustBought() {
    return optionMustBought == null ? false : optionMustBought;
  }
  
  /**
   **/
  public void setOptionMustBought(Boolean optionMustBought) {
    this.optionMustBought = optionMustBought;
  }
  
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
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("autoFinishedAt")
  @com.fasterxml.jackson.annotation.JsonProperty("autoFinishedAt")
  public Date getAutoFinishedAt() {
    return autoFinishedAt;
  }
  
  /**
   **/
  public void setAutoFinishedAt(Date autoFinishedAt) {
    this.autoFinishedAt = autoFinishedAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("autoFinished")
  @com.fasterxml.jackson.annotation.JsonProperty("autoFinished")
  public Boolean getAutoFinished() {
    return autoFinished;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isAutoFinished() {
    return autoFinished == null ? false : autoFinished;
  }
  
  /**
   **/
  public void setAutoFinished(Boolean autoFinished) {
    this.autoFinished = autoFinished;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorItemPolicyDto vendorItemPolicyDto = (VendorItemPolicyDto) o;
    return Objects.equals(this.optionMustBought, vendorItemPolicyDto.optionMustBought) &&
        Objects.equals(this.maximumBuyForPersonPeriod, vendorItemPolicyDto.maximumBuyForPersonPeriod) &&
        Objects.equals(this.maximumBuyForPerson, vendorItemPolicyDto.maximumBuyForPerson) &&
        Objects.equals(this.autoFinishedAt, vendorItemPolicyDto.autoFinishedAt) &&
        Objects.equals(this.autoFinished, vendorItemPolicyDto.autoFinished);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optionMustBought, maximumBuyForPersonPeriod, maximumBuyForPerson, autoFinishedAt, autoFinished);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorItemPolicyDto {\n");
    
    sb.append("    optionMustBought: ").append(toIndentedString(optionMustBought)).append("\n");
    sb.append("    maximumBuyForPersonPeriod: ").append(toIndentedString(maximumBuyForPersonPeriod)).append("\n");
    sb.append("    maximumBuyForPerson: ").append(toIndentedString(maximumBuyForPerson)).append("\n");
    sb.append("    autoFinishedAt: ").append(toIndentedString(autoFinishedAt)).append("\n");
    sb.append("    autoFinished: ").append(toIndentedString(autoFinished)).append("\n");
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

  public static VendorItemPolicyDtoBuilder builder() {
    return new VendorItemPolicyDtoBuilder();
  }

  public static class VendorItemPolicyDtoBuilder {

    private Boolean optionMustBought = null;
    private Integer maximumBuyForPersonPeriod = null;
    private Integer maximumBuyForPerson = null;
    private Date autoFinishedAt = null;
    private Boolean autoFinished = null;
    

    VendorItemPolicyDtoBuilder() {
    }

    /**
     **/
    public VendorItemPolicyDtoBuilder optionMustBought(Boolean optionMustBought) {
      this.optionMustBought = optionMustBought;
      return this;
    }

    /**
     **/
    public VendorItemPolicyDtoBuilder maximumBuyForPersonPeriod(Integer maximumBuyForPersonPeriod) {
      this.maximumBuyForPersonPeriod = maximumBuyForPersonPeriod;
      return this;
    }

    /**
     **/
    public VendorItemPolicyDtoBuilder maximumBuyForPerson(Integer maximumBuyForPerson) {
      this.maximumBuyForPerson = maximumBuyForPerson;
      return this;
    }

    /**
     **/
    public VendorItemPolicyDtoBuilder autoFinishedAt(Date autoFinishedAt) {
      this.autoFinishedAt = autoFinishedAt;
      return this;
    }

    /**
     **/
    public VendorItemPolicyDtoBuilder autoFinished(Boolean autoFinished) {
      this.autoFinished = autoFinished;
      return this;
    }


    public VendorItemPolicyDto build() {
      VendorItemPolicyDto vendorItemPolicyDto = new VendorItemPolicyDto();
      vendorItemPolicyDto.setOptionMustBought(this.optionMustBought);
      vendorItemPolicyDto.setMaximumBuyForPersonPeriod(this.maximumBuyForPersonPeriod);
      vendorItemPolicyDto.setMaximumBuyForPerson(this.maximumBuyForPerson);
      vendorItemPolicyDto.setAutoFinishedAt(this.autoFinishedAt);
      vendorItemPolicyDto.setAutoFinished(this.autoFinished);
      return vendorItemPolicyDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorItemPolicyDtoBuilder {\n");
      
      sb.append("    optionMustBought: ").append(toIndentedString(optionMustBought)).append("\n");
      sb.append("    maximumBuyForPersonPeriod: ").append(toIndentedString(maximumBuyForPersonPeriod)).append("\n");
      sb.append("    maximumBuyForPerson: ").append(toIndentedString(maximumBuyForPerson)).append("\n");
      sb.append("    autoFinishedAt: ").append(toIndentedString(autoFinishedAt)).append("\n");
      sb.append("    autoFinished: ").append(toIndentedString(autoFinished)).append("\n");
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

