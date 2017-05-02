package com.coupang.apigateway.services.rss.model;

import java.util.Objects;
import java.util.*;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.307+09:00")
public class VendorItemInfoDto   {
  
  private Map<String, List<Long>> vendorItemPackageIdsByType = new HashMap<String, List<Long>>();
  private Long vendorItemId = null;
  private Long representativePackageId = null;
  private Long representativeCoupangSrl = null;
  private List<Long> optionSrls = new ArrayList<Long>();
  private Map<String, Boolean> dualwriteStoppedMap = new HashMap<String, Boolean>();
  private Map<String, List<Long>> coupangSrlsByType = new HashMap<String, List<Long>>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemPackageIdsByType")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemPackageIdsByType")
  public Map<String, List<Long>> getVendorItemPackageIdsByType() {
    return vendorItemPackageIdsByType;
  }
  
  /**
   **/
  public void setVendorItemPackageIdsByType(Map<String, List<Long>> vendorItemPackageIdsByType) {
    this.vendorItemPackageIdsByType = vendorItemPackageIdsByType;
  }
  
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
  @org.codehaus.jackson.annotate.JsonProperty("representativePackageId")
  @com.fasterxml.jackson.annotation.JsonProperty("representativePackageId")
  public Long getRepresentativePackageId() {
    return representativePackageId;
  }
  
  /**
   **/
  public void setRepresentativePackageId(Long representativePackageId) {
    this.representativePackageId = representativePackageId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("representativeCoupangSrl")
  @com.fasterxml.jackson.annotation.JsonProperty("representativeCoupangSrl")
  public Long getRepresentativeCoupangSrl() {
    return representativeCoupangSrl;
  }
  
  /**
   **/
  public void setRepresentativeCoupangSrl(Long representativeCoupangSrl) {
    this.representativeCoupangSrl = representativeCoupangSrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("optionSrls")
  @com.fasterxml.jackson.annotation.JsonProperty("optionSrls")
  public List<Long> getOptionSrls() {
    return optionSrls;
  }
  
  /**
   **/
  public void setOptionSrls(List<Long> optionSrls) {
    this.optionSrls = optionSrls;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("dualwriteStoppedMap")
  @com.fasterxml.jackson.annotation.JsonProperty("dualwriteStoppedMap")
  public Map<String, Boolean> getDualwriteStoppedMap() {
    return dualwriteStoppedMap;
  }
  
  /**
   **/
  public void setDualwriteStoppedMap(Map<String, Boolean> dualwriteStoppedMap) {
    this.dualwriteStoppedMap = dualwriteStoppedMap;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("coupangSrlsByType")
  @com.fasterxml.jackson.annotation.JsonProperty("coupangSrlsByType")
  public Map<String, List<Long>> getCoupangSrlsByType() {
    return coupangSrlsByType;
  }
  
  /**
   **/
  public void setCoupangSrlsByType(Map<String, List<Long>> coupangSrlsByType) {
    this.coupangSrlsByType = coupangSrlsByType;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorItemInfoDto vendorItemInfoDto = (VendorItemInfoDto) o;
    return Objects.equals(this.vendorItemPackageIdsByType, vendorItemInfoDto.vendorItemPackageIdsByType) &&
        Objects.equals(this.vendorItemId, vendorItemInfoDto.vendorItemId) &&
        Objects.equals(this.representativePackageId, vendorItemInfoDto.representativePackageId) &&
        Objects.equals(this.representativeCoupangSrl, vendorItemInfoDto.representativeCoupangSrl) &&
        Objects.equals(this.optionSrls, vendorItemInfoDto.optionSrls) &&
        Objects.equals(this.dualwriteStoppedMap, vendorItemInfoDto.dualwriteStoppedMap) &&
        Objects.equals(this.coupangSrlsByType, vendorItemInfoDto.coupangSrlsByType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemPackageIdsByType, vendorItemId, representativePackageId, representativeCoupangSrl, optionSrls, dualwriteStoppedMap, coupangSrlsByType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorItemInfoDto {\n");
    
    sb.append("    vendorItemPackageIdsByType: ").append(toIndentedString(vendorItemPackageIdsByType)).append("\n");
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    representativePackageId: ").append(toIndentedString(representativePackageId)).append("\n");
    sb.append("    representativeCoupangSrl: ").append(toIndentedString(representativeCoupangSrl)).append("\n");
    sb.append("    optionSrls: ").append(toIndentedString(optionSrls)).append("\n");
    sb.append("    dualwriteStoppedMap: ").append(toIndentedString(dualwriteStoppedMap)).append("\n");
    sb.append("    coupangSrlsByType: ").append(toIndentedString(coupangSrlsByType)).append("\n");
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

  public static VendorItemInfoDtoBuilder builder() {
    return new VendorItemInfoDtoBuilder();
  }

  public static class VendorItemInfoDtoBuilder {

    private Map<String, List<Long>> vendorItemPackageIdsByType = new HashMap<String, List<Long>>();
    private Long vendorItemId = null;
    private Long representativePackageId = null;
    private Long representativeCoupangSrl = null;
    private List<Long> optionSrls = new ArrayList<Long>();
    private Map<String, Boolean> dualwriteStoppedMap = new HashMap<String, Boolean>();
    private Map<String, List<Long>> coupangSrlsByType = new HashMap<String, List<Long>>();
    

    VendorItemInfoDtoBuilder() {
    }

    /**
     **/
    public VendorItemInfoDtoBuilder vendorItemPackageIdsByType(Map<String, List<Long>> vendorItemPackageIdsByType) {
      this.vendorItemPackageIdsByType = vendorItemPackageIdsByType;
      return this;
    }

    /**
     **/
    public VendorItemInfoDtoBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public VendorItemInfoDtoBuilder representativePackageId(Long representativePackageId) {
      this.representativePackageId = representativePackageId;
      return this;
    }

    /**
     **/
    public VendorItemInfoDtoBuilder representativeCoupangSrl(Long representativeCoupangSrl) {
      this.representativeCoupangSrl = representativeCoupangSrl;
      return this;
    }

    /**
     **/
    public VendorItemInfoDtoBuilder optionSrls(List<Long> optionSrls) {
      this.optionSrls = optionSrls;
      return this;
    }

    /**
     **/
    public VendorItemInfoDtoBuilder dualwriteStoppedMap(Map<String, Boolean> dualwriteStoppedMap) {
      this.dualwriteStoppedMap = dualwriteStoppedMap;
      return this;
    }

    /**
     **/
    public VendorItemInfoDtoBuilder coupangSrlsByType(Map<String, List<Long>> coupangSrlsByType) {
      this.coupangSrlsByType = coupangSrlsByType;
      return this;
    }


    public VendorItemInfoDto build() {
      VendorItemInfoDto vendorItemInfoDto = new VendorItemInfoDto();
      vendorItemInfoDto.setVendorItemPackageIdsByType(this.vendorItemPackageIdsByType);
      vendorItemInfoDto.setVendorItemId(this.vendorItemId);
      vendorItemInfoDto.setRepresentativePackageId(this.representativePackageId);
      vendorItemInfoDto.setRepresentativeCoupangSrl(this.representativeCoupangSrl);
      vendorItemInfoDto.setOptionSrls(this.optionSrls);
      vendorItemInfoDto.setDualwriteStoppedMap(this.dualwriteStoppedMap);
      vendorItemInfoDto.setCoupangSrlsByType(this.coupangSrlsByType);
      return vendorItemInfoDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorItemInfoDtoBuilder {\n");
      
      sb.append("    vendorItemPackageIdsByType: ").append(toIndentedString(vendorItemPackageIdsByType)).append("\n");
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    representativePackageId: ").append(toIndentedString(representativePackageId)).append("\n");
      sb.append("    representativeCoupangSrl: ").append(toIndentedString(representativeCoupangSrl)).append("\n");
      sb.append("    optionSrls: ").append(toIndentedString(optionSrls)).append("\n");
      sb.append("    dualwriteStoppedMap: ").append(toIndentedString(dualwriteStoppedMap)).append("\n");
      sb.append("    coupangSrlsByType: ").append(toIndentedString(coupangSrlsByType)).append("\n");
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

