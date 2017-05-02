package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class SalePolicyDTO   {
  
  private java.math.BigDecimal unitPrice = null;
  private Integer unitCount = null;
  private Integer soldCount = null;
  private String saleStartedAt = null;
  private String salePeriodType = null;
  private String saleEndedAt = null;
  private String originalPriceType = null;
  private String originalPriceComment = null;
  private java.math.BigDecimal originalPrice = null;
  private Integer maximumBuyTotal = null;
  private Integer maximumBuyForPersonPeriod = null;
  private Integer maximumBuyForPerson = null;
  private java.math.BigDecimal coupangPrice = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("unitPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("unitPrice")
  public java.math.BigDecimal getUnitPrice() {
    return unitPrice;
  }
  
  /**
   **/
  public void setUnitPrice(java.math.BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("unitCount")
  @com.fasterxml.jackson.annotation.JsonProperty("unitCount")
  public Integer getUnitCount() {
    return unitCount;
  }
  
  /**
   **/
  public void setUnitCount(Integer unitCount) {
    this.unitCount = unitCount;
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
  
  @io.swagger.annotations.ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ", value = "")
  @org.codehaus.jackson.annotate.JsonProperty("saleStartedAt")
  @com.fasterxml.jackson.annotation.JsonProperty("saleStartedAt")
  public String getSaleStartedAt() {
    return saleStartedAt;
  }
  
  /**
   **/
  public void setSaleStartedAt(String saleStartedAt) {
    this.saleStartedAt = saleStartedAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("salePeriodType")
  @com.fasterxml.jackson.annotation.JsonProperty("salePeriodType")
  public String getSalePeriodType() {
    return salePeriodType;
  }
  
  /**
   **/
  public void setSalePeriodType(String salePeriodType) {
    this.salePeriodType = salePeriodType;
  }
  
  @io.swagger.annotations.ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ", value = "")
  @org.codehaus.jackson.annotate.JsonProperty("saleEndedAt")
  @com.fasterxml.jackson.annotation.JsonProperty("saleEndedAt")
  public String getSaleEndedAt() {
    return saleEndedAt;
  }
  
  /**
   **/
  public void setSaleEndedAt(String saleEndedAt) {
    this.saleEndedAt = saleEndedAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("originalPriceType")
  @com.fasterxml.jackson.annotation.JsonProperty("originalPriceType")
  public String getOriginalPriceType() {
    return originalPriceType;
  }
  
  /**
   **/
  public void setOriginalPriceType(String originalPriceType) {
    this.originalPriceType = originalPriceType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("originalPriceComment")
  @com.fasterxml.jackson.annotation.JsonProperty("originalPriceComment")
  public String getOriginalPriceComment() {
    return originalPriceComment;
  }
  
  /**
   **/
  public void setOriginalPriceComment(String originalPriceComment) {
    this.originalPriceComment = originalPriceComment;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("originalPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("originalPrice")
  public java.math.BigDecimal getOriginalPrice() {
    return originalPrice;
  }
  
  /**
   **/
  public void setOriginalPrice(java.math.BigDecimal originalPrice) {
    this.originalPrice = originalPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("maximumBuyTotal")
  @com.fasterxml.jackson.annotation.JsonProperty("maximumBuyTotal")
  public Integer getMaximumBuyTotal() {
    return maximumBuyTotal;
  }
  
  /**
   **/
  public void setMaximumBuyTotal(Integer maximumBuyTotal) {
    this.maximumBuyTotal = maximumBuyTotal;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("maximumBuyForPersonPeriod")
  @com.fasterxml.jackson.annotation.JsonProperty("maximumBuyForPersonPeriod")
  public Integer getMaximumBuyForPersonPeriod() {
    return maximumBuyForPersonPeriod;
  }
  
  /**
   **/
  public void setMaximumBuyForPersonPeriod(Integer maximumBuyForPersonPeriod) {
    this.maximumBuyForPersonPeriod = maximumBuyForPersonPeriod;
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
  @org.codehaus.jackson.annotate.JsonProperty("coupangPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("coupangPrice")
  public java.math.BigDecimal getCoupangPrice() {
    return coupangPrice;
  }
  
  /**
   **/
  public void setCoupangPrice(java.math.BigDecimal coupangPrice) {
    this.coupangPrice = coupangPrice;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalePolicyDTO salePolicyDTO = (SalePolicyDTO) o;
    return Objects.equals(this.unitPrice, salePolicyDTO.unitPrice) &&
        Objects.equals(this.unitCount, salePolicyDTO.unitCount) &&
        Objects.equals(this.soldCount, salePolicyDTO.soldCount) &&
        Objects.equals(this.saleStartedAt, salePolicyDTO.saleStartedAt) &&
        Objects.equals(this.salePeriodType, salePolicyDTO.salePeriodType) &&
        Objects.equals(this.saleEndedAt, salePolicyDTO.saleEndedAt) &&
        Objects.equals(this.originalPriceType, salePolicyDTO.originalPriceType) &&
        Objects.equals(this.originalPriceComment, salePolicyDTO.originalPriceComment) &&
        Objects.equals(this.originalPrice, salePolicyDTO.originalPrice) &&
        Objects.equals(this.maximumBuyTotal, salePolicyDTO.maximumBuyTotal) &&
        Objects.equals(this.maximumBuyForPersonPeriod, salePolicyDTO.maximumBuyForPersonPeriod) &&
        Objects.equals(this.maximumBuyForPerson, salePolicyDTO.maximumBuyForPerson) &&
        Objects.equals(this.coupangPrice, salePolicyDTO.coupangPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitPrice, unitCount, soldCount, saleStartedAt, salePeriodType, saleEndedAt, originalPriceType, originalPriceComment, originalPrice, maximumBuyTotal, maximumBuyForPersonPeriod, maximumBuyForPerson, coupangPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalePolicyDTO {\n");
    
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    unitCount: ").append(toIndentedString(unitCount)).append("\n");
    sb.append("    soldCount: ").append(toIndentedString(soldCount)).append("\n");
    sb.append("    saleStartedAt: ").append(toIndentedString(saleStartedAt)).append("\n");
    sb.append("    salePeriodType: ").append(toIndentedString(salePeriodType)).append("\n");
    sb.append("    saleEndedAt: ").append(toIndentedString(saleEndedAt)).append("\n");
    sb.append("    originalPriceType: ").append(toIndentedString(originalPriceType)).append("\n");
    sb.append("    originalPriceComment: ").append(toIndentedString(originalPriceComment)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    maximumBuyTotal: ").append(toIndentedString(maximumBuyTotal)).append("\n");
    sb.append("    maximumBuyForPersonPeriod: ").append(toIndentedString(maximumBuyForPersonPeriod)).append("\n");
    sb.append("    maximumBuyForPerson: ").append(toIndentedString(maximumBuyForPerson)).append("\n");
    sb.append("    coupangPrice: ").append(toIndentedString(coupangPrice)).append("\n");
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

  public static SalePolicyDTOBuilder builder() {
    return new SalePolicyDTOBuilder();
  }

  public static class SalePolicyDTOBuilder {

    private java.math.BigDecimal unitPrice = null;
    private Integer unitCount = null;
    private Integer soldCount = null;
    private String saleStartedAt = null;
    private String salePeriodType = null;
    private String saleEndedAt = null;
    private String originalPriceType = null;
    private String originalPriceComment = null;
    private java.math.BigDecimal originalPrice = null;
    private Integer maximumBuyTotal = null;
    private Integer maximumBuyForPersonPeriod = null;
    private Integer maximumBuyForPerson = null;
    private java.math.BigDecimal coupangPrice = null;
    

    SalePolicyDTOBuilder() {
    }

    /**
     **/
    public SalePolicyDTOBuilder unitPrice(java.math.BigDecimal unitPrice) {
      this.unitPrice = unitPrice;
      return this;
    }

    /**
     **/
    public SalePolicyDTOBuilder unitCount(Integer unitCount) {
      this.unitCount = unitCount;
      return this;
    }

    /**
     **/
    public SalePolicyDTOBuilder soldCount(Integer soldCount) {
      this.soldCount = soldCount;
      return this;
    }

    /**
     **/
    public SalePolicyDTOBuilder saleStartedAt(String saleStartedAt) {
      this.saleStartedAt = saleStartedAt;
      return this;
    }

    /**
     **/
    public SalePolicyDTOBuilder salePeriodType(String salePeriodType) {
      this.salePeriodType = salePeriodType;
      return this;
    }

    /**
     **/
    public SalePolicyDTOBuilder saleEndedAt(String saleEndedAt) {
      this.saleEndedAt = saleEndedAt;
      return this;
    }

    /**
     **/
    public SalePolicyDTOBuilder originalPriceType(String originalPriceType) {
      this.originalPriceType = originalPriceType;
      return this;
    }

    /**
     **/
    public SalePolicyDTOBuilder originalPriceComment(String originalPriceComment) {
      this.originalPriceComment = originalPriceComment;
      return this;
    }

    /**
     **/
    public SalePolicyDTOBuilder originalPrice(java.math.BigDecimal originalPrice) {
      this.originalPrice = originalPrice;
      return this;
    }

    /**
     **/
    public SalePolicyDTOBuilder maximumBuyTotal(Integer maximumBuyTotal) {
      this.maximumBuyTotal = maximumBuyTotal;
      return this;
    }

    /**
     **/
    public SalePolicyDTOBuilder maximumBuyForPersonPeriod(Integer maximumBuyForPersonPeriod) {
      this.maximumBuyForPersonPeriod = maximumBuyForPersonPeriod;
      return this;
    }

    /**
     **/
    public SalePolicyDTOBuilder maximumBuyForPerson(Integer maximumBuyForPerson) {
      this.maximumBuyForPerson = maximumBuyForPerson;
      return this;
    }

    /**
     **/
    public SalePolicyDTOBuilder coupangPrice(java.math.BigDecimal coupangPrice) {
      this.coupangPrice = coupangPrice;
      return this;
    }


    public SalePolicyDTO build() {
      SalePolicyDTO salePolicyDTO = new SalePolicyDTO();
      salePolicyDTO.setUnitPrice(this.unitPrice);
      salePolicyDTO.setUnitCount(this.unitCount);
      salePolicyDTO.setSoldCount(this.soldCount);
      salePolicyDTO.setSaleStartedAt(this.saleStartedAt);
      salePolicyDTO.setSalePeriodType(this.salePeriodType);
      salePolicyDTO.setSaleEndedAt(this.saleEndedAt);
      salePolicyDTO.setOriginalPriceType(this.originalPriceType);
      salePolicyDTO.setOriginalPriceComment(this.originalPriceComment);
      salePolicyDTO.setOriginalPrice(this.originalPrice);
      salePolicyDTO.setMaximumBuyTotal(this.maximumBuyTotal);
      salePolicyDTO.setMaximumBuyForPersonPeriod(this.maximumBuyForPersonPeriod);
      salePolicyDTO.setMaximumBuyForPerson(this.maximumBuyForPerson);
      salePolicyDTO.setCoupangPrice(this.coupangPrice);
      return salePolicyDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SalePolicyDTOBuilder {\n");
      
      sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
      sb.append("    unitCount: ").append(toIndentedString(unitCount)).append("\n");
      sb.append("    soldCount: ").append(toIndentedString(soldCount)).append("\n");
      sb.append("    saleStartedAt: ").append(toIndentedString(saleStartedAt)).append("\n");
      sb.append("    salePeriodType: ").append(toIndentedString(salePeriodType)).append("\n");
      sb.append("    saleEndedAt: ").append(toIndentedString(saleEndedAt)).append("\n");
      sb.append("    originalPriceType: ").append(toIndentedString(originalPriceType)).append("\n");
      sb.append("    originalPriceComment: ").append(toIndentedString(originalPriceComment)).append("\n");
      sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
      sb.append("    maximumBuyTotal: ").append(toIndentedString(maximumBuyTotal)).append("\n");
      sb.append("    maximumBuyForPersonPeriod: ").append(toIndentedString(maximumBuyForPersonPeriod)).append("\n");
      sb.append("    maximumBuyForPerson: ").append(toIndentedString(maximumBuyForPerson)).append("\n");
      sb.append("    coupangPrice: ").append(toIndentedString(coupangPrice)).append("\n");
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

