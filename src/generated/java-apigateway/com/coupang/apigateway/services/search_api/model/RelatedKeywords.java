package com.coupang.apigateway.services.search_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
public class RelatedKeywords   {
  
  private String relatedKeywords = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("relatedKeywords")
  @com.fasterxml.jackson.annotation.JsonProperty("relatedKeywords")
  public String getRelatedKeywords() {
    return relatedKeywords;
  }
  
  /**
   **/
  public void setRelatedKeywords(String relatedKeywords) {
    this.relatedKeywords = relatedKeywords;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedKeywords relatedKeywords = (RelatedKeywords) o;
    return Objects.equals(this.relatedKeywords, relatedKeywords.relatedKeywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relatedKeywords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedKeywords {\n");
    
    sb.append("    relatedKeywords: ").append(toIndentedString(relatedKeywords)).append("\n");
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

  public static RelatedKeywordsBuilder builder() {
    return new RelatedKeywordsBuilder();
  }

  public static class RelatedKeywordsBuilder {

    private String relatedKeywords = null;
    

    RelatedKeywordsBuilder() {
    }

    /**
     **/
    public RelatedKeywordsBuilder relatedKeywords(String relatedKeywords) {
      this.relatedKeywords = relatedKeywords;
      return this;
    }


    public RelatedKeywords build() {
      RelatedKeywords relatedKeywords = new RelatedKeywords();
      relatedKeywords.setRelatedKeywords(this.relatedKeywords);
      return relatedKeywords;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RelatedKeywordsBuilder {\n");
      
      sb.append("    relatedKeywords: ").append(toIndentedString(relatedKeywords)).append("\n");
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

