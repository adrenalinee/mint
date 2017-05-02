package com.coupang.apigateway.services.cart_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.904+09:00")
public class ShoppingCartResponseDTOOfint   {
  
  private Boolean success = null;
  private String message = null;
  private Integer contents = null;
  private String code = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("success")
  @com.fasterxml.jackson.annotation.JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isSuccess() {
    return success == null ? false : success;
  }
  
  /**
   **/
  public void setSuccess(Boolean success) {
    this.success = success;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("message")
  @com.fasterxml.jackson.annotation.JsonProperty("message")
  public String getMessage() {
    return message;
  }
  
  /**
   **/
  public void setMessage(String message) {
    this.message = message;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("contents")
  @com.fasterxml.jackson.annotation.JsonProperty("contents")
  public Integer getContents() {
    return contents;
  }
  
  /**
   **/
  public void setContents(Integer contents) {
    this.contents = contents;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("code")
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  public String getCode() {
    return code;
  }
  
  /**
   **/
  public void setCode(String code) {
    this.code = code;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShoppingCartResponseDTOOfint shoppingCartResponseDTOOfint = (ShoppingCartResponseDTOOfint) o;
    return Objects.equals(this.success, shoppingCartResponseDTOOfint.success) &&
        Objects.equals(this.message, shoppingCartResponseDTOOfint.message) &&
        Objects.equals(this.contents, shoppingCartResponseDTOOfint.contents) &&
        Objects.equals(this.code, shoppingCartResponseDTOOfint.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, message, contents, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShoppingCartResponseDTOOfint {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

  public static ShoppingCartResponseDTOOfintBuilder builder() {
    return new ShoppingCartResponseDTOOfintBuilder();
  }

  public static class ShoppingCartResponseDTOOfintBuilder {

    private Boolean success = null;
    private String message = null;
    private Integer contents = null;
    private String code = null;
    

    ShoppingCartResponseDTOOfintBuilder() {
    }

    /**
     **/
    public ShoppingCartResponseDTOOfintBuilder success(Boolean success) {
      this.success = success;
      return this;
    }

    /**
     **/
    public ShoppingCartResponseDTOOfintBuilder message(String message) {
      this.message = message;
      return this;
    }

    /**
     **/
    public ShoppingCartResponseDTOOfintBuilder contents(Integer contents) {
      this.contents = contents;
      return this;
    }

    /**
     **/
    public ShoppingCartResponseDTOOfintBuilder code(String code) {
      this.code = code;
      return this;
    }


    public ShoppingCartResponseDTOOfint build() {
      ShoppingCartResponseDTOOfint shoppingCartResponseDTOOfint = new ShoppingCartResponseDTOOfint();
      shoppingCartResponseDTOOfint.setSuccess(this.success);
      shoppingCartResponseDTOOfint.setMessage(this.message);
      shoppingCartResponseDTOOfint.setContents(this.contents);
      shoppingCartResponseDTOOfint.setCode(this.code);
      return shoppingCartResponseDTOOfint;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ShoppingCartResponseDTOOfintBuilder {\n");
      
      sb.append("    success: ").append(toIndentedString(success)).append("\n");
      sb.append("    message: ").append(toIndentedString(message)).append("\n");
      sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
      sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

