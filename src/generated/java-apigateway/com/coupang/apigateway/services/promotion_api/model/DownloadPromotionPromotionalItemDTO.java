package com.coupang.apigateway.services.promotion_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.975+09:00")
public class DownloadPromotionPromotionalItemDTO   {
  
  private String promotionalItem = null;
  private Long id = null;
  private String createdBy = null;
  private String createdAt = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("promotionalItem")
  @com.fasterxml.jackson.annotation.JsonProperty("promotionalItem")
  public String getPromotionalItem() {
    return promotionalItem;
  }
  
  /**
   **/
  public void setPromotionalItem(String promotionalItem) {
    this.promotionalItem = promotionalItem;
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
    DownloadPromotionPromotionalItemDTO downloadPromotionPromotionalItemDTO = (DownloadPromotionPromotionalItemDTO) o;
    return Objects.equals(this.promotionalItem, downloadPromotionPromotionalItemDTO.promotionalItem) &&
        Objects.equals(this.id, downloadPromotionPromotionalItemDTO.id) &&
        Objects.equals(this.createdBy, downloadPromotionPromotionalItemDTO.createdBy) &&
        Objects.equals(this.createdAt, downloadPromotionPromotionalItemDTO.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotionalItem, id, createdBy, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadPromotionPromotionalItemDTO {\n");
    
    sb.append("    promotionalItem: ").append(toIndentedString(promotionalItem)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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

  public static DownloadPromotionPromotionalItemDTOBuilder builder() {
    return new DownloadPromotionPromotionalItemDTOBuilder();
  }

  public static class DownloadPromotionPromotionalItemDTOBuilder {

    private String promotionalItem = null;
    private Long id = null;
    private String createdBy = null;
    private String createdAt = null;
    

    DownloadPromotionPromotionalItemDTOBuilder() {
    }

    /**
     **/
    public DownloadPromotionPromotionalItemDTOBuilder promotionalItem(String promotionalItem) {
      this.promotionalItem = promotionalItem;
      return this;
    }

    /**
     **/
    public DownloadPromotionPromotionalItemDTOBuilder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public DownloadPromotionPromotionalItemDTOBuilder createdBy(String createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    /**
     **/
    public DownloadPromotionPromotionalItemDTOBuilder createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }


    public DownloadPromotionPromotionalItemDTO build() {
      DownloadPromotionPromotionalItemDTO downloadPromotionPromotionalItemDTO = new DownloadPromotionPromotionalItemDTO();
      downloadPromotionPromotionalItemDTO.setPromotionalItem(this.promotionalItem);
      downloadPromotionPromotionalItemDTO.setId(this.id);
      downloadPromotionPromotionalItemDTO.setCreatedBy(this.createdBy);
      downloadPromotionPromotionalItemDTO.setCreatedAt(this.createdAt);
      return downloadPromotionPromotionalItemDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DownloadPromotionPromotionalItemDTOBuilder {\n");
      
      sb.append("    promotionalItem: ").append(toIndentedString(promotionalItem)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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

