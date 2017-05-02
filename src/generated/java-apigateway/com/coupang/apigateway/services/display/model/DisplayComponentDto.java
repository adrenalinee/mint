package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import java.util.*;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayComponentDto   {
  
  private String status = null;
  private Long productCount = null;
  private Integer ordering = null;
  private String name = null;
  private String linkCode = null;
  private String imageUrl = null;
  private Long id = null;
  private Integer depth = null;
  private List<String> attribute = new ArrayList<String>();
  private Map<String, String> asset = new HashMap<String, String>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("status")
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  public String getStatus() {
    return status;
  }
  
  /**
   **/
  public void setStatus(String status) {
    this.status = status;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("productCount")
  @com.fasterxml.jackson.annotation.JsonProperty("productCount")
  public Long getProductCount() {
    return productCount;
  }
  
  /**
   **/
  public void setProductCount(Long productCount) {
    this.productCount = productCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("ordering")
  @com.fasterxml.jackson.annotation.JsonProperty("ordering")
  public Integer getOrdering() {
    return ordering;
  }
  
  /**
   **/
  public void setOrdering(Integer ordering) {
    this.ordering = ordering;
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
  @org.codehaus.jackson.annotate.JsonProperty("linkCode")
  @com.fasterxml.jackson.annotation.JsonProperty("linkCode")
  public String getLinkCode() {
    return linkCode;
  }
  
  /**
   **/
  public void setLinkCode(String linkCode) {
    this.linkCode = linkCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("imageUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("imageUrl")
  public String getImageUrl() {
    return imageUrl;
  }
  
  /**
   **/
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
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
  @org.codehaus.jackson.annotate.JsonProperty("depth")
  @com.fasterxml.jackson.annotation.JsonProperty("depth")
  public Integer getDepth() {
    return depth;
  }
  
  /**
   **/
  public void setDepth(Integer depth) {
    this.depth = depth;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attribute")
  @com.fasterxml.jackson.annotation.JsonProperty("attribute")
  public List<String> getAttribute() {
    return attribute;
  }
  
  /**
   **/
  public void setAttribute(List<String> attribute) {
    this.attribute = attribute;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("asset")
  @com.fasterxml.jackson.annotation.JsonProperty("asset")
  public Map<String, String> getAsset() {
    return asset;
  }
  
  /**
   **/
  public void setAsset(Map<String, String> asset) {
    this.asset = asset;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayComponentDto displayComponentDto = (DisplayComponentDto) o;
    return Objects.equals(this.status, displayComponentDto.status) &&
        Objects.equals(this.productCount, displayComponentDto.productCount) &&
        Objects.equals(this.ordering, displayComponentDto.ordering) &&
        Objects.equals(this.name, displayComponentDto.name) &&
        Objects.equals(this.linkCode, displayComponentDto.linkCode) &&
        Objects.equals(this.imageUrl, displayComponentDto.imageUrl) &&
        Objects.equals(this.id, displayComponentDto.id) &&
        Objects.equals(this.depth, displayComponentDto.depth) &&
        Objects.equals(this.attribute, displayComponentDto.attribute) &&
        Objects.equals(this.asset, displayComponentDto.asset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, productCount, ordering, name, linkCode, imageUrl, id, depth, attribute, asset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayComponentDto {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    productCount: ").append(toIndentedString(productCount)).append("\n");
    sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    linkCode: ").append(toIndentedString(linkCode)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
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

  public static DisplayComponentDtoBuilder builder() {
    return new DisplayComponentDtoBuilder();
  }

  public static class DisplayComponentDtoBuilder {

    private String status = null;
    private Long productCount = null;
    private Integer ordering = null;
    private String name = null;
    private String linkCode = null;
    private String imageUrl = null;
    private Long id = null;
    private Integer depth = null;
    private List<String> attribute = new ArrayList<String>();
    private Map<String, String> asset = new HashMap<String, String>();
    

    DisplayComponentDtoBuilder() {
    }

    /**
     **/
    public DisplayComponentDtoBuilder status(String status) {
      this.status = status;
      return this;
    }

    /**
     **/
    public DisplayComponentDtoBuilder productCount(Long productCount) {
      this.productCount = productCount;
      return this;
    }

    /**
     **/
    public DisplayComponentDtoBuilder ordering(Integer ordering) {
      this.ordering = ordering;
      return this;
    }

    /**
     **/
    public DisplayComponentDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public DisplayComponentDtoBuilder linkCode(String linkCode) {
      this.linkCode = linkCode;
      return this;
    }

    /**
     **/
    public DisplayComponentDtoBuilder imageUrl(String imageUrl) {
      this.imageUrl = imageUrl;
      return this;
    }

    /**
     **/
    public DisplayComponentDtoBuilder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public DisplayComponentDtoBuilder depth(Integer depth) {
      this.depth = depth;
      return this;
    }

    /**
     **/
    public DisplayComponentDtoBuilder attribute(List<String> attribute) {
      this.attribute = attribute;
      return this;
    }

    /**
     **/
    public DisplayComponentDtoBuilder asset(Map<String, String> asset) {
      this.asset = asset;
      return this;
    }


    public DisplayComponentDto build() {
      DisplayComponentDto displayComponentDto = new DisplayComponentDto();
      displayComponentDto.setStatus(this.status);
      displayComponentDto.setProductCount(this.productCount);
      displayComponentDto.setOrdering(this.ordering);
      displayComponentDto.setName(this.name);
      displayComponentDto.setLinkCode(this.linkCode);
      displayComponentDto.setImageUrl(this.imageUrl);
      displayComponentDto.setId(this.id);
      displayComponentDto.setDepth(this.depth);
      displayComponentDto.setAttribute(this.attribute);
      displayComponentDto.setAsset(this.asset);
      return displayComponentDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayComponentDtoBuilder {\n");
      
      sb.append("    status: ").append(toIndentedString(status)).append("\n");
      sb.append("    productCount: ").append(toIndentedString(productCount)).append("\n");
      sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    linkCode: ").append(toIndentedString(linkCode)).append("\n");
      sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
      sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
      sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
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

