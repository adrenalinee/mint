package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class VendorItemPackageContentDetailDto   {
  
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
    VendorItemPackageContentDetailDto vendorItemPackageContentDetailDto = (VendorItemPackageContentDetailDto) o;
    return Objects.equals(this.detailType, vendorItemPackageContentDetailDto.detailType) &&
        Objects.equals(this.content, vendorItemPackageContentDetailDto.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detailType, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorItemPackageContentDetailDto {\n");
    
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

  public static VendorItemPackageContentDetailDtoBuilder builder() {
    return new VendorItemPackageContentDetailDtoBuilder();
  }

  public static class VendorItemPackageContentDetailDtoBuilder {

    private String detailType = null;
    private String content = null;
    

    VendorItemPackageContentDetailDtoBuilder() {
    }

    /**
     **/
    public VendorItemPackageContentDetailDtoBuilder detailType(String detailType) {
      this.detailType = detailType;
      return this;
    }

    /**
     **/
    public VendorItemPackageContentDetailDtoBuilder content(String content) {
      this.content = content;
      return this;
    }


    public VendorItemPackageContentDetailDto build() {
      VendorItemPackageContentDetailDto vendorItemPackageContentDetailDto = new VendorItemPackageContentDetailDto();
      vendorItemPackageContentDetailDto.setDetailType(this.detailType);
      vendorItemPackageContentDetailDto.setContent(this.content);
      return vendorItemPackageContentDetailDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorItemPackageContentDetailDtoBuilder {\n");
      
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

