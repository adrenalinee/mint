package com.coupang.apigateway.services.brand_shop.model;

import java.util.Objects;
import java.util.*;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.084+09:00")
public class BrandShopModuleMeta   {
  
  private Integer totalCount = null;
  private String searchId = null;
  private Map<String, String> requestUris = new HashMap<String, String>();
  private String nextPageKey = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("totalCount")
  @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
  public Integer getTotalCount() {
    return totalCount;
  }
  
  /**
   **/
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("searchId")
  @com.fasterxml.jackson.annotation.JsonProperty("searchId")
  public String getSearchId() {
    return searchId;
  }
  
  /**
   **/
  public void setSearchId(String searchId) {
    this.searchId = searchId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("requestUris")
  @com.fasterxml.jackson.annotation.JsonProperty("requestUris")
  public Map<String, String> getRequestUris() {
    return requestUris;
  }
  
  /**
   **/
  public void setRequestUris(Map<String, String> requestUris) {
    this.requestUris = requestUris;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("nextPageKey")
  @com.fasterxml.jackson.annotation.JsonProperty("nextPageKey")
  public String getNextPageKey() {
    return nextPageKey;
  }
  
  /**
   **/
  public void setNextPageKey(String nextPageKey) {
    this.nextPageKey = nextPageKey;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandShopModuleMeta brandShopModuleMeta = (BrandShopModuleMeta) o;
    return Objects.equals(this.totalCount, brandShopModuleMeta.totalCount) &&
        Objects.equals(this.searchId, brandShopModuleMeta.searchId) &&
        Objects.equals(this.requestUris, brandShopModuleMeta.requestUris) &&
        Objects.equals(this.nextPageKey, brandShopModuleMeta.nextPageKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, searchId, requestUris, nextPageKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandShopModuleMeta {\n");
    
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("    requestUris: ").append(toIndentedString(requestUris)).append("\n");
    sb.append("    nextPageKey: ").append(toIndentedString(nextPageKey)).append("\n");
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

  public static BrandShopModuleMetaBuilder builder() {
    return new BrandShopModuleMetaBuilder();
  }

  public static class BrandShopModuleMetaBuilder {

    private Integer totalCount = null;
    private String searchId = null;
    private Map<String, String> requestUris = new HashMap<String, String>();
    private String nextPageKey = null;
    

    BrandShopModuleMetaBuilder() {
    }

    /**
     **/
    public BrandShopModuleMetaBuilder totalCount(Integer totalCount) {
      this.totalCount = totalCount;
      return this;
    }

    /**
     **/
    public BrandShopModuleMetaBuilder searchId(String searchId) {
      this.searchId = searchId;
      return this;
    }

    /**
     **/
    public BrandShopModuleMetaBuilder requestUris(Map<String, String> requestUris) {
      this.requestUris = requestUris;
      return this;
    }

    /**
     **/
    public BrandShopModuleMetaBuilder nextPageKey(String nextPageKey) {
      this.nextPageKey = nextPageKey;
      return this;
    }


    public BrandShopModuleMeta build() {
      BrandShopModuleMeta brandShopModuleMeta = new BrandShopModuleMeta();
      brandShopModuleMeta.setTotalCount(this.totalCount);
      brandShopModuleMeta.setSearchId(this.searchId);
      brandShopModuleMeta.setRequestUris(this.requestUris);
      brandShopModuleMeta.setNextPageKey(this.nextPageKey);
      return brandShopModuleMeta;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BrandShopModuleMetaBuilder {\n");
      
      sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
      sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
      sb.append("    requestUris: ").append(toIndentedString(requestUris)).append("\n");
      sb.append("    nextPageKey: ").append(toIndentedString(nextPageKey)).append("\n");
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

