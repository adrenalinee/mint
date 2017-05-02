package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class Option   {
  
  private String value = null;
  private String text = null;
  private Long count = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("value")
  @com.fasterxml.jackson.annotation.JsonProperty("value")
  public String getValue() {
    return value;
  }
  
  /**
   **/
  public void setValue(String value) {
    this.value = value;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("text")
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  public String getText() {
    return text;
  }
  
  /**
   **/
  public void setText(String text) {
    this.text = text;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("count")
  @com.fasterxml.jackson.annotation.JsonProperty("count")
  public Long getCount() {
    return count;
  }
  
  /**
   **/
  public void setCount(Long count) {
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
    Option option = (Option) o;
    return Objects.equals(this.value, option.value) &&
        Objects.equals(this.text, option.text) &&
        Objects.equals(this.count, option.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, text, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Option {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

  public static OptionBuilder builder() {
    return new OptionBuilder();
  }

  public static class OptionBuilder {

    private String value = null;
    private String text = null;
    private Long count = null;
    

    OptionBuilder() {
    }

    /**
     **/
    public OptionBuilder value(String value) {
      this.value = value;
      return this;
    }

    /**
     **/
    public OptionBuilder text(String text) {
      this.text = text;
      return this;
    }

    /**
     **/
    public OptionBuilder count(Long count) {
      this.count = count;
      return this;
    }


    public Option build() {
      Option option = new Option();
      option.setValue(this.value);
      option.setText(this.text);
      option.setCount(this.count);
      return option;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class OptionBuilder {\n");
      
      sb.append("    value: ").append(toIndentedString(value)).append("\n");
      sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

