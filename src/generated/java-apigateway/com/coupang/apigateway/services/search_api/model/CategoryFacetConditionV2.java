package com.coupang.apigateway.services.search_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.search_api.model.Context;
import com.coupang.apigateway.services.search_api.model.DynamicFacetItem;
import com.coupang.apigateway.services.search_api.model.GeneralFilter;
import java.util.*;
import java.util.Map;



/**
 * Category Facet Condition Model
 **/

@io.swagger.annotations.ApiModel(description = "Category Facet Condition Model")
@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
public class CategoryFacetConditionV2   {
  
  private String segmentId = null;
  private String segRank = null;
  private Map<String, GeneralFilter> filter = new HashMap<String, GeneralFilter>();
  private List<DynamicFacetItem> dynamicFacetItems = new ArrayList<DynamicFacetItem>();
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
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Dynamic Items that need faceting(example attributes)")
  @org.codehaus.jackson.annotate.JsonProperty("dynamicFacetItems")
  @com.fasterxml.jackson.annotation.JsonProperty("dynamicFacetItems")
  public List<DynamicFacetItem> getDynamicFacetItems() {
    return dynamicFacetItems;
  }
  
  /**
   * Dynamic Items that need faceting(example attributes)
   **/
  public void setDynamicFacetItems(List<DynamicFacetItem> dynamicFacetItems) {
    this.dynamicFacetItems = dynamicFacetItems;
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
    CategoryFacetConditionV2 categoryFacetConditionV2 = (CategoryFacetConditionV2) o;
    return Objects.equals(this.segmentId, categoryFacetConditionV2.segmentId) &&
        Objects.equals(this.segRank, categoryFacetConditionV2.segRank) &&
        Objects.equals(this.filter, categoryFacetConditionV2.filter) &&
        Objects.equals(this.dynamicFacetItems, categoryFacetConditionV2.dynamicFacetItems) &&
        Objects.equals(this.date, categoryFacetConditionV2.date) &&
        Objects.equals(this.context, categoryFacetConditionV2.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentId, segRank, filter, dynamicFacetItems, date, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryFacetConditionV2 {\n");
    
    sb.append("    segmentId: ").append(toIndentedString(segmentId)).append("\n");
    sb.append("    segRank: ").append(toIndentedString(segRank)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    dynamicFacetItems: ").append(toIndentedString(dynamicFacetItems)).append("\n");
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

  public static CategoryFacetConditionV2Builder builder() {
    return new CategoryFacetConditionV2Builder();
  }

  public static class CategoryFacetConditionV2Builder {

    private String segmentId = null;
    private String segRank = null;
    private Map<String, GeneralFilter> filter = new HashMap<String, GeneralFilter>();
    private List<DynamicFacetItem> dynamicFacetItems = new ArrayList<DynamicFacetItem>();
    private String date = null;
    private Context context = null;
    

    CategoryFacetConditionV2Builder() {
    }

    /**
     * User Segment Id. (Default: 0)
     **/
    public CategoryFacetConditionV2Builder segmentId(String segmentId) {
      this.segmentId = segmentId;
      return this;
    }

    /**
     * segRank. (Default: segRankB)
     **/
    public CategoryFacetConditionV2Builder segRank(String segRank) {
      this.segRank = segRank;
      return this;
    }

    /**
     * GeneralFilter conditions map
     **/
    public CategoryFacetConditionV2Builder filter(Map<String, GeneralFilter> filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Dynamic Items that need faceting(example attributes)
     **/
    public CategoryFacetConditionV2Builder dynamicFacetItems(List<DynamicFacetItem> dynamicFacetItems) {
      this.dynamicFacetItems = dynamicFacetItems;
      return this;
    }

    /**
     * Date in YYYYMMDDThhmmss format
     **/
    public CategoryFacetConditionV2Builder date(String date) {
      this.date = date;
      return this;
    }

    /**
     * Client context information
     **/
    public CategoryFacetConditionV2Builder context(Context context) {
      this.context = context;
      return this;
    }


    public CategoryFacetConditionV2 build() {
      CategoryFacetConditionV2 categoryFacetConditionV2 = new CategoryFacetConditionV2();
      categoryFacetConditionV2.setSegmentId(this.segmentId);
      categoryFacetConditionV2.setSegRank(this.segRank);
      categoryFacetConditionV2.setFilter(this.filter);
      categoryFacetConditionV2.setDynamicFacetItems(this.dynamicFacetItems);
      categoryFacetConditionV2.setDate(this.date);
      categoryFacetConditionV2.setContext(this.context);
      return categoryFacetConditionV2;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CategoryFacetConditionV2Builder {\n");
      
      sb.append("    segmentId: ").append(toIndentedString(segmentId)).append("\n");
      sb.append("    segRank: ").append(toIndentedString(segRank)).append("\n");
      sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
      sb.append("    dynamicFacetItems: ").append(toIndentedString(dynamicFacetItems)).append("\n");
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

