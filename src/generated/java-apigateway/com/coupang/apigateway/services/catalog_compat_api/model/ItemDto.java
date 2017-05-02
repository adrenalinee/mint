package com.coupang.apigateway.services.catalog_compat_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.catalog_compat_api.model.ItemAttributeDto;
import com.coupang.apigateway.services.catalog_compat_api.model.ItemBundleDto;
import com.coupang.apigateway.services.catalog_compat_api.model.ItemImageDto;
import com.coupang.apigateway.services.catalog_compat_api.model.ItemListDto;
import com.coupang.apigateway.services.catalog_compat_api.model.ItemNoticeDto;
import com.coupang.apigateway.services.catalog_compat_api.model.ItemPriceDto;
import com.coupang.apigateway.services.catalog_compat_api.model.LocationDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.107+09:00")
public class ItemDto   {
  
  private Long weight = null;
  private Boolean valid = null;
  private Integer quantity = null;
  private Long productId = null;
  private List<ItemListDto> parentItems = new ArrayList<ItemListDto>();
  private String name = null;
  private String messageForExtraInfo = null;
  private LocationDto location = null;
  private ItemPriceDto latestItemPrice = null;
  private String labelForExtraInfo = null;
  private List<ItemPriceDto> itemPrices = new ArrayList<ItemPriceDto>();
  private ItemNoticeDto itemNotice = null;
  private List<ItemImageDto> itemImages = new ArrayList<ItemImageDto>();
  private Long itemId = null;
  private List<ItemBundleDto> itemBundles = new ArrayList<ItemBundleDto>();
  private List<ItemAttributeDto> itemAttributes = new ArrayList<ItemAttributeDto>();
  private String freeDealType = null;
  private Boolean extraInfoUsed = null;
  private String description = null;
  private Long categoryId = null;
  private Boolean bundled = null;
  private String barcode = null;
  private Boolean adultSold = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("quantity")
  @com.fasterxml.jackson.annotation.JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  
  /**
   **/
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
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
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("parentItems")
  @com.fasterxml.jackson.annotation.JsonProperty("parentItems")
  public List<ItemListDto> getParentItems() {
    return parentItems;
  }
  
