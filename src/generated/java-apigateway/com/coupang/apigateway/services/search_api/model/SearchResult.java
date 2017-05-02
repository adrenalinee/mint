package com.coupang.apigateway.services.search_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.search_api.model.SearchProduct;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
public class SearchResult   {
  
  private String searchId = null;
  private Integer numFound = null;
  private List<SearchProduct> docs = new ArrayList<SearchProduct>();
  private Integer availableCount = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("numFound")
  @com.fasterxml.jackson.annotation.JsonProperty("numFound")
  public Integer getNumFound() {
    return numFound;
  }
  
  /**
   **/
  public void setNumFound(Integer numFound) {
    this.numFound = numFound;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("docs")
  @com.fasterxml.jackson.annotation.JsonProperty("docs")
  public List<SearchProduct> getDocs() {
    return docs;
  }
  
  /**
   **/
  public void setDocs(List<SearchProduct> docs) {
    this.docs = docs;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("availableCount")
  @com.fasterxml.jackson.annotation.JsonProperty("availableCount")
  public Integer getAvailableCount() {
    return availableCount;
  }
  
  /**
   **/
  public void setAvailableCount(Integer availableCount) {
    this.availableCount = availableCount;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResult searchResult = (SearchResult) o;
    return Objects.equals(this.searchId, searchResult.searchId) &&
        Objects.equals(this.numFound, searchResult.numFound) &&
        Objects.equals(this.docs, searchResult.docs) &&
        Objects.equals(this.availableCount, searchResult.availableCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchId, numFound, docs, availableCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResult {\n");
    
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("    numFound: ").append(toIndentedString(numFound)).append("\n");
    sb.append("    docs: ").append(toIndentedString(docs)).append("\n");
    sb.append("    availableCount: ").append(toIndentedString(availableCount)).append("\n");
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

  public static SearchResultBuilder builder() {
    return new SearchResultBuilder();
  }

  public static class SearchResultBuilder {

    private String searchId = null;
    private Integer numFound = null;
    private List<SearchProduct> docs = new ArrayList<SearchProduct>();
    private Integer availableCount = null;
    

    SearchResultBuilder() {
    }

    /**
     **/
    public SearchResultBuilder searchId(String searchId) {
      this.searchId = searchId;
      return this;
    }

    /**
     **/
    public SearchResultBuilder numFound(Integer numFound) {
      this.numFound = numFound;
      return this;
    }

    /**
     **/
    public SearchResultBuilder docs(List<SearchProduct> docs) {
      this.docs = docs;
      return this;
    }

    /**
     **/
    public SearchResultBuilder availableCount(Integer availableCount) {
      this.availableCount = availableCount;
      return this;
    }


    public SearchResult build() {
      SearchResult searchResult = new SearchResult();
      searchResult.setSearchId(this.searchId);
      searchResult.setNumFound(this.numFound);
      searchResult.setDocs(this.docs);
      searchResult.setAvailableCount(this.availableCount);
      return searchResult;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SearchResultBuilder {\n");
      
      sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
      sb.append("    numFound: ").append(toIndentedString(numFound)).append("\n");
      sb.append("    docs: ").append(toIndentedString(docs)).append("\n");
      sb.append("    availableCount: ").append(toIndentedString(availableCount)).append("\n");
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

