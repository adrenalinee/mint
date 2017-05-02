package com.coupang.apigateway.services.search_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.search_api.model.Context;
import com.coupang.apigateway.services.search_api.model.GeneralFilter;
import java.util.*;
import java.util.Map;



/**
 * Search Api Condition Model
 **/

@io.swagger.annotations.ApiModel(description = "Search Api Condition Model")
@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
public class SearchConditionV1   {
  
  private Integer start = null;


  public enum SortEnum {
    BEST("BEST"),
    RECENCY("RECENCY"),
    OVERDATE("OVERDATE"),
    LOWEST_PRICE("LOWEST_PRICE"),
    MAXIMUM_PRICE("MAXIMUM_PRICE"),
    DEFAULT("DEFAULT"),
    BEST_SELLING("BEST_SELLING"),
    SECTION("SECTION"),
    SOLDOUT("SOLDOUT");

    private String value;

    SortEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private List<SortEnum> sort = new ArrayList<SortEnum>();
  private String query = null;
  private Integer limit = null;
  private Map<String, GeneralFilter> filter = new HashMap<String, GeneralFilter>();
  private String date = null;
  private Context context = null;

  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Result page start offset")
  @org.codehaus.jackson.annotate.JsonProperty("start")
  @com.fasterxml.jackson.annotation.JsonProperty("start")
  public Integer getStart() {
    return start;
  }
  
