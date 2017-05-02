package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_api.model.CertificationAdapterDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class VendorItemCertificationAdapterDto   {
  
  private String vendorItemName = null;
  private Long vendorItemId = null;
  private Long vendorItemCertificationId = null;
  private Boolean valid = null;
  private String certificationRequiredType = null;
  private String certificationNo = null;
  private CertificationAdapterDto certification = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemName")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemName")
  public String getVendorItemName() {
    return vendorItemName;
  }
  
  /**
   **/
  public void setVendorItemName(String vendorItemName) {
    this.vendorItemName = vendorItemName;
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
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemCertificationId")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemCertificationId")
  public Long getVendorItemCertificationId() {
    return vendorItemCertificationId;
  }
  
  /**
   **/
  public void setVendorItemCertificationId(Long vendorItemCertificationId) {
    this.vendorItemCertificationId = vendorItemCertificationId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("valid")
  @com.fasterxml.jackson.annotation.JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isValid() {
    return valid == null ? false : valid;
  }
  
  /**
   **/
  public void setValid(Boolean valid) {
    this.valid = valid;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("certificationRequiredType")
  @com.fasterxml.jackson.annotation.JsonProperty("certificationRequiredType")
  public String getCertificationRequiredType() {
    return certificationRequiredType;
  }
  
  /**
   **/
  public void setCertificationRequiredType(String certificationRequiredType) {
    this.certificationRequiredType = certificationRequiredType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("certificationNo")
  @com.fasterxml.jackson.annotation.JsonProperty("certificationNo")
  public String getCertificationNo() {
    return certificationNo;
  }
  
  /**
   **/
  public void setCertificationNo(String certificationNo) {
    this.certificationNo = certificationNo;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("certification")
  @com.fasterxml.jackson.annotation.JsonProperty("certification")
  public CertificationAdapterDto getCertification() {
    return certification;
  }
  
  /**
   **/
  public void setCertification(CertificationAdapterDto certification) {
    this.certification = certification;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorItemCertificationAdapterDto vendorItemCertificationAdapterDto = (VendorItemCertificationAdapterDto) o;
    return Objects.equals(this.vendorItemName, vendorItemCertificationAdapterDto.vendorItemName) &&
        Objects.equals(this.vendorItemId, vendorItemCertificationAdapterDto.vendorItemId) &&
        Objects.equals(this.vendorItemCertificationId, vendorItemCertificationAdapterDto.vendorItemCertificationId) &&
        Objects.equals(this.valid, vendorItemCertificationAdapterDto.valid) &&
        Objects.equals(this.certificationRequiredType, vendorItemCertificationAdapterDto.certificationRequiredType) &&
        Objects.equals(this.certificationNo, vendorItemCertificationAdapterDto.certificationNo) &&
        Objects.equals(this.certification, vendorItemCertificationAdapterDto.certification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemName, vendorItemId, vendorItemCertificationId, valid, certificationRequiredType, certificationNo, certification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorItemCertificationAdapterDto {\n");
    
    sb.append("    vendorItemName: ").append(toIndentedString(vendorItemName)).append("\n");
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    vendorItemCertificationId: ").append(toIndentedString(vendorItemCertificationId)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    certificationRequiredType: ").append(toIndentedString(certificationRequiredType)).append("\n");
    sb.append("    certificationNo: ").append(toIndentedString(certificationNo)).append("\n");
    sb.append("    certification: ").append(toIndentedString(certification)).append("\n");
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

  public static VendorItemCertificationAdapterDtoBuilder builder() {
    return new VendorItemCertificationAdapterDtoBuilder();
  }

  public static class VendorItemCertificationAdapterDtoBuilder {

    private String vendorItemName = null;
    private Long vendorItemId = null;
    private Long vendorItemCertificationId = null;
    private Boolean valid = null;
    private String certificationRequiredType = null;
    private String certificationNo = null;
    private CertificationAdapterDto certification = null;
    

    VendorItemCertificationAdapterDtoBuilder() {
    }

    /**
     **/
    public VendorItemCertificationAdapterDtoBuilder vendorItemName(String vendorItemName) {
      this.vendorItemName = vendorItemName;
      return this;
    }

    /**
     **/
    public VendorItemCertificationAdapterDtoBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public VendorItemCertificationAdapterDtoBuilder vendorItemCertificationId(Long vendorItemCertificationId) {
      this.vendorItemCertificationId = vendorItemCertificationId;
      return this;
    }

    /**
     **/
    public VendorItemCertificationAdapterDtoBuilder valid(Boolean valid) {
      this.valid = valid;
      return this;
    }

    /**
     **/
    public VendorItemCertificationAdapterDtoBuilder certificationRequiredType(String certificationRequiredType) {
      this.certificationRequiredType = certificationRequiredType;
      return this;
    }

    /**
     **/
    public VendorItemCertificationAdapterDtoBuilder certificationNo(String certificationNo) {
      this.certificationNo = certificationNo;
      return this;
    }

    /**
     **/
    public VendorItemCertificationAdapterDtoBuilder certification(CertificationAdapterDto certification) {
      this.certification = certification;
      return this;
    }


    public VendorItemCertificationAdapterDto build() {
      VendorItemCertificationAdapterDto vendorItemCertificationAdapterDto = new VendorItemCertificationAdapterDto();
      vendorItemCertificationAdapterDto.setVendorItemName(this.vendorItemName);
      vendorItemCertificationAdapterDto.setVendorItemId(this.vendorItemId);
      vendorItemCertificationAdapterDto.setVendorItemCertificationId(this.vendorItemCertificationId);
      vendorItemCertificationAdapterDto.setValid(this.valid);
      vendorItemCertificationAdapterDto.setCertificationRequiredType(this.certificationRequiredType);
      vendorItemCertificationAdapterDto.setCertificationNo(this.certificationNo);
      vendorItemCertificationAdapterDto.setCertification(this.certification);
      return vendorItemCertificationAdapterDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorItemCertificationAdapterDtoBuilder {\n");
      
      sb.append("    vendorItemName: ").append(toIndentedString(vendorItemName)).append("\n");
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    vendorItemCertificationId: ").append(toIndentedString(vendorItemCertificationId)).append("\n");
      sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
      sb.append("    certificationRequiredType: ").append(toIndentedString(certificationRequiredType)).append("\n");
      sb.append("    certificationNo: ").append(toIndentedString(certificationNo)).append("\n");
      sb.append("    certification: ").append(toIndentedString(certification)).append("\n");
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

