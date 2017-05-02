package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.booking_api.model.SorterDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class SorterDto   {
  
  private String value = null;
  private String title = null;
  private String key = null;
  private List<SorterDto> children = new ArrayList<SorterDto>();

  
  @io.swagger.annotations.ApiModelProperty(value = "정렬시 사용되는 값")
  @org.codehaus.jackson.annotate.JsonProperty("value")
  @com.fasterxml.jackson.annotation.JsonProperty("value")
  public String getValue() {
    return value;
  }
  
  /**
   * 정렬시 사용되는 값
   **/
  public void setValue(String value) {
    this.value = value;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "정렬명")
  @org.codehaus.jackson.annotate.JsonProperty("title")
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  public String getTitle() {
    return title;
  }
  
  /**
   * 정렬명
   **/
  public void setTitle(String title) {
    this.title = title;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "정렬시 사용되는 키")
  @org.codehaus.jackson.annotate.JsonProperty("key")
  @com.fasterxml.jackson.annotation.JsonProperty("key")
  public String getKey() {
    return key;
  }
  
  /**
   * 정렬시 사용되는 키
   **/
  public void setKey(String key) {
    this.key = key;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "하위정렬 목록")
  @org.codehaus.jackson.annotate.JsonProperty("children")
  @com.fasterxml.jackson.annotation.JsonProperty("children")
  public List<SorterDto> getChildren() {
    return children;
  }
  
  /**
   * 하위정렬 목록
   **/
  public void setChildren(List<SorterDto> children) {
    this.children = children;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SorterDto sorterDto = (SorterDto) o;
    return Objects.equals(this.value, sorterDto.value) &&
        Objects.equals(this.title, sorterDto.title) &&
        Objects.equals(this.key, sorterDto.key) &&
        Objects.equals(this.children, sorterDto.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, title, key, children);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SorterDto {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

  public static SorterDtoBuilder builder() {
    return new SorterDtoBuilder();
  }

  public static class SorterDtoBuilder {

    private String value = null;
    private String title = null;
    private String key = null;
    private List<SorterDto> children = new ArrayList<SorterDto>();
    

    SorterDtoBuilder() {
    }

    /**
     * 정렬시 사용되는 값
     **/
    public SorterDtoBuilder value(String value) {
      this.value = value;
      return this;
    }

    /**
     * 정렬명
     **/
    public SorterDtoBuilder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * 정렬시 사용되는 키
     **/
    public SorterDtoBuilder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * 하위정렬 목록
     **/
    public SorterDtoBuilder children(List<SorterDto> children) {
      this.children = children;
      return this;
    }


    public SorterDto build() {
      SorterDto sorterDto = new SorterDto();
      sorterDto.setValue(this.value);
      sorterDto.setTitle(this.title);
      sorterDto.setKey(this.key);
      sorterDto.setChildren(this.children);
      return sorterDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SorterDtoBuilder {\n");
      
      sb.append("    value: ").append(toIndentedString(value)).append("\n");
      sb.append("    title: ").append(toIndentedString(title)).append("\n");
      sb.append("    key: ").append(toIndentedString(key)).append("\n");
      sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

