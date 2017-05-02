package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ReviewTemplateAssistantDto   {
  
  private Integer sort = null;
  private String landUrl = null;
  private String iconUrl = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("sort")
  @com.fasterxml.jackson.annotation.JsonProperty("sort")
  public Integer getSort() {
    return sort;
  }
  
  /**
   **/
  public void setSort(Integer sort) {
    this.sort = sort;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("landUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("landUrl")
  public String getLandUrl() {
    return landUrl;
  }
  
  /**
   **/
  public void setLandUrl(String landUrl) {
    this.landUrl = landUrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("iconUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("iconUrl")
  public String getIconUrl() {
    return iconUrl;
  }
  
  /**
   **/
  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewTemplateAssistantDto reviewTemplateAssistantDto = (ReviewTemplateAssistantDto) o;
    return Objects.equals(this.sort, reviewTemplateAssistantDto.sort) &&
        Objects.equals(this.landUrl, reviewTemplateAssistantDto.landUrl) &&
        Objects.equals(this.iconUrl, reviewTemplateAssistantDto.iconUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sort, landUrl, iconUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewTemplateAssistantDto {\n");
    
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    landUrl: ").append(toIndentedString(landUrl)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
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

  public static ReviewTemplateAssistantDtoBuilder builder() {
    return new ReviewTemplateAssistantDtoBuilder();
  }

  public static class ReviewTemplateAssistantDtoBuilder {

    private Integer sort = null;
    private String landUrl = null;
    private String iconUrl = null;
    

    ReviewTemplateAssistantDtoBuilder() {
    }

    /**
     **/
    public ReviewTemplateAssistantDtoBuilder sort(Integer sort) {
      this.sort = sort;
      return this;
    }

    /**
     **/
    public ReviewTemplateAssistantDtoBuilder landUrl(String landUrl) {
      this.landUrl = landUrl;
      return this;
    }

    /**
     **/
    public ReviewTemplateAssistantDtoBuilder iconUrl(String iconUrl) {
      this.iconUrl = iconUrl;
      return this;
    }


    public ReviewTemplateAssistantDto build() {
      ReviewTemplateAssistantDto reviewTemplateAssistantDto = new ReviewTemplateAssistantDto();
      reviewTemplateAssistantDto.setSort(this.sort);
      reviewTemplateAssistantDto.setLandUrl(this.landUrl);
      reviewTemplateAssistantDto.setIconUrl(this.iconUrl);
      return reviewTemplateAssistantDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReviewTemplateAssistantDtoBuilder {\n");
      
      sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
      sb.append("    landUrl: ").append(toIndentedString(landUrl)).append("\n");
      sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
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

