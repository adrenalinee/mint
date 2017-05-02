package com.coupang.apigateway.services.search_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
public class NoHitSuggestion   {
  
  private String query = null;
  private Integer qf = null;
  private Integer hit = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("query")
  @com.fasterxml.jackson.annotation.JsonProperty("query")
  public String getQuery() {
    return query;
  }
  
  /**
   **/
  public void setQuery(String query) {
    this.query = query;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("qf")
  @com.fasterxml.jackson.annotation.JsonProperty("qf")
  public Integer getQf() {
    return qf;
  }
  
  /**
   **/
  public void setQf(Integer qf) {
    this.qf = qf;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("hit")
  @com.fasterxml.jackson.annotation.JsonProperty("hit")
  public Integer getHit() {
    return hit;
  }
  
  /**
   **/
  public void setHit(Integer hit) {
    this.hit = hit;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoHitSuggestion noHitSuggestion = (NoHitSuggestion) o;
    return Objects.equals(this.query, noHitSuggestion.query) &&
        Objects.equals(this.qf, noHitSuggestion.qf) &&
        Objects.equals(this.hit, noHitSuggestion.hit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, qf, hit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoHitSuggestion {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    qf: ").append(toIndentedString(qf)).append("\n");
    sb.append("    hit: ").append(toIndentedString(hit)).append("\n");
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

  public static NoHitSuggestionBuilder builder() {
    return new NoHitSuggestionBuilder();
  }

  public static class NoHitSuggestionBuilder {

    private String query = null;
    private Integer qf = null;
    private Integer hit = null;
    

    NoHitSuggestionBuilder() {
    }

    /**
     **/
    public NoHitSuggestionBuilder query(String query) {
      this.query = query;
      return this;
    }

    /**
     **/
    public NoHitSuggestionBuilder qf(Integer qf) {
      this.qf = qf;
      return this;
    }

    /**
     **/
    public NoHitSuggestionBuilder hit(Integer hit) {
      this.hit = hit;
      return this;
    }


    public NoHitSuggestion build() {
      NoHitSuggestion noHitSuggestion = new NoHitSuggestion();
      noHitSuggestion.setQuery(this.query);
      noHitSuggestion.setQf(this.qf);
      noHitSuggestion.setHit(this.hit);
      return noHitSuggestion;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class NoHitSuggestionBuilder {\n");
      
      sb.append("    query: ").append(toIndentedString(query)).append("\n");
      sb.append("    qf: ").append(toIndentedString(qf)).append("\n");
      sb.append("    hit: ").append(toIndentedString(hit)).append("\n");
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

