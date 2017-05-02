package com.coupang.apigateway.services.member_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.419+09:00")
public class ModifyIsAllowPushDto   {
  
  private Boolean isAllowPush = null;
  private Boolean isAllowMarketingPush = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("isAllowPush")
  @com.fasterxml.jackson.annotation.JsonProperty("isAllowPush")
  public Boolean getIsAllowPush() {
    return isAllowPush;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isIsAllowPush() {
    return isAllowPush == null ? false : isAllowPush;
  }
  
  /**
   **/
  public void setIsAllowPush(Boolean isAllowPush) {
    this.isAllowPush = isAllowPush;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("isAllowMarketingPush")
  @com.fasterxml.jackson.annotation.JsonProperty("isAllowMarketingPush")
  public Boolean getIsAllowMarketingPush() {
    return isAllowMarketingPush;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isIsAllowMarketingPush() {
    return isAllowMarketingPush == null ? false : isAllowMarketingPush;
  }
  
  /**
   **/
  public void setIsAllowMarketingPush(Boolean isAllowMarketingPush) {
    this.isAllowMarketingPush = isAllowMarketingPush;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyIsAllowPushDto modifyIsAllowPushDto = (ModifyIsAllowPushDto) o;
    return Objects.equals(this.isAllowPush, modifyIsAllowPushDto.isAllowPush) &&
        Objects.equals(this.isAllowMarketingPush, modifyIsAllowPushDto.isAllowMarketingPush);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isAllowPush, isAllowMarketingPush);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyIsAllowPushDto {\n");
    
    sb.append("    isAllowPush: ").append(toIndentedString(isAllowPush)).append("\n");
    sb.append("    isAllowMarketingPush: ").append(toIndentedString(isAllowMarketingPush)).append("\n");
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

  public static ModifyIsAllowPushDtoBuilder builder() {
    return new ModifyIsAllowPushDtoBuilder();
  }

  public static class ModifyIsAllowPushDtoBuilder {

    private Boolean isAllowPush = null;
    private Boolean isAllowMarketingPush = null;
    

    ModifyIsAllowPushDtoBuilder() {
    }

    /**
     **/
    public ModifyIsAllowPushDtoBuilder isAllowPush(Boolean isAllowPush) {
      this.isAllowPush = isAllowPush;
      return this;
    }

    /**
     **/
    public ModifyIsAllowPushDtoBuilder isAllowMarketingPush(Boolean isAllowMarketingPush) {
      this.isAllowMarketingPush = isAllowMarketingPush;
      return this;
    }


    public ModifyIsAllowPushDto build() {
      ModifyIsAllowPushDto modifyIsAllowPushDto = new ModifyIsAllowPushDto();
      modifyIsAllowPushDto.setIsAllowPush(this.isAllowPush);
      modifyIsAllowPushDto.setIsAllowMarketingPush(this.isAllowMarketingPush);
      return modifyIsAllowPushDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ModifyIsAllowPushDtoBuilder {\n");
      
      sb.append("    isAllowPush: ").append(toIndentedString(isAllowPush)).append("\n");
      sb.append("    isAllowMarketingPush: ").append(toIndentedString(isAllowMarketingPush)).append("\n");
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

