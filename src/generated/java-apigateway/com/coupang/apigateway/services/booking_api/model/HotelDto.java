package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.booking_api.model.HotelAmenityDto;
import com.coupang.apigateway.services.booking_api.model.HotelAttributeDto;
import com.coupang.apigateway.services.booking_api.model.HotelDetailDto;
import com.coupang.apigateway.services.booking_api.model.HotelImageDto;
import com.coupang.apigateway.services.booking_api.model.RegionDto;
import java.util.*;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class HotelDto   {
  
  private String telephone = null;
  private RegionDto regionDto = null;
  private Long productId = null;
  private String postalCode = null;
  private Integer numberOfRooms = null;
  private Integer numberOfFloors = null;
  private String nativeCurrencyCode = null;
  private java.math.BigDecimal maxGrade = null;
  private String mainImagePath = null;
  private java.math.BigDecimal longitude = null;
  private String locationType = null;
  private java.math.BigDecimal latitude = null;
  private String krName = null;
  private Integer imageOriginWidth = null;
  private Integer imageOriginHeight = null;
  private String hotelSummary = null;
  private String hotelStatus = null;
  private List<HotelImageDto> hotelImageDtos = new ArrayList<HotelImageDto>();
  private Long hotelId = null;
  private Map<String, HotelDetailDto> hotelDetailDtoMap = new HashMap<String, HotelDetailDto>();
  private HotelAttributeDto hotelAttributeDto = null;
  private List<HotelAmenityDto> hotelAmenityDtos = new ArrayList<HotelAmenityDto>();
  private String homePageUrl = null;
  private String gradeType = null;
  private java.math.BigDecimal grade = null;
  private String fax = null;
  private String engName = null;
  private String checkOutTime = null;
  private String checkInTime = null;
  private String address = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("telephone")
  @com.fasterxml.jackson.annotation.JsonProperty("telephone")
  public String getTelephone() {
    return telephone;
  }
  
  /**
   **/
  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("regionDto")
  @com.fasterxml.jackson.annotation.JsonProperty("regionDto")
  public RegionDto getRegionDto() {
    return regionDto;
  }
  
  /**
   **/
  public void setRegionDto(RegionDto regionDto) {
    this.regionDto = regionDto;
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
  @org.codehaus.jackson.annotate.JsonProperty("postalCode")
  @com.fasterxml.jackson.annotation.JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }
  
  /**
   **/
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("numberOfRooms")
  @com.fasterxml.jackson.annotation.JsonProperty("numberOfRooms")
  public Integer getNumberOfRooms() {
    return numberOfRooms;
  }
  
  /**
   **/
  public void setNumberOfRooms(Integer numberOfRooms) {
    this.numberOfRooms = numberOfRooms;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("numberOfFloors")
  @com.fasterxml.jackson.annotation.JsonProperty("numberOfFloors")
  public Integer getNumberOfFloors() {
    return numberOfFloors;
  }
  
  /**
   **/
  public void setNumberOfFloors(Integer numberOfFloors) {
    this.numberOfFloors = numberOfFloors;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("nativeCurrencyCode")
  @com.fasterxml.jackson.annotation.JsonProperty("nativeCurrencyCode")
  public String getNativeCurrencyCode() {
    return nativeCurrencyCode;
  }
  
  /**
   **/
  public void setNativeCurrencyCode(String nativeCurrencyCode) {
    this.nativeCurrencyCode = nativeCurrencyCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("maxGrade")
  @com.fasterxml.jackson.annotation.JsonProperty("maxGrade")
  public java.math.BigDecimal getMaxGrade() {
    return maxGrade;
  }
  
  /**
   **/
  public void setMaxGrade(java.math.BigDecimal maxGrade) {
    this.maxGrade = maxGrade;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("mainImagePath")
  @com.fasterxml.jackson.annotation.JsonProperty("mainImagePath")
  public String getMainImagePath() {
    return mainImagePath;
  }
  
  /**
   **/
  public void setMainImagePath(String mainImagePath) {
    this.mainImagePath = mainImagePath;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("longitude")
  @com.fasterxml.jackson.annotation.JsonProperty("longitude")
  public java.math.BigDecimal getLongitude() {
    return longitude;
  }
  
  /**
   **/
  public void setLongitude(java.math.BigDecimal longitude) {
    this.longitude = longitude;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("locationType")
  @com.fasterxml.jackson.annotation.JsonProperty("locationType")
  public String getLocationType() {
    return locationType;
  }
  
  /**
   **/
  public void setLocationType(String locationType) {
    this.locationType = locationType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("latitude")
  @com.fasterxml.jackson.annotation.JsonProperty("latitude")
  public java.math.BigDecimal getLatitude() {
    return latitude;
  }
  
  /**
   **/
  public void setLatitude(java.math.BigDecimal latitude) {
    this.latitude = latitude;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("krName")
  @com.fasterxml.jackson.annotation.JsonProperty("krName")
  public String getKrName() {
    return krName;
  }
  
  /**
   **/
  public void setKrName(String krName) {
    this.krName = krName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("imageOriginWidth")
  @com.fasterxml.jackson.annotation.JsonProperty("imageOriginWidth")
  public Integer getImageOriginWidth() {
    return imageOriginWidth;
  }
  
  /**
   **/
  public void setImageOriginWidth(Integer imageOriginWidth) {
    this.imageOriginWidth = imageOriginWidth;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("imageOriginHeight")
  @com.fasterxml.jackson.annotation.JsonProperty("imageOriginHeight")
  public Integer getImageOriginHeight() {
    return imageOriginHeight;
  }
  
  /**
   **/
  public void setImageOriginHeight(Integer imageOriginHeight) {
    this.imageOriginHeight = imageOriginHeight;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("hotelSummary")
  @com.fasterxml.jackson.annotation.JsonProperty("hotelSummary")
  public String getHotelSummary() {
    return hotelSummary;
  }
  
  /**
   **/
  public void setHotelSummary(String hotelSummary) {
    this.hotelSummary = hotelSummary;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("hotelStatus")
  @com.fasterxml.jackson.annotation.JsonProperty("hotelStatus")
  public String getHotelStatus() {
    return hotelStatus;
  }
  
  /**
   **/
  public void setHotelStatus(String hotelStatus) {
    this.hotelStatus = hotelStatus;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("hotelImageDtos")
  @com.fasterxml.jackson.annotation.JsonProperty("hotelImageDtos")
  public List<HotelImageDto> getHotelImageDtos() {
    return hotelImageDtos;
  }
  
  /**
   **/
  public void setHotelImageDtos(List<HotelImageDto> hotelImageDtos) {
    this.hotelImageDtos = hotelImageDtos;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("hotelId")
  @com.fasterxml.jackson.annotation.JsonProperty("hotelId")
  public Long getHotelId() {
    return hotelId;
  }
  
  /**
   **/
  public void setHotelId(Long hotelId) {
    this.hotelId = hotelId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("hotelDetailDtoMap")
  @com.fasterxml.jackson.annotation.JsonProperty("hotelDetailDtoMap")
  public Map<String, HotelDetailDto> getHotelDetailDtoMap() {
    return hotelDetailDtoMap;
  }
  
  /**
   **/
  public void setHotelDetailDtoMap(Map<String, HotelDetailDto> hotelDetailDtoMap) {
    this.hotelDetailDtoMap = hotelDetailDtoMap;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("hotelAttributeDto")
  @com.fasterxml.jackson.annotation.JsonProperty("hotelAttributeDto")
  public HotelAttributeDto getHotelAttributeDto() {
    return hotelAttributeDto;
  }
  
  /**
   **/
  public void setHotelAttributeDto(HotelAttributeDto hotelAttributeDto) {
    this.hotelAttributeDto = hotelAttributeDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("hotelAmenityDtos")
  @com.fasterxml.jackson.annotation.JsonProperty("hotelAmenityDtos")
  public List<HotelAmenityDto> getHotelAmenityDtos() {
    return hotelAmenityDtos;
  }
  
  /**
   **/
  public void setHotelAmenityDtos(List<HotelAmenityDto> hotelAmenityDtos) {
    this.hotelAmenityDtos = hotelAmenityDtos;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("homePageUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("homePageUrl")
  public String getHomePageUrl() {
    return homePageUrl;
  }
  
  /**
   **/
  public void setHomePageUrl(String homePageUrl) {
    this.homePageUrl = homePageUrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("gradeType")
  @com.fasterxml.jackson.annotation.JsonProperty("gradeType")
  public String getGradeType() {
    return gradeType;
  }
  
  /**
   **/
  public void setGradeType(String gradeType) {
    this.gradeType = gradeType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("grade")
  @com.fasterxml.jackson.annotation.JsonProperty("grade")
  public java.math.BigDecimal getGrade() {
    return grade;
  }
  
  /**
   **/
  public void setGrade(java.math.BigDecimal grade) {
    this.grade = grade;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("fax")
  @com.fasterxml.jackson.annotation.JsonProperty("fax")
  public String getFax() {
    return fax;
  }
  
  /**
   **/
  public void setFax(String fax) {
    this.fax = fax;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("engName")
  @com.fasterxml.jackson.annotation.JsonProperty("engName")
  public String getEngName() {
    return engName;
  }
  
  /**
   **/
  public void setEngName(String engName) {
    this.engName = engName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("checkOutTime")
  @com.fasterxml.jackson.annotation.JsonProperty("checkOutTime")
  public String getCheckOutTime() {
    return checkOutTime;
  }
  
  /**
   **/
  public void setCheckOutTime(String checkOutTime) {
    this.checkOutTime = checkOutTime;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("checkInTime")
  @com.fasterxml.jackson.annotation.JsonProperty("checkInTime")
  public String getCheckInTime() {
    return checkInTime;
  }
  
  /**
   **/
  public void setCheckInTime(String checkInTime) {
    this.checkInTime = checkInTime;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("address")
  @com.fasterxml.jackson.annotation.JsonProperty("address")
  public String getAddress() {
    return address;
  }
  
  /**
   **/
  public void setAddress(String address) {
    this.address = address;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelDto hotelDto = (HotelDto) o;
    return Objects.equals(this.telephone, hotelDto.telephone) &&
        Objects.equals(this.regionDto, hotelDto.regionDto) &&
        Objects.equals(this.productId, hotelDto.productId) &&
        Objects.equals(this.postalCode, hotelDto.postalCode) &&
        Objects.equals(this.numberOfRooms, hotelDto.numberOfRooms) &&
        Objects.equals(this.numberOfFloors, hotelDto.numberOfFloors) &&
        Objects.equals(this.nativeCurrencyCode, hotelDto.nativeCurrencyCode) &&
        Objects.equals(this.maxGrade, hotelDto.maxGrade) &&
        Objects.equals(this.mainImagePath, hotelDto.mainImagePath) &&
        Objects.equals(this.longitude, hotelDto.longitude) &&
        Objects.equals(this.locationType, hotelDto.locationType) &&
        Objects.equals(this.latitude, hotelDto.latitude) &&
        Objects.equals(this.krName, hotelDto.krName) &&
        Objects.equals(this.imageOriginWidth, hotelDto.imageOriginWidth) &&
        Objects.equals(this.imageOriginHeight, hotelDto.imageOriginHeight) &&
        Objects.equals(this.hotelSummary, hotelDto.hotelSummary) &&
        Objects.equals(this.hotelStatus, hotelDto.hotelStatus) &&
        Objects.equals(this.hotelImageDtos, hotelDto.hotelImageDtos) &&
        Objects.equals(this.hotelId, hotelDto.hotelId) &&
        Objects.equals(this.hotelDetailDtoMap, hotelDto.hotelDetailDtoMap) &&
        Objects.equals(this.hotelAttributeDto, hotelDto.hotelAttributeDto) &&
        Objects.equals(this.hotelAmenityDtos, hotelDto.hotelAmenityDtos) &&
        Objects.equals(this.homePageUrl, hotelDto.homePageUrl) &&
        Objects.equals(this.gradeType, hotelDto.gradeType) &&
        Objects.equals(this.grade, hotelDto.grade) &&
        Objects.equals(this.fax, hotelDto.fax) &&
        Objects.equals(this.engName, hotelDto.engName) &&
        Objects.equals(this.checkOutTime, hotelDto.checkOutTime) &&
        Objects.equals(this.checkInTime, hotelDto.checkInTime) &&
        Objects.equals(this.address, hotelDto.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(telephone, regionDto, productId, postalCode, numberOfRooms, numberOfFloors, nativeCurrencyCode, maxGrade, mainImagePath, longitude, locationType, latitude, krName, imageOriginWidth, imageOriginHeight, hotelSummary, hotelStatus, hotelImageDtos, hotelId, hotelDetailDtoMap, hotelAttributeDto, hotelAmenityDtos, homePageUrl, gradeType, grade, fax, engName, checkOutTime, checkInTime, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelDto {\n");
    
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    regionDto: ").append(toIndentedString(regionDto)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    numberOfRooms: ").append(toIndentedString(numberOfRooms)).append("\n");
    sb.append("    numberOfFloors: ").append(toIndentedString(numberOfFloors)).append("\n");
    sb.append("    nativeCurrencyCode: ").append(toIndentedString(nativeCurrencyCode)).append("\n");
    sb.append("    maxGrade: ").append(toIndentedString(maxGrade)).append("\n");
    sb.append("    mainImagePath: ").append(toIndentedString(mainImagePath)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    krName: ").append(toIndentedString(krName)).append("\n");
    sb.append("    imageOriginWidth: ").append(toIndentedString(imageOriginWidth)).append("\n");
    sb.append("    imageOriginHeight: ").append(toIndentedString(imageOriginHeight)).append("\n");
    sb.append("    hotelSummary: ").append(toIndentedString(hotelSummary)).append("\n");
    sb.append("    hotelStatus: ").append(toIndentedString(hotelStatus)).append("\n");
    sb.append("    hotelImageDtos: ").append(toIndentedString(hotelImageDtos)).append("\n");
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    hotelDetailDtoMap: ").append(toIndentedString(hotelDetailDtoMap)).append("\n");
    sb.append("    hotelAttributeDto: ").append(toIndentedString(hotelAttributeDto)).append("\n");
    sb.append("    hotelAmenityDtos: ").append(toIndentedString(hotelAmenityDtos)).append("\n");
    sb.append("    homePageUrl: ").append(toIndentedString(homePageUrl)).append("\n");
    sb.append("    gradeType: ").append(toIndentedString(gradeType)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    engName: ").append(toIndentedString(engName)).append("\n");
    sb.append("    checkOutTime: ").append(toIndentedString(checkOutTime)).append("\n");
    sb.append("    checkInTime: ").append(toIndentedString(checkInTime)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

  public static HotelDtoBuilder builder() {
    return new HotelDtoBuilder();
  }

  public static class HotelDtoBuilder {

    private String telephone = null;
    private RegionDto regionDto = null;
    private Long productId = null;
    private String postalCode = null;
    private Integer numberOfRooms = null;
    private Integer numberOfFloors = null;
    private String nativeCurrencyCode = null;
    private java.math.BigDecimal maxGrade = null;
    private String mainImagePath = null;
    private java.math.BigDecimal longitude = null;
    private String locationType = null;
    private java.math.BigDecimal latitude = null;
    private String krName = null;
    private Integer imageOriginWidth = null;
    private Integer imageOriginHeight = null;
    private String hotelSummary = null;
    private String hotelStatus = null;
    private List<HotelImageDto> hotelImageDtos = new ArrayList<HotelImageDto>();
    private Long hotelId = null;
    private Map<String, HotelDetailDto> hotelDetailDtoMap = new HashMap<String, HotelDetailDto>();
    private HotelAttributeDto hotelAttributeDto = null;
    private List<HotelAmenityDto> hotelAmenityDtos = new ArrayList<HotelAmenityDto>();
    private String homePageUrl = null;
    private String gradeType = null;
    private java.math.BigDecimal grade = null;
    private String fax = null;
    private String engName = null;
    private String checkOutTime = null;
    private String checkInTime = null;
    private String address = null;
    

    HotelDtoBuilder() {
    }

    /**
     **/
    public HotelDtoBuilder telephone(String telephone) {
      this.telephone = telephone;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder regionDto(RegionDto regionDto) {
      this.regionDto = regionDto;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder postalCode(String postalCode) {
      this.postalCode = postalCode;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder numberOfRooms(Integer numberOfRooms) {
      this.numberOfRooms = numberOfRooms;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder numberOfFloors(Integer numberOfFloors) {
      this.numberOfFloors = numberOfFloors;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder nativeCurrencyCode(String nativeCurrencyCode) {
      this.nativeCurrencyCode = nativeCurrencyCode;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder maxGrade(java.math.BigDecimal maxGrade) {
      this.maxGrade = maxGrade;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder mainImagePath(String mainImagePath) {
      this.mainImagePath = mainImagePath;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder longitude(java.math.BigDecimal longitude) {
      this.longitude = longitude;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder locationType(String locationType) {
      this.locationType = locationType;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder latitude(java.math.BigDecimal latitude) {
      this.latitude = latitude;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder krName(String krName) {
      this.krName = krName;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder imageOriginWidth(Integer imageOriginWidth) {
      this.imageOriginWidth = imageOriginWidth;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder imageOriginHeight(Integer imageOriginHeight) {
      this.imageOriginHeight = imageOriginHeight;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder hotelSummary(String hotelSummary) {
      this.hotelSummary = hotelSummary;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder hotelStatus(String hotelStatus) {
      this.hotelStatus = hotelStatus;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder hotelImageDtos(List<HotelImageDto> hotelImageDtos) {
      this.hotelImageDtos = hotelImageDtos;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder hotelId(Long hotelId) {
      this.hotelId = hotelId;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder hotelDetailDtoMap(Map<String, HotelDetailDto> hotelDetailDtoMap) {
      this.hotelDetailDtoMap = hotelDetailDtoMap;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder hotelAttributeDto(HotelAttributeDto hotelAttributeDto) {
      this.hotelAttributeDto = hotelAttributeDto;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder hotelAmenityDtos(List<HotelAmenityDto> hotelAmenityDtos) {
      this.hotelAmenityDtos = hotelAmenityDtos;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder homePageUrl(String homePageUrl) {
      this.homePageUrl = homePageUrl;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder gradeType(String gradeType) {
      this.gradeType = gradeType;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder grade(java.math.BigDecimal grade) {
      this.grade = grade;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder fax(String fax) {
      this.fax = fax;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder engName(String engName) {
      this.engName = engName;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder checkOutTime(String checkOutTime) {
      this.checkOutTime = checkOutTime;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder checkInTime(String checkInTime) {
      this.checkInTime = checkInTime;
      return this;
    }

    /**
     **/
    public HotelDtoBuilder address(String address) {
      this.address = address;
      return this;
    }


    public HotelDto build() {
      HotelDto hotelDto = new HotelDto();
      hotelDto.setTelephone(this.telephone);
      hotelDto.setRegionDto(this.regionDto);
      hotelDto.setProductId(this.productId);
      hotelDto.setPostalCode(this.postalCode);
      hotelDto.setNumberOfRooms(this.numberOfRooms);
      hotelDto.setNumberOfFloors(this.numberOfFloors);
      hotelDto.setNativeCurrencyCode(this.nativeCurrencyCode);
      hotelDto.setMaxGrade(this.maxGrade);
      hotelDto.setMainImagePath(this.mainImagePath);
      hotelDto.setLongitude(this.longitude);
      hotelDto.setLocationType(this.locationType);
      hotelDto.setLatitude(this.latitude);
      hotelDto.setKrName(this.krName);
      hotelDto.setImageOriginWidth(this.imageOriginWidth);
      hotelDto.setImageOriginHeight(this.imageOriginHeight);
      hotelDto.setHotelSummary(this.hotelSummary);
      hotelDto.setHotelStatus(this.hotelStatus);
      hotelDto.setHotelImageDtos(this.hotelImageDtos);
      hotelDto.setHotelId(this.hotelId);
      hotelDto.setHotelDetailDtoMap(this.hotelDetailDtoMap);
      hotelDto.setHotelAttributeDto(this.hotelAttributeDto);
      hotelDto.setHotelAmenityDtos(this.hotelAmenityDtos);
      hotelDto.setHomePageUrl(this.homePageUrl);
      hotelDto.setGradeType(this.gradeType);
      hotelDto.setGrade(this.grade);
      hotelDto.setFax(this.fax);
      hotelDto.setEngName(this.engName);
      hotelDto.setCheckOutTime(this.checkOutTime);
      hotelDto.setCheckInTime(this.checkInTime);
      hotelDto.setAddress(this.address);
      return hotelDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HotelDtoBuilder {\n");
      
      sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
      sb.append("    regionDto: ").append(toIndentedString(regionDto)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
      sb.append("    numberOfRooms: ").append(toIndentedString(numberOfRooms)).append("\n");
      sb.append("    numberOfFloors: ").append(toIndentedString(numberOfFloors)).append("\n");
      sb.append("    nativeCurrencyCode: ").append(toIndentedString(nativeCurrencyCode)).append("\n");
      sb.append("    maxGrade: ").append(toIndentedString(maxGrade)).append("\n");
      sb.append("    mainImagePath: ").append(toIndentedString(mainImagePath)).append("\n");
      sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
      sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
      sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
      sb.append("    krName: ").append(toIndentedString(krName)).append("\n");
      sb.append("    imageOriginWidth: ").append(toIndentedString(imageOriginWidth)).append("\n");
      sb.append("    imageOriginHeight: ").append(toIndentedString(imageOriginHeight)).append("\n");
      sb.append("    hotelSummary: ").append(toIndentedString(hotelSummary)).append("\n");
      sb.append("    hotelStatus: ").append(toIndentedString(hotelStatus)).append("\n");
      sb.append("    hotelImageDtos: ").append(toIndentedString(hotelImageDtos)).append("\n");
      sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
      sb.append("    hotelDetailDtoMap: ").append(toIndentedString(hotelDetailDtoMap)).append("\n");
      sb.append("    hotelAttributeDto: ").append(toIndentedString(hotelAttributeDto)).append("\n");
      sb.append("    hotelAmenityDtos: ").append(toIndentedString(hotelAmenityDtos)).append("\n");
      sb.append("    homePageUrl: ").append(toIndentedString(homePageUrl)).append("\n");
      sb.append("    gradeType: ").append(toIndentedString(gradeType)).append("\n");
      sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
      sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
      sb.append("    engName: ").append(toIndentedString(engName)).append("\n");
      sb.append("    checkOutTime: ").append(toIndentedString(checkOutTime)).append("\n");
      sb.append("    checkInTime: ").append(toIndentedString(checkInTime)).append("\n");
      sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

