package com.coupang.apigateway.services.display.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class MobileSectionDto   {
  
  private String trackingName = null;
  private String sectionName = null;
  private Long sectionId = null;
  private String sectionBadgeUrl = null;
  private String iosVersion = null;
  private Boolean excludeMobileWeb = null;
  private String collectionType = null;
  private String androidVersion = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("trackingName")
  @com.fasterxml.jackson.annotation.JsonProperty("trackingName")
  public String getTrackingName() {
    return trackingName;
  }
  
  /**
   **/
  public void setTrackingName(String trackingName) {
    this.trackingName = trackingName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("sectionName")
  @com.fasterxml.jackson.annotation.JsonProperty("sectionName")
  public String getSectionName() {
    return sectionName;
  }
  
  /**
   **/
  public void setSectionName(String sectionName) {
    this.sectionName = sectionName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("sectionId")
  @com.fasterxml.jackson.annotation.JsonProperty("sectionId")
  public Long getSectionId() {
    return sectionId;
  }
  
  /**
   **/
  public void setSectionId(Long sectionId) {
    this.sectionId = sectionId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("sectionBadgeUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("sectionBadgeUrl")
  public String getSectionBadgeUrl() {
    return sectionBadgeUrl;
  }
  
  /**
   **/
  public void setSectionBadgeUrl(String sectionBadgeUrl) {
    this.sectionBadgeUrl = sectionBadgeUrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("iosVersion")
  @com.fasterxml.jackson.annotation.JsonProperty("iosVersion")
  public String getIosVersion() {
    return iosVersion;
  }
  
  /**
   **/
  public void setIosVersion(String iosVersion) {
    this.iosVersion = iosVersion;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("excludeMobileWeb")
  @com.fasterxml.jackson.annotation.JsonProperty("excludeMobileWeb")
  public Boolean getExcludeMobileWeb() {
    return excludeMobileWeb;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isExcludeMobileWeb() {
    return excludeMobileWeb == null ? false : excludeMobileWeb;
  }
  
  /**
   **/
  public void setExcludeMobileWeb(Boolean excludeMobileWeb) {
    this.excludeMobileWeb = excludeMobileWeb;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("collectionType")
  @com.fasterxml.jackson.annotation.JsonProperty("collectionType")
  public String getCollectionType() {
    return collectionType;
  }
  
  /**
   **/
  public void setCollectionType(String collectionType) {
    this.collectionType = collectionType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("androidVersion")
  @com.fasterxml.jackson.annotation.JsonProperty("androidVersion")
  public String getAndroidVersion() {
    return androidVersion;
  }
  
  /**
   **/
  public void setAndroidVersion(String androidVersion) {
    this.androidVersion = androidVersion;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileSectionDto mobileSectionDto = (MobileSectionDto) o;
    return Objects.equals(this.trackingName, mobileSectionDto.trackingName) &&
        Objects.equals(this.sectionName, mobileSectionDto.sectionName) &&
        Objects.equals(this.sectionId, mobileSectionDto.sectionId) &&
        Objects.equals(this.sectionBadgeUrl, mobileSectionDto.sectionBadgeUrl) &&
        Objects.equals(this.iosVersion, mobileSectionDto.iosVersion) &&
        Objects.equals(this.excludeMobileWeb, mobileSectionDto.excludeMobileWeb) &&
        Objects.equals(this.collectionType, mobileSectionDto.collectionType) &&
        Objects.equals(this.androidVersion, mobileSectionDto.androidVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackingName, sectionName, sectionId, sectionBadgeUrl, iosVersion, excludeMobileWeb, collectionType, androidVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileSectionDto {\n");
    
    sb.append("    trackingName: ").append(toIndentedString(trackingName)).append("\n");
    sb.append("    sectionName: ").append(toIndentedString(sectionName)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    sectionBadgeUrl: ").append(toIndentedString(sectionBadgeUrl)).append("\n");
    sb.append("    iosVersion: ").append(toIndentedString(iosVersion)).append("\n");
    sb.append("    excludeMobileWeb: ").append(toIndentedString(excludeMobileWeb)).append("\n");
    sb.append("    collectionType: ").append(toIndentedString(collectionType)).append("\n");
    sb.append("    androidVersion: ").append(toIndentedString(androidVersion)).append("\n");
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

  public static MobileSectionDtoBuilder builder() {
    return new MobileSectionDtoBuilder();
  }

  public static class MobileSectionDtoBuilder {

    private String trackingName = null;
    private String sectionName = null;
    private Long sectionId = null;
    private String sectionBadgeUrl = null;
    private String iosVersion = null;
    private Boolean excludeMobileWeb = null;
    private String collectionType = null;
    private String androidVersion = null;
    

    MobileSectionDtoBuilder() {
    }

    /**
     **/
    public MobileSectionDtoBuilder trackingName(String trackingName) {
      this.trackingName = trackingName;
      return this;
    }

    /**
     **/
    public MobileSectionDtoBuilder sectionName(String sectionName) {
      this.sectionName = sectionName;
      return this;
    }

    /**
     **/
    public MobileSectionDtoBuilder sectionId(Long sectionId) {
      this.sectionId = sectionId;
      return this;
    }

    /**
     **/
    public MobileSectionDtoBuilder sectionBadgeUrl(String sectionBadgeUrl) {
      this.sectionBadgeUrl = sectionBadgeUrl;
      return this;
    }

    /**
     **/
    public MobileSectionDtoBuilder iosVersion(String iosVersion) {
      this.iosVersion = iosVersion;
      return this;
    }

    /**
     **/
    public MobileSectionDtoBuilder excludeMobileWeb(Boolean excludeMobileWeb) {
      this.excludeMobileWeb = excludeMobileWeb;
      return this;
    }

    /**
     **/
    public MobileSectionDtoBuilder collectionType(String collectionType) {
      this.collectionType = collectionType;
      return this;
    }

    /**
     **/
    public MobileSectionDtoBuilder androidVersion(String androidVersion) {
      this.androidVersion = androidVersion;
      return this;
    }


    public MobileSectionDto build() {
      MobileSectionDto mobileSectionDto = new MobileSectionDto();
      mobileSectionDto.setTrackingName(this.trackingName);
      mobileSectionDto.setSectionName(this.sectionName);
      mobileSectionDto.setSectionId(this.sectionId);
      mobileSectionDto.setSectionBadgeUrl(this.sectionBadgeUrl);
      mobileSectionDto.setIosVersion(this.iosVersion);
      mobileSectionDto.setExcludeMobileWeb(this.excludeMobileWeb);
      mobileSectionDto.setCollectionType(this.collectionType);
      mobileSectionDto.setAndroidVersion(this.androidVersion);
      return mobileSectionDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MobileSectionDtoBuilder {\n");
      
      sb.append("    trackingName: ").append(toIndentedString(trackingName)).append("\n");
      sb.append("    sectionName: ").append(toIndentedString(sectionName)).append("\n");
      sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
      sb.append("    sectionBadgeUrl: ").append(toIndentedString(sectionBadgeUrl)).append("\n");
      sb.append("    iosVersion: ").append(toIndentedString(iosVersion)).append("\n");
      sb.append("    excludeMobileWeb: ").append(toIndentedString(excludeMobileWeb)).append("\n");
      sb.append("    collectionType: ").append(toIndentedString(collectionType)).append("\n");
      sb.append("    androidVersion: ").append(toIndentedString(androidVersion)).append("\n");
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

