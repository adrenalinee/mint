package com.coupang.apigateway.services.shared.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.189+09:00")
public class FacetDto   {
  
  private String name = null;
  private Integer count = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("name")
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  public String getName() {
    return name;
  }
  
  /**
   **/
  public void setName(String name) {
    this.name = name;
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
    FacetDto facetDto = (FacetDto) o;
    return Objects.equals(this.name, facetDto.name) &&
        Objects.equals(this.count, facetDto.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacetDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

  public static FacetDtoBuilder builder() {
    return new FacetDtoBuilder();
  }

  public static class FacetDtoBuilder {

    private String name = null;
    private Integer count = null;
    

    FacetDtoBuilder() {
    }

    /**
     **/
    public FacetDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public FacetDtoBuilder count(Integer count) {
      this.count = count;
      return this;
    }


    public FacetDto build() {
      FacetDto facetDto = new FacetDto();
      facetDto.setName(this.name);
      facetDto.setCount(this.count);
      return facetDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class FacetDtoBuilder {\n");
      
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

