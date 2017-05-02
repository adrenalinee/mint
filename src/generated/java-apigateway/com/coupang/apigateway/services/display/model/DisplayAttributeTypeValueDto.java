package com.coupang.apigateway.services.display.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayAttributeTypeValueDto   {
  
  private Long valudId = null;
  private String stringValue = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("valudId")
  @com.fasterxml.jackson.annotation.JsonProperty("valudId")
  public Long getValudId() {
    return valudId;
  }
  
  /**
   **/
  public void setValudId(Long valudId) {
    this.valudId = valudId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("stringValue")
  @com.fasterxml.jackson.annotation.JsonProperty("stringValue")
  public String getStringValue() {
    return stringValue;
  }
  
  /**
   **/
  public void setStringValue(String stringValue) {
    this.stringValue = stringValue;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayAttributeTypeValueDto displayAttributeTypeValueDto = (DisplayAttributeTypeValueDto) o;
    return Objects.equals(this.valudId, displayAttributeTypeValueDto.valudId) &&
        Objects.equals(this.stringValue, displayAttributeTypeValueDto.stringValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valudId, stringValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayAttributeTypeValueDto {\n");
    
    sb.append("    valudId: ").append(toIndentedString(valudId)).append("\n");
    sb.append("    stringValue: ").append(toIndentedString(stringValue)).append("\n");
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

  public static DisplayAttributeTypeValueDtoBuilder builder() {
    return new DisplayAttributeTypeValueDtoBuilder();
  }

  public static class DisplayAttributeTypeValueDtoBuilder {

    private Long valudId = null;
    private String stringValue = null;
    

    DisplayAttributeTypeValueDtoBuilder() {
    }

    /**
     **/
    public DisplayAttributeTypeValueDtoBuilder valudId(Long valudId) {
      this.valudId = valudId;
      return this;
    }

    /**
     **/
    public DisplayAttributeTypeValueDtoBuilder stringValue(String stringValue) {
      this.stringValue = stringValue;
      return this;
    }


    public DisplayAttributeTypeValueDto build() {
      DisplayAttributeTypeValueDto displayAttributeTypeValueDto = new DisplayAttributeTypeValueDto();
      displayAttributeTypeValueDto.setValudId(this.valudId);
      displayAttributeTypeValueDto.setStringValue(this.stringValue);
      return displayAttributeTypeValueDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayAttributeTypeValueDtoBuilder {\n");
      
      sb.append("    valudId: ").append(toIndentedString(valudId)).append("\n");
      sb.append("    stringValue: ").append(toIndentedString(stringValue)).append("\n");
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

