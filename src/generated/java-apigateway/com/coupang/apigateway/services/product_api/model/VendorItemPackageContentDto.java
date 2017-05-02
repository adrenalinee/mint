package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_api.model.VendorItemPackageContentDetailDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class VendorItemPackageContentDto   {
  
  private Long vendorItemPackageId = null;
  private Long vendorItemPackageContentsId = null;
  private List<VendorItemPackageContentDetailDto> vendorItemPackageContentDetails = new ArrayList<VendorItemPackageContentDetailDto>();
  private String updId = null;
  private String contentsType = null;
  private String contentInfoType = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemPackageId")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemPackageId")
  public Long getVendorItemPackageId() {
    return vendorItemPackageId;
  }
  
  /**
   **/
  public void setVendorItemPackageId(Long vendorItemPackageId) {
    this.vendorItemPackageId = vendorItemPackageId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemPackageContentsId")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemPackageContentsId")
  public Long getVendorItemPackageContentsId() {
    return vendorItemPackageContentsId;
  }
  
  /**
   **/
  public void setVendorItemPackageContentsId(Long vendorItemPackageContentsId) {
    this.vendorItemPackageContentsId = vendorItemPackageContentsId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemPackageContentDetails")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemPackageContentDetails")
  public List<VendorItemPackageContentDetailDto> getVendorItemPackageContentDetails() {
    return vendorItemPackageContentDetails;
  }
  
  /**
   **/
  public void setVendorItemPackageContentDetails(List<VendorItemPackageContentDetailDto> vendorItemPackageContentDetails) {
    this.vendorItemPackageContentDetails = vendorItemPackageContentDetails;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("updId")
  @com.fasterxml.jackson.annotation.JsonProperty("updId")
  public String getUpdId() {
    return updId;
  }
  
  /**
   **/
  public void setUpdId(String updId) {
    this.updId = updId;
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
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("contentInfoType")
  @com.fasterxml.jackson.annotation.JsonProperty("contentInfoType")
  public String getContentInfoType() {
    return contentInfoType;
  }
  
  /**
   **/
  public void setContentInfoType(String contentInfoType) {
    this.contentInfoType = contentInfoType;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorItemPackageContentDto vendorItemPackageContentDto = (VendorItemPackageContentDto) o;
    return Objects.equals(this.vendorItemPackageId, vendorItemPackageContentDto.vendorItemPackageId) &&
        Objects.equals(this.vendorItemPackageContentsId, vendorItemPackageContentDto.vendorItemPackageContentsId) &&
        Objects.equals(this.vendorItemPackageContentDetails, vendorItemPackageContentDto.vendorItemPackageContentDetails) &&
        Objects.equals(this.updId, vendorItemPackageContentDto.updId) &&
        Objects.equals(this.contentsType, vendorItemPackageContentDto.contentsType) &&
        Objects.equals(this.contentInfoType, vendorItemPackageContentDto.contentInfoType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemPackageId, vendorItemPackageContentsId, vendorItemPackageContentDetails, updId, contentsType, contentInfoType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorItemPackageContentDto {\n");
    
    sb.append("    vendorItemPackageId: ").append(toIndentedString(vendorItemPackageId)).append("\n");
    sb.append("    vendorItemPackageContentsId: ").append(toIndentedString(vendorItemPackageContentsId)).append("\n");
    sb.append("    vendorItemPackageContentDetails: ").append(toIndentedString(vendorItemPackageContentDetails)).append("\n");
    sb.append("    updId: ").append(toIndentedString(updId)).append("\n");
    sb.append("    contentsType: ").append(toIndentedString(contentsType)).append("\n");
    sb.append("    contentInfoType: ").append(toIndentedString(contentInfoType)).append("\n");
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

  public static VendorItemPackageContentDtoBuilder builder() {
    return new VendorItemPackageContentDtoBuilder();
  }

  public static class VendorItemPackageContentDtoBuilder {

    private Long vendorItemPackageId = null;
    private Long vendorItemPackageContentsId = null;
    private List<VendorItemPackageContentDetailDto> vendorItemPackageContentDetails = new ArrayList<VendorItemPackageContentDetailDto>();
    private String updId = null;
    private String contentsType = null;
    private String contentInfoType = null;
    

    VendorItemPackageContentDtoBuilder() {
    }

    /**
     **/
    public VendorItemPackageContentDtoBuilder vendorItemPackageId(Long vendorItemPackageId) {
      this.vendorItemPackageId = vendorItemPackageId;
      return this;
    }

    /**
     **/
    public VendorItemPackageContentDtoBuilder vendorItemPackageContentsId(Long vendorItemPackageContentsId) {
      this.vendorItemPackageContentsId = vendorItemPackageContentsId;
      return this;
    }

    /**
     **/
    public VendorItemPackageContentDtoBuilder vendorItemPackageContentDetails(List<VendorItemPackageContentDetailDto> vendorItemPackageContentDetails) {
      this.vendorItemPackageContentDetails = vendorItemPackageContentDetails;
      return this;
    }

    /**
     **/
    public VendorItemPackageContentDtoBuilder updId(String updId) {
      this.updId = updId;
      return this;
    }

    /**
     **/
    public VendorItemPackageContentDtoBuilder contentsType(String contentsType) {
      this.contentsType = contentsType;
      return this;
    }

    /**
     **/
    public VendorItemPackageContentDtoBuilder contentInfoType(String contentInfoType) {
      this.contentInfoType = contentInfoType;
      return this;
    }


    public VendorItemPackageContentDto build() {
      VendorItemPackageContentDto vendorItemPackageContentDto = new VendorItemPackageContentDto();
      vendorItemPackageContentDto.setVendorItemPackageId(this.vendorItemPackageId);
      vendorItemPackageContentDto.setVendorItemPackageContentsId(this.vendorItemPackageContentsId);
      vendorItemPackageContentDto.setVendorItemPackageContentDetails(this.vendorItemPackageContentDetails);
      vendorItemPackageContentDto.setUpdId(this.updId);
      vendorItemPackageContentDto.setContentsType(this.contentsType);
      vendorItemPackageContentDto.setContentInfoType(this.contentInfoType);
      return vendorItemPackageContentDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorItemPackageContentDtoBuilder {\n");
      
      sb.append("    vendorItemPackageId: ").append(toIndentedString(vendorItemPackageId)).append("\n");
      sb.append("    vendorItemPackageContentsId: ").append(toIndentedString(vendorItemPackageContentsId)).append("\n");
      sb.append("    vendorItemPackageContentDetails: ").append(toIndentedString(vendorItemPackageContentDetails)).append("\n");
      sb.append("    updId: ").append(toIndentedString(updId)).append("\n");
      sb.append("    contentsType: ").append(toIndentedString(contentsType)).append("\n");
      sb.append("    contentInfoType: ").append(toIndentedString(contentInfoType)).append("\n");
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

