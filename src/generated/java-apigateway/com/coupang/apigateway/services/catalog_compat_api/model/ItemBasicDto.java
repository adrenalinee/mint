package com.coupang.apigateway.services.catalog_compat_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.catalog_compat_api.model.ItemAttributeDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.107+09:00")
public class ItemBasicDto   {
  
  private Long productId = null;
  private String modelNo = null;
  private String itemName = null;
  private Long itemId = null;
  private List<ItemAttributeDto> itemAttributes = new ArrayList<ItemAttributeDto>();
  private Boolean adultSold = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("modelNo")
  @com.fasterxml.jackson.annotation.JsonProperty("modelNo")
  public String getModelNo() {
    return modelNo;
  }
  
  /**
   **/
  public void setModelNo(String modelNo) {
    this.modelNo = modelNo;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemName")
  @com.fasterxml.jackson.annotation.JsonProperty("itemName")
  public String getItemName() {
    return itemName;
  }
  
  /**
   **/
  public void setItemName(String itemName) {
    this.itemName = itemName;
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
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemAttributes")
  @com.fasterxml.jackson.annotation.JsonProperty("itemAttributes")
  public List<ItemAttributeDto> getItemAttributes() {
    return itemAttributes;
  }
  
  /**
   **/
  public void setItemAttributes(List<ItemAttributeDto> itemAttributes) {
    this.itemAttributes = itemAttributes;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("adultSold")
  @com.fasterxml.jackson.annotation.JsonProperty("adultSold")
  public Boolean getAdultSold() {
    return adultSold;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isAdultSold() {
    return adultSold == null ? false : adultSold;
  }
  
  /**
   **/
  public void setAdultSold(Boolean adultSold) {
    this.adultSold = adultSold;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemBasicDto itemBasicDto = (ItemBasicDto) o;
    return Objects.equals(this.productId, itemBasicDto.productId) &&
        Objects.equals(this.modelNo, itemBasicDto.modelNo) &&
        Objects.equals(this.itemName, itemBasicDto.itemName) &&
        Objects.equals(this.itemId, itemBasicDto.itemId) &&
        Objects.equals(this.itemAttributes, itemBasicDto.itemAttributes) &&
        Objects.equals(this.adultSold, itemBasicDto.adultSold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, modelNo, itemName, itemId, itemAttributes, adultSold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemBasicDto {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    modelNo: ").append(toIndentedString(modelNo)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemAttributes: ").append(toIndentedString(itemAttributes)).append("\n");
    sb.append("    adultSold: ").append(toIndentedString(adultSold)).append("\n");
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

  public static ItemBasicDtoBuilder builder() {
    return new ItemBasicDtoBuilder();
  }

  public static class ItemBasicDtoBuilder {

    private Long productId = null;
    private String modelNo = null;
    private String itemName = null;
    private Long itemId = null;
    private List<ItemAttributeDto> itemAttributes = new ArrayList<ItemAttributeDto>();
    private Boolean adultSold = null;
    

    ItemBasicDtoBuilder() {
    }

    /**
     **/
    public ItemBasicDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public ItemBasicDtoBuilder modelNo(String modelNo) {
      this.modelNo = modelNo;
      return this;
    }

    /**
     **/
    public ItemBasicDtoBuilder itemName(String itemName) {
      this.itemName = itemName;
      return this;
    }

    /**
     **/
    public ItemBasicDtoBuilder itemId(Long itemId) {
      this.itemId = itemId;
      return this;
    }

    /**
     **/
    public ItemBasicDtoBuilder itemAttributes(List<ItemAttributeDto> itemAttributes) {
      this.itemAttributes = itemAttributes;
      return this;
    }

    /**
     **/
    public ItemBasicDtoBuilder adultSold(Boolean adultSold) {
      this.adultSold = adultSold;
      return this;
    }


    public ItemBasicDto build() {
      ItemBasicDto itemBasicDto = new ItemBasicDto();
      itemBasicDto.setProductId(this.productId);
      itemBasicDto.setModelNo(this.modelNo);
      itemBasicDto.setItemName(this.itemName);
      itemBasicDto.setItemId(this.itemId);
      itemBasicDto.setItemAttributes(this.itemAttributes);
      itemBasicDto.setAdultSold(this.adultSold);
      return itemBasicDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ItemBasicDtoBuilder {\n");
      
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    modelNo: ").append(toIndentedString(modelNo)).append("\n");
      sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
      sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
      sb.append("    itemAttributes: ").append(toIndentedString(itemAttributes)).append("\n");
      sb.append("    adultSold: ").append(toIndentedString(adultSold)).append("\n");
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

