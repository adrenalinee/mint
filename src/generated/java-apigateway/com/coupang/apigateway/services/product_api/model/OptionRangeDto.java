package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class OptionRangeDto   {
  
  private List<Long> vendorItemIds = new ArrayList<Long>();
  private Long vendorItemId = null;
  private String useStartedAt = null;
  private String useEndedAt = null;
  private Integer stockQuantity = null;
  private Boolean soldOut = null;
  private Integer soldCount = null;
  private java.math.BigDecimal salesPrice = null;
  private String name = null;
  private java.math.BigDecimal minSalePrice = null;
  private Integer maximumBuyForPerson = null;
  private Integer maximumBuyCount = null;
  private java.math.BigDecimal maxSalePrice = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemIds")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemIds")
  public List<Long> getVendorItemIds() {
    return vendorItemIds;
  }
  
  /**
   **/
  public void setVendorItemIds(List<Long> vendorItemIds) {
    this.vendorItemIds = vendorItemIds;
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
  @org.codehaus.jackson.annotate.JsonProperty("useStartedAt")
  @com.fasterxml.jackson.annotation.JsonProperty("useStartedAt")
  public String getUseStartedAt() {
    return useStartedAt;
  }
  
  /**
   **/
  public void setUseStartedAt(String useStartedAt) {
    this.useStartedAt = useStartedAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("useEndedAt")
  @com.fasterxml.jackson.annotation.JsonProperty("useEndedAt")
  public String getUseEndedAt() {
    return useEndedAt;
  }
  
  /**
   **/
  public void setUseEndedAt(String useEndedAt) {
    this.useEndedAt = useEndedAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("stockQuantity")
  @com.fasterxml.jackson.annotation.JsonProperty("stockQuantity")
  public Integer getStockQuantity() {
    return stockQuantity;
  }
  
  /**
   **/
  public void setStockQuantity(Integer stockQuantity) {
    this.stockQuantity = stockQuantity;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("soldOut")
  @com.fasterxml.jackson.annotation.JsonProperty("soldOut")
  public Boolean getSoldOut() {
    return soldOut;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isSoldOut() {
    return soldOut == null ? false : soldOut;
  }
  
  /**
   **/
  public void setSoldOut(Boolean soldOut) {
    this.soldOut = soldOut;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("soldCount")
  @com.fasterxml.jackson.annotation.JsonProperty("soldCount")
  public Integer getSoldCount() {
    return soldCount;
  }
  
  /**
   **/
  public void setSoldCount(Integer soldCount) {
    this.soldCount = soldCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("salesPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("salesPrice")
  public java.math.BigDecimal getSalesPrice() {
    return salesPrice;
  }
  
  /**
   **/
  public void setSalesPrice(java.math.BigDecimal salesPrice) {
    this.salesPrice = salesPrice;
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
  @org.codehaus.jackson.annotate.JsonProperty("minSalePrice")
  @com.fasterxml.jackson.annotation.JsonProperty("minSalePrice")
  public java.math.BigDecimal getMinSalePrice() {
    return minSalePrice;
  }
  
  /**
   **/
  public void setMinSalePrice(java.math.BigDecimal minSalePrice) {
    this.minSalePrice = minSalePrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("maximumBuyForPerson")
  @com.fasterxml.jackson.annotation.JsonProperty("maximumBuyForPerson")
  public Integer getMaximumBuyForPerson() {
    return maximumBuyForPerson;
  }
  
  /**
   **/
  public void setMaximumBuyForPerson(Integer maximumBuyForPerson) {
    this.maximumBuyForPerson = maximumBuyForPerson;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("maximumBuyCount")
  @com.fasterxml.jackson.annotation.JsonProperty("maximumBuyCount")
  public Integer getMaximumBuyCount() {
    return maximumBuyCount;
  }
  
  /**
   **/
  public void setMaximumBuyCount(Integer maximumBuyCount) {
    this.maximumBuyCount = maximumBuyCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("maxSalePrice")
  @com.fasterxml.jackson.annotation.JsonProperty("maxSalePrice")
  public java.math.BigDecimal getMaxSalePrice() {
    return maxSalePrice;
  }
  
  /**
   **/
  public void setMaxSalePrice(java.math.BigDecimal maxSalePrice) {
    this.maxSalePrice = maxSalePrice;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionRangeDto optionRangeDto = (OptionRangeDto) o;
    return Objects.equals(this.vendorItemIds, optionRangeDto.vendorItemIds) &&
        Objects.equals(this.vendorItemId, optionRangeDto.vendorItemId) &&
        Objects.equals(this.useStartedAt, optionRangeDto.useStartedAt) &&
        Objects.equals(this.useEndedAt, optionRangeDto.useEndedAt) &&
        Objects.equals(this.stockQuantity, optionRangeDto.stockQuantity) &&
        Objects.equals(this.soldOut, optionRangeDto.soldOut) &&
        Objects.equals(this.soldCount, optionRangeDto.soldCount) &&
        Objects.equals(this.salesPrice, optionRangeDto.salesPrice) &&
        Objects.equals(this.name, optionRangeDto.name) &&
        Objects.equals(this.minSalePrice, optionRangeDto.minSalePrice) &&
        Objects.equals(this.maximumBuyForPerson, optionRangeDto.maximumBuyForPerson) &&
        Objects.equals(this.maximumBuyCount, optionRangeDto.maximumBuyCount) &&
        Objects.equals(this.maxSalePrice, optionRangeDto.maxSalePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemIds, vendorItemId, useStartedAt, useEndedAt, stockQuantity, soldOut, soldCount, salesPrice, name, minSalePrice, maximumBuyForPerson, maximumBuyCount, maxSalePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionRangeDto {\n");
    
    sb.append("    vendorItemIds: ").append(toIndentedString(vendorItemIds)).append("\n");
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    useStartedAt: ").append(toIndentedString(useStartedAt)).append("\n");
    sb.append("    useEndedAt: ").append(toIndentedString(useEndedAt)).append("\n");
    sb.append("    stockQuantity: ").append(toIndentedString(stockQuantity)).append("\n");
    sb.append("    soldOut: ").append(toIndentedString(soldOut)).append("\n");
    sb.append("    soldCount: ").append(toIndentedString(soldCount)).append("\n");
    sb.append("    salesPrice: ").append(toIndentedString(salesPrice)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    minSalePrice: ").append(toIndentedString(minSalePrice)).append("\n");
    sb.append("    maximumBuyForPerson: ").append(toIndentedString(maximumBuyForPerson)).append("\n");
    sb.append("    maximumBuyCount: ").append(toIndentedString(maximumBuyCount)).append("\n");
    sb.append("    maxSalePrice: ").append(toIndentedString(maxSalePrice)).append("\n");
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

  public static OptionRangeDtoBuilder builder() {
    return new OptionRangeDtoBuilder();
  }

  public static class OptionRangeDtoBuilder {

    private List<Long> vendorItemIds = new ArrayList<Long>();
    private Long vendorItemId = null;
    private String useStartedAt = null;
    private String useEndedAt = null;
    private Integer stockQuantity = null;
    private Boolean soldOut = null;
    private Integer soldCount = null;
    private java.math.BigDecimal salesPrice = null;
    private String name = null;
    private java.math.BigDecimal minSalePrice = null;
    private Integer maximumBuyForPerson = null;
    private Integer maximumBuyCount = null;
    private java.math.BigDecimal maxSalePrice = null;
    

    OptionRangeDtoBuilder() {
    }

    /**
     **/
    public OptionRangeDtoBuilder vendorItemIds(List<Long> vendorItemIds) {
      this.vendorItemIds = vendorItemIds;
      return this;
    }

    /**
     **/
    public OptionRangeDtoBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public OptionRangeDtoBuilder useStartedAt(String useStartedAt) {
      this.useStartedAt = useStartedAt;
      return this;
    }

    /**
     **/
    public OptionRangeDtoBuilder useEndedAt(String useEndedAt) {
      this.useEndedAt = useEndedAt;
      return this;
    }

    /**
     **/
    public OptionRangeDtoBuilder stockQuantity(Integer stockQuantity) {
      this.stockQuantity = stockQuantity;
      return this;
    }

    /**
     **/
    public OptionRangeDtoBuilder soldOut(Boolean soldOut) {
      this.soldOut = soldOut;
      return this;
    }

    /**
     **/
    public OptionRangeDtoBuilder soldCount(Integer soldCount) {
      this.soldCount = soldCount;
      return this;
    }

    /**
     **/
    public OptionRangeDtoBuilder salesPrice(java.math.BigDecimal salesPrice) {
      this.salesPrice = salesPrice;
      return this;
    }

    /**
     **/
    public OptionRangeDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public OptionRangeDtoBuilder minSalePrice(java.math.BigDecimal minSalePrice) {
      this.minSalePrice = minSalePrice;
      return this;
    }

    /**
     **/
    public OptionRangeDtoBuilder maximumBuyForPerson(Integer maximumBuyForPerson) {
      this.maximumBuyForPerson = maximumBuyForPerson;
      return this;
    }

    /**
     **/
    public OptionRangeDtoBuilder maximumBuyCount(Integer maximumBuyCount) {
      this.maximumBuyCount = maximumBuyCount;
      return this;
    }

    /**
     **/
    public OptionRangeDtoBuilder maxSalePrice(java.math.BigDecimal maxSalePrice) {
      this.maxSalePrice = maxSalePrice;
      return this;
    }


    public OptionRangeDto build() {
      OptionRangeDto optionRangeDto = new OptionRangeDto();
      optionRangeDto.setVendorItemIds(this.vendorItemIds);
      optionRangeDto.setVendorItemId(this.vendorItemId);
      optionRangeDto.setUseStartedAt(this.useStartedAt);
      optionRangeDto.setUseEndedAt(this.useEndedAt);
      optionRangeDto.setStockQuantity(this.stockQuantity);
      optionRangeDto.setSoldOut(this.soldOut);
      optionRangeDto.setSoldCount(this.soldCount);
      optionRangeDto.setSalesPrice(this.salesPrice);
      optionRangeDto.setName(this.name);
      optionRangeDto.setMinSalePrice(this.minSalePrice);
      optionRangeDto.setMaximumBuyForPerson(this.maximumBuyForPerson);
      optionRangeDto.setMaximumBuyCount(this.maximumBuyCount);
      optionRangeDto.setMaxSalePrice(this.maxSalePrice);
      return optionRangeDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class OptionRangeDtoBuilder {\n");
      
      sb.append("    vendorItemIds: ").append(toIndentedString(vendorItemIds)).append("\n");
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    useStartedAt: ").append(toIndentedString(useStartedAt)).append("\n");
      sb.append("    useEndedAt: ").append(toIndentedString(useEndedAt)).append("\n");
      sb.append("    stockQuantity: ").append(toIndentedString(stockQuantity)).append("\n");
      sb.append("    soldOut: ").append(toIndentedString(soldOut)).append("\n");
      sb.append("    soldCount: ").append(toIndentedString(soldCount)).append("\n");
      sb.append("    salesPrice: ").append(toIndentedString(salesPrice)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    minSalePrice: ").append(toIndentedString(minSalePrice)).append("\n");
      sb.append("    maximumBuyForPerson: ").append(toIndentedString(maximumBuyForPerson)).append("\n");
      sb.append("    maximumBuyCount: ").append(toIndentedString(maximumBuyCount)).append("\n");
      sb.append("    maxSalePrice: ").append(toIndentedString(maxSalePrice)).append("\n");
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

