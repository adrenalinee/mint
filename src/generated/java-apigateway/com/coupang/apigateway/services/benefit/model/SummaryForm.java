package com.coupang.apigateway.services.benefit.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.660+09:00")
public class SummaryForm   {
  
  private String componentId = null;


  public enum ComponentTypeEnum {
    CART("CART"),
    DEAL("DEAL"),
    VENDOR_ITEM_PACKAGE("VENDOR_ITEM_PACKAGE"),
    VENDOR_ITEM("VENDOR_ITEM"),
    VENDOR("VENDOR");

    private String value;

    ComponentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private ComponentTypeEnum componentType = null;

  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "")
  @org.codehaus.jackson.annotate.JsonProperty("componentId")
  @com.fasterxml.jackson.annotation.JsonProperty("componentId")
  public String getComponentId() {
    return componentId;
  }
  
  /**
   **/
  public void setComponentId(String componentId) {
    this.componentId = componentId;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "")
  @org.codehaus.jackson.annotate.JsonProperty("componentType")
  @com.fasterxml.jackson.annotation.JsonProperty("componentType")
  public ComponentTypeEnum getComponentType() {
    return componentType;
  }
  
  /**
   **/
  public void setComponentType(ComponentTypeEnum componentType) {
    this.componentType = componentType;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryForm summaryForm = (SummaryForm) o;
    return Objects.equals(this.componentId, summaryForm.componentId) &&
        Objects.equals(this.componentType, summaryForm.componentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentId, componentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryForm {\n");
    
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
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

  public static SummaryFormBuilder builder() {
    return new SummaryFormBuilder();
  }

  public static class SummaryFormBuilder {

    private String componentId = null;
    private ComponentTypeEnum componentType = null;
    

    SummaryFormBuilder() {
    }

    /**
     **/
    public SummaryFormBuilder componentId(String componentId) {
      this.componentId = componentId;
      return this;
    }

    /**
     **/
    public SummaryFormBuilder componentType(ComponentTypeEnum componentType) {
      this.componentType = componentType;
      return this;
    }


    public SummaryForm build() {
      SummaryForm summaryForm = new SummaryForm();
      summaryForm.setComponentId(this.componentId);
      summaryForm.setComponentType(this.componentType);
      return summaryForm;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SummaryFormBuilder {\n");
      
      sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
      sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
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

