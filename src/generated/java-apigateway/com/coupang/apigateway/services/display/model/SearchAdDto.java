package com.coupang.apigateway.services.display.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class SearchAdDto   {
  
  private Integer newWindow = null;
  private String linkType = null;
  private String linkContent = null;
  private String copy = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("newWindow")
  @com.fasterxml.jackson.annotation.JsonProperty("newWindow")
  public Integer getNewWindow() {
    return newWindow;
  }
  
  /**
   **/
  public void setNewWindow(Integer newWindow) {
    this.newWindow = newWindow;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("linkType")
  @com.fasterxml.jackson.annotation.JsonProperty("linkType")
  public String getLinkType() {
    return linkType;
  }
  
  /**
   **/
  public void setLinkType(String linkType) {
    this.linkType = linkType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("linkContent")
  @com.fasterxml.jackson.annotation.JsonProperty("linkContent")
  public String getLinkContent() {
    return linkContent;
  }
  
  /**
   **/
  public void setLinkContent(String linkContent) {
    this.linkContent = linkContent;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("copy")
  @com.fasterxml.jackson.annotation.JsonProperty("copy")
  public String getCopy() {
    return copy;
  }
  
  /**
   **/
  public void setCopy(String copy) {
    this.copy = copy;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchAdDto searchAdDto = (SearchAdDto) o;
    return Objects.equals(this.newWindow, searchAdDto.newWindow) &&
        Objects.equals(this.linkType, searchAdDto.linkType) &&
        Objects.equals(this.linkContent, searchAdDto.linkContent) &&
        Objects.equals(this.copy, searchAdDto.copy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newWindow, linkType, linkContent, copy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchAdDto {\n");
    
    sb.append("    newWindow: ").append(toIndentedString(newWindow)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    linkContent: ").append(toIndentedString(linkContent)).append("\n");
    sb.append("    copy: ").append(toIndentedString(copy)).append("\n");
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

  public static SearchAdDtoBuilder builder() {
    return new SearchAdDtoBuilder();
  }

  public static class SearchAdDtoBuilder {

    private Integer newWindow = null;
    private String linkType = null;
    private String linkContent = null;
    private String copy = null;
    

    SearchAdDtoBuilder() {
    }

    /**
     **/
    public SearchAdDtoBuilder newWindow(Integer newWindow) {
      this.newWindow = newWindow;
      return this;
    }

    /**
     **/
    public SearchAdDtoBuilder linkType(String linkType) {
      this.linkType = linkType;
      return this;
    }

    /**
     **/
    public SearchAdDtoBuilder linkContent(String linkContent) {
      this.linkContent = linkContent;
      return this;
    }

    /**
     **/
    public SearchAdDtoBuilder copy(String copy) {
      this.copy = copy;
      return this;
    }


    public SearchAdDto build() {
      SearchAdDto searchAdDto = new SearchAdDto();
      searchAdDto.setNewWindow(this.newWindow);
      searchAdDto.setLinkType(this.linkType);
      searchAdDto.setLinkContent(this.linkContent);
      searchAdDto.setCopy(this.copy);
      return searchAdDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SearchAdDtoBuilder {\n");
      
      sb.append("    newWindow: ").append(toIndentedString(newWindow)).append("\n");
      sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
      sb.append("    linkContent: ").append(toIndentedString(linkContent)).append("\n");
      sb.append("    copy: ").append(toIndentedString(copy)).append("\n");
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

