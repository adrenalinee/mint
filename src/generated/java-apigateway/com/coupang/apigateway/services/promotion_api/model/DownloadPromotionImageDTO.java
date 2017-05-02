package com.coupang.apigateway.services.promotion_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.975+09:00")
public class DownloadPromotionImageDTO   {
  


  public enum TypeEnum {
    MAIN_PC("MAIN_PC"),
    MAIN_MOBILE("MAIN_MOBILE"),
    BANNER_BG("BANNER_BG");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type = null;
  private String _path = null;
  private Long id = null;
  private String createdAt = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("type")
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  /**
   **/
  public void setType(TypeEnum type) {
    this.type = type;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("path")
  @com.fasterxml.jackson.annotation.JsonProperty("path")
  public String getPath() {
    return _path;
  }
  
  /**
   **/
  public void setPath(String _path) {
    this._path = _path;
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
  @org.codehaus.jackson.annotate.JsonProperty("createdAt")
  @com.fasterxml.jackson.annotation.JsonProperty("createdAt")
  public String getCreatedAt() {
    return createdAt;
  }
  
  /**
   **/
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadPromotionImageDTO downloadPromotionImageDTO = (DownloadPromotionImageDTO) o;
    return Objects.equals(this.type, downloadPromotionImageDTO.type) &&
        Objects.equals(this._path, downloadPromotionImageDTO._path) &&
        Objects.equals(this.id, downloadPromotionImageDTO.id) &&
        Objects.equals(this.createdAt, downloadPromotionImageDTO.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, _path, id, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadPromotionImageDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    _path: ").append(toIndentedString(_path)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

  public static DownloadPromotionImageDTOBuilder builder() {
    return new DownloadPromotionImageDTOBuilder();
  }

  public static class DownloadPromotionImageDTOBuilder {

    private TypeEnum type = null;
    private String _path = null;
    private Long id = null;
    private String createdAt = null;
    

    DownloadPromotionImageDTOBuilder() {
    }

    /**
     **/
    public DownloadPromotionImageDTOBuilder type(TypeEnum type) {
      this.type = type;
      return this;
    }

    /**
     **/
    public DownloadPromotionImageDTOBuilder _path(String _path) {
      this._path = _path;
      return this;
    }

    /**
     **/
    public DownloadPromotionImageDTOBuilder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public DownloadPromotionImageDTOBuilder createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }


    public DownloadPromotionImageDTO build() {
      DownloadPromotionImageDTO downloadPromotionImageDTO = new DownloadPromotionImageDTO();
      downloadPromotionImageDTO.setType(this.type);
      downloadPromotionImageDTO.setPath(this._path);
      downloadPromotionImageDTO.setId(this.id);
      downloadPromotionImageDTO.setCreatedAt(this.createdAt);
      return downloadPromotionImageDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DownloadPromotionImageDTOBuilder {\n");
      
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
      sb.append("    _path: ").append(toIndentedString(_path)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

