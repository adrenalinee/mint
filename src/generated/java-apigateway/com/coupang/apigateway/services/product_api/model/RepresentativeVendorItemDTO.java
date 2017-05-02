package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class RepresentativeVendorItemDTO   {
  
  private Long weight = null;
  private Long vendorItemId = null;
  private Boolean valid = null;
  private Boolean representative = null;
  private Long productId = null;

  
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepresentativeVendorItemDTO representativeVendorItemDTO = (RepresentativeVendorItemDTO) o;
    return Objects.equals(this.weight, representativeVendorItemDTO.weight) &&
        Objects.equals(this.vendorItemId, representativeVendorItemDTO.vendorItemId) &&
        Objects.equals(this.valid, representativeVendorItemDTO.valid) &&
        Objects.equals(this.representative, representativeVendorItemDTO.representative) &&
        Objects.equals(this.productId, representativeVendorItemDTO.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weight, vendorItemId, valid, representative, productId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepresentativeVendorItemDTO {\n");
    
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    representative: ").append(toIndentedString(representative)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

  public static RepresentativeVendorItemDTOBuilder builder() {
    return new RepresentativeVendorItemDTOBuilder();
  }

  public static class RepresentativeVendorItemDTOBuilder {

    private Long weight = null;
    private Long vendorItemId = null;
    private Boolean valid = null;
    private Boolean representative = null;
    private Long productId = null;
    

    RepresentativeVendorItemDTOBuilder() {
    }

    /**
     **/
    public RepresentativeVendorItemDTOBuilder weight(Long weight) {
      this.weight = weight;
      return this;
    }

    /**
     **/
    public RepresentativeVendorItemDTOBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public RepresentativeVendorItemDTOBuilder valid(Boolean valid) {
      this.valid = valid;
      return this;
    }

    /**
     **/
    public RepresentativeVendorItemDTOBuilder representative(Boolean representative) {
      this.representative = representative;
      return this;
    }

    /**
     **/
    public RepresentativeVendorItemDTOBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }


    public RepresentativeVendorItemDTO build() {
      RepresentativeVendorItemDTO representativeVendorItemDTO = new RepresentativeVendorItemDTO();
      representativeVendorItemDTO.setWeight(this.weight);
      representativeVendorItemDTO.setVendorItemId(this.vendorItemId);
      representativeVendorItemDTO.setValid(this.valid);
      representativeVendorItemDTO.setRepresentative(this.representative);
      representativeVendorItemDTO.setProductId(this.productId);
      return representativeVendorItemDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RepresentativeVendorItemDTOBuilder {\n");
      
      sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
      sb.append("    representative: ").append(toIndentedString(representative)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

