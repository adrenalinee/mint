package com.coupang.apigateway.services.coupang_mobile_web.model;

import java.util.Objects;
import com.coupang.apigateway.services.coupang_mobile_web.model.DetailPageLinkRequestIdDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.807+09:00")
public class DetailPageLinkRequestDto   {
  
  private List<DetailPageLinkRequestIdDto> idList = new ArrayList<DetailPageLinkRequestIdDto>();
  private Boolean forceLanding = null;
  private String appVersion = null;
  private String agentType = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("idList")
  @com.fasterxml.jackson.annotation.JsonProperty("idList")
  public List<DetailPageLinkRequestIdDto> getIdList() {
    return idList;
  }
  
  /**
   **/
  public void setIdList(List<DetailPageLinkRequestIdDto> idList) {
    this.idList = idList;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("forceLanding")
  @com.fasterxml.jackson.annotation.JsonProperty("forceLanding")
  public Boolean getForceLanding() {
    return forceLanding;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isForceLanding() {
    return forceLanding == null ? false : forceLanding;
  }
  
  /**
   **/
  public void setForceLanding(Boolean forceLanding) {
    this.forceLanding = forceLanding;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("appVersion")
  @com.fasterxml.jackson.annotation.JsonProperty("appVersion")
  public String getAppVersion() {
    return appVersion;
  }
  
  /**
   **/
  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("agentType")
  @com.fasterxml.jackson.annotation.JsonProperty("agentType")
  public String getAgentType() {
    return agentType;
  }
  
  /**
   **/
  public void setAgentType(String agentType) {
    this.agentType = agentType;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailPageLinkRequestDto detailPageLinkRequestDto = (DetailPageLinkRequestDto) o;
    return Objects.equals(this.idList, detailPageLinkRequestDto.idList) &&
        Objects.equals(this.forceLanding, detailPageLinkRequestDto.forceLanding) &&
        Objects.equals(this.appVersion, detailPageLinkRequestDto.appVersion) &&
        Objects.equals(this.agentType, detailPageLinkRequestDto.agentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idList, forceLanding, appVersion, agentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailPageLinkRequestDto {\n");
    
    sb.append("    idList: ").append(toIndentedString(idList)).append("\n");
    sb.append("    forceLanding: ").append(toIndentedString(forceLanding)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
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

  public static DetailPageLinkRequestDtoBuilder builder() {
    return new DetailPageLinkRequestDtoBuilder();
  }

  public static class DetailPageLinkRequestDtoBuilder {

    private List<DetailPageLinkRequestIdDto> idList = new ArrayList<DetailPageLinkRequestIdDto>();
    private Boolean forceLanding = null;
    private String appVersion = null;
    private String agentType = null;
    

    DetailPageLinkRequestDtoBuilder() {
    }

    /**
     **/
    public DetailPageLinkRequestDtoBuilder idList(List<DetailPageLinkRequestIdDto> idList) {
      this.idList = idList;
      return this;
    }

    /**
     **/
    public DetailPageLinkRequestDtoBuilder forceLanding(Boolean forceLanding) {
      this.forceLanding = forceLanding;
      return this;
    }

    /**
     **/
    public DetailPageLinkRequestDtoBuilder appVersion(String appVersion) {
      this.appVersion = appVersion;
      return this;
    }

    /**
     **/
    public DetailPageLinkRequestDtoBuilder agentType(String agentType) {
      this.agentType = agentType;
      return this;
    }


    public DetailPageLinkRequestDto build() {
      DetailPageLinkRequestDto detailPageLinkRequestDto = new DetailPageLinkRequestDto();
      detailPageLinkRequestDto.setIdList(this.idList);
      detailPageLinkRequestDto.setForceLanding(this.forceLanding);
      detailPageLinkRequestDto.setAppVersion(this.appVersion);
      detailPageLinkRequestDto.setAgentType(this.agentType);
      return detailPageLinkRequestDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DetailPageLinkRequestDtoBuilder {\n");
      
      sb.append("    idList: ").append(toIndentedString(idList)).append("\n");
      sb.append("    forceLanding: ").append(toIndentedString(forceLanding)).append("\n");
      sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
      sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
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