  /**
   **/
  public void setParentItems(List<ItemListDto> parentItems) {
    this.parentItems = parentItems;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("name")
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  public String getName() {
    return name;
  }
  
  /**
   **/
  public void setName(String name) {
    this.name = name;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("messageForExtraInfo")
  @com.fasterxml.jackson.annotation.JsonProperty("messageForExtraInfo")
  public String getMessageForExtraInfo() {
    return messageForExtraInfo;
  }
  
  /**
   **/
  public void setMessageForExtraInfo(String messageForExtraInfo) {
    this.messageForExtraInfo = messageForExtraInfo;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("location")
  @com.fasterxml.jackson.annotation.JsonProperty("location")
  public LocationDto getLocation() {
    return location;
  }
  
  /**
   **/
  public void setLocation(LocationDto location) {
    this.location = location;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("latestItemPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("latestItemPrice")
  public ItemPriceDto getLatestItemPrice() {
    return latestItemPrice;
  }
  
  /**
   **/
  public void setLatestItemPrice(ItemPriceDto latestItemPrice) {
    this.latestItemPrice = latestItemPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("labelForExtraInfo")
  @com.fasterxml.jackson.annotation.JsonProperty("labelForExtraInfo")
  public String getLabelForExtraInfo() {
    return labelForExtraInfo;
  }
  
  /**
   **/
  public void setLabelForExtraInfo(String labelForExtraInfo) {
    this.labelForExtraInfo = labelForExtraInfo;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemPrices")
  @com.fasterxml.jackson.annotation.JsonProperty("itemPrices")
  public List<ItemPriceDto> getItemPrices() {
    return itemPrices;
  }
  
  /**
   **/
  public void setItemPrices(List<ItemPriceDto> itemPrices) {
    this.itemPrices = itemPrices;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemNotice")
  @com.fasterxml.jackson.annotation.JsonProperty("itemNotice")
  public ItemNoticeDto getItemNotice() {
    return itemNotice;
  }
  
  /**
   **/
  public void setItemNotice(ItemNoticeDto itemNotice) {
    this.itemNotice = itemNotice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemImages")
  @com.fasterxml.jackson.annotation.JsonProperty("itemImages")
  public List<ItemImageDto> getItemImages() {
    return itemImages;
  }
  
  /**
   **/
  public void setItemImages(List<ItemImageDto> itemImages) {
    this.itemImages = itemImages;
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
  @org.codehaus.jackson.annotate.JsonProperty("itemBundles")
  @com.fasterxml.jackson.annotation.JsonProperty("itemBundles")
  public List<ItemBundleDto> getItemBundles() {
    return itemBundles;
  }
  
  /**
   **/
  public void setItemBundles(List<ItemBundleDto> itemBundles) {
    this.itemBundles = itemBundles;
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
  @org.codehaus.jackson.annotate.JsonProperty("freeDealType")
  @com.fasterxml.jackson.annotation.JsonProperty("freeDealType")
  public String getFreeDealType() {
    return freeDealType;
  }
  
  /**
   **/
  public void setFreeDealType(String freeDealType) {
    this.freeDealType = freeDealType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("extraInfoUsed")
  @com.fasterxml.jackson.annotation.JsonProperty("extraInfoUsed")
  public Boolean getExtraInfoUsed() {
    return extraInfoUsed;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isExtraInfoUsed() {
    return extraInfoUsed == null ? false : extraInfoUsed;
  }
  
  /**
   **/
  public void setExtraInfoUsed(Boolean extraInfoUsed) {
    this.extraInfoUsed = extraInfoUsed;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("description")
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  public String getDescription() {
    return description;
  }
  
  /**
   **/
  public void setDescription(String description) {
    this.description = description;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("categoryId")
  @com.fasterxml.jackson.annotation.JsonProperty("categoryId")
  public Long getCategoryId() {
    return categoryId;
  }
  
  /**
   **/
  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("bundled")
  @com.fasterxml.jackson.annotation.JsonProperty("bundled")
  public Boolean getBundled() {
    return bundled;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isBundled() {
    return bundled == null ? false : bundled;
  }
  
  /**
   **/
  public void setBundled(Boolean bundled) {
    this.bundled = bundled;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("barcode")
  @com.fasterxml.jackson.annotation.JsonProperty("barcode")
  public String getBarcode() {
    return barcode;
  }
  
  /**
   **/
  public void setBarcode(String barcode) {
    this.barcode = barcode;
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
    ItemDto itemDto = (ItemDto) o;
    return Objects.equals(this.weight, itemDto.weight) &&
        Objects.equals(this.valid, itemDto.valid) &&
        Objects.equals(this.quantity, itemDto.quantity) &&
        Objects.equals(this.productId, itemDto.productId) &&
        Objects.equals(this.parentItems, itemDto.parentItems) &&
        Objects.equals(this.name, itemDto.name) &&
        Objects.equals(this.messageForExtraInfo, itemDto.messageForExtraInfo) &&
        Objects.equals(this.location, itemDto.location) &&
        Objects.equals(this.latestItemPrice, itemDto.latestItemPrice) &&
        Objects.equals(this.labelForExtraInfo, itemDto.labelForExtraInfo) &&
        Objects.equals(this.itemPrices, itemDto.itemPrices) &&
        Objects.equals(this.itemNotice, itemDto.itemNotice) &&
        Objects.equals(this.itemImages, itemDto.itemImages) &&
        Objects.equals(this.itemId, itemDto.itemId) &&
        Objects.equals(this.itemBundles, itemDto.itemBundles) &&
        Objects.equals(this.itemAttributes, itemDto.itemAttributes) &&
        Objects.equals(this.freeDealType, itemDto.freeDealType) &&
        Objects.equals(this.extraInfoUsed, itemDto.extraInfoUsed) &&
        Objects.equals(this.description, itemDto.description) &&
        Objects.equals(this.categoryId, itemDto.categoryId) &&
        Objects.equals(this.bundled, itemDto.bundled) &&
        Objects.equals(this.barcode, itemDto.barcode) &&
        Objects.equals(this.adultSold, itemDto.adultSold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weight, valid, quantity, productId, parentItems, name, messageForExtraInfo, location, latestItemPrice, labelForExtraInfo, itemPrices, itemNotice, itemImages, itemId, itemBundles, itemAttributes, freeDealType, extraInfoUsed, description, categoryId, bundled, barcode, adultSold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDto {\n");
    
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    parentItems: ").append(toIndentedString(parentItems)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    messageForExtraInfo: ").append(toIndentedString(messageForExtraInfo)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    latestItemPrice: ").append(toIndentedString(latestItemPrice)).append("\n");
    sb.append("    labelForExtraInfo: ").append(toIndentedString(labelForExtraInfo)).append("\n");
    sb.append("    itemPrices: ").append(toIndentedString(itemPrices)).append("\n");
    sb.append("    itemNotice: ").append(toIndentedString(itemNotice)).append("\n");
    sb.append("    itemImages: ").append(toIndentedString(itemImages)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemBundles: ").append(toIndentedString(itemBundles)).append("\n");
    sb.append("    itemAttributes: ").append(toIndentedString(itemAttributes)).append("\n");
    sb.append("    freeDealType: ").append(toIndentedString(freeDealType)).append("\n");
    sb.append("    extraInfoUsed: ").append(toIndentedString(extraInfoUsed)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    bundled: ").append(toIndentedString(bundled)).append("\n");
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
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

  public static ItemDtoBuilder builder() {
    return new ItemDtoBuilder();
  }

  public static class ItemDtoBuilder {

    private Long weight = null;
    private Boolean valid = null;
    private Integer quantity = null;
    private Long productId = null;
    private List<ItemListDto> parentItems = new ArrayList<ItemListDto>();
    private String name = null;
    private String messageForExtraInfo = null;
    private LocationDto location = null;
    private ItemPriceDto latestItemPrice = null;
    private String labelForExtraInfo = null;
    private List<ItemPriceDto> itemPrices = new ArrayList<ItemPriceDto>();
    private ItemNoticeDto itemNotice = null;
    private List<ItemImageDto> itemImages = new ArrayList<ItemImageDto>();
    private Long itemId = null;
    private List<ItemBundleDto> itemBundles = new ArrayList<ItemBundleDto>();
    private List<ItemAttributeDto> itemAttributes = new ArrayList<ItemAttributeDto>();
    private String freeDealType = null;
    private Boolean extraInfoUsed = null;
    private String description = null;
    private Long categoryId = null;
    private Boolean bundled = null;
    private String barcode = null;
    private Boolean adultSold = null;
    

    ItemDtoBuilder() {
    }

    /**
     **/
    public ItemDtoBuilder weight(Long weight) {
      this.weight = weight;
      return this;
    }

    /**
     **/
    public ItemDtoBuilder valid(Boolean valid) {
      this.valid = valid;
      return this;
    }

    /**
     **/
    public ItemDtoBuilder quantity(Integer quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     **/
    public ItemDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public ItemDtoBuilder parentItems(List<ItemListDto> parentItems) {
      this.parentItems = parentItems;
      return this;
    }

    /**
     **/
    public ItemDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public ItemDtoBuilder messageForExtraInfo(String messageForExtraInfo) {
      this.messageForExtraInfo = messageForExtraInfo;
      return this;
    }

    /**
     **/
    public ItemDtoBuilder location(LocationDto location) {
      this.location = location;
      return this;
    }

    /**
     **/
    public ItemDtoBuilder latestItemPrice(ItemPriceDto latestItemPrice) {
      this.latestItemPrice = latestItemPrice;
      return this;
    }

    /**
     **/
    public ItemDtoBuilder labelForExtraInfo(String labelForExtraInfo) {
      this.labelForExtraInfo = labelForExtraInfo;
      return this;
    }

    /**
     **/
    public ItemDtoBuilder itemPrices(List<ItemPriceDto> itemPrices) {
      this.itemPrices = itemPrices;
      return this;
    }

    /**
     **/
    public ItemDtoBuilder itemNotice(ItemNoticeDto itemNotice) {
      this.itemNotice = itemNotice;
      return this;
    }

    /**
     **/
    public ItemDtoBuilder itemImages(List<ItemImageDto> itemImages) {
      this.itemImages = itemImages;
      return this;
    }

    /**
     **/
    public ItemDtoBuilder itemId(Long itemId) {
      this.itemId = itemId;
      return this;
    }

    /**
     **/
    public ItemDtoBuilder itemBundles(List<ItemBundleDto> itemBundles) {
      this.itemBundles = itemBundles;
      return this;
    }

    /**
     **/
    public ItemDtoBuilder itemAttributes(List<ItemAttributeDto> itemAttributes) {
      this.itemAttributes = itemAttributes;
      return this;
    }

    /**
     **/
    public ItemDtoBuilder freeDealType(String freeDealType) {
      this.freeDealType = freeDealType;
      return this;
    }

    /**
     **/
    public ItemDtoBuilder extraInfoUsed(Boolean extraInfoUsed) {
      this.extraInfoUsed = extraInfoUsed;
      return this;
    }

    /**
     **/
    public ItemDtoBuilder description(String description) {
      this.description = description;
      return this;
    }

    /**
     **/
    public ItemDtoBuilder categoryId(Long categoryId) {
      this.categoryId = categoryId;
      return this;
    }

    /**
     **/
    public ItemDtoBuilder bundled(Boolean bundled) {
      this.bundled = bundled;
      return this;
    }

    /**
     **/
    public ItemDtoBuilder barcode(String barcode) {
      this.barcode = barcode;
      return this;
    }

    /**
     **/
    public ItemDtoBuilder adultSold(Boolean adultSold) {
      this.adultSold = adultSold;
      return this;
    }


    public ItemDto build() {
      ItemDto itemDto = new ItemDto();
      itemDto.setWeight(this.weight);
      itemDto.setValid(this.valid);
      itemDto.setQuantity(this.quantity);
      itemDto.setProductId(this.productId);
      itemDto.setParentItems(this.parentItems);
      itemDto.setName(this.name);
      itemDto.setMessageForExtraInfo(this.messageForExtraInfo);
      itemDto.setLocation(this.location);
      itemDto.setLatestItemPrice(this.latestItemPrice);
      itemDto.setLabelForExtraInfo(this.labelForExtraInfo);
      itemDto.setItemPrices(this.itemPrices);
      itemDto.setItemNotice(this.itemNotice);
      itemDto.setItemImages(this.itemImages);
      itemDto.setItemId(this.itemId);
      itemDto.setItemBundles(this.itemBundles);
      itemDto.setItemAttributes(this.itemAttributes);
      itemDto.setFreeDealType(this.freeDealType);
      itemDto.setExtraInfoUsed(this.extraInfoUsed);
      itemDto.setDescription(this.description);
      itemDto.setCategoryId(this.categoryId);
      itemDto.setBundled(this.bundled);
      itemDto.setBarcode(this.barcode);
      itemDto.setAdultSold(this.adultSold);
      return itemDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ItemDtoBuilder {\n");
      
      sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
      sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
      sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    parentItems: ").append(toIndentedString(parentItems)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    messageForExtraInfo: ").append(toIndentedString(messageForExtraInfo)).append("\n");
      sb.append("    location: ").append(toIndentedString(location)).append("\n");
      sb.append("    latestItemPrice: ").append(toIndentedString(latestItemPrice)).append("\n");
      sb.append("    labelForExtraInfo: ").append(toIndentedString(labelForExtraInfo)).append("\n");
      sb.append("    itemPrices: ").append(toIndentedString(itemPrices)).append("\n");
      sb.append("    itemNotice: ").append(toIndentedString(itemNotice)).append("\n");
      sb.append("    itemImages: ").append(toIndentedString(itemImages)).append("\n");
      sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
      sb.append("    itemBundles: ").append(toIndentedString(itemBundles)).append("\n");
      sb.append("    itemAttributes: ").append(toIndentedString(itemAttributes)).append("\n");
      sb.append("    freeDealType: ").append(toIndentedString(freeDealType)).append("\n");
      sb.append("    extraInfoUsed: ").append(toIndentedString(extraInfoUsed)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
      sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
      sb.append("    bundled: ").append(toIndentedString(bundled)).append("\n");
      sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
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

