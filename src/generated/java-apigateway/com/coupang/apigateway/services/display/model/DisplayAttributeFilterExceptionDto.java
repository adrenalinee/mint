package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayAttributeFilterExceptionDto   {
  
  private List<String> requiredList = new ArrayList<String>();
  private List<String> exclusionList = new ArrayList<String>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("requiredList")
  @com.fasterxml.jackson.annotation.JsonProperty("requiredList")
  public List<String> getRequiredList() {
    return requiredList;
  }
  
  /**
   **/
  public void setRequiredList(List<String> requiredList) {
    this.requiredList = requiredList;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("exclusionList")
  @com.fasterxml.jackson.annotation.JsonProperty("exclusionList")
  public List<String> getExclusionList() {
    return exclusionList;
  }
  
  /**
   **/
  public void setExclusionList(List<String> exclusionList) {
    this.exclusionList = exclusionList;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayAttributeFilterExceptionDto displayAttributeFilterExceptionDto = (DisplayAttributeFilterExceptionDto) o;
    return Objects.equals(this.requiredList, displayAttributeFilterExceptionDto.requiredList) &&
        Objects.equals(this.exclusionList, displayAttributeFilterExceptionDto.exclusionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredList, exclusionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayAttributeFilterExceptionDto {\n");
    
    sb.append("    requiredList: ").append(toIndentedString(requiredList)).append("\n");
    sb.append("    exclusionList: ").append(toIndentedString(exclusionList)).append("\n");
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

  public static DisplayAttributeFilterExceptionDtoBuilder builder() {
    return new DisplayAttributeFilterExceptionDtoBuilder();
  }

  public static class DisplayAttributeFilterExceptionDtoBuilder {

    private List<String> requiredList = new ArrayList<String>();
    private List<String> exclusionList = new ArrayList<String>();
    

    DisplayAttributeFilterExceptionDtoBuilder() {
    }

    /**
     **/
    public DisplayAttributeFilterExceptionDtoBuilder requiredList(List<String> requiredList) {
      this.requiredList = requiredList;
      return this;
    }

    /**
     **/
    public DisplayAttributeFilterExceptionDtoBuilder exclusionList(List<String> exclusionList) {
      this.exclusionList = exclusionList;
      return this;
    }


    public DisplayAttributeFilterExceptionDto build() {
      DisplayAttributeFilterExceptionDto displayAttributeFilterExceptionDto = new DisplayAttributeFilterExceptionDto();
      displayAttributeFilterExceptionDto.setRequiredList(this.requiredList);
      displayAttributeFilterExceptionDto.setExclusionList(this.exclusionList);
      return displayAttributeFilterExceptionDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayAttributeFilterExceptionDtoBuilder {\n");
      
      sb.append("    requiredList: ").append(toIndentedString(requiredList)).append("\n");
      sb.append("    exclusionList: ").append(toIndentedString(exclusionList)).append("\n");
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

