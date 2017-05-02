package com.coupang.apigateway.services.coupang_mobile_web.model;

import java.util.Objects;
import com.coupang.apigateway.services.coupang_mobile_web.model.DetailPageLinkRequestIdDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.807+09:00")
public class DetailPageLinkDto   {
  
  private String link = null;
  private DetailPageLinkRequestIdDto id = null;
  private String alertMessage = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("link")
  @com.fasterxml.jackson.annotation.JsonProperty("link")
  public String getLink() {
    return link;
  }
  
  /**
   **/
  public void setLink(String link) {
    this.link = link;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("id")
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  public DetailPageLinkRequestIdDto getId() {
    return id;
  }
  
  /**
   **/
  public void setId(DetailPageLinkRequestIdDto id) {
    this.id = id;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("alertMessage")
  @com.fasterxml.jackson.annotation.JsonProperty("alertMessage")
  public String getAlertMessage() {
    return alertMessage;
  }
  
  /**
   **/
  public void setAlertMessage(String alertMessage) {
    this.alertMessage = alertMessage;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailPageLinkDto detailPageLinkDto = (DetailPageLinkDto) o;
    return Objects.equals(this.link, detailPageLinkDto.link) &&
        Objects.equals(this.id, detailPageLinkDto.id) &&
        Objects.equals(this.alertMessage, detailPageLinkDto.alertMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, id, alertMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailPageLinkDto {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    alertMessage: ").append(toIndentedString(alertMessage)).append("\n");
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

  public static DetailPageLinkDtoBuilder builder() {
    return new DetailPageLinkDtoBuilder();
  }

  public static class DetailPageLinkDtoBuilder {

    private String link = null;
    private DetailPageLinkRequestIdDto id = null;
    private String alertMessage = null;
    

    DetailPageLinkDtoBuilder() {
    }

    /**
     **/
    public DetailPageLinkDtoBuilder link(String link) {
      this.link = link;
      return this;
    }

    /**
     **/
    public DetailPageLinkDtoBuilder id(DetailPageLinkRequestIdDto id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public DetailPageLinkDtoBuilder alertMessage(String alertMessage) {
      this.alertMessage = alertMessage;
      return this;
    }


    public DetailPageLinkDto build() {
      DetailPageLinkDto detailPageLinkDto = new DetailPageLinkDto();
      detailPageLinkDto.setLink(this.link);
      detailPageLinkDto.setId(this.id);
      detailPageLinkDto.setAlertMessage(this.alertMessage);
      return detailPageLinkDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DetailPageLinkDtoBuilder {\n");
      
      sb.append("    link: ").append(toIndentedString(link)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    alertMessage: ").append(toIndentedString(alertMessage)).append("\n");
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

