package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class PairOfstringAndstring   {
  
  private String value = null;
  private String right = null;
  private String left = null;
  private String key = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("right")
  @com.fasterxml.jackson.annotation.JsonProperty("right")
  public String getRight() {
    return right;
  }
  
  /**
   **/
  public void setRight(String right) {
    this.right = right;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("left")
  @com.fasterxml.jackson.annotation.JsonProperty("left")
  public String getLeft() {
    return left;
  }
  
  /**
   **/
  public void setLeft(String left) {
    this.left = left;
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PairOfstringAndstring pairOfstringAndstring = (PairOfstringAndstring) o;
    return Objects.equals(this.value, pairOfstringAndstring.value) &&
        Objects.equals(this.right, pairOfstringAndstring.right) &&
        Objects.equals(this.left, pairOfstringAndstring.left) &&
        Objects.equals(this.key, pairOfstringAndstring.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, right, left, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PairOfstringAndstring {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
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

  public static PairOfstringAndstringBuilder builder() {
    return new PairOfstringAndstringBuilder();
  }

  public static class PairOfstringAndstringBuilder {

    private String value = null;
    private String right = null;
    private String left = null;
    private String key = null;
    

    PairOfstringAndstringBuilder() {
    }

    /**
     **/
    public PairOfstringAndstringBuilder value(String value) {
      this.value = value;
      return this;
    }

    /**
     **/
    public PairOfstringAndstringBuilder right(String right) {
      this.right = right;
      return this;
    }

    /**
     **/
    public PairOfstringAndstringBuilder left(String left) {
      this.left = left;
      return this;
    }

    /**
     **/
    public PairOfstringAndstringBuilder key(String key) {
      this.key = key;
      return this;
    }


    public PairOfstringAndstring build() {
      PairOfstringAndstring pairOfstringAndstring = new PairOfstringAndstring();
      pairOfstringAndstring.setValue(this.value);
      pairOfstringAndstring.setRight(this.right);
      pairOfstringAndstring.setLeft(this.left);
      pairOfstringAndstring.setKey(this.key);
      return pairOfstringAndstring;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PairOfstringAndstringBuilder {\n");
      
      sb.append("    value: ").append(toIndentedString(value)).append("\n");
      sb.append("    right: ").append(toIndentedString(right)).append("\n");
      sb.append("    left: ").append(toIndentedString(left)).append("\n");
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

