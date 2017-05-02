package com.coupang.apigateway.services.api_manager.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.146+09:00")
public class RegressionTestDo   {
  
  private Integer code = null;
  private String arg2 = null;
  private String arg1 = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("code")
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  
  /**
   **/
  public void setCode(Integer code) {
    this.code = code;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("arg2")
  @com.fasterxml.jackson.annotation.JsonProperty("arg2")
  public String getArg2() {
    return arg2;
  }
  
  /**
   **/
  public void setArg2(String arg2) {
    this.arg2 = arg2;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("arg1")
  @com.fasterxml.jackson.annotation.JsonProperty("arg1")
  public String getArg1() {
    return arg1;
  }
  
  /**
   **/
  public void setArg1(String arg1) {
    this.arg1 = arg1;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegressionTestDo regressionTestDo = (RegressionTestDo) o;
    return Objects.equals(this.code, regressionTestDo.code) &&
        Objects.equals(this.arg2, regressionTestDo.arg2) &&
        Objects.equals(this.arg1, regressionTestDo.arg1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, arg2, arg1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegressionTestDo {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    arg2: ").append(toIndentedString(arg2)).append("\n");
    sb.append("    arg1: ").append(toIndentedString(arg1)).append("\n");
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

  public static RegressionTestDoBuilder builder() {
    return new RegressionTestDoBuilder();
  }

  public static class RegressionTestDoBuilder {

    private Integer code = null;
    private String arg2 = null;
    private String arg1 = null;
    

    RegressionTestDoBuilder() {
    }

    /**
     **/
    public RegressionTestDoBuilder code(Integer code) {
      this.code = code;
      return this;
    }

    /**
     **/
    public RegressionTestDoBuilder arg2(String arg2) {
      this.arg2 = arg2;
      return this;
    }

    /**
     **/
    public RegressionTestDoBuilder arg1(String arg1) {
      this.arg1 = arg1;
      return this;
    }


    public RegressionTestDo build() {
      RegressionTestDo regressionTestDo = new RegressionTestDo();
      regressionTestDo.setCode(this.code);
      regressionTestDo.setArg2(this.arg2);
      regressionTestDo.setArg1(this.arg1);
      return regressionTestDo;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RegressionTestDoBuilder {\n");
      
      sb.append("    code: ").append(toIndentedString(code)).append("\n");
      sb.append("    arg2: ").append(toIndentedString(arg2)).append("\n");
      sb.append("    arg1: ").append(toIndentedString(arg1)).append("\n");
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

