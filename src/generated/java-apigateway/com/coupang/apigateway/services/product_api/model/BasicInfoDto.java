package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_api.model.LocationDtoOfBasicInfoDto;
import java.util.*;
import java.util.Date;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class BasicInfoDto   {
  
  private Boolean valid = null;
  private String uniqueMessage = null;
  private String title = null;
  private String termsOfUse = null;
  private String subDivisionType = null;


  public enum SellingStatusTypeEnum {
    ONSALES("ONSALES"),
    UNLIMITED_SALES("UNLIMITED_SALES"),
    SOLDOUT("SOLDOUT"),
    ALMOST_SOLDOUT("ALMOST_SOLDOUT");

    private String value;

    SellingStatusTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private SellingStatusTypeEnum sellingStatusType = null;
  private Long salesPrice = null;
  private Integer salesCount = null;
  private Integer purchaseLimitPerUser = null;
  private List<String> priceExtraDescriptions = new ArrayList<String>();
  private String priceDescription = null;
  private List<String> pictogramList = new ArrayList<String>();
  private String packageType = null;


  public enum OriginalPriceTypeEnum {
    PR_AGENT("PR_AGENT"),
    PR_CATALOG("PR_CATALOG"),
    PR_COMPANY("PR_COMPANY"),
    PR_DEPARTMENT("PR_DEPARTMENT"),
    PR_DISCOUNT("PR_DISCOUNT"),
    PR_HOME("PR_HOME"),
    PR_ONLINE("PR_ONLINE"),
    PR_ONLINE_Y("PR_ONLINE_Y"),
    PR_ONLINE_N("PR_ONLINE_N"),
    PR_SPECIAL("PR_SPECIAL"),
    PR_TOTAL("PR_TOTAL"),
    PR_HOMPAGE("PR_HOMPAGE"),
    PR_RESERVATION("PR_RESERVATION"),
    PR_BOOK("PR_BOOK"),
    PR_MENUPAN("PR_MENUPAN"),
    PR_REPORT("PR_REPORT"),
    PR_TRAVEL("PR_TRAVEL"),
    PR_TAG("PR_TAG"),
    PR_COUPANG("PR_COUPANG"),
    NONE("NONE");

    private String value;

    OriginalPriceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private OriginalPriceTypeEnum originalPriceType = null;
  private Long originalPrice = null;
  private Date onSaleStart = null;
  private Date onSaleEnd = null;
  private List<LocationDtoOfBasicInfoDto> locationDtos = new ArrayList<LocationDtoOfBasicInfoDto>();
  private Long id = null;
  private Map<String, String> extraProperties = new HashMap<String, String>();
  private List<String> extraInfoList = new ArrayList<String>();
  private String divisionType = null;
  private Boolean adultOnly = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("uniqueMessage")
  @com.fasterxml.jackson.annotation.JsonProperty("uniqueMessage")
  public String getUniqueMessage() {
    return uniqueMessage;
  }
  
  /**
   **/
  public void setUniqueMessage(String uniqueMessage) {
    this.uniqueMessage = uniqueMessage;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("title")
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  public String getTitle() {
    return title;
  }
  
  /**
   **/
  public void setTitle(String title) {
    this.title = title;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("termsOfUse")
  @com.fasterxml.jackson.annotation.JsonProperty("termsOfUse")
  public String getTermsOfUse() {
    return termsOfUse;
  }
  
  /**
   **/
  public void setTermsOfUse(String termsOfUse) {
    this.termsOfUse = termsOfUse;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("subDivisionType")
  @com.fasterxml.jackson.annotation.JsonProperty("subDivisionType")
  public String getSubDivisionType() {
    return subDivisionType;
  }
  
  /**
   **/
  public void setSubDivisionType(String subDivisionType) {
    this.subDivisionType = subDivisionType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("sellingStatusType")
  @com.fasterxml.jackson.annotation.JsonProperty("sellingStatusType")
  public SellingStatusTypeEnum getSellingStatusType() {
    return sellingStatusType;
  }
  
  /**
   **/
  public void setSellingStatusType(SellingStatusTypeEnum sellingStatusType) {
    this.sellingStatusType = sellingStatusType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("salesPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("salesPrice")
  public Long getSalesPrice() {
    return salesPrice;
  }
  
  /**
   **/
  public void setSalesPrice(Long salesPrice) {
    this.salesPrice = salesPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("salesCount")
  @com.fasterxml.jackson.annotation.JsonProperty("salesCount")
  public Integer getSalesCount() {
    return salesCount;
  }
  
  /**
   **/
  public void setSalesCount(Integer salesCount) {
    this.salesCount = salesCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("purchaseLimitPerUser")
  @com.fasterxml.jackson.annotation.JsonProperty("purchaseLimitPerUser")
  public Integer getPurchaseLimitPerUser() {
    return purchaseLimitPerUser;
  }
  
  /**
   **/
  public void setPurchaseLimitPerUser(Integer purchaseLimitPerUser) {
    this.purchaseLimitPerUser = purchaseLimitPerUser;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("priceExtraDescriptions")
  @com.fasterxml.jackson.annotation.JsonProperty("priceExtraDescriptions")
  public List<String> getPriceExtraDescriptions() {
    return priceExtraDescriptions;
  }
  
  /**
   **/
  public void setPriceExtraDescriptions(List<String> priceExtraDescriptions) {
    this.priceExtraDescriptions = priceExtraDescriptions;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("priceDescription")
  @com.fasterxml.jackson.annotation.JsonProperty("priceDescription")
  public String getPriceDescription() {
    return priceDescription;
  }
  
  /**
   **/
  public void setPriceDescription(String priceDescription) {
    this.priceDescription = priceDescription;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("pictogramList")
  @com.fasterxml.jackson.annotation.JsonProperty("pictogramList")
  public List<String> getPictogramList() {
    return pictogramList;
  }
  
  /**
   **/
  public void setPictogramList(List<String> pictogramList) {
    this.pictogramList = pictogramList;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("packageType")
  @com.fasterxml.jackson.annotation.JsonProperty("packageType")
  public String getPackageType() {
    return packageType;
  }
  
  /**
   **/
  public void setPackageType(String packageType) {
    this.packageType = packageType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("originalPriceType")
  @com.fasterxml.jackson.annotation.JsonProperty("originalPriceType")
  public OriginalPriceTypeEnum getOriginalPriceType() {
    return originalPriceType;
  }
  
  /**
   **/
  public void setOriginalPriceType(OriginalPriceTypeEnum originalPriceType) {
    this.originalPriceType = originalPriceType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("originalPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("originalPrice")
  public Long getOriginalPrice() {
    return originalPrice;
  }
  
  /**
   **/
  public void setOriginalPrice(Long originalPrice) {
    this.originalPrice = originalPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("onSaleStart")
  @com.fasterxml.jackson.annotation.JsonProperty("onSaleStart")
  public Date getOnSaleStart() {
    return onSaleStart;
  }
  
  /**
   **/
  public void setOnSaleStart(Date onSaleStart) {
    this.onSaleStart = onSaleStart;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("onSaleEnd")
  @com.fasterxml.jackson.annotation.JsonProperty("onSaleEnd")
  public Date getOnSaleEnd() {
    return onSaleEnd;
  }
  
  /**
   **/
  public void setOnSaleEnd(Date onSaleEnd) {
    this.onSaleEnd = onSaleEnd;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("locationDtos")
  @com.fasterxml.jackson.annotation.JsonProperty("locationDtos")
  public List<LocationDtoOfBasicInfoDto> getLocationDtos() {
    return locationDtos;
  }
  
  /**
   **/
  public void setLocationDtos(List<LocationDtoOfBasicInfoDto> locationDtos) {
    this.locationDtos = locationDtos;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("id")
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  public Long getId() {
    return id;
  }
  
  /**
   **/
  public void setId(Long id) {
    this.id = id;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("extraProperties")
  @com.fasterxml.jackson.annotation.JsonProperty("extraProperties")
  public Map<String, String> getExtraProperties() {
    return extraProperties;
  }
  
  /**
   **/
  public void setExtraProperties(Map<String, String> extraProperties) {
    this.extraProperties = extraProperties;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("extraInfoList")
  @com.fasterxml.jackson.annotation.JsonProperty("extraInfoList")
  public List<String> getExtraInfoList() {
    return extraInfoList;
  }
  
  /**
   **/
  public void setExtraInfoList(List<String> extraInfoList) {
    this.extraInfoList = extraInfoList;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("divisionType")
  @com.fasterxml.jackson.annotation.JsonProperty("divisionType")
  public String getDivisionType() {
    return divisionType;
  }
  
  /**
   **/
  public void setDivisionType(String divisionType) {
    this.divisionType = divisionType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("adultOnly")
  @com.fasterxml.jackson.annotation.JsonProperty("adultOnly")
  public Boolean getAdultOnly() {
    return adultOnly;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isAdultOnly() {
    return adultOnly == null ? false : adultOnly;
  }
  
  /**
   **/
  public void setAdultOnly(Boolean adultOnly) {
    this.adultOnly = adultOnly;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicInfoDto basicInfoDto = (BasicInfoDto) o;
    return Objects.equals(this.valid, basicInfoDto.valid) &&
        Objects.equals(this.uniqueMessage, basicInfoDto.uniqueMessage) &&
        Objects.equals(this.title, basicInfoDto.title) &&
        Objects.equals(this.termsOfUse, basicInfoDto.termsOfUse) &&
        Objects.equals(this.subDivisionType, basicInfoDto.subDivisionType) &&
        Objects.equals(this.sellingStatusType, basicInfoDto.sellingStatusType) &&
        Objects.equals(this.salesPrice, basicInfoDto.salesPrice) &&
        Objects.equals(this.salesCount, basicInfoDto.salesCount) &&
        Objects.equals(this.purchaseLimitPerUser, basicInfoDto.purchaseLimitPerUser) &&
        Objects.equals(this.priceExtraDescriptions, basicInfoDto.priceExtraDescriptions) &&
        Objects.equals(this.priceDescription, basicInfoDto.priceDescription) &&
        Objects.equals(this.pictogramList, basicInfoDto.pictogramList) &&
        Objects.equals(this.packageType, basicInfoDto.packageType) &&
        Objects.equals(this.originalPriceType, basicInfoDto.originalPriceType) &&
        Objects.equals(this.originalPrice, basicInfoDto.originalPrice) &&
        Objects.equals(this.onSaleStart, basicInfoDto.onSaleStart) &&
        Objects.equals(this.onSaleEnd, basicInfoDto.onSaleEnd) &&
        Objects.equals(this.locationDtos, basicInfoDto.locationDtos) &&
        Objects.equals(this.id, basicInfoDto.id) &&
        Objects.equals(this.extraProperties, basicInfoDto.extraProperties) &&
        Objects.equals(this.extraInfoList, basicInfoDto.extraInfoList) &&
        Objects.equals(this.divisionType, basicInfoDto.divisionType) &&
        Objects.equals(this.adultOnly, basicInfoDto.adultOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, uniqueMessage, title, termsOfUse, subDivisionType, sellingStatusType, salesPrice, salesCount, purchaseLimitPerUser, priceExtraDescriptions, priceDescription, pictogramList, packageType, originalPriceType, originalPrice, onSaleStart, onSaleEnd, locationDtos, id, extraProperties, extraInfoList, divisionType, adultOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicInfoDto {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    uniqueMessage: ").append(toIndentedString(uniqueMessage)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    termsOfUse: ").append(toIndentedString(termsOfUse)).append("\n");
    sb.append("    subDivisionType: ").append(toIndentedString(subDivisionType)).append("\n");
    sb.append("    sellingStatusType: ").append(toIndentedString(sellingStatusType)).append("\n");
    sb.append("    salesPrice: ").append(toIndentedString(salesPrice)).append("\n");
    sb.append("    salesCount: ").append(toIndentedString(salesCount)).append("\n");
    sb.append("    purchaseLimitPerUser: ").append(toIndentedString(purchaseLimitPerUser)).append("\n");
    sb.append("    priceExtraDescriptions: ").append(toIndentedString(priceExtraDescriptions)).append("\n");
    sb.append("    priceDescription: ").append(toIndentedString(priceDescription)).append("\n");
    sb.append("    pictogramList: ").append(toIndentedString(pictogramList)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
    sb.append("    originalPriceType: ").append(toIndentedString(originalPriceType)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    onSaleStart: ").append(toIndentedString(onSaleStart)).append("\n");
    sb.append("    onSaleEnd: ").append(toIndentedString(onSaleEnd)).append("\n");
    sb.append("    locationDtos: ").append(toIndentedString(locationDtos)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    extraProperties: ").append(toIndentedString(extraProperties)).append("\n");
    sb.append("    extraInfoList: ").append(toIndentedString(extraInfoList)).append("\n");
    sb.append("    divisionType: ").append(toIndentedString(divisionType)).append("\n");
    sb.append("    adultOnly: ").append(toIndentedString(adultOnly)).append("\n");
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

  public static BasicInfoDtoBuilder builder() {
    return new BasicInfoDtoBuilder();
  }

  public static class BasicInfoDtoBuilder {

    private Boolean valid = null;
    private String uniqueMessage = null;
    private String title = null;
    private String termsOfUse = null;
    private String subDivisionType = null;
    private SellingStatusTypeEnum sellingStatusType = null;
    private Long salesPrice = null;
    private Integer salesCount = null;
    private Integer purchaseLimitPerUser = null;
    private List<String> priceExtraDescriptions = new ArrayList<String>();
    private String priceDescription = null;
    private List<String> pictogramList = new ArrayList<String>();
    private String packageType = null;
    private OriginalPriceTypeEnum originalPriceType = null;
    private Long originalPrice = null;
    private Date onSaleStart = null;
    private Date onSaleEnd = null;
    private List<LocationDtoOfBasicInfoDto> locationDtos = new ArrayList<LocationDtoOfBasicInfoDto>();
    private Long id = null;
    private Map<String, String> extraProperties = new HashMap<String, String>();
    private List<String> extraInfoList = new ArrayList<String>();
    private String divisionType = null;
    private Boolean adultOnly = null;
    

    BasicInfoDtoBuilder() {
    }

    /**
     **/
    public BasicInfoDtoBuilder valid(Boolean valid) {
      this.valid = valid;
      return this;
    }

    /**
     **/
    public BasicInfoDtoBuilder uniqueMessage(String uniqueMessage) {
      this.uniqueMessage = uniqueMessage;
      return this;
    }

    /**
     **/
    public BasicInfoDtoBuilder title(String title) {
      this.title = title;
      return this;
    }

    /**
     **/
    public BasicInfoDtoBuilder termsOfUse(String termsOfUse) {
      this.termsOfUse = termsOfUse;
      return this;
    }

    /**
     **/
    public BasicInfoDtoBuilder subDivisionType(String subDivisionType) {
      this.subDivisionType = subDivisionType;
      return this;
    }

    /**
     **/
    public BasicInfoDtoBuilder sellingStatusType(SellingStatusTypeEnum sellingStatusType) {
      this.sellingStatusType = sellingStatusType;
      return this;
    }

    /**
     **/
    public BasicInfoDtoBuilder salesPrice(Long salesPrice) {
      this.salesPrice = salesPrice;
      return this;
    }

    /**
     **/
    public BasicInfoDtoBuilder salesCount(Integer salesCount) {
      this.salesCount = salesCount;
      return this;
    }

    /**
     **/
    public BasicInfoDtoBuilder purchaseLimitPerUser(Integer purchaseLimitPerUser) {
      this.purchaseLimitPerUser = purchaseLimitPerUser;
      return this;
    }

    /**
     **/
    public BasicInfoDtoBuilder priceExtraDescriptions(List<String> priceExtraDescriptions) {
      this.priceExtraDescriptions = priceExtraDescriptions;
      return this;
    }

    /**
     **/
    public BasicInfoDtoBuilder priceDescription(String priceDescription) {
      this.priceDescription = priceDescription;
      return this;
    }

    /**
     **/
    public BasicInfoDtoBuilder pictogramList(List<String> pictogramList) {
      this.pictogramList = pictogramList;
      return this;
    }

    /**
     **/
    public BasicInfoDtoBuilder packageType(String packageType) {
      this.packageType = packageType;
      return this;
    }

    /**
     **/
    public BasicInfoDtoBuilder originalPriceType(OriginalPriceTypeEnum originalPriceType) {
      this.originalPriceType = originalPriceType;
      return this;
    }

    /**
     **/
    public BasicInfoDtoBuilder originalPrice(Long originalPrice) {
      this.originalPrice = originalPrice;
      return this;
    }

    /**
     **/
    public BasicInfoDtoBuilder onSaleStart(Date onSaleStart) {
      this.onSaleStart = onSaleStart;
      return this;
    }

    /**
     **/
    public BasicInfoDtoBuilder onSaleEnd(Date onSaleEnd) {
      this.onSaleEnd = onSaleEnd;
      return this;
    }

    /**
     **/
    public BasicInfoDtoBuilder locationDtos(List<LocationDtoOfBasicInfoDto> locationDtos) {
      this.locationDtos = locationDtos;
      return this;
    }

    /**
     **/
    public BasicInfoDtoBuilder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public BasicInfoDtoBuilder extraProperties(Map<String, String> extraProperties) {
      this.extraProperties = extraProperties;
      return this;
    }

    /**
     **/
    public BasicInfoDtoBuilder extraInfoList(List<String> extraInfoList) {
      this.extraInfoList = extraInfoList;
      return this;
    }

    /**
     **/
    public BasicInfoDtoBuilder divisionType(String divisionType) {
      this.divisionType = divisionType;
      return this;
    }

    /**
     **/
    public BasicInfoDtoBuilder adultOnly(Boolean adultOnly) {
      this.adultOnly = adultOnly;
      return this;
    }


    public BasicInfoDto build() {
      BasicInfoDto basicInfoDto = new BasicInfoDto();
      basicInfoDto.setValid(this.valid);
      basicInfoDto.setUniqueMessage(this.uniqueMessage);
      basicInfoDto.setTitle(this.title);
      basicInfoDto.setTermsOfUse(this.termsOfUse);
      basicInfoDto.setSubDivisionType(this.subDivisionType);
      basicInfoDto.setSellingStatusType(this.sellingStatusType);
      basicInfoDto.setSalesPrice(this.salesPrice);
      basicInfoDto.setSalesCount(this.salesCount);
      basicInfoDto.setPurchaseLimitPerUser(this.purchaseLimitPerUser);
      basicInfoDto.setPriceExtraDescriptions(this.priceExtraDescriptions);
      basicInfoDto.setPriceDescription(this.priceDescription);
      basicInfoDto.setPictogramList(this.pictogramList);
      basicInfoDto.setPackageType(this.packageType);
      basicInfoDto.setOriginalPriceType(this.originalPriceType);
      basicInfoDto.setOriginalPrice(this.originalPrice);
      basicInfoDto.setOnSaleStart(this.onSaleStart);
      basicInfoDto.setOnSaleEnd(this.onSaleEnd);
      basicInfoDto.setLocationDtos(this.locationDtos);
      basicInfoDto.setId(this.id);
      basicInfoDto.setExtraProperties(this.extraProperties);
      basicInfoDto.setExtraInfoList(this.extraInfoList);
      basicInfoDto.setDivisionType(this.divisionType);
      basicInfoDto.setAdultOnly(this.adultOnly);
      return basicInfoDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BasicInfoDtoBuilder {\n");
      
      sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
      sb.append("    uniqueMessage: ").append(toIndentedString(uniqueMessage)).append("\n");
      sb.append("    title: ").append(toIndentedString(title)).append("\n");
      sb.append("    termsOfUse: ").append(toIndentedString(termsOfUse)).append("\n");
      sb.append("    subDivisionType: ").append(toIndentedString(subDivisionType)).append("\n");
      sb.append("    sellingStatusType: ").append(toIndentedString(sellingStatusType)).append("\n");
      sb.append("    salesPrice: ").append(toIndentedString(salesPrice)).append("\n");
      sb.append("    salesCount: ").append(toIndentedString(salesCount)).append("\n");
      sb.append("    purchaseLimitPerUser: ").append(toIndentedString(purchaseLimitPerUser)).append("\n");
      sb.append("    priceExtraDescriptions: ").append(toIndentedString(priceExtraDescriptions)).append("\n");
      sb.append("    priceDescription: ").append(toIndentedString(priceDescription)).append("\n");
      sb.append("    pictogramList: ").append(toIndentedString(pictogramList)).append("\n");
      sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
      sb.append("    originalPriceType: ").append(toIndentedString(originalPriceType)).append("\n");
      sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
      sb.append("    onSaleStart: ").append(toIndentedString(onSaleStart)).append("\n");
      sb.append("    onSaleEnd: ").append(toIndentedString(onSaleEnd)).append("\n");
      sb.append("    locationDtos: ").append(toIndentedString(locationDtos)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    extraProperties: ").append(toIndentedString(extraProperties)).append("\n");
      sb.append("    extraInfoList: ").append(toIndentedString(extraInfoList)).append("\n");
      sb.append("    divisionType: ").append(toIndentedString(divisionType)).append("\n");
      sb.append("    adultOnly: ").append(toIndentedString(adultOnly)).append("\n");
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

