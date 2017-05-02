package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class VendorItemContentDetailDto   {
  
  private String detailType = null;
  private String content = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("detailType")
  @com.fasterxml.jackson.annotation.JsonProperty("detailType")
  public String getDetailType() {
    return detailType;
  }
  
  /**
   **/
  public void setDetailType(String detailType) {
    this.detailType = detailType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("content")
  @com.fasterxml.jackson.annotation.JsonProperty("content")
  public String getContent() {
    return content;
  }
  
  /**
   **/
  public void setContent(String content) {
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
    VendorItemContentDetailDto vendorItemContentDetailDto = (VendorItemContentDetailDto) o;
    return Objects.equals(this.detailType, vendorItemContentDetailDto.detailType) &&
        Objects.equals(this.content, vendorItemContentDetailDto.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detailType, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorItemContentDetailDto {\n");
    
    sb.append("    detailType: ").append(toIndentedString(detailType)).append("\n");
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

  public static VendorItemContentDetailDtoBuilder builder() {
    return new VendorItemContentDetailDtoBuilder();
  }

  public static class VendorItemContentDetailDtoBuilder {

    private String detailType = null;
    private String content = null;
    

    VendorItemContentDetailDtoBuilder() {
    }

    /**
     **/
    public VendorItemContentDetailDtoBuilder detailType(String detailType) {
      this.detailType = detailType;
      return this;
    }

    /**
     **/
    public VendorItemContentDetailDtoBuilder content(String content) {
      this.content = content;
      return this;
    }


    public VendorItemContentDetailDto build() {
      VendorItemContentDetailDto vendorItemContentDetailDto = new VendorItemContentDetailDto();
      vendorItemContentDetailDto.setDetailType(this.detailType);
      vendorItemContentDetailDto.setContent(this.content);
      return vendorItemContentDetailDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorItemContentDetailDtoBuilder {\n");
      
      sb.append("    detailType: ").append(toIndentedString(detailType)).append("\n");
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

