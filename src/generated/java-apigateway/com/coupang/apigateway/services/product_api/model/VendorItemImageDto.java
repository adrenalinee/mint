package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_api.model.VendorItemImageInfo;
import java.util.*;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class VendorItemImageDto   {
  
  private Long vendorItemId = null;
  private Map<String, VendorItemImageInfo> representationSquareImageMaps = new HashMap<String, VendorItemImageInfo>();
  private Map<String, VendorItemImageInfo> representationOblongImageMaps = new HashMap<String, VendorItemImageInfo>();
  private VendorItemImageInfo originalRepresentationSquareImageInfo = null;
  private VendorItemImageInfo originalRepresentationOblongImageInfo = null;
  private List<VendorItemImageInfo> originalDetailImageInfos = new ArrayList<VendorItemImageInfo>();
  private Map<String, List<VendorItemImageInfo>> detailImageMaps = new HashMap<String, List<VendorItemImageInfo>>();

  
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
  @org.codehaus.jackson.annotate.JsonProperty("representationSquareImageMaps")
  @com.fasterxml.jackson.annotation.JsonProperty("representationSquareImageMaps")
  public Map<String, VendorItemImageInfo> getRepresentationSquareImageMaps() {
    return representationSquareImageMaps;
  }
  
  /**
   **/
  public void setRepresentationSquareImageMaps(Map<String, VendorItemImageInfo> representationSquareImageMaps) {
    this.representationSquareImageMaps = representationSquareImageMaps;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("representationOblongImageMaps")
  @com.fasterxml.jackson.annotation.JsonProperty("representationOblongImageMaps")
  public Map<String, VendorItemImageInfo> getRepresentationOblongImageMaps() {
    return representationOblongImageMaps;
  }
  
  /**
   **/
  public void setRepresentationOblongImageMaps(Map<String, VendorItemImageInfo> representationOblongImageMaps) {
    this.representationOblongImageMaps = representationOblongImageMaps;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("originalRepresentationSquareImageInfo")
  @com.fasterxml.jackson.annotation.JsonProperty("originalRepresentationSquareImageInfo")
  public VendorItemImageInfo getOriginalRepresentationSquareImageInfo() {
    return originalRepresentationSquareImageInfo;
  }
  
  /**
   **/
  public void setOriginalRepresentationSquareImageInfo(VendorItemImageInfo originalRepresentationSquareImageInfo) {
    this.originalRepresentationSquareImageInfo = originalRepresentationSquareImageInfo;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("originalRepresentationOblongImageInfo")
  @com.fasterxml.jackson.annotation.JsonProperty("originalRepresentationOblongImageInfo")
  public VendorItemImageInfo getOriginalRepresentationOblongImageInfo() {
    return originalRepresentationOblongImageInfo;
  }
  
  /**
   **/
  public void setOriginalRepresentationOblongImageInfo(VendorItemImageInfo originalRepresentationOblongImageInfo) {
    this.originalRepresentationOblongImageInfo = originalRepresentationOblongImageInfo;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("originalDetailImageInfos")
  @com.fasterxml.jackson.annotation.JsonProperty("originalDetailImageInfos")
  public List<VendorItemImageInfo> getOriginalDetailImageInfos() {
    return originalDetailImageInfos;
  }
  
  /**
   **/
  public void setOriginalDetailImageInfos(List<VendorItemImageInfo> originalDetailImageInfos) {
    this.originalDetailImageInfos = originalDetailImageInfos;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("detailImageMaps")
  @com.fasterxml.jackson.annotation.JsonProperty("detailImageMaps")
  public Map<String, List<VendorItemImageInfo>> getDetailImageMaps() {
    return detailImageMaps;
  }
  
  /**
   **/
  public void setDetailImageMaps(Map<String, List<VendorItemImageInfo>> detailImageMaps) {
    this.detailImageMaps = detailImageMaps;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorItemImageDto vendorItemImageDto = (VendorItemImageDto) o;
    return Objects.equals(this.vendorItemId, vendorItemImageDto.vendorItemId) &&
        Objects.equals(this.representationSquareImageMaps, vendorItemImageDto.representationSquareImageMaps) &&
        Objects.equals(this.representationOblongImageMaps, vendorItemImageDto.representationOblongImageMaps) &&
        Objects.equals(this.originalRepresentationSquareImageInfo, vendorItemImageDto.originalRepresentationSquareImageInfo) &&
        Objects.equals(this.originalRepresentationOblongImageInfo, vendorItemImageDto.originalRepresentationOblongImageInfo) &&
        Objects.equals(this.originalDetailImageInfos, vendorItemImageDto.originalDetailImageInfos) &&
        Objects.equals(this.detailImageMaps, vendorItemImageDto.detailImageMaps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemId, representationSquareImageMaps, representationOblongImageMaps, originalRepresentationSquareImageInfo, originalRepresentationOblongImageInfo, originalDetailImageInfos, detailImageMaps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorItemImageDto {\n");
    
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    representationSquareImageMaps: ").append(toIndentedString(representationSquareImageMaps)).append("\n");
    sb.append("    representationOblongImageMaps: ").append(toIndentedString(representationOblongImageMaps)).append("\n");
    sb.append("    originalRepresentationSquareImageInfo: ").append(toIndentedString(originalRepresentationSquareImageInfo)).append("\n");
    sb.append("    originalRepresentationOblongImageInfo: ").append(toIndentedString(originalRepresentationOblongImageInfo)).append("\n");
    sb.append("    originalDetailImageInfos: ").append(toIndentedString(originalDetailImageInfos)).append("\n");
    sb.append("    detailImageMaps: ").append(toIndentedString(detailImageMaps)).append("\n");
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

  public static VendorItemImageDtoBuilder builder() {
    return new VendorItemImageDtoBuilder();
  }

  public static class VendorItemImageDtoBuilder {

    private Long vendorItemId = null;
    private Map<String, VendorItemImageInfo> representationSquareImageMaps = new HashMap<String, VendorItemImageInfo>();
    private Map<String, VendorItemImageInfo> representationOblongImageMaps = new HashMap<String, VendorItemImageInfo>();
    private VendorItemImageInfo originalRepresentationSquareImageInfo = null;
    private VendorItemImageInfo originalRepresentationOblongImageInfo = null;
    private List<VendorItemImageInfo> originalDetailImageInfos = new ArrayList<VendorItemImageInfo>();
    private Map<String, List<VendorItemImageInfo>> detailImageMaps = new HashMap<String, List<VendorItemImageInfo>>();
    

    VendorItemImageDtoBuilder() {
    }

    /**
     **/
    public VendorItemImageDtoBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public VendorItemImageDtoBuilder representationSquareImageMaps(Map<String, VendorItemImageInfo> representationSquareImageMaps) {
      this.representationSquareImageMaps = representationSquareImageMaps;
      return this;
    }

    /**
     **/
    public VendorItemImageDtoBuilder representationOblongImageMaps(Map<String, VendorItemImageInfo> representationOblongImageMaps) {
      this.representationOblongImageMaps = representationOblongImageMaps;
      return this;
    }

    /**
     **/
    public VendorItemImageDtoBuilder originalRepresentationSquareImageInfo(VendorItemImageInfo originalRepresentationSquareImageInfo) {
      this.originalRepresentationSquareImageInfo = originalRepresentationSquareImageInfo;
      return this;
    }

    /**
     **/
    public VendorItemImageDtoBuilder originalRepresentationOblongImageInfo(VendorItemImageInfo originalRepresentationOblongImageInfo) {
      this.originalRepresentationOblongImageInfo = originalRepresentationOblongImageInfo;
      return this;
    }

    /**
     **/
    public VendorItemImageDtoBuilder originalDetailImageInfos(List<VendorItemImageInfo> originalDetailImageInfos) {
      this.originalDetailImageInfos = originalDetailImageInfos;
      return this;
    }

    /**
     **/
    public VendorItemImageDtoBuilder detailImageMaps(Map<String, List<VendorItemImageInfo>> detailImageMaps) {
      this.detailImageMaps = detailImageMaps;
      return this;
    }


    public VendorItemImageDto build() {
      VendorItemImageDto vendorItemImageDto = new VendorItemImageDto();
      vendorItemImageDto.setVendorItemId(this.vendorItemId);
      vendorItemImageDto.setRepresentationSquareImageMaps(this.representationSquareImageMaps);
      vendorItemImageDto.setRepresentationOblongImageMaps(this.representationOblongImageMaps);
      vendorItemImageDto.setOriginalRepresentationSquareImageInfo(this.originalRepresentationSquareImageInfo);
      vendorItemImageDto.setOriginalRepresentationOblongImageInfo(this.originalRepresentationOblongImageInfo);
      vendorItemImageDto.setOriginalDetailImageInfos(this.originalDetailImageInfos);
      vendorItemImageDto.setDetailImageMaps(this.detailImageMaps);
      return vendorItemImageDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorItemImageDtoBuilder {\n");
      
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    representationSquareImageMaps: ").append(toIndentedString(representationSquareImageMaps)).append("\n");
      sb.append("    representationOblongImageMaps: ").append(toIndentedString(representationOblongImageMaps)).append("\n");
      sb.append("    originalRepresentationSquareImageInfo: ").append(toIndentedString(originalRepresentationSquareImageInfo)).append("\n");
      sb.append("    originalRepresentationOblongImageInfo: ").append(toIndentedString(originalRepresentationOblongImageInfo)).append("\n");
      sb.append("    originalDetailImageInfos: ").append(toIndentedString(originalDetailImageInfos)).append("\n");
      sb.append("    detailImageMaps: ").append(toIndentedString(detailImageMaps)).append("\n");
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

