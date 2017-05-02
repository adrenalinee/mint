package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.booking_api.model.Option;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class SelectFilterDto   {
  
  private String type = null;
  private String title = null;
  private List<Option> options = new ArrayList<Option>();
  private String key = null;
  private Integer filterOrder = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("type")
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  public String getType() {
    return type;
  }
  
  /**
   **/
  public void setType(String type) {
    this.type = type;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("title")
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  public String getTitle() {
    return title;
  }
  
  /**
   **/
  public void setTitle(String title) {
    this.title = title;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("options")
  @com.fasterxml.jackson.annotation.JsonProperty("options")
  public List<Option> getOptions() {
    return options;
  }
  
  /**
   **/
  public void setOptions(List<Option> options) {
    this.options = options;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("key")
  @com.fasterxml.jackson.annotation.JsonProperty("key")
  public String getKey() {
    return key;
  }
  
  /**
   **/
  public void setKey(String key) {
    this.key = key;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("filterOrder")
  @com.fasterxml.jackson.annotation.JsonProperty("filterOrder")
  public Integer getFilterOrder() {
    return filterOrder;
  }
  
  /**
   **/
  public void setFilterOrder(Integer filterOrder) {
    this.filterOrder = filterOrder;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectFilterDto selectFilterDto = (SelectFilterDto) o;
    return Objects.equals(this.type, selectFilterDto.type) &&
        Objects.equals(this.title, selectFilterDto.title) &&
        Objects.equals(this.options, selectFilterDto.options) &&
        Objects.equals(this.key, selectFilterDto.key) &&
        Objects.equals(this.filterOrder, selectFilterDto.filterOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, options, key, filterOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectFilterDto {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    filterOrder: ").append(toIndentedString(filterOrder)).append("\n");
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

  public static SelectFilterDtoBuilder builder() {
    return new SelectFilterDtoBuilder();
  }

  public static class SelectFilterDtoBuilder {

    private String type = null;
    private String title = null;
    private List<Option> options = new ArrayList<Option>();
    private String key = null;
    private Integer filterOrder = null;
    

    SelectFilterDtoBuilder() {
    }

    /**
     **/
    public SelectFilterDtoBuilder type(String type) {
      this.type = type;
      return this;
    }

    /**
     **/
    public SelectFilterDtoBuilder title(String title) {
      this.title = title;
      return this;
    }

    /**
     **/
    public SelectFilterDtoBuilder options(List<Option> options) {
      this.options = options;
      return this;
    }

    /**
     **/
    public SelectFilterDtoBuilder key(String key) {
      this.key = key;
      return this;
    }

    /**
     **/
    public SelectFilterDtoBuilder filterOrder(Integer filterOrder) {
      this.filterOrder = filterOrder;
      return this;
    }


    public SelectFilterDto build() {
      SelectFilterDto selectFilterDto = new SelectFilterDto();
      selectFilterDto.setType(this.type);
      selectFilterDto.setTitle(this.title);
      selectFilterDto.setOptions(this.options);
      selectFilterDto.setKey(this.key);
      selectFilterDto.setFilterOrder(this.filterOrder);
      return selectFilterDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SelectFilterDtoBuilder {\n");
      
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
      sb.append("    title: ").append(toIndentedString(title)).append("\n");
      sb.append("    options: ").append(toIndentedString(options)).append("\n");
      sb.append("    key: ").append(toIndentedString(key)).append("\n");
      sb.append("    filterOrder: ").append(toIndentedString(filterOrder)).append("\n");
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

