package com.coupang.apigateway.services.dealrank.model;

import java.util.Objects;
import java.math.BigDecimal;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.606+09:00")
public class InlineResponse200   {
  
  private List<String> data = new ArrayList<String>();
  private BigDecimal totalCount = null;
  private BigDecimal categoryId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("data")
  @com.fasterxml.jackson.annotation.JsonProperty("data")
  public List<String> getData() {
    return data;
  }
  
  /**
   **/
  public void setData(List<String> data) {
    this.data = data;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("totalCount")
  @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
  public BigDecimal getTotalCount() {
    return totalCount;
  }
  
  /**
   **/
  public void setTotalCount(BigDecimal totalCount) {
    this.totalCount = totalCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("categoryId")
  @com.fasterxml.jackson.annotation.JsonProperty("categoryId")
  public BigDecimal getCategoryId() {
    return categoryId;
  }
  
  /**
   **/
  public void setCategoryId(BigDecimal categoryId) {
    this.categoryId = categoryId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.data, inlineResponse200.data) &&
        Objects.equals(this.totalCount, inlineResponse200.totalCount) &&
        Objects.equals(this.categoryId, inlineResponse200.categoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, totalCount, categoryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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

  public static InlineResponse200Builder builder() {
    return new InlineResponse200Builder();
  }

  public static class InlineResponse200Builder {

    private List<String> data = new ArrayList<String>();
    private BigDecimal totalCount = null;
    private BigDecimal categoryId = null;
    

    InlineResponse200Builder() {
    }

    /**
     **/
    public InlineResponse200Builder data(List<String> data) {
      this.data = data;
      return this;
    }

    /**
     **/
    public InlineResponse200Builder totalCount(BigDecimal totalCount) {
      this.totalCount = totalCount;
      return this;
    }

    /**
     **/
    public InlineResponse200Builder categoryId(BigDecimal categoryId) {
      this.categoryId = categoryId;
      return this;
    }


    public InlineResponse200 build() {
      InlineResponse200 inlineResponse200 = new InlineResponse200();
      inlineResponse200.setData(this.data);
      inlineResponse200.setTotalCount(this.totalCount);
      inlineResponse200.setCategoryId(this.categoryId);
      return inlineResponse200;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class InlineResponse200Builder {\n");
      
      sb.append("    data: ").append(toIndentedString(data)).append("\n");
      sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
      sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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

