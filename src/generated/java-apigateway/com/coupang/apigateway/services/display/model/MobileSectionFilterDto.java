package com.coupang.apigateway.services.display.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class MobileSectionFilterDto   {
  
  private String filterValue = null;
  private String filterName = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("filterValue")
  @com.fasterxml.jackson.annotation.JsonProperty("filterValue")
  public String getFilterValue() {
    return filterValue;
  }
  
  /**
   **/
  public void setFilterValue(String filterValue) {
    this.filterValue = filterValue;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("filterName")
  @com.fasterxml.jackson.annotation.JsonProperty("filterName")
  public String getFilterName() {
    return filterName;
  }
  
  /**
   **/
  public void setFilterName(String filterName) {
    this.filterName = filterName;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileSectionFilterDto mobileSectionFilterDto = (MobileSectionFilterDto) o;
    return Objects.equals(this.filterValue, mobileSectionFilterDto.filterValue) &&
        Objects.equals(this.filterName, mobileSectionFilterDto.filterName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterValue, filterName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileSectionFilterDto {\n");
    
    sb.append("    filterValue: ").append(toIndentedString(filterValue)).append("\n");
    sb.append("    filterName: ").append(toIndentedString(filterName)).append("\n");
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

  public static MobileSectionFilterDtoBuilder builder() {
    return new MobileSectionFilterDtoBuilder();
  }

  public static class MobileSectionFilterDtoBuilder {

    private String filterValue = null;
    private String filterName = null;
    

    MobileSectionFilterDtoBuilder() {
    }

    /**
     **/
    public MobileSectionFilterDtoBuilder filterValue(String filterValue) {
      this.filterValue = filterValue;
      return this;
    }

    /**
     **/
    public MobileSectionFilterDtoBuilder filterName(String filterName) {
      this.filterName = filterName;
      return this;
    }


    public MobileSectionFilterDto build() {
      MobileSectionFilterDto mobileSectionFilterDto = new MobileSectionFilterDto();
      mobileSectionFilterDto.setFilterValue(this.filterValue);
      mobileSectionFilterDto.setFilterName(this.filterName);
      return mobileSectionFilterDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MobileSectionFilterDtoBuilder {\n");
      
      sb.append("    filterValue: ").append(toIndentedString(filterValue)).append("\n");
      sb.append("    filterName: ").append(toIndentedString(filterName)).append("\n");
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

