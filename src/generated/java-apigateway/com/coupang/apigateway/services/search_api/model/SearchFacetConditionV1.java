package com.coupang.apigateway.services.search_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.search_api.model.Context;
import com.coupang.apigateway.services.search_api.model.GeneralFilter;
import java.util.*;
import java.util.Map;



/**
 * Facet Api Condition Model
 **/

@io.swagger.annotations.ApiModel(description = "Facet Api Condition Model")
@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
public class SearchFacetConditionV1   {
  
  private String query = null;
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
    SearchFacetConditionV1 searchFacetConditionV1 = (SearchFacetConditionV1) o;
    return Objects.equals(this.query, searchFacetConditionV1.query) &&
        Objects.equals(this.filter, searchFacetConditionV1.filter) &&
        Objects.equals(this.facetItems, searchFacetConditionV1.facetItems) &&
        Objects.equals(this.date, searchFacetConditionV1.date) &&
        Objects.equals(this.context, searchFacetConditionV1.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, filter, facetItems, date, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchFacetConditionV1 {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

  public static SearchFacetConditionV1Builder builder() {
    return new SearchFacetConditionV1Builder();
  }

  public static class SearchFacetConditionV1Builder {

    private String query = null;
    private Map<String, GeneralFilter> filter = new HashMap<String, GeneralFilter>();
    private List<FacetItemsEnum> facetItems = new ArrayList<FacetItemsEnum>();
    private String date = null;
    private Context context = null;
    

    SearchFacetConditionV1Builder() {
    }

    /**
     * Search Keyword
     **/
    public SearchFacetConditionV1Builder query(String query) {
      this.query = query;
      return this;
    }

    /**
     * GeneralFilter conditions map
     **/
    public SearchFacetConditionV1Builder filter(Map<String, GeneralFilter> filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Items that need faceting
     **/
    public SearchFacetConditionV1Builder facetItems(List<FacetItemsEnum> facetItems) {
      this.facetItems = facetItems;
      return this;
    }

    /**
     * Date in YYYYMMDDThhmmss format
     **/
    public SearchFacetConditionV1Builder date(String date) {
      this.date = date;
      return this;
    }

    /**
     * Client context information
     **/
    public SearchFacetConditionV1Builder context(Context context) {
      this.context = context;
      return this;
    }


    public SearchFacetConditionV1 build() {
      SearchFacetConditionV1 searchFacetConditionV1 = new SearchFacetConditionV1();
      searchFacetConditionV1.setQuery(this.query);
      searchFacetConditionV1.setFilter(this.filter);
      searchFacetConditionV1.setFacetItems(this.facetItems);
      searchFacetConditionV1.setDate(this.date);
      searchFacetConditionV1.setContext(this.context);
      return searchFacetConditionV1;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SearchFacetConditionV1Builder {\n");
      
      sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

