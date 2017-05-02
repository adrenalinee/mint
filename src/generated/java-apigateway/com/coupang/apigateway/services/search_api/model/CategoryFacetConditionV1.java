package com.coupang.apigateway.services.search_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.search_api.model.Context;
import com.coupang.apigateway.services.search_api.model.GeneralFilter;
import java.util.*;
import java.util.Map;



/**
 * Category Facet Condition Model
 **/

@io.swagger.annotations.ApiModel(description = "Category Facet Condition Model")
@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
public class CategoryFacetConditionV1   {
  
  private String segmentId = null;
  private String segRank = null;
  private Map<String, GeneralFilter> filter = new HashMap<String, GeneralFilter>();


  public enum FacetItemsEnum {
    CATEGORY("CATEGORY"),
    LEAF_CATEGORY("LEAF_CATEGORY"),
    PRICE("PRICE"),
    DELIVERY("DELIVERY"),
    BRAND("BRAND"),
    ATTRIBUTE_TYPE("ATTRIBUTE_TYPE"),
    ATTRIBUTE("ATTRIBUTE");

    private String value;

    FacetItemsEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private List<FacetItemsEnum> facetItems = new ArrayList<FacetItemsEnum>();
  private String date = null;
  private Context context = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "User Segment Id. (Default: 0)")
  @org.codehaus.jackson.annotate.JsonProperty("segmentId")
  @com.fasterxml.jackson.annotation.JsonProperty("segmentId")
  public String getSegmentId() {
    return segmentId;
  }
  
  /**
   * User Segment Id. (Default: 0)
   **/
  public void setSegmentId(String segmentId) {
    this.segmentId = segmentId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "segRank. (Default: segRankB)")
  @org.codehaus.jackson.annotate.JsonProperty("segRank")
  @com.fasterxml.jackson.annotation.JsonProperty("segRank")
  public String getSegRank() {
    return segRank;
  }
  
  /**
   * segRank. (Default: segRankB)
   **/
  public void setSegRank(String segRank) {
    this.segRank = segRank;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "GeneralFilter conditions map")
  @org.codehaus.jackson.annotate.JsonProperty("filter")
  @com.fasterxml.jackson.annotation.JsonProperty("filter")
  public Map<String, GeneralFilter> getFilter() {
    return filter;
  }
  
  /**
   * GeneralFilter conditions map
   **/
  public void setFilter(Map<String, GeneralFilter> filter) {
    this.filter = filter;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Items that need faceting")
  @org.codehaus.jackson.annotate.JsonProperty("facetItems")
  @com.fasterxml.jackson.annotation.JsonProperty("facetItems")
  public List<FacetItemsEnum> getFacetItems() {
    return facetItems;
  }
  
  /**
   * Items that need faceting
   **/
  public void setFacetItems(List<FacetItemsEnum> facetItems) {
    this.facetItems = facetItems;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Date in YYYYMMDDThhmmss format")
  @org.codehaus.jackson.annotate.JsonProperty("date")
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  public String getDate() {
    return date;
  }
  
  /**
   * Date in YYYYMMDDThhmmss format
   **/
  public void setDate(String date) {
    this.date = date;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Client context information")
  @org.codehaus.jackson.annotate.JsonProperty("context")
  @com.fasterxml.jackson.annotation.JsonProperty("context")
  public Context getContext() {
    return context;
  }
  
  /**
   * Client context information
   **/
  public void setContext(Context context) {
    this.context = context;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryFacetConditionV1 categoryFacetConditionV1 = (CategoryFacetConditionV1) o;
    return Objects.equals(this.segmentId, categoryFacetConditionV1.segmentId) &&
        Objects.equals(this.segRank, categoryFacetConditionV1.segRank) &&
        Objects.equals(this.filter, categoryFacetConditionV1.filter) &&
        Objects.equals(this.facetItems, categoryFacetConditionV1.facetItems) &&
        Objects.equals(this.date, categoryFacetConditionV1.date) &&
        Objects.equals(this.context, categoryFacetConditionV1.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentId, segRank, filter, facetItems, date, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryFacetConditionV1 {\n");
    
    sb.append("    segmentId: ").append(toIndentedString(segmentId)).append("\n");
    sb.append("    segRank: ").append(toIndentedString(segRank)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    facetItems: ").append(toIndentedString(facetItems)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

  public static CategoryFacetConditionV1Builder builder() {
    return new CategoryFacetConditionV1Builder();
  }

  public static class CategoryFacetConditionV1Builder {

    private String segmentId = null;
    private String segRank = null;
    private Map<String, GeneralFilter> filter = new HashMap<String, GeneralFilter>();
    private List<FacetItemsEnum> facetItems = new ArrayList<FacetItemsEnum>();
    private String date = null;
    private Context context = null;
    

    CategoryFacetConditionV1Builder() {
    }

    /**
     * User Segment Id. (Default: 0)
     **/
    public CategoryFacetConditionV1Builder segmentId(String segmentId) {
      this.segmentId = segmentId;
      return this;
    }

    /**
     * segRank. (Default: segRankB)
     **/
    public CategoryFacetConditionV1Builder segRank(String segRank) {
      this.segRank = segRank;
      return this;
    }

    /**
     * GeneralFilter conditions map
     **/
    public CategoryFacetConditionV1Builder filter(Map<String, GeneralFilter> filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Items that need faceting
     **/
    public CategoryFacetConditionV1Builder facetItems(List<FacetItemsEnum> facetItems) {
      this.facetItems = facetItems;
      return this;
    }

    /**
     * Date in YYYYMMDDThhmmss format
     **/
    public CategoryFacetConditionV1Builder date(String date) {
      this.date = date;
      return this;
    }

    /**
     * Client context information
     **/
    public CategoryFacetConditionV1Builder context(Context context) {
      this.context = context;
      return this;
    }


    public CategoryFacetConditionV1 build() {
      CategoryFacetConditionV1 categoryFacetConditionV1 = new CategoryFacetConditionV1();
      categoryFacetConditionV1.setSegmentId(this.segmentId);
      categoryFacetConditionV1.setSegRank(this.segRank);
      categoryFacetConditionV1.setFilter(this.filter);
      categoryFacetConditionV1.setFacetItems(this.facetItems);
      categoryFacetConditionV1.setDate(this.date);
      categoryFacetConditionV1.setContext(this.context);
      return categoryFacetConditionV1;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CategoryFacetConditionV1Builder {\n");
      
      sb.append("    segmentId: ").append(toIndentedString(segmentId)).append("\n");
      sb.append("    segRank: ").append(toIndentedString(segRank)).append("\n");
      sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
      sb.append("    facetItems: ").append(toIndentedString(facetItems)).append("\n");
      sb.append("    date: ").append(toIndentedString(date)).append("\n");
      sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

