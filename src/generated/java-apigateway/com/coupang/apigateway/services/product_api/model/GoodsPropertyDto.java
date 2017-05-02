package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class GoodsPropertyDto   {
  
  private String propertyKey = null;
  private Long goodsPropertyId = null;
  private Long goodsId = null;
  private String defaultValue = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("propertyKey")
  @com.fasterxml.jackson.annotation.JsonProperty("propertyKey")
  public String getPropertyKey() {
    return propertyKey;
  }
  
  /**
   **/
  public void setPropertyKey(String propertyKey) {
    this.propertyKey = propertyKey;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("goodsPropertyId")
  @com.fasterxml.jackson.annotation.JsonProperty("goodsPropertyId")
  public Long getGoodsPropertyId() {
    return goodsPropertyId;
  }
  
  /**
   **/
  public void setGoodsPropertyId(Long goodsPropertyId) {
    this.goodsPropertyId = goodsPropertyId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("goodsId")
  @com.fasterxml.jackson.annotation.JsonProperty("goodsId")
  public Long getGoodsId() {
    return goodsId;
  }
  
  /**
   **/
  public void setGoodsId(Long goodsId) {
    this.goodsId = goodsId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("defaultValue")
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
  public String getDefaultValue() {
    return defaultValue;
  }
  
  /**
   **/
  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoodsPropertyDto goodsPropertyDto = (GoodsPropertyDto) o;
    return Objects.equals(this.propertyKey, goodsPropertyDto.propertyKey) &&
        Objects.equals(this.goodsPropertyId, goodsPropertyDto.goodsPropertyId) &&
        Objects.equals(this.goodsId, goodsPropertyDto.goodsId) &&
        Objects.equals(this.defaultValue, goodsPropertyDto.defaultValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyKey, goodsPropertyId, goodsId, defaultValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsPropertyDto {\n");
    
    sb.append("    propertyKey: ").append(toIndentedString(propertyKey)).append("\n");
    sb.append("    goodsPropertyId: ").append(toIndentedString(goodsPropertyId)).append("\n");
    sb.append("    goodsId: ").append(toIndentedString(goodsId)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
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

  public static GoodsPropertyDtoBuilder builder() {
    return new GoodsPropertyDtoBuilder();
  }

  public static class GoodsPropertyDtoBuilder {

    private String propertyKey = null;
    private Long goodsPropertyId = null;
    private Long goodsId = null;
    private String defaultValue = null;
    

    GoodsPropertyDtoBuilder() {
    }

    /**
     **/
    public GoodsPropertyDtoBuilder propertyKey(String propertyKey) {
      this.propertyKey = propertyKey;
      return this;
    }

    /**
     **/
    public GoodsPropertyDtoBuilder goodsPropertyId(Long goodsPropertyId) {
      this.goodsPropertyId = goodsPropertyId;
      return this;
    }

    /**
     **/
    public GoodsPropertyDtoBuilder goodsId(Long goodsId) {
      this.goodsId = goodsId;
      return this;
    }

    /**
     **/
    public GoodsPropertyDtoBuilder defaultValue(String defaultValue) {
      this.defaultValue = defaultValue;
      return this;
    }


    public GoodsPropertyDto build() {
      GoodsPropertyDto goodsPropertyDto = new GoodsPropertyDto();
      goodsPropertyDto.setPropertyKey(this.propertyKey);
      goodsPropertyDto.setGoodsPropertyId(this.goodsPropertyId);
      goodsPropertyDto.setGoodsId(this.goodsId);
      goodsPropertyDto.setDefaultValue(this.defaultValue);
      return goodsPropertyDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class GoodsPropertyDtoBuilder {\n");
      
      sb.append("    propertyKey: ").append(toIndentedString(propertyKey)).append("\n");
      sb.append("    goodsPropertyId: ").append(toIndentedString(goodsPropertyId)).append("\n");
      sb.append("    goodsId: ").append(toIndentedString(goodsId)).append("\n");
      sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
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

