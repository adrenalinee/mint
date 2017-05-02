package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_api.model.ItemUnitPriceDto;
import com.coupang.apigateway.services.product_api.model.VendorItemPriceDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class PriceDto   {
  
  private VendorItemPriceDto vendorItemPriceDto = null;
  private Long vendorItemId = null;
  private ItemUnitPriceDto itemUnitPriceDto = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemPriceDto")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemPriceDto")
  public VendorItemPriceDto getVendorItemPriceDto() {
    return vendorItemPriceDto;
  }
  
  /**
   **/
  public void setVendorItemPriceDto(VendorItemPriceDto vendorItemPriceDto) {
    this.vendorItemPriceDto = vendorItemPriceDto;
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
  @org.codehaus.jackson.annotate.JsonProperty("itemUnitPriceDto")
  @com.fasterxml.jackson.annotation.JsonProperty("itemUnitPriceDto")
  public ItemUnitPriceDto getItemUnitPriceDto() {
    return itemUnitPriceDto;
  }
  
  /**
   **/
  public void setItemUnitPriceDto(ItemUnitPriceDto itemUnitPriceDto) {
    this.itemUnitPriceDto = itemUnitPriceDto;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceDto priceDto = (PriceDto) o;
    return Objects.equals(this.vendorItemPriceDto, priceDto.vendorItemPriceDto) &&
        Objects.equals(this.vendorItemId, priceDto.vendorItemId) &&
        Objects.equals(this.itemUnitPriceDto, priceDto.itemUnitPriceDto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemPriceDto, vendorItemId, itemUnitPriceDto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceDto {\n");
    
    sb.append("    vendorItemPriceDto: ").append(toIndentedString(vendorItemPriceDto)).append("\n");
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    itemUnitPriceDto: ").append(toIndentedString(itemUnitPriceDto)).append("\n");
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

  public static PriceDtoBuilder builder() {
    return new PriceDtoBuilder();
  }

  public static class PriceDtoBuilder {

    private VendorItemPriceDto vendorItemPriceDto = null;
    private Long vendorItemId = null;
    private ItemUnitPriceDto itemUnitPriceDto = null;
    

    PriceDtoBuilder() {
    }

    /**
     **/
    public PriceDtoBuilder vendorItemPriceDto(VendorItemPriceDto vendorItemPriceDto) {
      this.vendorItemPriceDto = vendorItemPriceDto;
      return this;
    }

    /**
     **/
    public PriceDtoBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public PriceDtoBuilder itemUnitPriceDto(ItemUnitPriceDto itemUnitPriceDto) {
      this.itemUnitPriceDto = itemUnitPriceDto;
      return this;
    }


    public PriceDto build() {
      PriceDto priceDto = new PriceDto();
      priceDto.setVendorItemPriceDto(this.vendorItemPriceDto);
      priceDto.setVendorItemId(this.vendorItemId);
      priceDto.setItemUnitPriceDto(this.itemUnitPriceDto);
      return priceDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PriceDtoBuilder {\n");
      
      sb.append("    vendorItemPriceDto: ").append(toIndentedString(vendorItemPriceDto)).append("\n");
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    itemUnitPriceDto: ").append(toIndentedString(itemUnitPriceDto)).append("\n");
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

