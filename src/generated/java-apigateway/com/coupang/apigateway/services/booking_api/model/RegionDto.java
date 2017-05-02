package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.booking_api.model.RegionDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class RegionDto   {
  
  private String regionType = null;
  private String regionStatus = null;
  private Long regionId = null;
  private String regionCode = null;
  private RegionDto parentRegionDto = null;
  private Long numberOfHotels = null;
  private java.math.BigDecimal longitude = null;
  private java.math.BigDecimal latitude = null;
  private String krName = null;
  private String extraInfo = null;
  private String engName = null;

  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "CITY, COUNTRY")
  @org.codehaus.jackson.annotate.JsonProperty("regionType")
  @com.fasterxml.jackson.annotation.JsonProperty("regionType")
  public String getRegionType() {
    return regionType;
  }
  
  /**
   * CITY, COUNTRY
   **/
  public void setRegionType(String regionType) {
    this.regionType = regionType;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "지역이 유효한지 여부. VALID 면 유효함.")
  @org.codehaus.jackson.annotate.JsonProperty("regionStatus")
  @com.fasterxml.jackson.annotation.JsonProperty("regionStatus")
  public String getRegionStatus() {
    return regionStatus;
  }
  
  /**
   * 지역이 유효한지 여부. VALID 면 유효함.
   **/
  public void setRegionStatus(String regionStatus) {
    this.regionStatus = regionStatus;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "지역 아이디")
  @org.codehaus.jackson.annotate.JsonProperty("regionId")
  @com.fasterxml.jackson.annotation.JsonProperty("regionId")
  public Long getRegionId() {
    return regionId;
  }
  
  /**
   * 지역 아이디
   **/
  public void setRegionId(Long regionId) {
    this.regionId = regionId;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "지역 코드")
  @org.codehaus.jackson.annotate.JsonProperty("regionCode")
  @com.fasterxml.jackson.annotation.JsonProperty("regionCode")
  public String getRegionCode() {
    return regionCode;
  }
  
  /**
   * 지역 코드
   **/
  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "상위 지역")
  @org.codehaus.jackson.annotate.JsonProperty("parentRegionDto")
  @com.fasterxml.jackson.annotation.JsonProperty("parentRegionDto")
  public RegionDto getParentRegionDto() {
    return parentRegionDto;
  }
  
  /**
   * 상위 지역
   **/
  public void setParentRegionDto(RegionDto parentRegionDto) {
    this.parentRegionDto = parentRegionDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "지역내의 호텔 개수")
  @org.codehaus.jackson.annotate.JsonProperty("numberOfHotels")
  @com.fasterxml.jackson.annotation.JsonProperty("numberOfHotels")
  public Long getNumberOfHotels() {
    return numberOfHotels;
  }
  
  /**
   * 지역내의 호텔 개수
   **/
  public void setNumberOfHotels(Long numberOfHotels) {
    this.numberOfHotels = numberOfHotels;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "호텔좌표")
  @org.codehaus.jackson.annotate.JsonProperty("longitude")
  @com.fasterxml.jackson.annotation.JsonProperty("longitude")
  public java.math.BigDecimal getLongitude() {
    return longitude;
  }
  
  /**
   * 호텔좌표
   **/
  public void setLongitude(java.math.BigDecimal longitude) {
    this.longitude = longitude;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "호텔좌표")
  @org.codehaus.jackson.annotate.JsonProperty("latitude")
  @com.fasterxml.jackson.annotation.JsonProperty("latitude")
  public java.math.BigDecimal getLatitude() {
    return latitude;
  }
  
  /**
   * 호텔좌표
   **/
  public void setLatitude(java.math.BigDecimal latitude) {
    this.latitude = latitude;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "지역한글명")
  @org.codehaus.jackson.annotate.JsonProperty("krName")
  @com.fasterxml.jackson.annotation.JsonProperty("krName")
  public String getKrName() {
    return krName;
  }
  
  /**
   * 지역한글명
   **/
  public void setKrName(String krName) {
    this.krName = krName;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "호텔정보")
  @org.codehaus.jackson.annotate.JsonProperty("extraInfo")
  @com.fasterxml.jackson.annotation.JsonProperty("extraInfo")
  public String getExtraInfo() {
    return extraInfo;
  }
  
  /**
   * 호텔정보
   **/
  public void setExtraInfo(String extraInfo) {
    this.extraInfo = extraInfo;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "지역영문명")
  @org.codehaus.jackson.annotate.JsonProperty("engName")
  @com.fasterxml.jackson.annotation.JsonProperty("engName")
  public String getEngName() {
    return engName;
  }
  
  /**
   * 지역영문명
   **/
  public void setEngName(String engName) {
    this.engName = engName;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegionDto regionDto = (RegionDto) o;
    return Objects.equals(this.regionType, regionDto.regionType) &&
        Objects.equals(this.regionStatus, regionDto.regionStatus) &&
        Objects.equals(this.regionId, regionDto.regionId) &&
        Objects.equals(this.regionCode, regionDto.regionCode) &&
        Objects.equals(this.parentRegionDto, regionDto.parentRegionDto) &&
        Objects.equals(this.numberOfHotels, regionDto.numberOfHotels) &&
        Objects.equals(this.longitude, regionDto.longitude) &&
        Objects.equals(this.latitude, regionDto.latitude) &&
        Objects.equals(this.krName, regionDto.krName) &&
        Objects.equals(this.extraInfo, regionDto.extraInfo) &&
        Objects.equals(this.engName, regionDto.engName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regionType, regionStatus, regionId, regionCode, parentRegionDto, numberOfHotels, longitude, latitude, krName, extraInfo, engName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionDto {\n");
    
    sb.append("    regionType: ").append(toIndentedString(regionType)).append("\n");
    sb.append("    regionStatus: ").append(toIndentedString(regionStatus)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    parentRegionDto: ").append(toIndentedString(parentRegionDto)).append("\n");
    sb.append("    numberOfHotels: ").append(toIndentedString(numberOfHotels)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    krName: ").append(toIndentedString(krName)).append("\n");
    sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
    sb.append("    engName: ").append(toIndentedString(engName)).append("\n");
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

  public static RegionDtoBuilder builder() {
    return new RegionDtoBuilder();
  }

  public static class RegionDtoBuilder {

    private String regionType = null;
    private String regionStatus = null;
    private Long regionId = null;
    private String regionCode = null;
    private RegionDto parentRegionDto = null;
    private Long numberOfHotels = null;
    private java.math.BigDecimal longitude = null;
    private java.math.BigDecimal latitude = null;
    private String krName = null;
    private String extraInfo = null;
    private String engName = null;
    

    RegionDtoBuilder() {
    }

    /**
     * CITY, COUNTRY
     **/
    public RegionDtoBuilder regionType(String regionType) {
      this.regionType = regionType;
      return this;
    }

    /**
     * 지역이 유효한지 여부. VALID 면 유효함.
     **/
    public RegionDtoBuilder regionStatus(String regionStatus) {
      this.regionStatus = regionStatus;
      return this;
    }

    /**
     * 지역 아이디
     **/
    public RegionDtoBuilder regionId(Long regionId) {
      this.regionId = regionId;
      return this;
    }

    /**
     * 지역 코드
     **/
    public RegionDtoBuilder regionCode(String regionCode) {
      this.regionCode = regionCode;
      return this;
    }

    /**
     * 상위 지역
     **/
    public RegionDtoBuilder parentRegionDto(RegionDto parentRegionDto) {
      this.parentRegionDto = parentRegionDto;
      return this;
    }

    /**
     * 지역내의 호텔 개수
     **/
    public RegionDtoBuilder numberOfHotels(Long numberOfHotels) {
      this.numberOfHotels = numberOfHotels;
      return this;
    }

    /**
     * 호텔좌표
     **/
    public RegionDtoBuilder longitude(java.math.BigDecimal longitude) {
      this.longitude = longitude;
      return this;
    }

    /**
     * 호텔좌표
     **/
    public RegionDtoBuilder latitude(java.math.BigDecimal latitude) {
      this.latitude = latitude;
      return this;
    }

    /**
     * 지역한글명
     **/
    public RegionDtoBuilder krName(String krName) {
      this.krName = krName;
      return this;
    }

    /**
     * 호텔정보
     **/
    public RegionDtoBuilder extraInfo(String extraInfo) {
      this.extraInfo = extraInfo;
      return this;
    }

    /**
     * 지역영문명
     **/
    public RegionDtoBuilder engName(String engName) {
      this.engName = engName;
      return this;
    }


    public RegionDto build() {
      RegionDto regionDto = new RegionDto();
      regionDto.setRegionType(this.regionType);
      regionDto.setRegionStatus(this.regionStatus);
      regionDto.setRegionId(this.regionId);
      regionDto.setRegionCode(this.regionCode);
      regionDto.setParentRegionDto(this.parentRegionDto);
      regionDto.setNumberOfHotels(this.numberOfHotels);
      regionDto.setLongitude(this.longitude);
      regionDto.setLatitude(this.latitude);
      regionDto.setKrName(this.krName);
      regionDto.setExtraInfo(this.extraInfo);
      regionDto.setEngName(this.engName);
      return regionDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RegionDtoBuilder {\n");
      
      sb.append("    regionType: ").append(toIndentedString(regionType)).append("\n");
      sb.append("    regionStatus: ").append(toIndentedString(regionStatus)).append("\n");
      sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
      sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
      sb.append("    parentRegionDto: ").append(toIndentedString(parentRegionDto)).append("\n");
      sb.append("    numberOfHotels: ").append(toIndentedString(numberOfHotels)).append("\n");
      sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
      sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
      sb.append("    krName: ").append(toIndentedString(krName)).append("\n");
      sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
      sb.append("    engName: ").append(toIndentedString(engName)).append("\n");
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

