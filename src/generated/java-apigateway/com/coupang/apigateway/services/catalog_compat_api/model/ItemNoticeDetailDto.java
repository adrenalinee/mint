package com.coupang.apigateway.services.catalog_compat_api.model;

import java.util.Objects;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.107+09:00")
public class ItemNoticeDetailDto   {
  
  private Boolean vendorEdited = null;
  private Boolean valid = null;
  private Date startedAt = null;
  private Integer order = null;
  private Long noticeCategoryTemplateId = null;
  private String name = null;
  private Long itemNoticeDetailId = null;
  private String defaultValue = null;
  private String content = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorEdited")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorEdited")
  public Boolean getVendorEdited() {
    return vendorEdited;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isVendorEdited() {
    return vendorEdited == null ? false : vendorEdited;
  }
  
  /**
   **/
  public void setVendorEdited(Boolean vendorEdited) {
    this.vendorEdited = vendorEdited;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("valid")
  @com.fasterxml.jackson.annotation.JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isValid() {
    return valid == null ? false : valid;
  }
  
  /**
   **/
  public void setValid(Boolean valid) {
    this.valid = valid;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("startedAt")
  @com.fasterxml.jackson.annotation.JsonProperty("startedAt")
  public Date getStartedAt() {
    return startedAt;
  }
  
  /**
   **/
  public void setStartedAt(Date startedAt) {
    this.startedAt = startedAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("order")
  @com.fasterxml.jackson.annotation.JsonProperty("order")
  public Integer getOrder() {
    return order;
  }
  
  /**
   **/
  public void setOrder(Integer order) {
    this.order = order;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("noticeCategoryTemplateId")
  @com.fasterxml.jackson.annotation.JsonProperty("noticeCategoryTemplateId")
  public Long getNoticeCategoryTemplateId() {
    return noticeCategoryTemplateId;
  }
  
  /**
   **/
  public void setNoticeCategoryTemplateId(Long noticeCategoryTemplateId) {
    this.noticeCategoryTemplateId = noticeCategoryTemplateId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("name")
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  public String getName() {
    return name;
  }
  
  /**
   **/
  public void setName(String name) {
    this.name = name;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemNoticeDetailId")
  @com.fasterxml.jackson.annotation.JsonProperty("itemNoticeDetailId")
  public Long getItemNoticeDetailId() {
    return itemNoticeDetailId;
  }
  
  /**
   **/
  public void setItemNoticeDetailId(Long itemNoticeDetailId) {
    this.itemNoticeDetailId = itemNoticeDetailId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("defaultValue")
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
  public String getDefaultValue() {
    return defaultValue;
  }
  
  /**
   **/
  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("content")
  @com.fasterxml.jackson.annotation.JsonProperty("content")
  public String getContent() {
    return content;
  }
  
  /**
   **/
  public void setContent(String content) {
    this.content = content;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemNoticeDetailDto itemNoticeDetailDto = (ItemNoticeDetailDto) o;
    return Objects.equals(this.vendorEdited, itemNoticeDetailDto.vendorEdited) &&
        Objects.equals(this.valid, itemNoticeDetailDto.valid) &&
        Objects.equals(this.startedAt, itemNoticeDetailDto.startedAt) &&
        Objects.equals(this.order, itemNoticeDetailDto.order) &&
        Objects.equals(this.noticeCategoryTemplateId, itemNoticeDetailDto.noticeCategoryTemplateId) &&
        Objects.equals(this.name, itemNoticeDetailDto.name) &&
        Objects.equals(this.itemNoticeDetailId, itemNoticeDetailDto.itemNoticeDetailId) &&
        Objects.equals(this.defaultValue, itemNoticeDetailDto.defaultValue) &&
        Objects.equals(this.content, itemNoticeDetailDto.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorEdited, valid, startedAt, order, noticeCategoryTemplateId, name, itemNoticeDetailId, defaultValue, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemNoticeDetailDto {\n");
    
    sb.append("    vendorEdited: ").append(toIndentedString(vendorEdited)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    noticeCategoryTemplateId: ").append(toIndentedString(noticeCategoryTemplateId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    itemNoticeDetailId: ").append(toIndentedString(itemNoticeDetailId)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

  public static ItemNoticeDetailDtoBuilder builder() {
    return new ItemNoticeDetailDtoBuilder();
  }

  public static class ItemNoticeDetailDtoBuilder {

    private Boolean vendorEdited = null;
    private Boolean valid = null;
    private Date startedAt = null;
    private Integer order = null;
    private Long noticeCategoryTemplateId = null;
    private String name = null;
    private Long itemNoticeDetailId = null;
    private String defaultValue = null;
    private String content = null;
    

    ItemNoticeDetailDtoBuilder() {
    }

    /**
     **/
    public ItemNoticeDetailDtoBuilder vendorEdited(Boolean vendorEdited) {
      this.vendorEdited = vendorEdited;
      return this;
    }

    /**
     **/
    public ItemNoticeDetailDtoBuilder valid(Boolean valid) {
      this.valid = valid;
      return this;
    }

    /**
     **/
    public ItemNoticeDetailDtoBuilder startedAt(Date startedAt) {
      this.startedAt = startedAt;
      return this;
    }

    /**
     **/
    public ItemNoticeDetailDtoBuilder order(Integer order) {
      this.order = order;
      return this;
    }

    /**
     **/
    public ItemNoticeDetailDtoBuilder noticeCategoryTemplateId(Long noticeCategoryTemplateId) {
      this.noticeCategoryTemplateId = noticeCategoryTemplateId;
      return this;
    }

    /**
     **/
    public ItemNoticeDetailDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public ItemNoticeDetailDtoBuilder itemNoticeDetailId(Long itemNoticeDetailId) {
      this.itemNoticeDetailId = itemNoticeDetailId;
      return this;
    }

    /**
     **/
    public ItemNoticeDetailDtoBuilder defaultValue(String defaultValue) {
      this.defaultValue = defaultValue;
      return this;
    }

    /**
     **/
    public ItemNoticeDetailDtoBuilder content(String content) {
      this.content = content;
      return this;
    }


    public ItemNoticeDetailDto build() {
      ItemNoticeDetailDto itemNoticeDetailDto = new ItemNoticeDetailDto();
      itemNoticeDetailDto.setVendorEdited(this.vendorEdited);
      itemNoticeDetailDto.setValid(this.valid);
      itemNoticeDetailDto.setStartedAt(this.startedAt);
      itemNoticeDetailDto.setOrder(this.order);
      itemNoticeDetailDto.setNoticeCategoryTemplateId(this.noticeCategoryTemplateId);
      itemNoticeDetailDto.setName(this.name);
      itemNoticeDetailDto.setItemNoticeDetailId(this.itemNoticeDetailId);
      itemNoticeDetailDto.setDefaultValue(this.defaultValue);
      itemNoticeDetailDto.setContent(this.content);
      return itemNoticeDetailDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ItemNoticeDetailDtoBuilder {\n");
      
      sb.append("    vendorEdited: ").append(toIndentedString(vendorEdited)).append("\n");
      sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
      sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
      sb.append("    order: ").append(toIndentedString(order)).append("\n");
      sb.append("    noticeCategoryTemplateId: ").append(toIndentedString(noticeCategoryTemplateId)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    itemNoticeDetailId: ").append(toIndentedString(itemNoticeDetailId)).append("\n");
      sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
      sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

