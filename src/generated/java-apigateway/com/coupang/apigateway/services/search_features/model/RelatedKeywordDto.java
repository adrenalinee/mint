package com.coupang.apigateway.services.search_features.model;

import java.util.Objects;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.210+09:00")
public class RelatedKeywordDto   {
  
  private List<String> relatedKeywords = new ArrayList<String>();
  private String keyword = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("relatedKeywords")
  @com.fasterxml.jackson.annotation.JsonProperty("relatedKeywords")
  public List<String> getRelatedKeywords() {
    return relatedKeywords;
  }
  
  /**
   **/
  public void setRelatedKeywords(List<String> relatedKeywords) {
    this.relatedKeywords = relatedKeywords;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("keyword")
  @com.fasterxml.jackson.annotation.JsonProperty("keyword")
  public String getKeyword() {
    return keyword;
  }
  
  /**
   **/
  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedKeywordDto relatedKeywordDto = (RelatedKeywordDto) o;
    return Objects.equals(this.relatedKeywords, relatedKeywordDto.relatedKeywords) &&
        Objects.equals(this.keyword, relatedKeywordDto.keyword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relatedKeywords, keyword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedKeywordDto {\n");
    
    sb.append("    relatedKeywords: ").append(toIndentedString(relatedKeywords)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
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

  public static RelatedKeywordDtoBuilder builder() {
    return new RelatedKeywordDtoBuilder();
  }

  public static class RelatedKeywordDtoBuilder {

    private List<String> relatedKeywords = new ArrayList<String>();
    private String keyword = null;
    

    RelatedKeywordDtoBuilder() {
    }

    /**
     **/
    public RelatedKeywordDtoBuilder relatedKeywords(List<String> relatedKeywords) {
      this.relatedKeywords = relatedKeywords;
      return this;
    }

    /**
     **/
    public RelatedKeywordDtoBuilder keyword(String keyword) {
      this.keyword = keyword;
      return this;
    }


    public RelatedKeywordDto build() {
      RelatedKeywordDto relatedKeywordDto = new RelatedKeywordDto();
      relatedKeywordDto.setRelatedKeywords(this.relatedKeywords);
      relatedKeywordDto.setKeyword(this.keyword);
      return relatedKeywordDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RelatedKeywordDtoBuilder {\n");
      
      sb.append("    relatedKeywords: ").append(toIndentedString(relatedKeywords)).append("\n");
      sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
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

