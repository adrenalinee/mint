package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_api.model.TravelImageDto;
import java.util.*;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class LegacyTravelDto   {
  
  private Integer zoomLevel = null;
  private Boolean usedUnfoldOption = null;
  private String specialBenefit = null;
  private Boolean shownOption3Depth = null;
  private Boolean shownCalendarOption = null;
  private String schedule = null;
  private String priceCriteria = null;
  private String packageType = null;
  private String optionPriceArea = null;
  private Date modDate = null;


  public enum MapTypeEnum {
    NAVER("NAVER"),
    GOOGLE("GOOGLE");

    private String value;

    MapTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private MapTypeEnum mapType = null;
  private String lng = null;
  private String lat = null;
  private List<TravelImageDto> images = new ArrayList<TravelImageDto>();
  private Long coupangSrl = null;
  private String calendarOptionType = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("zoomLevel")
  @com.fasterxml.jackson.annotation.JsonProperty("zoomLevel")
  public Integer getZoomLevel() {
    return zoomLevel;
  }
  
  /**
   **/
  public void setZoomLevel(Integer zoomLevel) {
    this.zoomLevel = zoomLevel;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("usedUnfoldOption")
  @com.fasterxml.jackson.annotation.JsonProperty("usedUnfoldOption")
  public Boolean getUsedUnfoldOption() {
    return usedUnfoldOption;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isUsedUnfoldOption() {
    return usedUnfoldOption == null ? false : usedUnfoldOption;
  }
  
  /**
   **/
  public void setUsedUnfoldOption(Boolean usedUnfoldOption) {
    this.usedUnfoldOption = usedUnfoldOption;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("specialBenefit")
  @com.fasterxml.jackson.annotation.JsonProperty("specialBenefit")
  public String getSpecialBenefit() {
    return specialBenefit;
  }
  
  /**
   **/
  public void setSpecialBenefit(String specialBenefit) {
    this.specialBenefit = specialBenefit;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("shownOption3Depth")
  @com.fasterxml.jackson.annotation.JsonProperty("shownOption3Depth")
  public Boolean getShownOption3Depth() {
    return shownOption3Depth;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isShownOption3Depth() {
    return shownOption3Depth == null ? false : shownOption3Depth;
  }
  
  /**
   **/
  public void setShownOption3Depth(Boolean shownOption3Depth) {
    this.shownOption3Depth = shownOption3Depth;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("shownCalendarOption")
  @com.fasterxml.jackson.annotation.JsonProperty("shownCalendarOption")
  public Boolean getShownCalendarOption() {
    return shownCalendarOption;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isShownCalendarOption() {
    return shownCalendarOption == null ? false : shownCalendarOption;
  }
  
  /**
   **/
  public void setShownCalendarOption(Boolean shownCalendarOption) {
    this.shownCalendarOption = shownCalendarOption;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("schedule")
  @com.fasterxml.jackson.annotation.JsonProperty("schedule")
  public String getSchedule() {
    return schedule;
  }
  
  /**
   **/
  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("priceCriteria")
  @com.fasterxml.jackson.annotation.JsonProperty("priceCriteria")
  public String getPriceCriteria() {
    return priceCriteria;
  }
  
  /**
   **/
  public void setPriceCriteria(String priceCriteria) {
    this.priceCriteria = priceCriteria;
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
  @org.codehaus.jackson.annotate.JsonProperty("optionPriceArea")
  @com.fasterxml.jackson.annotation.JsonProperty("optionPriceArea")
  public String getOptionPriceArea() {
    return optionPriceArea;
  }
  
  /**
   **/
  public void setOptionPriceArea(String optionPriceArea) {
    this.optionPriceArea = optionPriceArea;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("modDate")
  @com.fasterxml.jackson.annotation.JsonProperty("modDate")
  public Date getModDate() {
    return modDate;
  }
  
  /**
   **/
  public void setModDate(Date modDate) {
    this.modDate = modDate;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("mapType")
  @com.fasterxml.jackson.annotation.JsonProperty("mapType")
  public MapTypeEnum getMapType() {
    return mapType;
  }
  
  /**
   **/
  public void setMapType(MapTypeEnum mapType) {
    this.mapType = mapType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("lng")
  @com.fasterxml.jackson.annotation.JsonProperty("lng")
  public String getLng() {
    return lng;
  }
  
  /**
   **/
  public void setLng(String lng) {
    this.lng = lng;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("lat")
  @com.fasterxml.jackson.annotation.JsonProperty("lat")
  public String getLat() {
    return lat;
  }
  
  /**
   **/
  public void setLat(String lat) {
    this.lat = lat;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("images")
  @com.fasterxml.jackson.annotation.JsonProperty("images")
  public List<TravelImageDto> getImages() {
    return images;
  }
  
  /**
   **/
  public void setImages(List<TravelImageDto> images) {
    this.images = images;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("coupangSrl")
  @com.fasterxml.jackson.annotation.JsonProperty("coupangSrl")
  public Long getCoupangSrl() {
    return coupangSrl;
  }
  
  /**
   **/
  public void setCoupangSrl(Long coupangSrl) {
    this.coupangSrl = coupangSrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("calendarOptionType")
  @com.fasterxml.jackson.annotation.JsonProperty("calendarOptionType")
  public String getCalendarOptionType() {
    return calendarOptionType;
  }
  
  /**
   **/
  public void setCalendarOptionType(String calendarOptionType) {
    this.calendarOptionType = calendarOptionType;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegacyTravelDto legacyTravelDto = (LegacyTravelDto) o;
    return Objects.equals(this.zoomLevel, legacyTravelDto.zoomLevel) &&
        Objects.equals(this.usedUnfoldOption, legacyTravelDto.usedUnfoldOption) &&
        Objects.equals(this.specialBenefit, legacyTravelDto.specialBenefit) &&
        Objects.equals(this.shownOption3Depth, legacyTravelDto.shownOption3Depth) &&
        Objects.equals(this.shownCalendarOption, legacyTravelDto.shownCalendarOption) &&
        Objects.equals(this.schedule, legacyTravelDto.schedule) &&
        Objects.equals(this.priceCriteria, legacyTravelDto.priceCriteria) &&
        Objects.equals(this.packageType, legacyTravelDto.packageType) &&
        Objects.equals(this.optionPriceArea, legacyTravelDto.optionPriceArea) &&
        Objects.equals(this.modDate, legacyTravelDto.modDate) &&
        Objects.equals(this.mapType, legacyTravelDto.mapType) &&
        Objects.equals(this.lng, legacyTravelDto.lng) &&
        Objects.equals(this.lat, legacyTravelDto.lat) &&
        Objects.equals(this.images, legacyTravelDto.images) &&
        Objects.equals(this.coupangSrl, legacyTravelDto.coupangSrl) &&
        Objects.equals(this.calendarOptionType, legacyTravelDto.calendarOptionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zoomLevel, usedUnfoldOption, specialBenefit, shownOption3Depth, shownCalendarOption, schedule, priceCriteria, packageType, optionPriceArea, modDate, mapType, lng, lat, images, coupangSrl, calendarOptionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegacyTravelDto {\n");
    
    sb.append("    zoomLevel: ").append(toIndentedString(zoomLevel)).append("\n");
    sb.append("    usedUnfoldOption: ").append(toIndentedString(usedUnfoldOption)).append("\n");
    sb.append("    specialBenefit: ").append(toIndentedString(specialBenefit)).append("\n");
    sb.append("    shownOption3Depth: ").append(toIndentedString(shownOption3Depth)).append("\n");
    sb.append("    shownCalendarOption: ").append(toIndentedString(shownCalendarOption)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    priceCriteria: ").append(toIndentedString(priceCriteria)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
    sb.append("    optionPriceArea: ").append(toIndentedString(optionPriceArea)).append("\n");
    sb.append("    modDate: ").append(toIndentedString(modDate)).append("\n");
    sb.append("    mapType: ").append(toIndentedString(mapType)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    coupangSrl: ").append(toIndentedString(coupangSrl)).append("\n");
    sb.append("    calendarOptionType: ").append(toIndentedString(calendarOptionType)).append("\n");
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

  public static LegacyTravelDtoBuilder builder() {
    return new LegacyTravelDtoBuilder();
  }

  public static class LegacyTravelDtoBuilder {

    private Integer zoomLevel = null;
    private Boolean usedUnfoldOption = null;
    private String specialBenefit = null;
    private Boolean shownOption3Depth = null;
    private Boolean shownCalendarOption = null;
    private String schedule = null;
    private String priceCriteria = null;
    private String packageType = null;
    private String optionPriceArea = null;
    private Date modDate = null;
    private MapTypeEnum mapType = null;
    private String lng = null;
    private String lat = null;
    private List<TravelImageDto> images = new ArrayList<TravelImageDto>();
    private Long coupangSrl = null;
    private String calendarOptionType = null;
    

    LegacyTravelDtoBuilder() {
    }

    /**
     **/
    public LegacyTravelDtoBuilder zoomLevel(Integer zoomLevel) {
      this.zoomLevel = zoomLevel;
      return this;
    }

    /**
     **/
    public LegacyTravelDtoBuilder usedUnfoldOption(Boolean usedUnfoldOption) {
      this.usedUnfoldOption = usedUnfoldOption;
      return this;
    }

    /**
     **/
    public LegacyTravelDtoBuilder specialBenefit(String specialBenefit) {
      this.specialBenefit = specialBenefit;
      return this;
    }

    /**
     **/
    public LegacyTravelDtoBuilder shownOption3Depth(Boolean shownOption3Depth) {
      this.shownOption3Depth = shownOption3Depth;
      return this;
    }

    /**
     **/
    public LegacyTravelDtoBuilder shownCalendarOption(Boolean shownCalendarOption) {
      this.shownCalendarOption = shownCalendarOption;
      return this;
    }

    /**
     **/
    public LegacyTravelDtoBuilder schedule(String schedule) {
      this.schedule = schedule;
      return this;
    }

    /**
     **/
    public LegacyTravelDtoBuilder priceCriteria(String priceCriteria) {
      this.priceCriteria = priceCriteria;
      return this;
    }

    /**
     **/
    public LegacyTravelDtoBuilder packageType(String packageType) {
      this.packageType = packageType;
      return this;
    }

    /**
     **/
    public LegacyTravelDtoBuilder optionPriceArea(String optionPriceArea) {
      this.optionPriceArea = optionPriceArea;
      return this;
    }

    /**
     **/
    public LegacyTravelDtoBuilder modDate(Date modDate) {
      this.modDate = modDate;
      return this;
    }

    /**
     **/
    public LegacyTravelDtoBuilder mapType(MapTypeEnum mapType) {
      this.mapType = mapType;
      return this;
    }

    /**
     **/
    public LegacyTravelDtoBuilder lng(String lng) {
      this.lng = lng;
      return this;
    }

    /**
     **/
    public LegacyTravelDtoBuilder lat(String lat) {
      this.lat = lat;
      return this;
    }

    /**
     **/
    public LegacyTravelDtoBuilder images(List<TravelImageDto> images) {
      this.images = images;
      return this;
    }

    /**
     **/
    public LegacyTravelDtoBuilder coupangSrl(Long coupangSrl) {
      this.coupangSrl = coupangSrl;
      return this;
    }

    /**
     **/
    public LegacyTravelDtoBuilder calendarOptionType(String calendarOptionType) {
      this.calendarOptionType = calendarOptionType;
      return this;
    }


    public LegacyTravelDto build() {
      LegacyTravelDto legacyTravelDto = new LegacyTravelDto();
      legacyTravelDto.setZoomLevel(this.zoomLevel);
      legacyTravelDto.setUsedUnfoldOption(this.usedUnfoldOption);
      legacyTravelDto.setSpecialBenefit(this.specialBenefit);
      legacyTravelDto.setShownOption3Depth(this.shownOption3Depth);
      legacyTravelDto.setShownCalendarOption(this.shownCalendarOption);
      legacyTravelDto.setSchedule(this.schedule);
      legacyTravelDto.setPriceCriteria(this.priceCriteria);
      legacyTravelDto.setPackageType(this.packageType);
      legacyTravelDto.setOptionPriceArea(this.optionPriceArea);
      legacyTravelDto.setModDate(this.modDate);
      legacyTravelDto.setMapType(this.mapType);
      legacyTravelDto.setLng(this.lng);
      legacyTravelDto.setLat(this.lat);
      legacyTravelDto.setImages(this.images);
      legacyTravelDto.setCoupangSrl(this.coupangSrl);
      legacyTravelDto.setCalendarOptionType(this.calendarOptionType);
      return legacyTravelDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class LegacyTravelDtoBuilder {\n");
      
      sb.append("    zoomLevel: ").append(toIndentedString(zoomLevel)).append("\n");
      sb.append("    usedUnfoldOption: ").append(toIndentedString(usedUnfoldOption)).append("\n");
      sb.append("    specialBenefit: ").append(toIndentedString(specialBenefit)).append("\n");
      sb.append("    shownOption3Depth: ").append(toIndentedString(shownOption3Depth)).append("\n");
      sb.append("    shownCalendarOption: ").append(toIndentedString(shownCalendarOption)).append("\n");
      sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
      sb.append("    priceCriteria: ").append(toIndentedString(priceCriteria)).append("\n");
      sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
      sb.append("    optionPriceArea: ").append(toIndentedString(optionPriceArea)).append("\n");
      sb.append("    modDate: ").append(toIndentedString(modDate)).append("\n");
      sb.append("    mapType: ").append(toIndentedString(mapType)).append("\n");
      sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
      sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
      sb.append("    images: ").append(toIndentedString(images)).append("\n");
      sb.append("    coupangSrl: ").append(toIndentedString(coupangSrl)).append("\n");
      sb.append("    calendarOptionType: ").append(toIndentedString(calendarOptionType)).append("\n");
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

