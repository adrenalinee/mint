package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class OptionAdvertisedTourDto   {
  
  private Long vendorItemId = null;
  private String useStartedAt = null;
  private String useEndedAt = null;
  private String tourApprovedStatus = null;
  private Integer stockQuantity = null;
  private Boolean soldOut = null;
  private Integer soldCount = null;
  private Long setId = null;
  private java.math.BigDecimal salesPrice = null;
  private String name = null;
  private java.math.BigDecimal minSalePrice = null;
  private Integer maximumBuyForPerson = null;
  private Integer maximumBuyCount = null;
  private java.math.BigDecimal maxSalePrice = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("tourApprovedStatus")
  @com.fasterxml.jackson.annotation.JsonProperty("tourApprovedStatus")
  public String getTourApprovedStatus() {
    return tourApprovedStatus;
  }
  
  /**
   **/
  public void setTourApprovedStatus(String tourApprovedStatus) {
    this.tourApprovedStatus = tourApprovedStatus;
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
  @org.codehaus.jackson.annotate.JsonProperty("setId")
  @com.fasterxml.jackson.annotation.JsonProperty("setId")
  public Long getSetId() {
    return setId;
  }
  
  /**
   **/
  public void setSetId(Long setId) {
    this.setId = setId;
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
    OptionAdvertisedTourDto optionAdvertisedTourDto = (OptionAdvertisedTourDto) o;
    return Objects.equals(this.vendorItemId, optionAdvertisedTourDto.vendorItemId) &&
        Objects.equals(this.useStartedAt, optionAdvertisedTourDto.useStartedAt) &&
        Objects.equals(this.useEndedAt, optionAdvertisedTourDto.useEndedAt) &&
        Objects.equals(this.tourApprovedStatus, optionAdvertisedTourDto.tourApprovedStatus) &&
        Objects.equals(this.stockQuantity, optionAdvertisedTourDto.stockQuantity) &&
        Objects.equals(this.soldOut, optionAdvertisedTourDto.soldOut) &&
        Objects.equals(this.soldCount, optionAdvertisedTourDto.soldCount) &&
        Objects.equals(this.setId, optionAdvertisedTourDto.setId) &&
        Objects.equals(this.salesPrice, optionAdvertisedTourDto.salesPrice) &&
        Objects.equals(this.name, optionAdvertisedTourDto.name) &&
        Objects.equals(this.minSalePrice, optionAdvertisedTourDto.minSalePrice) &&
        Objects.equals(this.maximumBuyForPerson, optionAdvertisedTourDto.maximumBuyForPerson) &&
        Objects.equals(this.maximumBuyCount, optionAdvertisedTourDto.maximumBuyCount) &&
        Objects.equals(this.maxSalePrice, optionAdvertisedTourDto.maxSalePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemId, useStartedAt, useEndedAt, tourApprovedStatus, stockQuantity, soldOut, soldCount, setId, salesPrice, name, minSalePrice, maximumBuyForPerson, maximumBuyCount, maxSalePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionAdvertisedTourDto {\n");
    
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    useStartedAt: ").append(toIndentedString(useStartedAt)).append("\n");
    sb.append("    useEndedAt: ").append(toIndentedString(useEndedAt)).append("\n");
    sb.append("    tourApprovedStatus: ").append(toIndentedString(tourApprovedStatus)).append("\n");
    sb.append("    stockQuantity: ").append(toIndentedString(stockQuantity)).append("\n");
    sb.append("    soldOut: ").append(toIndentedString(soldOut)).append("\n");
    sb.append("    soldCount: ").append(toIndentedString(soldCount)).append("\n");
    sb.append("    setId: ").append(toIndentedString(setId)).append("\n");
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

  public static OptionAdvertisedTourDtoBuilder builder() {
    return new OptionAdvertisedTourDtoBuilder();
  }

  public static class OptionAdvertisedTourDtoBuilder {

    private Long vendorItemId = null;
    private String useStartedAt = null;
    private String useEndedAt = null;
    private String tourApprovedStatus = null;
    private Integer stockQuantity = null;
    private Boolean soldOut = null;
    private Integer soldCount = null;
    private Long setId = null;
    private java.math.BigDecimal salesPrice = null;
    private String name = null;
    private java.math.BigDecimal minSalePrice = null;
    private Integer maximumBuyForPerson = null;
    private Integer maximumBuyCount = null;
    private java.math.BigDecimal maxSalePrice = null;
    

    OptionAdvertisedTourDtoBuilder() {
    }

    /**
     **/
    public OptionAdvertisedTourDtoBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public OptionAdvertisedTourDtoBuilder useStartedAt(String useStartedAt) {
      this.useStartedAt = useStartedAt;
      return this;
    }

    /**
     **/
    public OptionAdvertisedTourDtoBuilder useEndedAt(String useEndedAt) {
      this.useEndedAt = useEndedAt;
      return this;
    }

    /**
     **/
    public OptionAdvertisedTourDtoBuilder tourApprovedStatus(String tourApprovedStatus) {
      this.tourApprovedStatus = tourApprovedStatus;
      return this;
    }

    /**
     **/
    public OptionAdvertisedTourDtoBuilder stockQuantity(Integer stockQuantity) {
      this.stockQuantity = stockQuantity;
      return this;
    }

    /**
     **/
    public OptionAdvertisedTourDtoBuilder soldOut(Boolean soldOut) {
      this.soldOut = soldOut;
      return this;
    }

    /**
     **/
    public OptionAdvertisedTourDtoBuilder soldCount(Integer soldCount) {
      this.soldCount = soldCount;
      return this;
    }

    /**
     **/
    public OptionAdvertisedTourDtoBuilder setId(Long setId) {
      this.setId = setId;
      return this;
    }

    /**
     **/
    public OptionAdvertisedTourDtoBuilder salesPrice(java.math.BigDecimal salesPrice) {
      this.salesPrice = salesPrice;
      return this;
    }

    /**
     **/
    public OptionAdvertisedTourDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public OptionAdvertisedTourDtoBuilder minSalePrice(java.math.BigDecimal minSalePrice) {
      this.minSalePrice = minSalePrice;
      return this;
    }

    /**
     **/
    public OptionAdvertisedTourDtoBuilder maximumBuyForPerson(Integer maximumBuyForPerson) {
      this.maximumBuyForPerson = maximumBuyForPerson;
      return this;
    }

    /**
     **/
    public OptionAdvertisedTourDtoBuilder maximumBuyCount(Integer maximumBuyCount) {
      this.maximumBuyCount = maximumBuyCount;
      return this;
    }

    /**
     **/
    public OptionAdvertisedTourDtoBuilder maxSalePrice(java.math.BigDecimal maxSalePrice) {
      this.maxSalePrice = maxSalePrice;
      return this;
    }


    public OptionAdvertisedTourDto build() {
      OptionAdvertisedTourDto optionAdvertisedTourDto = new OptionAdvertisedTourDto();
      optionAdvertisedTourDto.setVendorItemId(this.vendorItemId);
      optionAdvertisedTourDto.setUseStartedAt(this.useStartedAt);
      optionAdvertisedTourDto.setUseEndedAt(this.useEndedAt);
      optionAdvertisedTourDto.setTourApprovedStatus(this.tourApprovedStatus);
      optionAdvertisedTourDto.setStockQuantity(this.stockQuantity);
      optionAdvertisedTourDto.setSoldOut(this.soldOut);
      optionAdvertisedTourDto.setSoldCount(this.soldCount);
      optionAdvertisedTourDto.setSetId(this.setId);
      optionAdvertisedTourDto.setSalesPrice(this.salesPrice);
      optionAdvertisedTourDto.setName(this.name);
      optionAdvertisedTourDto.setMinSalePrice(this.minSalePrice);
      optionAdvertisedTourDto.setMaximumBuyForPerson(this.maximumBuyForPerson);
      optionAdvertisedTourDto.setMaximumBuyCount(this.maximumBuyCount);
      optionAdvertisedTourDto.setMaxSalePrice(this.maxSalePrice);
      return optionAdvertisedTourDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class OptionAdvertisedTourDtoBuilder {\n");
      
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    useStartedAt: ").append(toIndentedString(useStartedAt)).append("\n");
      sb.append("    useEndedAt: ").append(toIndentedString(useEndedAt)).append("\n");
      sb.append("    tourApprovedStatus: ").append(toIndentedString(tourApprovedStatus)).append("\n");
      sb.append("    stockQuantity: ").append(toIndentedString(stockQuantity)).append("\n");
      sb.append("    soldOut: ").append(toIndentedString(soldOut)).append("\n");
      sb.append("    soldCount: ").append(toIndentedString(soldCount)).append("\n");
      sb.append("    setId: ").append(toIndentedString(setId)).append("\n");
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