  /**
   * Result page start offset
   **/
  public void setStart(Integer start) {
    this.start = start;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Sort condition")
  @org.codehaus.jackson.annotate.JsonProperty("sort")
  @com.fasterxml.jackson.annotation.JsonProperty("sort")
  public List<SortEnum> getSort() {
    return sort;
  }
  
  /**
   * Sort condition
   **/
  public void setSort(List<SortEnum> sort) {
    this.sort = sort;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Query Keyword")
  @org.codehaus.jackson.annotate.JsonProperty("query")
  @com.fasterxml.jackson.annotation.JsonProperty("query")
  public String getQuery() {
    return query;
  }
  
  /**
   * Query Keyword
   **/
  public void setQuery(String query) {
    this.query = query;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Result page size")
  @org.codehaus.jackson.annotate.JsonProperty("limit")
  @com.fasterxml.jackson.annotation.JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }
  
  /**
   * Result page size
   **/
  public void setLimit(Integer limit) {
    this.limit = limit;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "GeneralFilter conditions map, accepted values for keys are any of: ABTEST_GROUPS, ATTRIBUTE, AVAILABLE_DATES, BOUNDINGBOX, BRAND, BRANDID, COMPONENTIDS, PRODUCTCOMPONENTIDS, DEALCOMPONENTIDS, DELIVERYTYPES, ISADULT, ISDIRECTUSE, ISSOLDOUT, ISREPRESENTITIVE, PRICE, NOATTRIBUTE, PRODUCTID, RATING, SECTION_FILTER, SHIPPINGCENTERID, SHIPPINGINFORMAIONLIST, TYPE, TODAYOPEN, TODAYCLOSE, VENDORID, WINNERVENDORITEMID, WINNERVENDORID, ITEMID, UPC")
  @org.codehaus.jackson.annotate.JsonProperty("filter")
  @com.fasterxml.jackson.annotation.JsonProperty("filter")
  public Map<String, GeneralFilter> getFilter() {
    return filter;
  }
  
  /**
   * GeneralFilter conditions map, accepted values for keys are any of: ABTEST_GROUPS, ATTRIBUTE, AVAILABLE_DATES, BOUNDINGBOX, BRAND, BRANDID, COMPONENTIDS, PRODUCTCOMPONENTIDS, DEALCOMPONENTIDS, DELIVERYTYPES, ISADULT, ISDIRECTUSE, ISSOLDOUT, ISREPRESENTITIVE, PRICE, NOATTRIBUTE, PRODUCTID, RATING, SECTION_FILTER, SHIPPINGCENTERID, SHIPPINGINFORMAIONLIST, TYPE, TODAYOPEN, TODAYCLOSE, VENDORID, WINNERVENDORITEMID, WINNERVENDORID, ITEMID, UPC
   **/
  public void setFilter(Map<String, GeneralFilter> filter) {
    this.filter = filter;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Date in yyyyMMddhhmmss format, 24-hour format")
  @org.codehaus.jackson.annotate.JsonProperty("date")
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  public String getDate() {
    return date;
  }
  
  /**
   * Date in yyyyMMddhhmmss format, 24-hour format
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
    SearchConditionV1 searchConditionV1 = (SearchConditionV1) o;
    return Objects.equals(this.start, searchConditionV1.start) &&
        Objects.equals(this.sort, searchConditionV1.sort) &&
        Objects.equals(this.query, searchConditionV1.query) &&
        Objects.equals(this.limit, searchConditionV1.limit) &&
        Objects.equals(this.filter, searchConditionV1.filter) &&
        Objects.equals(this.date, searchConditionV1.date) &&
        Objects.equals(this.context, searchConditionV1.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, sort, query, limit, filter, date, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchConditionV1 {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

  public static SearchConditionV1Builder builder() {
    return new SearchConditionV1Builder();
  }

  public static class SearchConditionV1Builder {

    private Integer start = null;
    private List<SortEnum> sort = new ArrayList<SortEnum>();
    private String query = null;
    private Integer limit = null;
    private Map<String, GeneralFilter> filter = new HashMap<String, GeneralFilter>();
    private String date = null;
    private Context context = null;
    

    SearchConditionV1Builder() {
    }

    /**
     * Result page start offset
     **/
    public SearchConditionV1Builder start(Integer start) {
      this.start = start;
      return this;
    }

    /**
     * Sort condition
     **/
    public SearchConditionV1Builder sort(List<SortEnum> sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Query Keyword
     **/
    public SearchConditionV1Builder query(String query) {
      this.query = query;
      return this;
    }

    /**
     * Result page size
     **/
    public SearchConditionV1Builder limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * GeneralFilter conditions map, accepted values for keys are any of: ABTEST_GROUPS, ATTRIBUTE, AVAILABLE_DATES, BOUNDINGBOX, BRAND, BRANDID, COMPONENTIDS, PRODUCTCOMPONENTIDS, DEALCOMPONENTIDS, DELIVERYTYPES, ISADULT, ISDIRECTUSE, ISSOLDOUT, ISREPRESENTITIVE, PRICE, NOATTRIBUTE, PRODUCTID, RATING, SECTION_FILTER, SHIPPINGCENTERID, SHIPPINGINFORMAIONLIST, TYPE, TODAYOPEN, TODAYCLOSE, VENDORID, WINNERVENDORITEMID, WINNERVENDORID, ITEMID, UPC
     **/
    public SearchConditionV1Builder filter(Map<String, GeneralFilter> filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Date in yyyyMMddhhmmss format, 24-hour format
     **/
    public SearchConditionV1Builder date(String date) {
      this.date = date;
      return this;
    }

    /**
     * Client context information
     **/
    public SearchConditionV1Builder context(Context context) {
      this.context = context;
      return this;
    }


    public SearchConditionV1 build() {
      SearchConditionV1 searchConditionV1 = new SearchConditionV1();
      searchConditionV1.setStart(this.start);
      searchConditionV1.setSort(this.sort);
      searchConditionV1.setQuery(this.query);
      searchConditionV1.setLimit(this.limit);
      searchConditionV1.setFilter(this.filter);
      searchConditionV1.setDate(this.date);
      searchConditionV1.setContext(this.context);
      return searchConditionV1;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SearchConditionV1Builder {\n");
      
      sb.append("    start: ").append(toIndentedString(start)).append("\n");
      sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
      sb.append("    query: ").append(toIndentedString(query)).append("\n");
      sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
      sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

