package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class RangeFilterDto   {
  
  private String valueSymbol = null;
  private String type = null;
  private String to = null;
  private String title = null;
  private String rangeSymbol = null;
  private String key = null;
  private String from = null;
  private Integer filterOrder = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("valueSymbol")
  @com.fasterxml.jackson.annotation.JsonProperty("valueSymbol")
  public String getValueSymbol() {
    return valueSymbol;
  }
  
  /**
   **/
  public void setValueSymbol(String valueSymbol) {
    this.valueSymbol = valueSymbol;
  }
  
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
  @org.codehaus.jackson.annotate.JsonProperty("to")
  @com.fasterxml.jackson.annotation.JsonProperty("to")
  public String getTo() {
    return to;
  }
  
  /**
   **/
  public void setTo(String to) {
    this.to = to;
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
  @org.codehaus.jackson.annotate.JsonProperty("rangeSymbol")
  @com.fasterxml.jackson.annotation.JsonProperty("rangeSymbol")
  public String getRangeSymbol() {
    return rangeSymbol;
  }
  
  /**
   **/
  public void setRangeSymbol(String rangeSymbol) {
    this.rangeSymbol = rangeSymbol;
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
  @org.codehaus.jackson.annotate.JsonProperty("from")
  @com.fasterxml.jackson.annotation.JsonProperty("from")
  public String getFrom() {
    return from;
  }
  
  /**
   **/
  public void setFrom(String from) {
    this.from = from;
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
    RangeFilterDto rangeFilterDto = (RangeFilterDto) o;
    return Objects.equals(this.valueSymbol, rangeFilterDto.valueSymbol) &&
        Objects.equals(this.type, rangeFilterDto.type) &&
        Objects.equals(this.to, rangeFilterDto.to) &&
        Objects.equals(this.title, rangeFilterDto.title) &&
        Objects.equals(this.rangeSymbol, rangeFilterDto.rangeSymbol) &&
        Objects.equals(this.key, rangeFilterDto.key) &&
        Objects.equals(this.from, rangeFilterDto.from) &&
        Objects.equals(this.filterOrder, rangeFilterDto.filterOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valueSymbol, type, to, title, rangeSymbol, key, from, filterOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RangeFilterDto {\n");
    
    sb.append("    valueSymbol: ").append(toIndentedString(valueSymbol)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    rangeSymbol: ").append(toIndentedString(rangeSymbol)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
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

  public static RangeFilterDtoBuilder builder() {
    return new RangeFilterDtoBuilder();
  }

  public static class RangeFilterDtoBuilder {

    private String valueSymbol = null;
    private String type = null;
    private String to = null;
    private String title = null;
    private String rangeSymbol = null;
    private String key = null;
    private String from = null;
    private Integer filterOrder = null;
    

    RangeFilterDtoBuilder() {
    }

    /**
     **/
    public RangeFilterDtoBuilder valueSymbol(String valueSymbol) {
      this.valueSymbol = valueSymbol;
      return this;
    }

    /**
     **/
    public RangeFilterDtoBuilder type(String type) {
      this.type = type;
      return this;
    }

    /**
     **/
    public RangeFilterDtoBuilder to(String to) {
      this.to = to;
      return this;
    }

    /**
     **/
    public RangeFilterDtoBuilder title(String title) {
      this.title = title;
      return this;
    }

    /**
     **/
    public RangeFilterDtoBuilder rangeSymbol(String rangeSymbol) {
      this.rangeSymbol = rangeSymbol;
      return this;
    }

    /**
     **/
    public RangeFilterDtoBuilder key(String key) {
      this.key = key;
      return this;
    }

    /**
     **/
    public RangeFilterDtoBuilder from(String from) {
      this.from = from;
      return this;
    }

    /**
     **/
    public RangeFilterDtoBuilder filterOrder(Integer filterOrder) {
      this.filterOrder = filterOrder;
      return this;
    }


    public RangeFilterDto build() {
      RangeFilterDto rangeFilterDto = new RangeFilterDto();
      rangeFilterDto.setValueSymbol(this.valueSymbol);
      rangeFilterDto.setType(this.type);
      rangeFilterDto.setTo(this.to);
      rangeFilterDto.setTitle(this.title);
      rangeFilterDto.setRangeSymbol(this.rangeSymbol);
      rangeFilterDto.setKey(this.key);
      rangeFilterDto.setFrom(this.from);
      rangeFilterDto.setFilterOrder(this.filterOrder);
      return rangeFilterDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RangeFilterDtoBuilder {\n");
      
      sb.append("    valueSymbol: ").append(toIndentedString(valueSymbol)).append("\n");
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
      sb.append("    to: ").append(toIndentedString(to)).append("\n");
      sb.append("    title: ").append(toIndentedString(title)).append("\n");
      sb.append("    rangeSymbol: ").append(toIndentedString(rangeSymbol)).append("\n");
      sb.append("    key: ").append(toIndentedString(key)).append("\n");
      sb.append("    from: ").append(toIndentedString(from)).append("\n");
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

