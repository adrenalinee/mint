package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class VendorItemMappingDTO   {
  
  private Long weight = null;
  private Long vendorItemPackageId = null;
  private Long vendorItemId = null;
  private Boolean valid = null;
  private String updId = null;
  private Boolean representative = null;
  private String regId = null;
  private Long productId = null;
  private java.math.BigDecimal originalPrice = null;
  private Boolean optionMustBought = null;
  private String name = null;
  private Boolean isUpdate = null;
  private String description = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("weight")
  @com.fasterxml.jackson.annotation.JsonProperty("weight")
  public Long getWeight() {
    return weight;
  }
  
  /**
   **/
  public void setWeight(Long weight) {
    this.weight = weight;
  }
  
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
  @org.codehaus.jackson.annotate.JsonProperty("representative")
  @com.fasterxml.jackson.annotation.JsonProperty("representative")
  public Boolean getRepresentative() {
    return representative;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isRepresentative() {
    return representative == null ? false : representative;
  }
  
  /**
   **/
  public void setRepresentative(Boolean representative) {
    this.representative = representative;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("regId")
  @com.fasterxml.jackson.annotation.JsonProperty("regId")
  public String getRegId() {
    return regId;
  }
  
  /**
   **/
  public void setRegId(String regId) {
    this.regId = regId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("productId")
  @com.fasterxml.jackson.annotation.JsonProperty("productId")
  public Long getProductId() {
    return productId;
  }
  
  /**
   **/
  public void setProductId(Long productId) {
    this.productId = productId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("originalPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("originalPrice")
  public java.math.BigDecimal getOriginalPrice() {
    return originalPrice;
  }
  
  /**
   **/
  public void setOriginalPrice(java.math.BigDecimal originalPrice) {
    this.originalPrice = originalPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("optionMustBought")
  @com.fasterxml.jackson.annotation.JsonProperty("optionMustBought")
  public Boolean getOptionMustBought() {
    return optionMustBought;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isOptionMustBought() {
    return optionMustBought == null ? false : optionMustBought;
  }
  
  /**
   **/
  public void setOptionMustBought(Boolean optionMustBought) {
    this.optionMustBought = optionMustBought;
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
  @org.codehaus.jackson.annotate.JsonProperty("isUpdate")
  @com.fasterxml.jackson.annotation.JsonProperty("isUpdate")
  public Boolean getIsUpdate() {
    return isUpdate;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isIsUpdate() {
    return isUpdate == null ? false : isUpdate;
  }
  
  /**
   **/
  public void setIsUpdate(Boolean isUpdate) {
    this.isUpdate = isUpdate;
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorItemMappingDTO vendorItemMappingDTO = (VendorItemMappingDTO) o;
    return Objects.equals(this.weight, vendorItemMappingDTO.weight) &&
        Objects.equals(this.vendorItemPackageId, vendorItemMappingDTO.vendorItemPackageId) &&
        Objects.equals(this.vendorItemId, vendorItemMappingDTO.vendorItemId) &&
        Objects.equals(this.valid, vendorItemMappingDTO.valid) &&
        Objects.equals(this.updId, vendorItemMappingDTO.updId) &&
        Objects.equals(this.representative, vendorItemMappingDTO.representative) &&
        Objects.equals(this.regId, vendorItemMappingDTO.regId) &&
        Objects.equals(this.productId, vendorItemMappingDTO.productId) &&
        Objects.equals(this.originalPrice, vendorItemMappingDTO.originalPrice) &&
        Objects.equals(this.optionMustBought, vendorItemMappingDTO.optionMustBought) &&
        Objects.equals(this.name, vendorItemMappingDTO.name) &&
        Objects.equals(this.isUpdate, vendorItemMappingDTO.isUpdate) &&
        Objects.equals(this.description, vendorItemMappingDTO.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weight, vendorItemPackageId, vendorItemId, valid, updId, representative, regId, productId, originalPrice, optionMustBought, name, isUpdate, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorItemMappingDTO {\n");
    
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    vendorItemPackageId: ").append(toIndentedString(vendorItemPackageId)).append("\n");
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    updId: ").append(toIndentedString(updId)).append("\n");
    sb.append("    representative: ").append(toIndentedString(representative)).append("\n");
    sb.append("    regId: ").append(toIndentedString(regId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    optionMustBought: ").append(toIndentedString(optionMustBought)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isUpdate: ").append(toIndentedString(isUpdate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

  public static VendorItemMappingDTOBuilder builder() {
    return new VendorItemMappingDTOBuilder();
  }

  public static class VendorItemMappingDTOBuilder {

    private Long weight = null;
    private Long vendorItemPackageId = null;
    private Long vendorItemId = null;
    private Boolean valid = null;
    private String updId = null;
    private Boolean representative = null;
    private String regId = null;
    private Long productId = null;
    private java.math.BigDecimal originalPrice = null;
    private Boolean optionMustBought = null;
    private String name = null;
    private Boolean isUpdate = null;
    private String description = null;
    

    VendorItemMappingDTOBuilder() {
    }

    /**
     **/
    public VendorItemMappingDTOBuilder weight(Long weight) {
      this.weight = weight;
      return this;
    }

    /**
     **/
    public VendorItemMappingDTOBuilder vendorItemPackageId(Long vendorItemPackageId) {
      this.vendorItemPackageId = vendorItemPackageId;
      return this;
    }

    /**
     **/
    public VendorItemMappingDTOBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public VendorItemMappingDTOBuilder valid(Boolean valid) {
      this.valid = valid;
      return this;
    }

    /**
     **/
    public VendorItemMappingDTOBuilder updId(String updId) {
      this.updId = updId;
      return this;
    }

    /**
     **/
    public VendorItemMappingDTOBuilder representative(Boolean representative) {
      this.representative = representative;
      return this;
    }

    /**
     **/
    public VendorItemMappingDTOBuilder regId(String regId) {
      this.regId = regId;
      return this;
    }

    /**
     **/
    public VendorItemMappingDTOBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public VendorItemMappingDTOBuilder originalPrice(java.math.BigDecimal originalPrice) {
      this.originalPrice = originalPrice;
      return this;
    }

    /**
     **/
    public VendorItemMappingDTOBuilder optionMustBought(Boolean optionMustBought) {
      this.optionMustBought = optionMustBought;
      return this;
    }

    /**
     **/
    public VendorItemMappingDTOBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public VendorItemMappingDTOBuilder isUpdate(Boolean isUpdate) {
      this.isUpdate = isUpdate;
      return this;
    }

    /**
     **/
    public VendorItemMappingDTOBuilder description(String description) {
      this.description = description;
      return this;
    }


    public VendorItemMappingDTO build() {
      VendorItemMappingDTO vendorItemMappingDTO = new VendorItemMappingDTO();
      vendorItemMappingDTO.setWeight(this.weight);
      vendorItemMappingDTO.setVendorItemPackageId(this.vendorItemPackageId);
      vendorItemMappingDTO.setVendorItemId(this.vendorItemId);
      vendorItemMappingDTO.setValid(this.valid);
      vendorItemMappingDTO.setUpdId(this.updId);
      vendorItemMappingDTO.setRepresentative(this.representative);
      vendorItemMappingDTO.setRegId(this.regId);
      vendorItemMappingDTO.setProductId(this.productId);
      vendorItemMappingDTO.setOriginalPrice(this.originalPrice);
      vendorItemMappingDTO.setOptionMustBought(this.optionMustBought);
      vendorItemMappingDTO.setName(this.name);
      vendorItemMappingDTO.setIsUpdate(this.isUpdate);
      vendorItemMappingDTO.setDescription(this.description);
      return vendorItemMappingDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorItemMappingDTOBuilder {\n");
      
      sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
      sb.append("    vendorItemPackageId: ").append(toIndentedString(vendorItemPackageId)).append("\n");
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
      sb.append("    updId: ").append(toIndentedString(updId)).append("\n");
      sb.append("    representative: ").append(toIndentedString(representative)).append("\n");
      sb.append("    regId: ").append(toIndentedString(regId)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
      sb.append("    optionMustBought: ").append(toIndentedString(optionMustBought)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    isUpdate: ").append(toIndentedString(isUpdate)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

