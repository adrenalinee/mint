package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayAttributeTypeExceptionDto   {
  
  private List<Long> requiredList = new ArrayList<Long>();
  private List<Long> exclusionList = new ArrayList<Long>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("requiredList")
  @com.fasterxml.jackson.annotation.JsonProperty("requiredList")
  public List<Long> getRequiredList() {
    return requiredList;
  }
  
  /**
   **/
  public void setRequiredList(List<Long> requiredList) {
    this.requiredList = requiredList;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("exclusionList")
  @com.fasterxml.jackson.annotation.JsonProperty("exclusionList")
  public List<Long> getExclusionList() {
    return exclusionList;
  }
  
  /**
   **/
  public void setExclusionList(List<Long> exclusionList) {
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
    DisplayAttributeTypeExceptionDto displayAttributeTypeExceptionDto = (DisplayAttributeTypeExceptionDto) o;
    return Objects.equals(this.requiredList, displayAttributeTypeExceptionDto.requiredList) &&
        Objects.equals(this.exclusionList, displayAttributeTypeExceptionDto.exclusionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredList, exclusionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayAttributeTypeExceptionDto {\n");
    
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

  public static DisplayAttributeTypeExceptionDtoBuilder builder() {
    return new DisplayAttributeTypeExceptionDtoBuilder();
  }

  public static class DisplayAttributeTypeExceptionDtoBuilder {

    private List<Long> requiredList = new ArrayList<Long>();
    private List<Long> exclusionList = new ArrayList<Long>();
    

    DisplayAttributeTypeExceptionDtoBuilder() {
    }

    /**
     **/
    public DisplayAttributeTypeExceptionDtoBuilder requiredList(List<Long> requiredList) {
      this.requiredList = requiredList;
      return this;
    }

    /**
     **/
    public DisplayAttributeTypeExceptionDtoBuilder exclusionList(List<Long> exclusionList) {
      this.exclusionList = exclusionList;
      return this;
    }


    public DisplayAttributeTypeExceptionDto build() {
      DisplayAttributeTypeExceptionDto displayAttributeTypeExceptionDto = new DisplayAttributeTypeExceptionDto();
      displayAttributeTypeExceptionDto.setRequiredList(this.requiredList);
      displayAttributeTypeExceptionDto.setExclusionList(this.exclusionList);
      return displayAttributeTypeExceptionDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayAttributeTypeExceptionDtoBuilder {\n");
      
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

