package com.coupang.apigateway.services.brand_shop.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.084+09:00")
public class BrandShopModule   {
  
  private String type = null;
  private Object entity = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("type")
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  public String getType() {
    return type;
  }
  
  /**
   **/
  public void setType(String type) {
    this.type = type;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("entity")
  @com.fasterxml.jackson.annotation.JsonProperty("entity")
  public Object getEntity() {
    return entity;
  }
  
  /**
   **/
  public void setEntity(Object entity) {
    this.entity = entity;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandShopModule brandShopModule = (BrandShopModule) o;
    return Objects.equals(this.type, brandShopModule.type) &&
        Objects.equals(this.entity, brandShopModule.entity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, entity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandShopModule {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
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

  public static BrandShopModuleBuilder builder() {
    return new BrandShopModuleBuilder();
  }

  public static class BrandShopModuleBuilder {

    private String type = null;
    private Object entity = null;
    

    BrandShopModuleBuilder() {
    }

    /**
     **/
    public BrandShopModuleBuilder type(String type) {
      this.type = type;
      return this;
    }

    /**
     **/
    public BrandShopModuleBuilder entity(Object entity) {
      this.entity = entity;
      return this;
    }


    public BrandShopModule build() {
      BrandShopModule brandShopModule = new BrandShopModule();
      brandShopModule.setType(this.type);
      brandShopModule.setEntity(this.entity);
      return brandShopModule;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BrandShopModuleBuilder {\n");
      
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
      sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
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

