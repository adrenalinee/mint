package com.coupang.apigateway.services.display.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayAttributeFilterValueDto   {
  
  private Long valueId = null;
  private String stringValue = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("valueId")
  @com.fasterxml.jackson.annotation.JsonProperty("valueId")
  public Long getValueId() {
    return valueId;
  }
  
  /**
   **/
  public void setValueId(Long valueId) {
    this.valueId = valueId;
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
    DisplayAttributeFilterValueDto displayAttributeFilterValueDto = (DisplayAttributeFilterValueDto) o;
    return Objects.equals(this.valueId, displayAttributeFilterValueDto.valueId) &&
        Objects.equals(this.stringValue, displayAttributeFilterValueDto.stringValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valueId, stringValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayAttributeFilterValueDto {\n");
    
    sb.append("    valueId: ").append(toIndentedString(valueId)).append("\n");
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

  public static DisplayAttributeFilterValueDtoBuilder builder() {
    return new DisplayAttributeFilterValueDtoBuilder();
  }

  public static class DisplayAttributeFilterValueDtoBuilder {

    private Long valueId = null;
    private String stringValue = null;
    

    DisplayAttributeFilterValueDtoBuilder() {
    }

    /**
     **/
    public DisplayAttributeFilterValueDtoBuilder valueId(Long valueId) {
      this.valueId = valueId;
      return this;
    }

    /**
     **/
    public DisplayAttributeFilterValueDtoBuilder stringValue(String stringValue) {
      this.stringValue = stringValue;
      return this;
    }


    public DisplayAttributeFilterValueDto build() {
      DisplayAttributeFilterValueDto displayAttributeFilterValueDto = new DisplayAttributeFilterValueDto();
      displayAttributeFilterValueDto.setValueId(this.valueId);
      displayAttributeFilterValueDto.setStringValue(this.stringValue);
      return displayAttributeFilterValueDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayAttributeFilterValueDtoBuilder {\n");
      
      sb.append("    valueId: ").append(toIndentedString(valueId)).append("\n");
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

