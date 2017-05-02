package com.coupang.apigateway.services.wms_fulfillment.model;

import java.util.Objects;
import com.coupang.apigateway.services.wms_fulfillment.model.FulfillmentRangeQuantityPddItemDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.020+09:00")
public class FulfillmentRangeQuantityPddDto   {
  
  private List<FulfillmentRangeQuantityPddItemDto> fulfillmentRangeQuantityPddItemList = new ArrayList<FulfillmentRangeQuantityPddItemDto>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("fulfillmentRangeQuantityPddItemList")
  @com.fasterxml.jackson.annotation.JsonProperty("fulfillmentRangeQuantityPddItemList")
  public List<FulfillmentRangeQuantityPddItemDto> getFulfillmentRangeQuantityPddItemList() {
    return fulfillmentRangeQuantityPddItemList;
  }
  
  /**
   **/
  public void setFulfillmentRangeQuantityPddItemList(List<FulfillmentRangeQuantityPddItemDto> fulfillmentRangeQuantityPddItemList) {
    this.fulfillmentRangeQuantityPddItemList = fulfillmentRangeQuantityPddItemList;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentRangeQuantityPddDto fulfillmentRangeQuantityPddDto = (FulfillmentRangeQuantityPddDto) o;
    return Objects.equals(this.fulfillmentRangeQuantityPddItemList, fulfillmentRangeQuantityPddDto.fulfillmentRangeQuantityPddItemList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentRangeQuantityPddItemList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentRangeQuantityPddDto {\n");
    
    sb.append("    fulfillmentRangeQuantityPddItemList: ").append(toIndentedString(fulfillmentRangeQuantityPddItemList)).append("\n");
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

  public static FulfillmentRangeQuantityPddDtoBuilder builder() {
    return new FulfillmentRangeQuantityPddDtoBuilder();
  }

  public static class FulfillmentRangeQuantityPddDtoBuilder {

    private List<FulfillmentRangeQuantityPddItemDto> fulfillmentRangeQuantityPddItemList = new ArrayList<FulfillmentRangeQuantityPddItemDto>();
    

    FulfillmentRangeQuantityPddDtoBuilder() {
    }

    /**
     **/
    public FulfillmentRangeQuantityPddDtoBuilder fulfillmentRangeQuantityPddItemList(List<FulfillmentRangeQuantityPddItemDto> fulfillmentRangeQuantityPddItemList) {
      this.fulfillmentRangeQuantityPddItemList = fulfillmentRangeQuantityPddItemList;
      return this;
    }


    public FulfillmentRangeQuantityPddDto build() {
      FulfillmentRangeQuantityPddDto fulfillmentRangeQuantityPddDto = new FulfillmentRangeQuantityPddDto();
      fulfillmentRangeQuantityPddDto.setFulfillmentRangeQuantityPddItemList(this.fulfillmentRangeQuantityPddItemList);
      return fulfillmentRangeQuantityPddDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class FulfillmentRangeQuantityPddDtoBuilder {\n");
      
      sb.append("    fulfillmentRangeQuantityPddItemList: ").append(toIndentedString(fulfillmentRangeQuantityPddItemList)).append("\n");
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

