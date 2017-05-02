package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.ProductReviewDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class BestReviewHomeDto   {
  
  private Integer index = null;
  private String headerTitle = null;
  private String footerTitle = null;
  private List<ProductReviewDto> entityList = new ArrayList<ProductReviewDto>();

  
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
  public List<ProductReviewDto> getEntityList() {
    return entityList;
  }
  
  /**
   **/
  public void setEntityList(List<ProductReviewDto> entityList) {
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
    BestReviewHomeDto bestReviewHomeDto = (BestReviewHomeDto) o;
    return Objects.equals(this.index, bestReviewHomeDto.index) &&
        Objects.equals(this.headerTitle, bestReviewHomeDto.headerTitle) &&
        Objects.equals(this.footerTitle, bestReviewHomeDto.footerTitle) &&
        Objects.equals(this.entityList, bestReviewHomeDto.entityList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, headerTitle, footerTitle, entityList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BestReviewHomeDto {\n");
    
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

  public static BestReviewHomeDtoBuilder builder() {
    return new BestReviewHomeDtoBuilder();
  }

  public static class BestReviewHomeDtoBuilder {

    private Integer index = null;
    private String headerTitle = null;
    private String footerTitle = null;
    private List<ProductReviewDto> entityList = new ArrayList<ProductReviewDto>();
    

    BestReviewHomeDtoBuilder() {
    }

    /**
     **/
    public BestReviewHomeDtoBuilder index(Integer index) {
      this.index = index;
      return this;
    }

    /**
     **/
    public BestReviewHomeDtoBuilder headerTitle(String headerTitle) {
      this.headerTitle = headerTitle;
      return this;
    }

    /**
     **/
    public BestReviewHomeDtoBuilder footerTitle(String footerTitle) {
      this.footerTitle = footerTitle;
      return this;
    }

    /**
     **/
    public BestReviewHomeDtoBuilder entityList(List<ProductReviewDto> entityList) {
      this.entityList = entityList;
      return this;
    }


    public BestReviewHomeDto build() {
      BestReviewHomeDto bestReviewHomeDto = new BestReviewHomeDto();
      bestReviewHomeDto.setIndex(this.index);
      bestReviewHomeDto.setHeaderTitle(this.headerTitle);
      bestReviewHomeDto.setFooterTitle(this.footerTitle);
      bestReviewHomeDto.setEntityList(this.entityList);
      return bestReviewHomeDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BestReviewHomeDtoBuilder {\n");
      
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

