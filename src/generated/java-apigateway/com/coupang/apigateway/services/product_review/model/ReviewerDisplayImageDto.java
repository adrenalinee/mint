package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ReviewerDisplayImageDto   {
  
  private String displayImageThumbnailPath = null;
  private String displayImageThumbnailHttpsPath = null;
  private Boolean displayImagePrivate = null;
  private String displayImageOriginalPath = null;
  private String displayImageOriginalHttpsPath = null;
  private Boolean displayImageBlinded = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("displayImageThumbnailPath")
  @com.fasterxml.jackson.annotation.JsonProperty("displayImageThumbnailPath")
  public String getDisplayImageThumbnailPath() {
    return displayImageThumbnailPath;
  }
  
  /**
   **/
  public void setDisplayImageThumbnailPath(String displayImageThumbnailPath) {
    this.displayImageThumbnailPath = displayImageThumbnailPath;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("displayImageThumbnailHttpsPath")
  @com.fasterxml.jackson.annotation.JsonProperty("displayImageThumbnailHttpsPath")
  public String getDisplayImageThumbnailHttpsPath() {
    return displayImageThumbnailHttpsPath;
  }
  
  /**
   **/
  public void setDisplayImageThumbnailHttpsPath(String displayImageThumbnailHttpsPath) {
    this.displayImageThumbnailHttpsPath = displayImageThumbnailHttpsPath;
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
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("displayImageOriginalPath")
  @com.fasterxml.jackson.annotation.JsonProperty("displayImageOriginalPath")
  public String getDisplayImageOriginalPath() {
    return displayImageOriginalPath;
  }
  
  /**
   **/
  public void setDisplayImageOriginalPath(String displayImageOriginalPath) {
    this.displayImageOriginalPath = displayImageOriginalPath;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("displayImageOriginalHttpsPath")
  @com.fasterxml.jackson.annotation.JsonProperty("displayImageOriginalHttpsPath")
  public String getDisplayImageOriginalHttpsPath() {
    return displayImageOriginalHttpsPath;
  }
  
  /**
   **/
  public void setDisplayImageOriginalHttpsPath(String displayImageOriginalHttpsPath) {
    this.displayImageOriginalHttpsPath = displayImageOriginalHttpsPath;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("displayImageBlinded")
  @com.fasterxml.jackson.annotation.JsonProperty("displayImageBlinded")
  public Boolean getDisplayImageBlinded() {
    return displayImageBlinded;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isDisplayImageBlinded() {
    return displayImageBlinded == null ? false : displayImageBlinded;
  }
  
  /**
   **/
  public void setDisplayImageBlinded(Boolean displayImageBlinded) {
    this.displayImageBlinded = displayImageBlinded;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewerDisplayImageDto reviewerDisplayImageDto = (ReviewerDisplayImageDto) o;
    return Objects.equals(this.displayImageThumbnailPath, reviewerDisplayImageDto.displayImageThumbnailPath) &&
        Objects.equals(this.displayImageThumbnailHttpsPath, reviewerDisplayImageDto.displayImageThumbnailHttpsPath) &&
        Objects.equals(this.displayImagePrivate, reviewerDisplayImageDto.displayImagePrivate) &&
        Objects.equals(this.displayImageOriginalPath, reviewerDisplayImageDto.displayImageOriginalPath) &&
        Objects.equals(this.displayImageOriginalHttpsPath, reviewerDisplayImageDto.displayImageOriginalHttpsPath) &&
        Objects.equals(this.displayImageBlinded, reviewerDisplayImageDto.displayImageBlinded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayImageThumbnailPath, displayImageThumbnailHttpsPath, displayImagePrivate, displayImageOriginalPath, displayImageOriginalHttpsPath, displayImageBlinded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewerDisplayImageDto {\n");
    
    sb.append("    displayImageThumbnailPath: ").append(toIndentedString(displayImageThumbnailPath)).append("\n");
    sb.append("    displayImageThumbnailHttpsPath: ").append(toIndentedString(displayImageThumbnailHttpsPath)).append("\n");
    sb.append("    displayImagePrivate: ").append(toIndentedString(displayImagePrivate)).append("\n");
    sb.append("    displayImageOriginalPath: ").append(toIndentedString(displayImageOriginalPath)).append("\n");
    sb.append("    displayImageOriginalHttpsPath: ").append(toIndentedString(displayImageOriginalHttpsPath)).append("\n");
    sb.append("    displayImageBlinded: ").append(toIndentedString(displayImageBlinded)).append("\n");
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

  public static ReviewerDisplayImageDtoBuilder builder() {
    return new ReviewerDisplayImageDtoBuilder();
  }

  public static class ReviewerDisplayImageDtoBuilder {

    private String displayImageThumbnailPath = null;
    private String displayImageThumbnailHttpsPath = null;
    private Boolean displayImagePrivate = null;
    private String displayImageOriginalPath = null;
    private String displayImageOriginalHttpsPath = null;
    private Boolean displayImageBlinded = null;
    

    ReviewerDisplayImageDtoBuilder() {
    }

    /**
     **/
    public ReviewerDisplayImageDtoBuilder displayImageThumbnailPath(String displayImageThumbnailPath) {
      this.displayImageThumbnailPath = displayImageThumbnailPath;
      return this;
    }

    /**
     **/
    public ReviewerDisplayImageDtoBuilder displayImageThumbnailHttpsPath(String displayImageThumbnailHttpsPath) {
      this.displayImageThumbnailHttpsPath = displayImageThumbnailHttpsPath;
      return this;
    }

    /**
     **/
    public ReviewerDisplayImageDtoBuilder displayImagePrivate(Boolean displayImagePrivate) {
      this.displayImagePrivate = displayImagePrivate;
      return this;
    }

    /**
     **/
    public ReviewerDisplayImageDtoBuilder displayImageOriginalPath(String displayImageOriginalPath) {
      this.displayImageOriginalPath = displayImageOriginalPath;
      return this;
    }

    /**
     **/
    public ReviewerDisplayImageDtoBuilder displayImageOriginalHttpsPath(String displayImageOriginalHttpsPath) {
      this.displayImageOriginalHttpsPath = displayImageOriginalHttpsPath;
      return this;
    }

    /**
     **/
    public ReviewerDisplayImageDtoBuilder displayImageBlinded(Boolean displayImageBlinded) {
      this.displayImageBlinded = displayImageBlinded;
      return this;
    }


    public ReviewerDisplayImageDto build() {
      ReviewerDisplayImageDto reviewerDisplayImageDto = new ReviewerDisplayImageDto();
      reviewerDisplayImageDto.setDisplayImageThumbnailPath(this.displayImageThumbnailPath);
      reviewerDisplayImageDto.setDisplayImageThumbnailHttpsPath(this.displayImageThumbnailHttpsPath);
      reviewerDisplayImageDto.setDisplayImagePrivate(this.displayImagePrivate);
      reviewerDisplayImageDto.setDisplayImageOriginalPath(this.displayImageOriginalPath);
      reviewerDisplayImageDto.setDisplayImageOriginalHttpsPath(this.displayImageOriginalHttpsPath);
      reviewerDisplayImageDto.setDisplayImageBlinded(this.displayImageBlinded);
      return reviewerDisplayImageDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReviewerDisplayImageDtoBuilder {\n");
      
      sb.append("    displayImageThumbnailPath: ").append(toIndentedString(displayImageThumbnailPath)).append("\n");
      sb.append("    displayImageThumbnailHttpsPath: ").append(toIndentedString(displayImageThumbnailHttpsPath)).append("\n");
      sb.append("    displayImagePrivate: ").append(toIndentedString(displayImagePrivate)).append("\n");
      sb.append("    displayImageOriginalPath: ").append(toIndentedString(displayImageOriginalPath)).append("\n");
      sb.append("    displayImageOriginalHttpsPath: ").append(toIndentedString(displayImageOriginalHttpsPath)).append("\n");
      sb.append("    displayImageBlinded: ").append(toIndentedString(displayImageBlinded)).append("\n");
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

