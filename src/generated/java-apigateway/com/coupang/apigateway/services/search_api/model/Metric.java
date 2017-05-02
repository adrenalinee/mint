package com.coupang.apigateway.services.search_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
public class Metric   {
  
  private Double score = null;
  private Integer count = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("score")
  @com.fasterxml.jackson.annotation.JsonProperty("score")
  public Double getScore() {
    return score;
  }
  
  /**
   **/
  public void setScore(Double score) {
    this.score = score;
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
    Metric metric = (Metric) o;
    return Objects.equals(this.score, metric.score) &&
        Objects.equals(this.count, metric.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metric {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

  public static MetricBuilder builder() {
    return new MetricBuilder();
  }

  public static class MetricBuilder {

    private Double score = null;
    private Integer count = null;
    

    MetricBuilder() {
    }

    /**
     **/
    public MetricBuilder score(Double score) {
      this.score = score;
      return this;
    }

    /**
     **/
    public MetricBuilder count(Integer count) {
      this.count = count;
      return this;
    }


    public Metric build() {
      Metric metric = new Metric();
      metric.setScore(this.score);
      metric.setCount(this.count);
      return metric;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MetricBuilder {\n");
      
      sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

