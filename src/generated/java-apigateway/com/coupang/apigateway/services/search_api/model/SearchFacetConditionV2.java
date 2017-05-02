package com.coupang.apigateway.services.search_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.search_api.model.Context;
import com.coupang.apigateway.services.search_api.model.DynamicFacetItem;
import com.coupang.apigateway.services.search_api.model.GeneralFilter;
import java.util.*;
import java.util.Map;



/**
 * Facet Api Condition Model
 **/

@io.swagger.annotations.ApiModel(description = "Facet Api Condition Model")
@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
public class SearchFacetConditionV2   {
  
  private String query = null;
  private Map<String, GeneralFilter> filter = new HashMap<String, GeneralFilter>();
  private List<DynamicFacetItem> dynamicFacetItems = new ArrayList<DynamicFacetItem>();
  private String date = null;
  private Context context = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "Search Keyword")
  @org.codehaus.jackson.annotate.JsonProperty("query")
  @com.fasterxml.jackson.annotation.JsonProperty("query")
  public String getQuery() {
    return query;
  }
  
  /**
   * Search Keyword
   **/
  public void setQuery(String query) {
    this.query = query;
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
    SearchFacetConditionV2 searchFacetConditionV2 = (SearchFacetConditionV2) o;
    return Objects.equals(this.query, searchFacetConditionV2.query) &&
        Objects.equals(this.filter, searchFacetConditionV2.filter) &&
        Objects.equals(this.dynamicFacetItems, searchFacetConditionV2.dynamicFacetItems) &&
        Objects.equals(this.date, searchFacetConditionV2.date) &&
        Objects.equals(this.context, searchFacetConditionV2.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, filter, dynamicFacetItems, date, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchFacetConditionV2 {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

  public static SearchFacetConditionV2Builder builder() {
    return new SearchFacetConditionV2Builder();
  }

  public static class SearchFacetConditionV2Builder {

    private String query = null;
    private Map<String, GeneralFilter> filter = new HashMap<String, GeneralFilter>();
    private List<DynamicFacetItem> dynamicFacetItems = new ArrayList<DynamicFacetItem>();
    private String date = null;
    private Context context = null;
    

    SearchFacetConditionV2Builder() {
    }

    /**
     * Search Keyword
     **/
    public SearchFacetConditionV2Builder query(String query) {
      this.query = query;
      return this;
    }

    /**
     * GeneralFilter conditions map
     **/
    public SearchFacetConditionV2Builder filter(Map<String, GeneralFilter> filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Dynamic Items that need faceting(example attributes)
     **/
    public SearchFacetConditionV2Builder dynamicFacetItems(List<DynamicFacetItem> dynamicFacetItems) {
      this.dynamicFacetItems = dynamicFacetItems;
      return this;
    }

    /**
     * Date in YYYYMMDDThhmmss format
     **/
    public SearchFacetConditionV2Builder date(String date) {
      this.date = date;
      return this;
    }

    /**
     * Client context information
     **/
    public SearchFacetConditionV2Builder context(Context context) {
      this.context = context;
      return this;
    }


    public SearchFacetConditionV2 build() {
      SearchFacetConditionV2 searchFacetConditionV2 = new SearchFacetConditionV2();
      searchFacetConditionV2.setQuery(this.query);
      searchFacetConditionV2.setFilter(this.filter);
      searchFacetConditionV2.setDynamicFacetItems(this.dynamicFacetItems);
      searchFacetConditionV2.setDate(this.date);
      searchFacetConditionV2.setContext(this.context);
      return searchFacetConditionV2;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SearchFacetConditionV2Builder {\n");
      
      sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

