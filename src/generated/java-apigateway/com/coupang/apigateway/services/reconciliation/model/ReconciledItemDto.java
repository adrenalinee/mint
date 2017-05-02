package com.coupang.apigateway.services.reconciliation.model;

import java.util.Objects;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.914+09:00")
public class ReconciledItemDto   {
  
  private String mainImagePath = null;
  private String itemId = null;
  private List<String> alternateImagePaths = new ArrayList<String>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("mainImagePath")
  @com.fasterxml.jackson.annotation.JsonProperty("mainImagePath")
  public String getMainImagePath() {
    return mainImagePath;
  }
  
  /**
   **/
  public void setMainImagePath(String mainImagePath) {
    this.mainImagePath = mainImagePath;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemId")
  @com.fasterxml.jackson.annotation.JsonProperty("itemId")
  public String getItemId() {
    return itemId;
  }
  
  /**
   **/
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("alternateImagePaths")
  @com.fasterxml.jackson.annotation.JsonProperty("alternateImagePaths")
  public List<String> getAlternateImagePaths() {
    return alternateImagePaths;
  }
  
  /**
   **/
  public void setAlternateImagePaths(List<String> alternateImagePaths) {
    this.alternateImagePaths = alternateImagePaths;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReconciledItemDto reconciledItemDto = (ReconciledItemDto) o;
    return Objects.equals(this.mainImagePath, reconciledItemDto.mainImagePath) &&
        Objects.equals(this.itemId, reconciledItemDto.itemId) &&
        Objects.equals(this.alternateImagePaths, reconciledItemDto.alternateImagePaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mainImagePath, itemId, alternateImagePaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReconciledItemDto {\n");
    
    sb.append("    mainImagePath: ").append(toIndentedString(mainImagePath)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    alternateImagePaths: ").append(toIndentedString(alternateImagePaths)).append("\n");
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

  public static ReconciledItemDtoBuilder builder() {
    return new ReconciledItemDtoBuilder();
  }

  public static class ReconciledItemDtoBuilder {

    private String mainImagePath = null;
    private String itemId = null;
    private List<String> alternateImagePaths = new ArrayList<String>();
    

    ReconciledItemDtoBuilder() {
    }

    /**
     **/
    public ReconciledItemDtoBuilder mainImagePath(String mainImagePath) {
      this.mainImagePath = mainImagePath;
      return this;
    }

    /**
     **/
    public ReconciledItemDtoBuilder itemId(String itemId) {
      this.itemId = itemId;
      return this;
    }

    /**
     **/
    public ReconciledItemDtoBuilder alternateImagePaths(List<String> alternateImagePaths) {
      this.alternateImagePaths = alternateImagePaths;
      return this;
    }


    public ReconciledItemDto build() {
      ReconciledItemDto reconciledItemDto = new ReconciledItemDto();
      reconciledItemDto.setMainImagePath(this.mainImagePath);
      reconciledItemDto.setItemId(this.itemId);
      reconciledItemDto.setAlternateImagePaths(this.alternateImagePaths);
      return reconciledItemDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReconciledItemDtoBuilder {\n");
      
      sb.append("    mainImagePath: ").append(toIndentedString(mainImagePath)).append("\n");
      sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
      sb.append("    alternateImagePaths: ").append(toIndentedString(alternateImagePaths)).append("\n");
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

