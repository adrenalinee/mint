package com.coupang.apigateway.services.display.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class BenefitType   {
  
  private String name = null;
  private String key = null;
  private String bgColor = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("bgColor")
  @com.fasterxml.jackson.annotation.JsonProperty("bgColor")
  public String getBgColor() {
    return bgColor;
  }
  
  /**
   **/
  public void setBgColor(String bgColor) {
    this.bgColor = bgColor;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BenefitType benefitType = (BenefitType) o;
    return Objects.equals(this.name, benefitType.name) &&
        Objects.equals(this.key, benefitType.key) &&
        Objects.equals(this.bgColor, benefitType.bgColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, key, bgColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenefitType {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    bgColor: ").append(toIndentedString(bgColor)).append("\n");
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

  public static BenefitTypeBuilder builder() {
    return new BenefitTypeBuilder();
  }

  public static class BenefitTypeBuilder {

    private String name = null;
    private String key = null;
    private String bgColor = null;
    

    BenefitTypeBuilder() {
    }

    /**
     **/
    public BenefitTypeBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public BenefitTypeBuilder key(String key) {
      this.key = key;
      return this;
    }

    /**
     **/
    public BenefitTypeBuilder bgColor(String bgColor) {
      this.bgColor = bgColor;
      return this;
    }


    public BenefitType build() {
      BenefitType benefitType = new BenefitType();
      benefitType.setName(this.name);
      benefitType.setKey(this.key);
      benefitType.setBgColor(this.bgColor);
      return benefitType;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BenefitTypeBuilder {\n");
      
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    key: ").append(toIndentedString(key)).append("\n");
      sb.append("    bgColor: ").append(toIndentedString(bgColor)).append("\n");
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

