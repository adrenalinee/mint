package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class FilterDto   {
  


  public enum TypeEnum {
    RANGE("RANGE"),
    SELECT("SELECT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type = null;
  private String title = null;
  private String key = null;

  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "필터종류")
  @org.codehaus.jackson.annotate.JsonProperty("type")
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  /**
   * 필터종류
   **/
  public void setType(TypeEnum type) {
    this.type = type;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "필터명")
  @org.codehaus.jackson.annotate.JsonProperty("title")
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  public String getTitle() {
    return title;
  }
  
  /**
   * 필터명
   **/
  public void setTitle(String title) {
    this.title = title;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "필터시 사용되는 키")
  @org.codehaus.jackson.annotate.JsonProperty("key")
  @com.fasterxml.jackson.annotation.JsonProperty("key")
  public String getKey() {
    return key;
  }
  
  /**
   * 필터시 사용되는 키
   **/
  public void setKey(String key) {
    this.key = key;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterDto filterDto = (FilterDto) o;
    return Objects.equals(this.type, filterDto.type) &&
        Objects.equals(this.title, filterDto.title) &&
        Objects.equals(this.key, filterDto.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterDto {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

  public static FilterDtoBuilder builder() {
    return new FilterDtoBuilder();
  }

  public static class FilterDtoBuilder {

    private TypeEnum type = null;
    private String title = null;
    private String key = null;
    

    FilterDtoBuilder() {
    }

    /**
     * 필터종류
     **/
    public FilterDtoBuilder type(TypeEnum type) {
      this.type = type;
      return this;
    }

    /**
     * 필터명
     **/
    public FilterDtoBuilder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * 필터시 사용되는 키
     **/
    public FilterDtoBuilder key(String key) {
      this.key = key;
      return this;
    }


    public FilterDto build() {
      FilterDto filterDto = new FilterDto();
      filterDto.setType(this.type);
      filterDto.setTitle(this.title);
      filterDto.setKey(this.key);
      return filterDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class FilterDtoBuilder {\n");
      
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
      sb.append("    title: ").append(toIndentedString(title)).append("\n");
      sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

