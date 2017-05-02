package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class TravelDto   {
  
  private Date useStartDate = null;
  private Date useEndDate = null;
  private java.math.BigDecimal autoRefundRate = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("useStartDate")
  @com.fasterxml.jackson.annotation.JsonProperty("useStartDate")
  public Date getUseStartDate() {
    return useStartDate;
  }
  
  /**
   **/
  public void setUseStartDate(Date useStartDate) {
    this.useStartDate = useStartDate;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("useEndDate")
  @com.fasterxml.jackson.annotation.JsonProperty("useEndDate")
  public Date getUseEndDate() {
    return useEndDate;
  }
  
  /**
   **/
  public void setUseEndDate(Date useEndDate) {
    this.useEndDate = useEndDate;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("autoRefundRate")
  @com.fasterxml.jackson.annotation.JsonProperty("autoRefundRate")
  public java.math.BigDecimal getAutoRefundRate() {
    return autoRefundRate;
  }
  
  /**
   **/
  public void setAutoRefundRate(java.math.BigDecimal autoRefundRate) {
    this.autoRefundRate = autoRefundRate;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelDto travelDto = (TravelDto) o;
    return Objects.equals(this.useStartDate, travelDto.useStartDate) &&
        Objects.equals(this.useEndDate, travelDto.useEndDate) &&
        Objects.equals(this.autoRefundRate, travelDto.autoRefundRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useStartDate, useEndDate, autoRefundRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelDto {\n");
    
    sb.append("    useStartDate: ").append(toIndentedString(useStartDate)).append("\n");
    sb.append("    useEndDate: ").append(toIndentedString(useEndDate)).append("\n");
    sb.append("    autoRefundRate: ").append(toIndentedString(autoRefundRate)).append("\n");
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

  public static TravelDtoBuilder builder() {
    return new TravelDtoBuilder();
  }

  public static class TravelDtoBuilder {

    private Date useStartDate = null;
    private Date useEndDate = null;
    private java.math.BigDecimal autoRefundRate = null;
    

    TravelDtoBuilder() {
    }

    /**
     **/
    public TravelDtoBuilder useStartDate(Date useStartDate) {
      this.useStartDate = useStartDate;
      return this;
    }

    /**
     **/
    public TravelDtoBuilder useEndDate(Date useEndDate) {
      this.useEndDate = useEndDate;
      return this;
    }

    /**
     **/
    public TravelDtoBuilder autoRefundRate(java.math.BigDecimal autoRefundRate) {
      this.autoRefundRate = autoRefundRate;
      return this;
    }


    public TravelDto build() {
      TravelDto travelDto = new TravelDto();
      travelDto.setUseStartDate(this.useStartDate);
      travelDto.setUseEndDate(this.useEndDate);
      travelDto.setAutoRefundRate(this.autoRefundRate);
      return travelDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class TravelDtoBuilder {\n");
      
      sb.append("    useStartDate: ").append(toIndentedString(useStartDate)).append("\n");
      sb.append("    useEndDate: ").append(toIndentedString(useEndDate)).append("\n");
      sb.append("    autoRefundRate: ").append(toIndentedString(autoRefundRate)).append("\n");
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

