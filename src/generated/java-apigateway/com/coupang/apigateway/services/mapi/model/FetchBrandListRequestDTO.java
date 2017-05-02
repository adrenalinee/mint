package com.coupang.apigateway.services.mapi.model;

import java.util.Objects;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.625+09:00")
public class FetchBrandListRequestDTO   {
  
  private String memberId = null;
  private List<String> bannerFilters = new ArrayList<String>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("memberId")
  @com.fasterxml.jackson.annotation.JsonProperty("memberId")
  public String getMemberId() {
    return memberId;
  }
  
  /**
   **/
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("bannerFilters")
  @com.fasterxml.jackson.annotation.JsonProperty("bannerFilters")
  public List<String> getBannerFilters() {
    return bannerFilters;
  }
  
  /**
   **/
  public void setBannerFilters(List<String> bannerFilters) {
    this.bannerFilters = bannerFilters;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FetchBrandListRequestDTO fetchBrandListRequestDTO = (FetchBrandListRequestDTO) o;
    return Objects.equals(this.memberId, fetchBrandListRequestDTO.memberId) &&
        Objects.equals(this.bannerFilters, fetchBrandListRequestDTO.bannerFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberId, bannerFilters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FetchBrandListRequestDTO {\n");
    
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    bannerFilters: ").append(toIndentedString(bannerFilters)).append("\n");
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

  public static FetchBrandListRequestDTOBuilder builder() {
    return new FetchBrandListRequestDTOBuilder();
  }

  public static class FetchBrandListRequestDTOBuilder {

    private String memberId = null;
    private List<String> bannerFilters = new ArrayList<String>();
    

    FetchBrandListRequestDTOBuilder() {
    }

    /**
     **/
    public FetchBrandListRequestDTOBuilder memberId(String memberId) {
      this.memberId = memberId;
      return this;
    }

    /**
     **/
    public FetchBrandListRequestDTOBuilder bannerFilters(List<String> bannerFilters) {
      this.bannerFilters = bannerFilters;
      return this;
    }


    public FetchBrandListRequestDTO build() {
      FetchBrandListRequestDTO fetchBrandListRequestDTO = new FetchBrandListRequestDTO();
      fetchBrandListRequestDTO.setMemberId(this.memberId);
      fetchBrandListRequestDTO.setBannerFilters(this.bannerFilters);
      return fetchBrandListRequestDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class FetchBrandListRequestDTOBuilder {\n");
      
      sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
      sb.append("    bannerFilters: ").append(toIndentedString(bannerFilters)).append("\n");
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

