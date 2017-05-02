package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayBrandMetaImageDto   {
  
  private String modifiedBy = null;
  private Date modifiedAt = null;
  private String imageType = null;
  private String imagePath = null;
  private String imageLinkUrl = null;
  private Long id = null;
  private String createdBy = null;
  private Date createdAt = null;
  private Long brandMetaId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("modifiedBy")
  @com.fasterxml.jackson.annotation.JsonProperty("modifiedBy")
  public String getModifiedBy() {
    return modifiedBy;
  }
  
  /**
   **/
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("modifiedAt")
  @com.fasterxml.jackson.annotation.JsonProperty("modifiedAt")
  public Date getModifiedAt() {
    return modifiedAt;
  }
  
  /**
   **/
  public void setModifiedAt(Date modifiedAt) {
    this.modifiedAt = modifiedAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("imageType")
  @com.fasterxml.jackson.annotation.JsonProperty("imageType")
  public String getImageType() {
    return imageType;
  }
  
  /**
   **/
  public void setImageType(String imageType) {
    this.imageType = imageType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("imagePath")
  @com.fasterxml.jackson.annotation.JsonProperty("imagePath")
  public String getImagePath() {
    return imagePath;
  }
  
  /**
   **/
  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("imageLinkUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("imageLinkUrl")
  public String getImageLinkUrl() {
    return imageLinkUrl;
  }
  
  /**
   **/
  public void setImageLinkUrl(String imageLinkUrl) {
    this.imageLinkUrl = imageLinkUrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("id")
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  public Long getId() {
    return id;
  }
  
  /**
   **/
  public void setId(Long id) {
    this.id = id;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("createdBy")
  @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }
  
  /**
   **/
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("createdAt")
  @com.fasterxml.jackson.annotation.JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }
  
  /**
   **/
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("brandMetaId")
  @com.fasterxml.jackson.annotation.JsonProperty("brandMetaId")
  public Long getBrandMetaId() {
    return brandMetaId;
  }
  
  /**
   **/
  public void setBrandMetaId(Long brandMetaId) {
    this.brandMetaId = brandMetaId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayBrandMetaImageDto displayBrandMetaImageDto = (DisplayBrandMetaImageDto) o;
    return Objects.equals(this.modifiedBy, displayBrandMetaImageDto.modifiedBy) &&
        Objects.equals(this.modifiedAt, displayBrandMetaImageDto.modifiedAt) &&
        Objects.equals(this.imageType, displayBrandMetaImageDto.imageType) &&
        Objects.equals(this.imagePath, displayBrandMetaImageDto.imagePath) &&
        Objects.equals(this.imageLinkUrl, displayBrandMetaImageDto.imageLinkUrl) &&
        Objects.equals(this.id, displayBrandMetaImageDto.id) &&
        Objects.equals(this.createdBy, displayBrandMetaImageDto.createdBy) &&
        Objects.equals(this.createdAt, displayBrandMetaImageDto.createdAt) &&
        Objects.equals(this.brandMetaId, displayBrandMetaImageDto.brandMetaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifiedBy, modifiedAt, imageType, imagePath, imageLinkUrl, id, createdBy, createdAt, brandMetaId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayBrandMetaImageDto {\n");
    
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    imagePath: ").append(toIndentedString(imagePath)).append("\n");
    sb.append("    imageLinkUrl: ").append(toIndentedString(imageLinkUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    brandMetaId: ").append(toIndentedString(brandMetaId)).append("\n");
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

  public static DisplayBrandMetaImageDtoBuilder builder() {
    return new DisplayBrandMetaImageDtoBuilder();
  }

  public static class DisplayBrandMetaImageDtoBuilder {

    private String modifiedBy = null;
    private Date modifiedAt = null;
    private String imageType = null;
    private String imagePath = null;
    private String imageLinkUrl = null;
    private Long id = null;
    private String createdBy = null;
    private Date createdAt = null;
    private Long brandMetaId = null;
    

    DisplayBrandMetaImageDtoBuilder() {
    }

    /**
     **/
    public DisplayBrandMetaImageDtoBuilder modifiedBy(String modifiedBy) {
      this.modifiedBy = modifiedBy;
      return this;
    }

    /**
     **/
    public DisplayBrandMetaImageDtoBuilder modifiedAt(Date modifiedAt) {
      this.modifiedAt = modifiedAt;
      return this;
    }

    /**
     **/
    public DisplayBrandMetaImageDtoBuilder imageType(String imageType) {
      this.imageType = imageType;
      return this;
    }

    /**
     **/
    public DisplayBrandMetaImageDtoBuilder imagePath(String imagePath) {
      this.imagePath = imagePath;
      return this;
    }

    /**
     **/
    public DisplayBrandMetaImageDtoBuilder imageLinkUrl(String imageLinkUrl) {
      this.imageLinkUrl = imageLinkUrl;
      return this;
    }

    /**
     **/
    public DisplayBrandMetaImageDtoBuilder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public DisplayBrandMetaImageDtoBuilder createdBy(String createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    /**
     **/
    public DisplayBrandMetaImageDtoBuilder createdAt(Date createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     **/
    public DisplayBrandMetaImageDtoBuilder brandMetaId(Long brandMetaId) {
      this.brandMetaId = brandMetaId;
      return this;
    }


    public DisplayBrandMetaImageDto build() {
      DisplayBrandMetaImageDto displayBrandMetaImageDto = new DisplayBrandMetaImageDto();
      displayBrandMetaImageDto.setModifiedBy(this.modifiedBy);
      displayBrandMetaImageDto.setModifiedAt(this.modifiedAt);
      displayBrandMetaImageDto.setImageType(this.imageType);
      displayBrandMetaImageDto.setImagePath(this.imagePath);
      displayBrandMetaImageDto.setImageLinkUrl(this.imageLinkUrl);
      displayBrandMetaImageDto.setId(this.id);
      displayBrandMetaImageDto.setCreatedBy(this.createdBy);
      displayBrandMetaImageDto.setCreatedAt(this.createdAt);
      displayBrandMetaImageDto.setBrandMetaId(this.brandMetaId);
      return displayBrandMetaImageDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayBrandMetaImageDtoBuilder {\n");
      
      sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
      sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
      sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
      sb.append("    imagePath: ").append(toIndentedString(imagePath)).append("\n");
      sb.append("    imageLinkUrl: ").append(toIndentedString(imageLinkUrl)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
      sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
      sb.append("    brandMetaId: ").append(toIndentedString(brandMetaId)).append("\n");
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

