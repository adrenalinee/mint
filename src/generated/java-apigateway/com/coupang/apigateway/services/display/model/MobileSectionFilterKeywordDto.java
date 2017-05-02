package com.coupang.apigateway.services.display.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class MobileSectionFilterKeywordDto   {
  
  private String filterKeyword = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("filterKeyword")
  @com.fasterxml.jackson.annotation.JsonProperty("filterKeyword")
  public String getFilterKeyword() {
    return filterKeyword;
  }
  
  /**
   **/
  public void setFilterKeyword(String filterKeyword) {
    this.filterKeyword = filterKeyword;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileSectionFilterKeywordDto mobileSectionFilterKeywordDto = (MobileSectionFilterKeywordDto) o;
    return Objects.equals(this.filterKeyword, mobileSectionFilterKeywordDto.filterKeyword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterKeyword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileSectionFilterKeywordDto {\n");
    
    sb.append("    filterKeyword: ").append(toIndentedString(filterKeyword)).append("\n");
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

  public static MobileSectionFilterKeywordDtoBuilder builder() {
    return new MobileSectionFilterKeywordDtoBuilder();
  }

  public static class MobileSectionFilterKeywordDtoBuilder {

    private String filterKeyword = null;
    

    MobileSectionFilterKeywordDtoBuilder() {
    }

    /**
     **/
    public MobileSectionFilterKeywordDtoBuilder filterKeyword(String filterKeyword) {
      this.filterKeyword = filterKeyword;
      return this;
    }


    public MobileSectionFilterKeywordDto build() {
      MobileSectionFilterKeywordDto mobileSectionFilterKeywordDto = new MobileSectionFilterKeywordDto();
      mobileSectionFilterKeywordDto.setFilterKeyword(this.filterKeyword);
      return mobileSectionFilterKeywordDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MobileSectionFilterKeywordDtoBuilder {\n");
      
      sb.append("    filterKeyword: ").append(toIndentedString(filterKeyword)).append("\n");
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

