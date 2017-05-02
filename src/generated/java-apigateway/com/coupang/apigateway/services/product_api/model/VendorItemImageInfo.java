package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class VendorItemImageInfo   {
  
  private String vendorItemImageType = null;
  private Long vendorItemImageId = null;
  private Long vendorItemId = null;
  private String _path = null;
  private String locale = null;
  private Integer imageOrder = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemImageType")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemImageType")
  public String getVendorItemImageType() {
    return vendorItemImageType;
  }
  
  /**
   **/
  public void setVendorItemImageType(String vendorItemImageType) {
    this.vendorItemImageType = vendorItemImageType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemImageId")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemImageId")
  public Long getVendorItemImageId() {
    return vendorItemImageId;
  }
  
  /**
   **/
  public void setVendorItemImageId(Long vendorItemImageId) {
    this.vendorItemImageId = vendorItemImageId;
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
  @org.codehaus.jackson.annotate.JsonProperty("path")
  @com.fasterxml.jackson.annotation.JsonProperty("path")
  public String getPath() {
    return _path;
  }
  
  /**
   **/
  public void setPath(String _path) {
    this._path = _path;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("locale")
  @com.fasterxml.jackson.annotation.JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  
  /**
   **/
  public void setLocale(String locale) {
    this.locale = locale;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("imageOrder")
  @com.fasterxml.jackson.annotation.JsonProperty("imageOrder")
  public Integer getImageOrder() {
    return imageOrder;
  }
  
  /**
   **/
  public void setImageOrder(Integer imageOrder) {
    this.imageOrder = imageOrder;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorItemImageInfo vendorItemImageInfo = (VendorItemImageInfo) o;
    return Objects.equals(this.vendorItemImageType, vendorItemImageInfo.vendorItemImageType) &&
        Objects.equals(this.vendorItemImageId, vendorItemImageInfo.vendorItemImageId) &&
        Objects.equals(this.vendorItemId, vendorItemImageInfo.vendorItemId) &&
        Objects.equals(this._path, vendorItemImageInfo._path) &&
        Objects.equals(this.locale, vendorItemImageInfo.locale) &&
        Objects.equals(this.imageOrder, vendorItemImageInfo.imageOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemImageType, vendorItemImageId, vendorItemId, _path, locale, imageOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorItemImageInfo {\n");
    
    sb.append("    vendorItemImageType: ").append(toIndentedString(vendorItemImageType)).append("\n");
    sb.append("    vendorItemImageId: ").append(toIndentedString(vendorItemImageId)).append("\n");
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    _path: ").append(toIndentedString(_path)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    imageOrder: ").append(toIndentedString(imageOrder)).append("\n");
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

  public static VendorItemImageInfoBuilder builder() {
    return new VendorItemImageInfoBuilder();
  }

  public static class VendorItemImageInfoBuilder {

    private String vendorItemImageType = null;
    private Long vendorItemImageId = null;
    private Long vendorItemId = null;
    private String _path = null;
    private String locale = null;
    private Integer imageOrder = null;
    

    VendorItemImageInfoBuilder() {
    }

    /**
     **/
    public VendorItemImageInfoBuilder vendorItemImageType(String vendorItemImageType) {
      this.vendorItemImageType = vendorItemImageType;
      return this;
    }

    /**
     **/
    public VendorItemImageInfoBuilder vendorItemImageId(Long vendorItemImageId) {
      this.vendorItemImageId = vendorItemImageId;
      return this;
    }

    /**
     **/
    public VendorItemImageInfoBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public VendorItemImageInfoBuilder _path(String _path) {
      this._path = _path;
      return this;
    }

    /**
     **/
    public VendorItemImageInfoBuilder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     **/
    public VendorItemImageInfoBuilder imageOrder(Integer imageOrder) {
      this.imageOrder = imageOrder;
      return this;
    }


    public VendorItemImageInfo build() {
      VendorItemImageInfo vendorItemImageInfo = new VendorItemImageInfo();
      vendorItemImageInfo.setVendorItemImageType(this.vendorItemImageType);
      vendorItemImageInfo.setVendorItemImageId(this.vendorItemImageId);
      vendorItemImageInfo.setVendorItemId(this.vendorItemId);
      vendorItemImageInfo.setPath(this._path);
      vendorItemImageInfo.setLocale(this.locale);
      vendorItemImageInfo.setImageOrder(this.imageOrder);
      return vendorItemImageInfo;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorItemImageInfoBuilder {\n");
      
      sb.append("    vendorItemImageType: ").append(toIndentedString(vendorItemImageType)).append("\n");
      sb.append("    vendorItemImageId: ").append(toIndentedString(vendorItemImageId)).append("\n");
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    _path: ").append(toIndentedString(_path)).append("\n");
      sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
      sb.append("    imageOrder: ").append(toIndentedString(imageOrder)).append("\n");
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

