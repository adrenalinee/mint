package com.coupang.apigateway.services.display.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class FlexibleBannerDto   {
  
  private Integer position = null;
  private Integer ordering = null;
  private String bannerCode = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("position")
  @com.fasterxml.jackson.annotation.JsonProperty("position")
  public Integer getPosition() {
    return position;
  }
  
  /**
   **/
  public void setPosition(Integer position) {
    this.position = position;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("ordering")
  @com.fasterxml.jackson.annotation.JsonProperty("ordering")
  public Integer getOrdering() {
    return ordering;
  }
  
  /**
   **/
  public void setOrdering(Integer ordering) {
    this.ordering = ordering;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("bannerCode")
  @com.fasterxml.jackson.annotation.JsonProperty("bannerCode")
  public String getBannerCode() {
    return bannerCode;
  }
  
  /**
   **/
  public void setBannerCode(String bannerCode) {
    this.bannerCode = bannerCode;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlexibleBannerDto flexibleBannerDto = (FlexibleBannerDto) o;
    return Objects.equals(this.position, flexibleBannerDto.position) &&
        Objects.equals(this.ordering, flexibleBannerDto.ordering) &&
        Objects.equals(this.bannerCode, flexibleBannerDto.bannerCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, ordering, bannerCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlexibleBannerDto {\n");
    
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
    sb.append("    bannerCode: ").append(toIndentedString(bannerCode)).append("\n");
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

  public static FlexibleBannerDtoBuilder builder() {
    return new FlexibleBannerDtoBuilder();
  }

  public static class FlexibleBannerDtoBuilder {

    private Integer position = null;
    private Integer ordering = null;
    private String bannerCode = null;
    

    FlexibleBannerDtoBuilder() {
    }

    /**
     **/
    public FlexibleBannerDtoBuilder position(Integer position) {
      this.position = position;
      return this;
    }

    /**
     **/
    public FlexibleBannerDtoBuilder ordering(Integer ordering) {
      this.ordering = ordering;
      return this;
    }

    /**
     **/
    public FlexibleBannerDtoBuilder bannerCode(String bannerCode) {
      this.bannerCode = bannerCode;
      return this;
    }


    public FlexibleBannerDto build() {
      FlexibleBannerDto flexibleBannerDto = new FlexibleBannerDto();
      flexibleBannerDto.setPosition(this.position);
      flexibleBannerDto.setOrdering(this.ordering);
      flexibleBannerDto.setBannerCode(this.bannerCode);
      return flexibleBannerDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class FlexibleBannerDtoBuilder {\n");
      
      sb.append("    position: ").append(toIndentedString(position)).append("\n");
      sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
      sb.append("    bannerCode: ").append(toIndentedString(bannerCode)).append("\n");
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

