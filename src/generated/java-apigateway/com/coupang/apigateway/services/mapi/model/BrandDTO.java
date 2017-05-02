package com.coupang.apigateway.services.mapi.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.625+09:00")
public class BrandDTO   {
  
  private String searchKeyword = null;


  public enum LinkTypeEnum {
    LEGACY("LEGACY"),
    SRP("SRP"),
    CLP("CLP"),
    EVENT("EVENT");

    private String value;

    LinkTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private LinkTypeEnum linkType = null;
  private Integer imageWidth = null;
  private String imagePath = null;
  private Integer imageHeight = null;
  private String brandName = null;
  private Long brandId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("searchKeyword")
  @com.fasterxml.jackson.annotation.JsonProperty("searchKeyword")
  public String getSearchKeyword() {
    return searchKeyword;
  }
  
  /**
   **/
  public void setSearchKeyword(String searchKeyword) {
    this.searchKeyword = searchKeyword;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("linkType")
  @com.fasterxml.jackson.annotation.JsonProperty("linkType")
  public LinkTypeEnum getLinkType() {
    return linkType;
  }
  
  /**
   **/
  public void setLinkType(LinkTypeEnum linkType) {
    this.linkType = linkType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("imageWidth")
  @com.fasterxml.jackson.annotation.JsonProperty("imageWidth")
  public Integer getImageWidth() {
    return imageWidth;
  }
  
  /**
   **/
  public void setImageWidth(Integer imageWidth) {
    this.imageWidth = imageWidth;
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
  @org.codehaus.jackson.annotate.JsonProperty("imageHeight")
  @com.fasterxml.jackson.annotation.JsonProperty("imageHeight")
  public Integer getImageHeight() {
    return imageHeight;
  }
  
  /**
   **/
  public void setImageHeight(Integer imageHeight) {
    this.imageHeight = imageHeight;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("brandName")
  @com.fasterxml.jackson.annotation.JsonProperty("brandName")
  public String getBrandName() {
    return brandName;
  }
  
  /**
   **/
  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("brandId")
  @com.fasterxml.jackson.annotation.JsonProperty("brandId")
  public Long getBrandId() {
    return brandId;
  }
  
  /**
   **/
  public void setBrandId(Long brandId) {
    this.brandId = brandId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandDTO brandDTO = (BrandDTO) o;
    return Objects.equals(this.searchKeyword, brandDTO.searchKeyword) &&
        Objects.equals(this.linkType, brandDTO.linkType) &&
        Objects.equals(this.imageWidth, brandDTO.imageWidth) &&
        Objects.equals(this.imagePath, brandDTO.imagePath) &&
        Objects.equals(this.imageHeight, brandDTO.imageHeight) &&
        Objects.equals(this.brandName, brandDTO.brandName) &&
        Objects.equals(this.brandId, brandDTO.brandId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchKeyword, linkType, imageWidth, imagePath, imageHeight, brandName, brandId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandDTO {\n");
    
    sb.append("    searchKeyword: ").append(toIndentedString(searchKeyword)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    imageWidth: ").append(toIndentedString(imageWidth)).append("\n");
    sb.append("    imagePath: ").append(toIndentedString(imagePath)).append("\n");
    sb.append("    imageHeight: ").append(toIndentedString(imageHeight)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
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

  public static BrandDTOBuilder builder() {
    return new BrandDTOBuilder();
  }

  public static class BrandDTOBuilder {

    private String searchKeyword = null;
    private LinkTypeEnum linkType = null;
    private Integer imageWidth = null;
    private String imagePath = null;
    private Integer imageHeight = null;
    private String brandName = null;
    private Long brandId = null;
    

    BrandDTOBuilder() {
    }

    /**
     **/
    public BrandDTOBuilder searchKeyword(String searchKeyword) {
      this.searchKeyword = searchKeyword;
      return this;
    }

    /**
     **/
    public BrandDTOBuilder linkType(LinkTypeEnum linkType) {
      this.linkType = linkType;
      return this;
    }

    /**
     **/
    public BrandDTOBuilder imageWidth(Integer imageWidth) {
      this.imageWidth = imageWidth;
      return this;
    }

    /**
     **/
    public BrandDTOBuilder imagePath(String imagePath) {
      this.imagePath = imagePath;
      return this;
    }

    /**
     **/
    public BrandDTOBuilder imageHeight(Integer imageHeight) {
      this.imageHeight = imageHeight;
      return this;
    }

    /**
     **/
    public BrandDTOBuilder brandName(String brandName) {
      this.brandName = brandName;
      return this;
    }

    /**
     **/
    public BrandDTOBuilder brandId(Long brandId) {
      this.brandId = brandId;
      return this;
    }


    public BrandDTO build() {
      BrandDTO brandDTO = new BrandDTO();
      brandDTO.setSearchKeyword(this.searchKeyword);
      brandDTO.setLinkType(this.linkType);
      brandDTO.setImageWidth(this.imageWidth);
      brandDTO.setImagePath(this.imagePath);
      brandDTO.setImageHeight(this.imageHeight);
      brandDTO.setBrandName(this.brandName);
      brandDTO.setBrandId(this.brandId);
      return brandDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BrandDTOBuilder {\n");
      
      sb.append("    searchKeyword: ").append(toIndentedString(searchKeyword)).append("\n");
      sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
      sb.append("    imageWidth: ").append(toIndentedString(imageWidth)).append("\n");
      sb.append("    imagePath: ").append(toIndentedString(imagePath)).append("\n");
      sb.append("    imageHeight: ").append(toIndentedString(imageHeight)).append("\n");
      sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
      sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
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

