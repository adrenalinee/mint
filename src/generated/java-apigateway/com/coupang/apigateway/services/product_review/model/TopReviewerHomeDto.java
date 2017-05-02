package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.TopReviewerDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class TopReviewerHomeDto   {
  
  private Integer index = null;
  private String headerTitle = null;
  private String footerTitle = null;
  private List<TopReviewerDto> entityList = new ArrayList<TopReviewerDto>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("index")
  @com.fasterxml.jackson.annotation.JsonProperty("index")
  public Integer getIndex() {
    return index;
  }
  
  /**
   **/
  public void setIndex(Integer index) {
    this.index = index;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("headerTitle")
  @com.fasterxml.jackson.annotation.JsonProperty("headerTitle")
  public String getHeaderTitle() {
    return headerTitle;
  }
  
  /**
   **/
  public void setHeaderTitle(String headerTitle) {
    this.headerTitle = headerTitle;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("footerTitle")
  @com.fasterxml.jackson.annotation.JsonProperty("footerTitle")
  public String getFooterTitle() {
    return footerTitle;
  }
  
  /**
   **/
  public void setFooterTitle(String footerTitle) {
    this.footerTitle = footerTitle;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("entityList")
  @com.fasterxml.jackson.annotation.JsonProperty("entityList")
  public List<TopReviewerDto> getEntityList() {
    return entityList;
  }
  
  /**
   **/
  public void setEntityList(List<TopReviewerDto> entityList) {
    this.entityList = entityList;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopReviewerHomeDto topReviewerHomeDto = (TopReviewerHomeDto) o;
    return Objects.equals(this.index, topReviewerHomeDto.index) &&
        Objects.equals(this.headerTitle, topReviewerHomeDto.headerTitle) &&
        Objects.equals(this.footerTitle, topReviewerHomeDto.footerTitle) &&
        Objects.equals(this.entityList, topReviewerHomeDto.entityList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, headerTitle, footerTitle, entityList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopReviewerHomeDto {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    headerTitle: ").append(toIndentedString(headerTitle)).append("\n");
    sb.append("    footerTitle: ").append(toIndentedString(footerTitle)).append("\n");
    sb.append("    entityList: ").append(toIndentedString(entityList)).append("\n");
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

  public static TopReviewerHomeDtoBuilder builder() {
    return new TopReviewerHomeDtoBuilder();
  }

  public static class TopReviewerHomeDtoBuilder {

    private Integer index = null;
    private String headerTitle = null;
    private String footerTitle = null;
    private List<TopReviewerDto> entityList = new ArrayList<TopReviewerDto>();
    

    TopReviewerHomeDtoBuilder() {
    }

    /**
     **/
    public TopReviewerHomeDtoBuilder index(Integer index) {
      this.index = index;
      return this;
    }

    /**
     **/
    public TopReviewerHomeDtoBuilder headerTitle(String headerTitle) {
      this.headerTitle = headerTitle;
      return this;
    }

    /**
     **/
    public TopReviewerHomeDtoBuilder footerTitle(String footerTitle) {
      this.footerTitle = footerTitle;
      return this;
    }

    /**
     **/
    public TopReviewerHomeDtoBuilder entityList(List<TopReviewerDto> entityList) {
      this.entityList = entityList;
      return this;
    }


    public TopReviewerHomeDto build() {
      TopReviewerHomeDto topReviewerHomeDto = new TopReviewerHomeDto();
      topReviewerHomeDto.setIndex(this.index);
      topReviewerHomeDto.setHeaderTitle(this.headerTitle);
      topReviewerHomeDto.setFooterTitle(this.footerTitle);
      topReviewerHomeDto.setEntityList(this.entityList);
      return topReviewerHomeDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class TopReviewerHomeDtoBuilder {\n");
      
      sb.append("    index: ").append(toIndentedString(index)).append("\n");
      sb.append("    headerTitle: ").append(toIndentedString(headerTitle)).append("\n");
      sb.append("    footerTitle: ").append(toIndentedString(footerTitle)).append("\n");
      sb.append("    entityList: ").append(toIndentedString(entityList)).append("\n");
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

