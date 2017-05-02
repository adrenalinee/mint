package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class BenefitDto   {
  
  private Double value = null;
  private String type = null;
  private String prefix = null;
  private String postfix = null;
  private String infix = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("value")
  @com.fasterxml.jackson.annotation.JsonProperty("value")
  public Double getValue() {
    return value;
  }
  
  /**
   **/
  public void setValue(Double value) {
    this.value = value;
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
  @org.codehaus.jackson.annotate.JsonProperty("prefix")
  @com.fasterxml.jackson.annotation.JsonProperty("prefix")
  public String getPrefix() {
    return prefix;
  }
  
  /**
   **/
  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("postfix")
  @com.fasterxml.jackson.annotation.JsonProperty("postfix")
  public String getPostfix() {
    return postfix;
  }
  
  /**
   **/
  public void setPostfix(String postfix) {
    this.postfix = postfix;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("infix")
  @com.fasterxml.jackson.annotation.JsonProperty("infix")
  public String getInfix() {
    return infix;
  }
  
  /**
   **/
  public void setInfix(String infix) {
    this.infix = infix;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BenefitDto benefitDto = (BenefitDto) o;
    return Objects.equals(this.value, benefitDto.value) &&
        Objects.equals(this.type, benefitDto.type) &&
        Objects.equals(this.prefix, benefitDto.prefix) &&
        Objects.equals(this.postfix, benefitDto.postfix) &&
        Objects.equals(this.infix, benefitDto.infix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, type, prefix, postfix, infix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenefitDto {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    postfix: ").append(toIndentedString(postfix)).append("\n");
    sb.append("    infix: ").append(toIndentedString(infix)).append("\n");
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

  public static BenefitDtoBuilder builder() {
    return new BenefitDtoBuilder();
  }

  public static class BenefitDtoBuilder {

    private Double value = null;
    private String type = null;
    private String prefix = null;
    private String postfix = null;
    private String infix = null;
    

    BenefitDtoBuilder() {
    }

    /**
     **/
    public BenefitDtoBuilder value(Double value) {
      this.value = value;
      return this;
    }

    /**
     **/
    public BenefitDtoBuilder type(String type) {
      this.type = type;
      return this;
    }

    /**
     **/
    public BenefitDtoBuilder prefix(String prefix) {
      this.prefix = prefix;
      return this;
    }

    /**
     **/
    public BenefitDtoBuilder postfix(String postfix) {
      this.postfix = postfix;
      return this;
    }

    /**
     **/
    public BenefitDtoBuilder infix(String infix) {
      this.infix = infix;
      return this;
    }


    public BenefitDto build() {
      BenefitDto benefitDto = new BenefitDto();
      benefitDto.setValue(this.value);
      benefitDto.setType(this.type);
      benefitDto.setPrefix(this.prefix);
      benefitDto.setPostfix(this.postfix);
      benefitDto.setInfix(this.infix);
      return benefitDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BenefitDtoBuilder {\n");
      
      sb.append("    value: ").append(toIndentedString(value)).append("\n");
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
      sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
      sb.append("    postfix: ").append(toIndentedString(postfix)).append("\n");
      sb.append("    infix: ").append(toIndentedString(infix)).append("\n");
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

