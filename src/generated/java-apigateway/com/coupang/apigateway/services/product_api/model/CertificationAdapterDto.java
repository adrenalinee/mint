package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class CertificationAdapterDto   {
  
  private Boolean valid = null;
  private String popupUrl = null;
  private String name = null;
  private Boolean mandatoryCheck = null;
  private String imageUrl = null;
  private String description = null;
  private String certificationType = null;
  private Long certificationId = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("popupUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("popupUrl")
  public String getPopupUrl() {
    return popupUrl;
  }
  
  /**
   **/
  public void setPopupUrl(String popupUrl) {
    this.popupUrl = popupUrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("name")
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  public String getName() {
    return name;
  }
  
  /**
   **/
  public void setName(String name) {
    this.name = name;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("mandatoryCheck")
  @com.fasterxml.jackson.annotation.JsonProperty("mandatoryCheck")
  public Boolean getMandatoryCheck() {
    return mandatoryCheck;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isMandatoryCheck() {
    return mandatoryCheck == null ? false : mandatoryCheck;
  }
  
  /**
   **/
  public void setMandatoryCheck(Boolean mandatoryCheck) {
    this.mandatoryCheck = mandatoryCheck;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("imageUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("imageUrl")
  public String getImageUrl() {
    return imageUrl;
  }
  
  /**
   **/
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("description")
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  public String getDescription() {
    return description;
  }
  
  /**
   **/
  public void setDescription(String description) {
    this.description = description;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("certificationType")
  @com.fasterxml.jackson.annotation.JsonProperty("certificationType")
  public String getCertificationType() {
    return certificationType;
  }
  
  /**
   **/
  public void setCertificationType(String certificationType) {
    this.certificationType = certificationType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("certificationId")
  @com.fasterxml.jackson.annotation.JsonProperty("certificationId")
  public Long getCertificationId() {
    return certificationId;
  }
  
  /**
   **/
  public void setCertificationId(Long certificationId) {
    this.certificationId = certificationId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificationAdapterDto certificationAdapterDto = (CertificationAdapterDto) o;
    return Objects.equals(this.valid, certificationAdapterDto.valid) &&
        Objects.equals(this.popupUrl, certificationAdapterDto.popupUrl) &&
        Objects.equals(this.name, certificationAdapterDto.name) &&
        Objects.equals(this.mandatoryCheck, certificationAdapterDto.mandatoryCheck) &&
        Objects.equals(this.imageUrl, certificationAdapterDto.imageUrl) &&
        Objects.equals(this.description, certificationAdapterDto.description) &&
        Objects.equals(this.certificationType, certificationAdapterDto.certificationType) &&
        Objects.equals(this.certificationId, certificationAdapterDto.certificationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, popupUrl, name, mandatoryCheck, imageUrl, description, certificationType, certificationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificationAdapterDto {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    popupUrl: ").append(toIndentedString(popupUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mandatoryCheck: ").append(toIndentedString(mandatoryCheck)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    certificationType: ").append(toIndentedString(certificationType)).append("\n");
    sb.append("    certificationId: ").append(toIndentedString(certificationId)).append("\n");
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

  public static CertificationAdapterDtoBuilder builder() {
    return new CertificationAdapterDtoBuilder();
  }

  public static class CertificationAdapterDtoBuilder {

    private Boolean valid = null;
    private String popupUrl = null;
    private String name = null;
    private Boolean mandatoryCheck = null;
    private String imageUrl = null;
    private String description = null;
    private String certificationType = null;
    private Long certificationId = null;
    

    CertificationAdapterDtoBuilder() {
    }

    /**
     **/
    public CertificationAdapterDtoBuilder valid(Boolean valid) {
      this.valid = valid;
      return this;
    }

    /**
     **/
    public CertificationAdapterDtoBuilder popupUrl(String popupUrl) {
      this.popupUrl = popupUrl;
      return this;
    }

    /**
     **/
    public CertificationAdapterDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public CertificationAdapterDtoBuilder mandatoryCheck(Boolean mandatoryCheck) {
      this.mandatoryCheck = mandatoryCheck;
      return this;
    }

    /**
     **/
    public CertificationAdapterDtoBuilder imageUrl(String imageUrl) {
      this.imageUrl = imageUrl;
      return this;
    }

    /**
     **/
    public CertificationAdapterDtoBuilder description(String description) {
      this.description = description;
      return this;
    }

    /**
     **/
    public CertificationAdapterDtoBuilder certificationType(String certificationType) {
      this.certificationType = certificationType;
      return this;
    }

    /**
     **/
    public CertificationAdapterDtoBuilder certificationId(Long certificationId) {
      this.certificationId = certificationId;
      return this;
    }


    public CertificationAdapterDto build() {
      CertificationAdapterDto certificationAdapterDto = new CertificationAdapterDto();
      certificationAdapterDto.setValid(this.valid);
      certificationAdapterDto.setPopupUrl(this.popupUrl);
      certificationAdapterDto.setName(this.name);
      certificationAdapterDto.setMandatoryCheck(this.mandatoryCheck);
      certificationAdapterDto.setImageUrl(this.imageUrl);
      certificationAdapterDto.setDescription(this.description);
      certificationAdapterDto.setCertificationType(this.certificationType);
      certificationAdapterDto.setCertificationId(this.certificationId);
      return certificationAdapterDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CertificationAdapterDtoBuilder {\n");
      
      sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
      sb.append("    popupUrl: ").append(toIndentedString(popupUrl)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    mandatoryCheck: ").append(toIndentedString(mandatoryCheck)).append("\n");
      sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
      sb.append("    certificationType: ").append(toIndentedString(certificationType)).append("\n");
      sb.append("    certificationId: ").append(toIndentedString(certificationId)).append("\n");
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

