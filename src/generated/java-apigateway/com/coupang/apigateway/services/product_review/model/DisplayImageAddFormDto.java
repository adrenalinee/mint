package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class DisplayImageAddFormDto   {
  
  private String uploadedFilePath = null;
  private String token = null;
  private Boolean displayImagePrivate = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("uploadedFilePath")
  @com.fasterxml.jackson.annotation.JsonProperty("uploadedFilePath")
  public String getUploadedFilePath() {
    return uploadedFilePath;
  }
  
  /**
   **/
  public void setUploadedFilePath(String uploadedFilePath) {
    this.uploadedFilePath = uploadedFilePath;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("token")
  @com.fasterxml.jackson.annotation.JsonProperty("token")
  public String getToken() {
    return token;
  }
  
  /**
   **/
  public void setToken(String token) {
    this.token = token;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("displayImagePrivate")
  @com.fasterxml.jackson.annotation.JsonProperty("displayImagePrivate")
  public Boolean getDisplayImagePrivate() {
    return displayImagePrivate;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isDisplayImagePrivate() {
    return displayImagePrivate == null ? false : displayImagePrivate;
  }
  
  /**
   **/
  public void setDisplayImagePrivate(Boolean displayImagePrivate) {
    this.displayImagePrivate = displayImagePrivate;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayImageAddFormDto displayImageAddFormDto = (DisplayImageAddFormDto) o;
    return Objects.equals(this.uploadedFilePath, displayImageAddFormDto.uploadedFilePath) &&
        Objects.equals(this.token, displayImageAddFormDto.token) &&
        Objects.equals(this.displayImagePrivate, displayImageAddFormDto.displayImagePrivate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadedFilePath, token, displayImagePrivate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayImageAddFormDto {\n");
    
    sb.append("    uploadedFilePath: ").append(toIndentedString(uploadedFilePath)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    displayImagePrivate: ").append(toIndentedString(displayImagePrivate)).append("\n");
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

  public static DisplayImageAddFormDtoBuilder builder() {
    return new DisplayImageAddFormDtoBuilder();
  }

  public static class DisplayImageAddFormDtoBuilder {

    private String uploadedFilePath = null;
    private String token = null;
    private Boolean displayImagePrivate = null;
    

    DisplayImageAddFormDtoBuilder() {
    }

    /**
     **/
    public DisplayImageAddFormDtoBuilder uploadedFilePath(String uploadedFilePath) {
      this.uploadedFilePath = uploadedFilePath;
      return this;
    }

    /**
     **/
    public DisplayImageAddFormDtoBuilder token(String token) {
      this.token = token;
      return this;
    }

    /**
     **/
    public DisplayImageAddFormDtoBuilder displayImagePrivate(Boolean displayImagePrivate) {
      this.displayImagePrivate = displayImagePrivate;
      return this;
    }


    public DisplayImageAddFormDto build() {
      DisplayImageAddFormDto displayImageAddFormDto = new DisplayImageAddFormDto();
      displayImageAddFormDto.setUploadedFilePath(this.uploadedFilePath);
      displayImageAddFormDto.setToken(this.token);
      displayImageAddFormDto.setDisplayImagePrivate(this.displayImagePrivate);
      return displayImageAddFormDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayImageAddFormDtoBuilder {\n");
      
      sb.append("    uploadedFilePath: ").append(toIndentedString(uploadedFilePath)).append("\n");
      sb.append("    token: ").append(toIndentedString(token)).append("\n");
      sb.append("    displayImagePrivate: ").append(toIndentedString(displayImagePrivate)).append("\n");
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

