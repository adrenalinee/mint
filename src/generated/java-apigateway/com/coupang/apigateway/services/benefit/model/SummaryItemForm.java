package com.coupang.apigateway.services.benefit.model;

import java.util.Objects;



/**
 * The pair of componentType and componentId must be unique.
 **/

@io.swagger.annotations.ApiModel(description = "The pair of componentType and componentId must be unique.")
@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.660+09:00")
public class SummaryItemForm   {
  
  private Long quantity = null;
  private Long amount = null;
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
  @org.codehaus.jackson.annotate.JsonProperty("quantity")
  @com.fasterxml.jackson.annotation.JsonProperty("quantity")
  public Long getQuantity() {
    return quantity;
  }
  
  /**
   **/
  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "")
  @org.codehaus.jackson.annotate.JsonProperty("amount")
  @com.fasterxml.jackson.annotation.JsonProperty("amount")
  public Long getAmount() {
    return amount;
  }
  
  /**
   **/
  public void setAmount(Long amount) {
    this.amount = amount;
  }
  
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
    SummaryItemForm summaryItemForm = (SummaryItemForm) o;
    return Objects.equals(this.quantity, summaryItemForm.quantity) &&
        Objects.equals(this.amount, summaryItemForm.amount) &&
        Objects.equals(this.componentId, summaryItemForm.componentId) &&
        Objects.equals(this.componentType, summaryItemForm.componentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, amount, componentId, componentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryItemForm {\n");
    
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

  public static SummaryItemFormBuilder builder() {
    return new SummaryItemFormBuilder();
  }

  public static class SummaryItemFormBuilder {

    private Long quantity = null;
    private Long amount = null;
    private String componentId = null;
    private ComponentTypeEnum componentType = null;
    

    SummaryItemFormBuilder() {
    }

    /**
     **/
    public SummaryItemFormBuilder quantity(Long quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     **/
    public SummaryItemFormBuilder amount(Long amount) {
      this.amount = amount;
      return this;
    }

    /**
     **/
    public SummaryItemFormBuilder componentId(String componentId) {
      this.componentId = componentId;
      return this;
    }

    /**
     **/
    public SummaryItemFormBuilder componentType(ComponentTypeEnum componentType) {
      this.componentType = componentType;
      return this;
    }


    public SummaryItemForm build() {
      SummaryItemForm summaryItemForm = new SummaryItemForm();
      summaryItemForm.setQuantity(this.quantity);
      summaryItemForm.setAmount(this.amount);
      summaryItemForm.setComponentId(this.componentId);
      summaryItemForm.setComponentType(this.componentType);
      return summaryItemForm;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SummaryItemFormBuilder {\n");
      
      sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
      sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

