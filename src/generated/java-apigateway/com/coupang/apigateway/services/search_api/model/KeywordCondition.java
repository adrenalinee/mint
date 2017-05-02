package com.coupang.apigateway.services.search_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.search_api.model.Context;



/**
 * Keyword Api Condition Model
 **/

@io.swagger.annotations.ApiModel(description = "Keyword Api Condition Model")
@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
public class KeywordCondition   {
  
  private String query = null;
  private Integer limit = null;
  private Context context = null;

  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Query keyword")
  @org.codehaus.jackson.annotate.JsonProperty("query")
  @com.fasterxml.jackson.annotation.JsonProperty("query")
  public String getQuery() {
    return query;
  }
  
  /**
   * Query keyword
   **/
  public void setQuery(String query) {
    this.query = query;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Size of the result set")
  @org.codehaus.jackson.annotate.JsonProperty("limit")
  @com.fasterxml.jackson.annotation.JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }
  
  /**
   * Size of the result set
   **/
  public void setLimit(Integer limit) {
    this.limit = limit;
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
    KeywordCondition keywordCondition = (KeywordCondition) o;
    return Objects.equals(this.query, keywordCondition.query) &&
        Objects.equals(this.limit, keywordCondition.limit) &&
        Objects.equals(this.context, keywordCondition.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, limit, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordCondition {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

  public static KeywordConditionBuilder builder() {
    return new KeywordConditionBuilder();
  }

  public static class KeywordConditionBuilder {

    private String query = null;
    private Integer limit = null;
    private Context context = null;
    

    KeywordConditionBuilder() {
    }

    /**
     * Query keyword
     **/
    public KeywordConditionBuilder query(String query) {
      this.query = query;
      return this;
    }

    /**
     * Size of the result set
     **/
    public KeywordConditionBuilder limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Client context information
     **/
    public KeywordConditionBuilder context(Context context) {
      this.context = context;
      return this;
    }


    public KeywordCondition build() {
      KeywordCondition keywordCondition = new KeywordCondition();
      keywordCondition.setQuery(this.query);
      keywordCondition.setLimit(this.limit);
      keywordCondition.setContext(this.context);
      return keywordCondition;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class KeywordConditionBuilder {\n");
      
      sb.append("    query: ").append(toIndentedString(query)).append("\n");
      sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

