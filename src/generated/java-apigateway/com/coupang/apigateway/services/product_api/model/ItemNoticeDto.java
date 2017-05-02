package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_api.model.ItemNoticeDetailDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class ItemNoticeDto   {
  
  private String noticeCategoryName = null;
  private Long noticeCategoryId = null;
  private Long itemNoticeId = null;
  private List<ItemNoticeDetailDto> itemNoticeDetails = new ArrayList<ItemNoticeDetailDto>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("noticeCategoryName")
  @com.fasterxml.jackson.annotation.JsonProperty("noticeCategoryName")
  public String getNoticeCategoryName() {
    return noticeCategoryName;
  }
  
  /**
   **/
  public void setNoticeCategoryName(String noticeCategoryName) {
    this.noticeCategoryName = noticeCategoryName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("noticeCategoryId")
  @com.fasterxml.jackson.annotation.JsonProperty("noticeCategoryId")
  public Long getNoticeCategoryId() {
    return noticeCategoryId;
  }
  
  /**
   **/
  public void setNoticeCategoryId(Long noticeCategoryId) {
    this.noticeCategoryId = noticeCategoryId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemNoticeId")
  @com.fasterxml.jackson.annotation.JsonProperty("itemNoticeId")
  public Long getItemNoticeId() {
    return itemNoticeId;
  }
  
  /**
   **/
  public void setItemNoticeId(Long itemNoticeId) {
    this.itemNoticeId = itemNoticeId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemNoticeDetails")
  @com.fasterxml.jackson.annotation.JsonProperty("itemNoticeDetails")
  public List<ItemNoticeDetailDto> getItemNoticeDetails() {
    return itemNoticeDetails;
  }
  
  /**
   **/
  public void setItemNoticeDetails(List<ItemNoticeDetailDto> itemNoticeDetails) {
    this.itemNoticeDetails = itemNoticeDetails;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemNoticeDto itemNoticeDto = (ItemNoticeDto) o;
    return Objects.equals(this.noticeCategoryName, itemNoticeDto.noticeCategoryName) &&
        Objects.equals(this.noticeCategoryId, itemNoticeDto.noticeCategoryId) &&
        Objects.equals(this.itemNoticeId, itemNoticeDto.itemNoticeId) &&
        Objects.equals(this.itemNoticeDetails, itemNoticeDto.itemNoticeDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(noticeCategoryName, noticeCategoryId, itemNoticeId, itemNoticeDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemNoticeDto {\n");
    
    sb.append("    noticeCategoryName: ").append(toIndentedString(noticeCategoryName)).append("\n");
    sb.append("    noticeCategoryId: ").append(toIndentedString(noticeCategoryId)).append("\n");
    sb.append("    itemNoticeId: ").append(toIndentedString(itemNoticeId)).append("\n");
    sb.append("    itemNoticeDetails: ").append(toIndentedString(itemNoticeDetails)).append("\n");
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

  public static ItemNoticeDtoBuilder builder() {
    return new ItemNoticeDtoBuilder();
  }

  public static class ItemNoticeDtoBuilder {

    private String noticeCategoryName = null;
    private Long noticeCategoryId = null;
    private Long itemNoticeId = null;
    private List<ItemNoticeDetailDto> itemNoticeDetails = new ArrayList<ItemNoticeDetailDto>();
    

    ItemNoticeDtoBuilder() {
    }

    /**
     **/
    public ItemNoticeDtoBuilder noticeCategoryName(String noticeCategoryName) {
      this.noticeCategoryName = noticeCategoryName;
      return this;
    }

    /**
     **/
    public ItemNoticeDtoBuilder noticeCategoryId(Long noticeCategoryId) {
      this.noticeCategoryId = noticeCategoryId;
      return this;
    }

    /**
     **/
    public ItemNoticeDtoBuilder itemNoticeId(Long itemNoticeId) {
      this.itemNoticeId = itemNoticeId;
      return this;
    }

    /**
     **/
    public ItemNoticeDtoBuilder itemNoticeDetails(List<ItemNoticeDetailDto> itemNoticeDetails) {
      this.itemNoticeDetails = itemNoticeDetails;
      return this;
    }


    public ItemNoticeDto build() {
      ItemNoticeDto itemNoticeDto = new ItemNoticeDto();
      itemNoticeDto.setNoticeCategoryName(this.noticeCategoryName);
      itemNoticeDto.setNoticeCategoryId(this.noticeCategoryId);
      itemNoticeDto.setItemNoticeId(this.itemNoticeId);
      itemNoticeDto.setItemNoticeDetails(this.itemNoticeDetails);
      return itemNoticeDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ItemNoticeDtoBuilder {\n");
      
      sb.append("    noticeCategoryName: ").append(toIndentedString(noticeCategoryName)).append("\n");
      sb.append("    noticeCategoryId: ").append(toIndentedString(noticeCategoryId)).append("\n");
      sb.append("    itemNoticeId: ").append(toIndentedString(itemNoticeId)).append("\n");
      sb.append("    itemNoticeDetails: ").append(toIndentedString(itemNoticeDetails)).append("\n");
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

