package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ReviewSmartFilterDto   {
  
  private String word = null;
  private String targetUrl = null;
  private Long id = null;
  private Integer count = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("word")
  @com.fasterxml.jackson.annotation.JsonProperty("word")
  public String getWord() {
    return word;
  }
  
  /**
   **/
  public void setWord(String word) {
    this.word = word;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("targetUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("targetUrl")
  public String getTargetUrl() {
    return targetUrl;
  }
  
  /**
   **/
  public void setTargetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("id")
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  public Long getId() {
    return id;
  }
  
  /**
   **/
  public void setId(Long id) {
    this.id = id;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("count")
  @com.fasterxml.jackson.annotation.JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  
  /**
   **/
  public void setCount(Integer count) {
    this.count = count;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewSmartFilterDto reviewSmartFilterDto = (ReviewSmartFilterDto) o;
    return Objects.equals(this.word, reviewSmartFilterDto.word) &&
        Objects.equals(this.targetUrl, reviewSmartFilterDto.targetUrl) &&
        Objects.equals(this.id, reviewSmartFilterDto.id) &&
        Objects.equals(this.count, reviewSmartFilterDto.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(word, targetUrl, id, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewSmartFilterDto {\n");
    
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
    sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

  public static ReviewSmartFilterDtoBuilder builder() {
    return new ReviewSmartFilterDtoBuilder();
  }

  public static class ReviewSmartFilterDtoBuilder {

    private String word = null;
    private String targetUrl = null;
    private Long id = null;
    private Integer count = null;
    

    ReviewSmartFilterDtoBuilder() {
    }

    /**
     **/
    public ReviewSmartFilterDtoBuilder word(String word) {
      this.word = word;
      return this;
    }

    /**
     **/
    public ReviewSmartFilterDtoBuilder targetUrl(String targetUrl) {
      this.targetUrl = targetUrl;
      return this;
    }

    /**
     **/
    public ReviewSmartFilterDtoBuilder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public ReviewSmartFilterDtoBuilder count(Integer count) {
      this.count = count;
      return this;
    }


    public ReviewSmartFilterDto build() {
      ReviewSmartFilterDto reviewSmartFilterDto = new ReviewSmartFilterDto();
      reviewSmartFilterDto.setWord(this.word);
      reviewSmartFilterDto.setTargetUrl(this.targetUrl);
      reviewSmartFilterDto.setId(this.id);
      reviewSmartFilterDto.setCount(this.count);
      return reviewSmartFilterDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReviewSmartFilterDtoBuilder {\n");
      
      sb.append("    word: ").append(toIndentedString(word)).append("\n");
      sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

