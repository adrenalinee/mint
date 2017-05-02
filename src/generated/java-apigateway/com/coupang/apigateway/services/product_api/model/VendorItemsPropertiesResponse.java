package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_api.model.VendorItemPropertiesDto;
import java.util.*;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class VendorItemsPropertiesResponse   {
  
  private Map<Long, VendorItemPropertiesDto> content = new HashMap<Long, VendorItemPropertiesDto>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("content")
  @com.fasterxml.jackson.annotation.JsonProperty("content")
  public Map<Long, VendorItemPropertiesDto> getContent() {
    return content;
  }
  
  /**
   **/
  public void setContent(Map<Long, VendorItemPropertiesDto> content) {
    this.content = content;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorItemsPropertiesResponse vendorItemsPropertiesResponse = (VendorItemsPropertiesResponse) o;
    return Objects.equals(this.content, vendorItemsPropertiesResponse.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorItemsPropertiesResponse {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

  public static VendorItemsPropertiesResponseBuilder builder() {
    return new VendorItemsPropertiesResponseBuilder();
  }

  public static class VendorItemsPropertiesResponseBuilder {

    private Map<Long, VendorItemPropertiesDto> content = new HashMap<Long, VendorItemPropertiesDto>();
    

    VendorItemsPropertiesResponseBuilder() {
    }

    /**
     **/
    public VendorItemsPropertiesResponseBuilder content(Map<Long, VendorItemPropertiesDto> content) {
      this.content = content;
      return this;
    }


    public VendorItemsPropertiesResponse build() {
      VendorItemsPropertiesResponse vendorItemsPropertiesResponse = new VendorItemsPropertiesResponse();
      vendorItemsPropertiesResponse.setContent(this.content);
      return vendorItemsPropertiesResponse;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorItemsPropertiesResponseBuilder {\n");
      
      sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

