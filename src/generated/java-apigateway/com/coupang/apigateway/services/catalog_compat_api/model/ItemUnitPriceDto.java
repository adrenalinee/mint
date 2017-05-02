package com.coupang.apigateway.services.catalog_compat_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.catalog_compat_api.model.UnitPriceDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.107+09:00")
public class ItemUnitPriceDto   {
  
  private UnitPriceDto unitPrice = null;
  private Long itemId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("unitPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("unitPrice")
  public UnitPriceDto getUnitPrice() {
    return unitPrice;
  }
  
  /**
   **/
  public void setUnitPrice(UnitPriceDto unitPrice) {
    this.unitPrice = unitPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemId")
  @com.fasterxml.jackson.annotation.JsonProperty("itemId")
  public Long getItemId() {
    return itemId;
  }
  
  /**
   **/
  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemUnitPriceDto itemUnitPriceDto = (ItemUnitPriceDto) o;
    return Objects.equals(this.unitPrice, itemUnitPriceDto.unitPrice) &&
        Objects.equals(this.itemId, itemUnitPriceDto.itemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitPrice, itemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemUnitPriceDto {\n");
    
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

  public static ItemUnitPriceDtoBuilder builder() {
    return new ItemUnitPriceDtoBuilder();
  }

  public static class ItemUnitPriceDtoBuilder {

    private UnitPriceDto unitPrice = null;
    private Long itemId = null;
    

    ItemUnitPriceDtoBuilder() {
    }

    /**
     **/
    public ItemUnitPriceDtoBuilder unitPrice(UnitPriceDto unitPrice) {
      this.unitPrice = unitPrice;
      return this;
    }

    /**
     **/
    public ItemUnitPriceDtoBuilder itemId(Long itemId) {
      this.itemId = itemId;
      return this;
    }


    public ItemUnitPriceDto build() {
      ItemUnitPriceDto itemUnitPriceDto = new ItemUnitPriceDto();
      itemUnitPriceDto.setUnitPrice(this.unitPrice);
      itemUnitPriceDto.setItemId(this.itemId);
      return itemUnitPriceDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ItemUnitPriceDtoBuilder {\n");
      
      sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
      sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

