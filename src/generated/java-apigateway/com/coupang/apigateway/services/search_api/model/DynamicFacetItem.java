package com.coupang.apigateway.services.search_api.model;

import java.util.Objects;



/**
 * Dynamic Filter Item
 **/

@io.swagger.annotations.ApiModel(description = "Dynamic Filter Item")
@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
public class DynamicFacetItem   {
  
  private String id = null;


  public enum FieldEnum {
    CATEGORY("CATEGORY"),
    LEAF_CATEGORY("LEAF_CATEGORY"),
    PRICE("PRICE"),
    DELIVERY("DELIVERY"),
    BRAND("BRAND"),
    ATTRIBUTE_TYPE("ATTRIBUTE_TYPE"),
    ATTRIBUTE("ATTRIBUTE");

    private String value;

    FieldEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private FieldEnum field = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("id")
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  public String getId() {
    return id;
  }
  
  /**
   **/
  public void setId(String id) {
    this.id = id;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("field")
  @com.fasterxml.jackson.annotation.JsonProperty("field")
  public FieldEnum getField() {
    return field;
  }
  
  /**
   **/
  public void setField(FieldEnum field) {
    this.field = field;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicFacetItem dynamicFacetItem = (DynamicFacetItem) o;
    return Objects.equals(this.id, dynamicFacetItem.id) &&
        Objects.equals(this.field, dynamicFacetItem.field);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, field);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicFacetItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
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

  public static DynamicFacetItemBuilder builder() {
    return new DynamicFacetItemBuilder();
  }

  public static class DynamicFacetItemBuilder {

    private String id = null;
    private FieldEnum field = null;
    

    DynamicFacetItemBuilder() {
    }

    /**
     **/
    public DynamicFacetItemBuilder id(String id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public DynamicFacetItemBuilder field(FieldEnum field) {
      this.field = field;
      return this;
    }


    public DynamicFacetItem build() {
      DynamicFacetItem dynamicFacetItem = new DynamicFacetItem();
      dynamicFacetItem.setId(this.id);
      dynamicFacetItem.setField(this.field);
      return dynamicFacetItem;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DynamicFacetItemBuilder {\n");
      
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    field: ").append(toIndentedString(field)).append("\n");
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

