package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import com.coupang.apigateway.services.display.model.DisplayComponentNodeDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayComponentActiveBundleDto   {
  
  private DisplayComponentNodeDto displayComponentNodeDto = null;
  private Long bundleId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("displayComponentNodeDto")
  @com.fasterxml.jackson.annotation.JsonProperty("displayComponentNodeDto")
  public DisplayComponentNodeDto getDisplayComponentNodeDto() {
    return displayComponentNodeDto;
  }
  
  /**
   **/
  public void setDisplayComponentNodeDto(DisplayComponentNodeDto displayComponentNodeDto) {
    this.displayComponentNodeDto = displayComponentNodeDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("bundleId")
  @com.fasterxml.jackson.annotation.JsonProperty("bundleId")
  public Long getBundleId() {
    return bundleId;
  }
  
  /**
   **/
  public void setBundleId(Long bundleId) {
    this.bundleId = bundleId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayComponentActiveBundleDto displayComponentActiveBundleDto = (DisplayComponentActiveBundleDto) o;
    return Objects.equals(this.displayComponentNodeDto, displayComponentActiveBundleDto.displayComponentNodeDto) &&
        Objects.equals(this.bundleId, displayComponentActiveBundleDto.bundleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayComponentNodeDto, bundleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayComponentActiveBundleDto {\n");
    
    sb.append("    displayComponentNodeDto: ").append(toIndentedString(displayComponentNodeDto)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
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

  public static DisplayComponentActiveBundleDtoBuilder builder() {
    return new DisplayComponentActiveBundleDtoBuilder();
  }

  public static class DisplayComponentActiveBundleDtoBuilder {

    private DisplayComponentNodeDto displayComponentNodeDto = null;
    private Long bundleId = null;
    

    DisplayComponentActiveBundleDtoBuilder() {
    }

    /**
     **/
    public DisplayComponentActiveBundleDtoBuilder displayComponentNodeDto(DisplayComponentNodeDto displayComponentNodeDto) {
      this.displayComponentNodeDto = displayComponentNodeDto;
      return this;
    }

    /**
     **/
    public DisplayComponentActiveBundleDtoBuilder bundleId(Long bundleId) {
      this.bundleId = bundleId;
      return this;
    }


    public DisplayComponentActiveBundleDto build() {
      DisplayComponentActiveBundleDto displayComponentActiveBundleDto = new DisplayComponentActiveBundleDto();
      displayComponentActiveBundleDto.setDisplayComponentNodeDto(this.displayComponentNodeDto);
      displayComponentActiveBundleDto.setBundleId(this.bundleId);
      return displayComponentActiveBundleDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayComponentActiveBundleDtoBuilder {\n");
      
      sb.append("    displayComponentNodeDto: ").append(toIndentedString(displayComponentNodeDto)).append("\n");
      sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
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

