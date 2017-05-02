package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_api.model.VendorItemContentDetailDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class VendorItemContentDto   {
  
  private Long vendorItemId = null;
  private Long vendorItemContentId = null;
  private List<VendorItemContentDetailDto> vendorItemContentDetails = new ArrayList<VendorItemContentDetailDto>();
  private String contentsType = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemId")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemId")
  public Long getVendorItemId() {
    return vendorItemId;
  }
  
  /**
   **/
  public void setVendorItemId(Long vendorItemId) {
    this.vendorItemId = vendorItemId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemContentId")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemContentId")
  public Long getVendorItemContentId() {
    return vendorItemContentId;
  }
  
  /**
   **/
  public void setVendorItemContentId(Long vendorItemContentId) {
    this.vendorItemContentId = vendorItemContentId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemContentDetails")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemContentDetails")
  public List<VendorItemContentDetailDto> getVendorItemContentDetails() {
    return vendorItemContentDetails;
  }
  
  /**
   **/
  public void setVendorItemContentDetails(List<VendorItemContentDetailDto> vendorItemContentDetails) {
    this.vendorItemContentDetails = vendorItemContentDetails;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("contentsType")
  @com.fasterxml.jackson.annotation.JsonProperty("contentsType")
  public String getContentsType() {
    return contentsType;
  }
  
  /**
   **/
  public void setContentsType(String contentsType) {
    this.contentsType = contentsType;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorItemContentDto vendorItemContentDto = (VendorItemContentDto) o;
    return Objects.equals(this.vendorItemId, vendorItemContentDto.vendorItemId) &&
        Objects.equals(this.vendorItemContentId, vendorItemContentDto.vendorItemContentId) &&
        Objects.equals(this.vendorItemContentDetails, vendorItemContentDto.vendorItemContentDetails) &&
        Objects.equals(this.contentsType, vendorItemContentDto.contentsType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemId, vendorItemContentId, vendorItemContentDetails, contentsType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorItemContentDto {\n");
    
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    vendorItemContentId: ").append(toIndentedString(vendorItemContentId)).append("\n");
    sb.append("    vendorItemContentDetails: ").append(toIndentedString(vendorItemContentDetails)).append("\n");
    sb.append("    contentsType: ").append(toIndentedString(contentsType)).append("\n");
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

  public static VendorItemContentDtoBuilder builder() {
    return new VendorItemContentDtoBuilder();
  }

  public static class VendorItemContentDtoBuilder {

    private Long vendorItemId = null;
    private Long vendorItemContentId = null;
    private List<VendorItemContentDetailDto> vendorItemContentDetails = new ArrayList<VendorItemContentDetailDto>();
    private String contentsType = null;
    

    VendorItemContentDtoBuilder() {
    }

    /**
     **/
    public VendorItemContentDtoBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public VendorItemContentDtoBuilder vendorItemContentId(Long vendorItemContentId) {
      this.vendorItemContentId = vendorItemContentId;
      return this;
    }

    /**
     **/
    public VendorItemContentDtoBuilder vendorItemContentDetails(List<VendorItemContentDetailDto> vendorItemContentDetails) {
      this.vendorItemContentDetails = vendorItemContentDetails;
      return this;
    }

    /**
     **/
    public VendorItemContentDtoBuilder contentsType(String contentsType) {
      this.contentsType = contentsType;
      return this;
    }


    public VendorItemContentDto build() {
      VendorItemContentDto vendorItemContentDto = new VendorItemContentDto();
      vendorItemContentDto.setVendorItemId(this.vendorItemId);
      vendorItemContentDto.setVendorItemContentId(this.vendorItemContentId);
      vendorItemContentDto.setVendorItemContentDetails(this.vendorItemContentDetails);
      vendorItemContentDto.setContentsType(this.contentsType);
      return vendorItemContentDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorItemContentDtoBuilder {\n");
      
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    vendorItemContentId: ").append(toIndentedString(vendorItemContentId)).append("\n");
      sb.append("    vendorItemContentDetails: ").append(toIndentedString(vendorItemContentDetails)).append("\n");
      sb.append("    contentsType: ").append(toIndentedString(contentsType)).append("\n");
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

