package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_api.model.LatLng;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class LocationDtoOfBasicInfoDto   {
  
  private String zipCode = null;
  private Boolean representative = null;
  private String phoneNumber = null;
  private String name = null;
  private String locationType = null;
  private LatLng latLng = null;
  private Boolean isOverseas = null;
  private Long id = null;
  private String homepage = null;
  private String address = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("zipCode")
  @com.fasterxml.jackson.annotation.JsonProperty("zipCode")
  public String getZipCode() {
    return zipCode;
  }
  
  /**
   **/
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("representative")
  @com.fasterxml.jackson.annotation.JsonProperty("representative")
  public Boolean getRepresentative() {
    return representative;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isRepresentative() {
    return representative == null ? false : representative;
  }
  
  /**
   **/
  public void setRepresentative(Boolean representative) {
    this.representative = representative;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("phoneNumber")
  @com.fasterxml.jackson.annotation.JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  
  /**
   **/
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
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
  @org.codehaus.jackson.annotate.JsonProperty("latLng")
  @com.fasterxml.jackson.annotation.JsonProperty("latLng")
  public LatLng getLatLng() {
    return latLng;
  }
  
  /**
   **/
  public void setLatLng(LatLng latLng) {
    this.latLng = latLng;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("isOverseas")
  @com.fasterxml.jackson.annotation.JsonProperty("isOverseas")
  public Boolean getIsOverseas() {
    return isOverseas;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isIsOverseas() {
    return isOverseas == null ? false : isOverseas;
  }
  
  /**
   **/
  public void setIsOverseas(Boolean isOverseas) {
    this.isOverseas = isOverseas;
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
  @org.codehaus.jackson.annotate.JsonProperty("homepage")
  @com.fasterxml.jackson.annotation.JsonProperty("homepage")
  public String getHomepage() {
    return homepage;
  }
  
  /**
   **/
  public void setHomepage(String homepage) {
    this.homepage = homepage;
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
    LocationDtoOfBasicInfoDto locationDtoOfBasicInfoDto = (LocationDtoOfBasicInfoDto) o;
    return Objects.equals(this.zipCode, locationDtoOfBasicInfoDto.zipCode) &&
        Objects.equals(this.representative, locationDtoOfBasicInfoDto.representative) &&
        Objects.equals(this.phoneNumber, locationDtoOfBasicInfoDto.phoneNumber) &&
        Objects.equals(this.name, locationDtoOfBasicInfoDto.name) &&
        Objects.equals(this.locationType, locationDtoOfBasicInfoDto.locationType) &&
        Objects.equals(this.latLng, locationDtoOfBasicInfoDto.latLng) &&
        Objects.equals(this.isOverseas, locationDtoOfBasicInfoDto.isOverseas) &&
        Objects.equals(this.id, locationDtoOfBasicInfoDto.id) &&
        Objects.equals(this.homepage, locationDtoOfBasicInfoDto.homepage) &&
        Objects.equals(this.address, locationDtoOfBasicInfoDto.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zipCode, representative, phoneNumber, name, locationType, latLng, isOverseas, id, homepage, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationDtoOfBasicInfoDto {\n");
    
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    representative: ").append(toIndentedString(representative)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    latLng: ").append(toIndentedString(latLng)).append("\n");
    sb.append("    isOverseas: ").append(toIndentedString(isOverseas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
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

  public static LocationDtoOfBasicInfoDtoBuilder builder() {
    return new LocationDtoOfBasicInfoDtoBuilder();
  }

  public static class LocationDtoOfBasicInfoDtoBuilder {

    private String zipCode = null;
    private Boolean representative = null;
    private String phoneNumber = null;
    private String name = null;
    private String locationType = null;
    private LatLng latLng = null;
    private Boolean isOverseas = null;
    private Long id = null;
    private String homepage = null;
    private String address = null;
    

    LocationDtoOfBasicInfoDtoBuilder() {
    }

    /**
     **/
    public LocationDtoOfBasicInfoDtoBuilder zipCode(String zipCode) {
      this.zipCode = zipCode;
      return this;
    }

    /**
     **/
    public LocationDtoOfBasicInfoDtoBuilder representative(Boolean representative) {
      this.representative = representative;
      return this;
    }

    /**
     **/
    public LocationDtoOfBasicInfoDtoBuilder phoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    /**
     **/
    public LocationDtoOfBasicInfoDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public LocationDtoOfBasicInfoDtoBuilder locationType(String locationType) {
      this.locationType = locationType;
      return this;
    }

    /**
     **/
    public LocationDtoOfBasicInfoDtoBuilder latLng(LatLng latLng) {
      this.latLng = latLng;
      return this;
    }

    /**
     **/
    public LocationDtoOfBasicInfoDtoBuilder isOverseas(Boolean isOverseas) {
      this.isOverseas = isOverseas;
      return this;
    }

    /**
     **/
    public LocationDtoOfBasicInfoDtoBuilder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public LocationDtoOfBasicInfoDtoBuilder homepage(String homepage) {
      this.homepage = homepage;
      return this;
    }

    /**
     **/
    public LocationDtoOfBasicInfoDtoBuilder address(String address) {
      this.address = address;
      return this;
    }


    public LocationDtoOfBasicInfoDto build() {
      LocationDtoOfBasicInfoDto locationDtoOfBasicInfoDto = new LocationDtoOfBasicInfoDto();
      locationDtoOfBasicInfoDto.setZipCode(this.zipCode);
      locationDtoOfBasicInfoDto.setRepresentative(this.representative);
      locationDtoOfBasicInfoDto.setPhoneNumber(this.phoneNumber);
      locationDtoOfBasicInfoDto.setName(this.name);
      locationDtoOfBasicInfoDto.setLocationType(this.locationType);
      locationDtoOfBasicInfoDto.setLatLng(this.latLng);
      locationDtoOfBasicInfoDto.setIsOverseas(this.isOverseas);
      locationDtoOfBasicInfoDto.setId(this.id);
      locationDtoOfBasicInfoDto.setHomepage(this.homepage);
      locationDtoOfBasicInfoDto.setAddress(this.address);
      return locationDtoOfBasicInfoDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class LocationDtoOfBasicInfoDtoBuilder {\n");
      
      sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
      sb.append("    representative: ").append(toIndentedString(representative)).append("\n");
      sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
      sb.append("    latLng: ").append(toIndentedString(latLng)).append("\n");
      sb.append("    isOverseas: ").append(toIndentedString(isOverseas)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
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

