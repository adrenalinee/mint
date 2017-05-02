package com.coupang.apigateway.services.catalog_compat_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.107+09:00")
public class ItemImageDto   {
  
  private String _path = null;
  private String itemImageType = null;
  private Long itemImageId = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("itemImageType")
  @com.fasterxml.jackson.annotation.JsonProperty("itemImageType")
  public String getItemImageType() {
    return itemImageType;
  }
  
  /**
   **/
  public void setItemImageType(String itemImageType) {
    this.itemImageType = itemImageType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemImageId")
  @com.fasterxml.jackson.annotation.JsonProperty("itemImageId")
  public Long getItemImageId() {
    return itemImageId;
  }
  
  /**
   **/
  public void setItemImageId(Long itemImageId) {
    this.itemImageId = itemImageId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemImageDto itemImageDto = (ItemImageDto) o;
    return Objects.equals(this._path, itemImageDto._path) &&
        Objects.equals(this.itemImageType, itemImageDto.itemImageType) &&
        Objects.equals(this.itemImageId, itemImageDto.itemImageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_path, itemImageType, itemImageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemImageDto {\n");
    
    sb.append("    _path: ").append(toIndentedString(_path)).append("\n");
    sb.append("    itemImageType: ").append(toIndentedString(itemImageType)).append("\n");
    sb.append("    itemImageId: ").append(toIndentedString(itemImageId)).append("\n");
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

  public static ItemImageDtoBuilder builder() {
    return new ItemImageDtoBuilder();
  }

  public static class ItemImageDtoBuilder {

    private String _path = null;
    private String itemImageType = null;
    private Long itemImageId = null;
    

    ItemImageDtoBuilder() {
    }

    /**
     **/
    public ItemImageDtoBuilder _path(String _path) {
      this._path = _path;
      return this;
    }

    /**
     **/
    public ItemImageDtoBuilder itemImageType(String itemImageType) {
      this.itemImageType = itemImageType;
      return this;
    }

    /**
     **/
    public ItemImageDtoBuilder itemImageId(Long itemImageId) {
      this.itemImageId = itemImageId;
      return this;
    }


    public ItemImageDto build() {
      ItemImageDto itemImageDto = new ItemImageDto();
      itemImageDto.setPath(this._path);
      itemImageDto.setItemImageType(this.itemImageType);
      itemImageDto.setItemImageId(this.itemImageId);
      return itemImageDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ItemImageDtoBuilder {\n");
      
      sb.append("    _path: ").append(toIndentedString(_path)).append("\n");
      sb.append("    itemImageType: ").append(toIndentedString(itemImageType)).append("\n");
      sb.append("    itemImageId: ").append(toIndentedString(itemImageId)).append("\n");
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

