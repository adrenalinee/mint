package com.coupang.apigateway.services.wms_fulfillment.model;

import java.util.Objects;
import com.coupang.apigateway.services.wms_fulfillment.model.FulfillmentEachVIPddItemDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.020+09:00")
public class FulfillmentEachVIPddDto   {
  
  private List<FulfillmentEachVIPddItemDto> fulfillmentEachVIPddItemList = new ArrayList<FulfillmentEachVIPddItemDto>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("fulfillmentEachVIPddItemList")
  @com.fasterxml.jackson.annotation.JsonProperty("fulfillmentEachVIPddItemList")
  public List<FulfillmentEachVIPddItemDto> getFulfillmentEachVIPddItemList() {
    return fulfillmentEachVIPddItemList;
  }
  
  /**
   **/
  public void setFulfillmentEachVIPddItemList(List<FulfillmentEachVIPddItemDto> fulfillmentEachVIPddItemList) {
    this.fulfillmentEachVIPddItemList = fulfillmentEachVIPddItemList;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentEachVIPddDto fulfillmentEachVIPddDto = (FulfillmentEachVIPddDto) o;
    return Objects.equals(this.fulfillmentEachVIPddItemList, fulfillmentEachVIPddDto.fulfillmentEachVIPddItemList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentEachVIPddItemList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentEachVIPddDto {\n");
    
    sb.append("    fulfillmentEachVIPddItemList: ").append(toIndentedString(fulfillmentEachVIPddItemList)).append("\n");
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

  public static FulfillmentEachVIPddDtoBuilder builder() {
    return new FulfillmentEachVIPddDtoBuilder();
  }

  public static class FulfillmentEachVIPddDtoBuilder {

    private List<FulfillmentEachVIPddItemDto> fulfillmentEachVIPddItemList = new ArrayList<FulfillmentEachVIPddItemDto>();
    

    FulfillmentEachVIPddDtoBuilder() {
    }

    /**
     **/
    public FulfillmentEachVIPddDtoBuilder fulfillmentEachVIPddItemList(List<FulfillmentEachVIPddItemDto> fulfillmentEachVIPddItemList) {
      this.fulfillmentEachVIPddItemList = fulfillmentEachVIPddItemList;
      return this;
    }


    public FulfillmentEachVIPddDto build() {
      FulfillmentEachVIPddDto fulfillmentEachVIPddDto = new FulfillmentEachVIPddDto();
      fulfillmentEachVIPddDto.setFulfillmentEachVIPddItemList(this.fulfillmentEachVIPddItemList);
      return fulfillmentEachVIPddDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class FulfillmentEachVIPddDtoBuilder {\n");
      
      sb.append("    fulfillmentEachVIPddItemList: ").append(toIndentedString(fulfillmentEachVIPddItemList)).append("\n");
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

