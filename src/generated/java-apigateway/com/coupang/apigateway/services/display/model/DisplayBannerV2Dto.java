package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import com.coupang.apigateway.services.display.model.DisplayBannerExtraImageDto;
import com.coupang.apigateway.services.display.model.DisplayBannerImageDto;
import com.coupang.apigateway.services.display.model.DisplayBannerV2Dto;
import java.util.*;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayBannerV2Dto   {
  
  private String linkUrl = null;
  private List<DisplayBannerImageDto> imageDtos = new ArrayList<DisplayBannerImageDto>();
  private Map<String, DisplayBannerExtraImageDto> extraImageMap = new HashMap<String, DisplayBannerExtraImageDto>();
  private Boolean empty = null;
  private String description = null;
  private DisplayBannerV2Dto childBanner = null;


  public enum BannerTypeEnum {
    LINK("LINK"),
    NONE("NONE"),
    AREAMAP_LINK("AREAMAP_LINK"),
    CALL_CHILD("CALL_CHILD");

    private String value;

    BannerTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private BannerTypeEnum bannerType = null;
  private Long bannerId = null;
  private Map<String, String> assetMap = new HashMap<String, String>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("linkUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("linkUrl")
  public String getLinkUrl() {
    return linkUrl;
  }
  
  /**
   **/
  public void setLinkUrl(String linkUrl) {
    this.linkUrl = linkUrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("imageDtos")
  @com.fasterxml.jackson.annotation.JsonProperty("imageDtos")
  public List<DisplayBannerImageDto> getImageDtos() {
    return imageDtos;
  }
  
  /**
   **/
  public void setImageDtos(List<DisplayBannerImageDto> imageDtos) {
    this.imageDtos = imageDtos;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("extraImageMap")
  @com.fasterxml.jackson.annotation.JsonProperty("extraImageMap")
  public Map<String, DisplayBannerExtraImageDto> getExtraImageMap() {
    return extraImageMap;
  }
  
  /**
   **/
  public void setExtraImageMap(Map<String, DisplayBannerExtraImageDto> extraImageMap) {
    this.extraImageMap = extraImageMap;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("empty")
  @com.fasterxml.jackson.annotation.JsonProperty("empty")
  public Boolean getEmpty() {
    return empty;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isEmpty() {
    return empty == null ? false : empty;
  }
  
  /**
   **/
  public void setEmpty(Boolean empty) {
    this.empty = empty;
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
  @org.codehaus.jackson.annotate.JsonProperty("childBanner")
  @com.fasterxml.jackson.annotation.JsonProperty("childBanner")
  public DisplayBannerV2Dto getChildBanner() {
    return childBanner;
  }
  
  /**
   **/
  public void setChildBanner(DisplayBannerV2Dto childBanner) {
    this.childBanner = childBanner;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("bannerType")
  @com.fasterxml.jackson.annotation.JsonProperty("bannerType")
  public BannerTypeEnum getBannerType() {
    return bannerType;
  }
  
  /**
   **/
  public void setBannerType(BannerTypeEnum bannerType) {
    this.bannerType = bannerType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("bannerId")
  @com.fasterxml.jackson.annotation.JsonProperty("bannerId")
  public Long getBannerId() {
    return bannerId;
  }
  
  /**
   **/
  public void setBannerId(Long bannerId) {
    this.bannerId = bannerId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("assetMap")
  @com.fasterxml.jackson.annotation.JsonProperty("assetMap")
  public Map<String, String> getAssetMap() {
    return assetMap;
  }
  
  /**
   **/
  public void setAssetMap(Map<String, String> assetMap) {
    this.assetMap = assetMap;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayBannerV2Dto displayBannerV2Dto = (DisplayBannerV2Dto) o;
    return Objects.equals(this.linkUrl, displayBannerV2Dto.linkUrl) &&
        Objects.equals(this.imageDtos, displayBannerV2Dto.imageDtos) &&
        Objects.equals(this.extraImageMap, displayBannerV2Dto.extraImageMap) &&
        Objects.equals(this.empty, displayBannerV2Dto.empty) &&
        Objects.equals(this.description, displayBannerV2Dto.description) &&
        Objects.equals(this.childBanner, displayBannerV2Dto.childBanner) &&
        Objects.equals(this.bannerType, displayBannerV2Dto.bannerType) &&
        Objects.equals(this.bannerId, displayBannerV2Dto.bannerId) &&
        Objects.equals(this.assetMap, displayBannerV2Dto.assetMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkUrl, imageDtos, extraImageMap, empty, description, childBanner, bannerType, bannerId, assetMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayBannerV2Dto {\n");
    
    sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
    sb.append("    imageDtos: ").append(toIndentedString(imageDtos)).append("\n");
    sb.append("    extraImageMap: ").append(toIndentedString(extraImageMap)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    childBanner: ").append(toIndentedString(childBanner)).append("\n");
    sb.append("    bannerType: ").append(toIndentedString(bannerType)).append("\n");
    sb.append("    bannerId: ").append(toIndentedString(bannerId)).append("\n");
    sb.append("    assetMap: ").append(toIndentedString(assetMap)).append("\n");
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

  public static DisplayBannerV2DtoBuilder builder() {
    return new DisplayBannerV2DtoBuilder();
  }

  public static class DisplayBannerV2DtoBuilder {

    private String linkUrl = null;
    private List<DisplayBannerImageDto> imageDtos = new ArrayList<DisplayBannerImageDto>();
    private Map<String, DisplayBannerExtraImageDto> extraImageMap = new HashMap<String, DisplayBannerExtraImageDto>();
    private Boolean empty = null;
    private String description = null;
    private DisplayBannerV2Dto childBanner = null;
    private BannerTypeEnum bannerType = null;
    private Long bannerId = null;
    private Map<String, String> assetMap = new HashMap<String, String>();
    

    DisplayBannerV2DtoBuilder() {
    }

    /**
     **/
    public DisplayBannerV2DtoBuilder linkUrl(String linkUrl) {
      this.linkUrl = linkUrl;
      return this;
    }

    /**
     **/
    public DisplayBannerV2DtoBuilder imageDtos(List<DisplayBannerImageDto> imageDtos) {
      this.imageDtos = imageDtos;
      return this;
    }

    /**
     **/
    public DisplayBannerV2DtoBuilder extraImageMap(Map<String, DisplayBannerExtraImageDto> extraImageMap) {
      this.extraImageMap = extraImageMap;
      return this;
    }

    /**
     **/
    public DisplayBannerV2DtoBuilder empty(Boolean empty) {
      this.empty = empty;
      return this;
    }

    /**
     **/
    public DisplayBannerV2DtoBuilder description(String description) {
      this.description = description;
      return this;
    }

    /**
     **/
    public DisplayBannerV2DtoBuilder childBanner(DisplayBannerV2Dto childBanner) {
      this.childBanner = childBanner;
      return this;
    }

    /**
     **/
    public DisplayBannerV2DtoBuilder bannerType(BannerTypeEnum bannerType) {
      this.bannerType = bannerType;
      return this;
    }

    /**
     **/
    public DisplayBannerV2DtoBuilder bannerId(Long bannerId) {
      this.bannerId = bannerId;
      return this;
    }

    /**
     **/
    public DisplayBannerV2DtoBuilder assetMap(Map<String, String> assetMap) {
      this.assetMap = assetMap;
      return this;
    }


    public DisplayBannerV2Dto build() {
      DisplayBannerV2Dto displayBannerV2Dto = new DisplayBannerV2Dto();
      displayBannerV2Dto.setLinkUrl(this.linkUrl);
      displayBannerV2Dto.setImageDtos(this.imageDtos);
      displayBannerV2Dto.setExtraImageMap(this.extraImageMap);
      displayBannerV2Dto.setEmpty(this.empty);
      displayBannerV2Dto.setDescription(this.description);
      displayBannerV2Dto.setChildBanner(this.childBanner);
      displayBannerV2Dto.setBannerType(this.bannerType);
      displayBannerV2Dto.setBannerId(this.bannerId);
      displayBannerV2Dto.setAssetMap(this.assetMap);
      return displayBannerV2Dto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayBannerV2DtoBuilder {\n");
      
      sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
      sb.append("    imageDtos: ").append(toIndentedString(imageDtos)).append("\n");
      sb.append("    extraImageMap: ").append(toIndentedString(extraImageMap)).append("\n");
      sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
      sb.append("    childBanner: ").append(toIndentedString(childBanner)).append("\n");
      sb.append("    bannerType: ").append(toIndentedString(bannerType)).append("\n");
      sb.append("    bannerId: ").append(toIndentedString(bannerId)).append("\n");
      sb.append("    assetMap: ").append(toIndentedString(assetMap)).append("\n");
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

