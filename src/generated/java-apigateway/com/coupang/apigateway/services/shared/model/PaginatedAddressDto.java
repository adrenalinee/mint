package com.coupang.apigateway.services.shared.model;

import java.util.Objects;
import com.coupang.apigateway.services.shared.model.AddressDto;
import com.coupang.apigateway.services.shared.model.FacetsDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.189+09:00")
public class PaginatedAddressDto   {
  
  private String type = null;
  private Integer totalCount = null;
  private Integer page = null;
  private String keyword = null;
  private FacetsDto facets = null;
  private Integer countPerPage = null;
  private List<AddressDto> addressDtos = new ArrayList<AddressDto>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("type")
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  public String getType() {
    return type;
  }
  
  /**
   **/
  public void setType(String type) {
    this.type = type;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("totalCount")
  @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
  public Integer getTotalCount() {
    return totalCount;
  }
  
  /**
   **/
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("page")
  @com.fasterxml.jackson.annotation.JsonProperty("page")
  public Integer getPage() {
    return page;
  }
  
  /**
   **/
  public void setPage(Integer page) {
    this.page = page;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("keyword")
  @com.fasterxml.jackson.annotation.JsonProperty("keyword")
  public String getKeyword() {
    return keyword;
  }
  
  /**
   **/
  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("facets")
  @com.fasterxml.jackson.annotation.JsonProperty("facets")
  public FacetsDto getFacets() {
    return facets;
  }
  
  /**
   **/
  public void setFacets(FacetsDto facets) {
    this.facets = facets;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("countPerPage")
  @com.fasterxml.jackson.annotation.JsonProperty("countPerPage")
  public Integer getCountPerPage() {
    return countPerPage;
  }
  
  /**
   **/
  public void setCountPerPage(Integer countPerPage) {
    this.countPerPage = countPerPage;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("addressDtos")
  @com.fasterxml.jackson.annotation.JsonProperty("addressDtos")
  public List<AddressDto> getAddressDtos() {
    return addressDtos;
  }
  
  /**
   **/
  public void setAddressDtos(List<AddressDto> addressDtos) {
    this.addressDtos = addressDtos;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedAddressDto paginatedAddressDto = (PaginatedAddressDto) o;
    return Objects.equals(this.type, paginatedAddressDto.type) &&
        Objects.equals(this.totalCount, paginatedAddressDto.totalCount) &&
        Objects.equals(this.page, paginatedAddressDto.page) &&
        Objects.equals(this.keyword, paginatedAddressDto.keyword) &&
        Objects.equals(this.facets, paginatedAddressDto.facets) &&
        Objects.equals(this.countPerPage, paginatedAddressDto.countPerPage) &&
        Objects.equals(this.addressDtos, paginatedAddressDto.addressDtos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, totalCount, page, keyword, facets, countPerPage, addressDtos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedAddressDto {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
    sb.append("    countPerPage: ").append(toIndentedString(countPerPage)).append("\n");
    sb.append("    addressDtos: ").append(toIndentedString(addressDtos)).append("\n");
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

  public static PaginatedAddressDtoBuilder builder() {
    return new PaginatedAddressDtoBuilder();
  }

  public static class PaginatedAddressDtoBuilder {

    private String type = null;
    private Integer totalCount = null;
    private Integer page = null;
    private String keyword = null;
    private FacetsDto facets = null;
    private Integer countPerPage = null;
    private List<AddressDto> addressDtos = new ArrayList<AddressDto>();
    

    PaginatedAddressDtoBuilder() {
    }

    /**
     **/
    public PaginatedAddressDtoBuilder type(String type) {
      this.type = type;
      return this;
    }

    /**
     **/
    public PaginatedAddressDtoBuilder totalCount(Integer totalCount) {
      this.totalCount = totalCount;
      return this;
    }

    /**
     **/
    public PaginatedAddressDtoBuilder page(Integer page) {
      this.page = page;
      return this;
    }

    /**
     **/
    public PaginatedAddressDtoBuilder keyword(String keyword) {
      this.keyword = keyword;
      return this;
    }

    /**
     **/
    public PaginatedAddressDtoBuilder facets(FacetsDto facets) {
      this.facets = facets;
      return this;
    }

    /**
     **/
    public PaginatedAddressDtoBuilder countPerPage(Integer countPerPage) {
      this.countPerPage = countPerPage;
      return this;
    }

    /**
     **/
    public PaginatedAddressDtoBuilder addressDtos(List<AddressDto> addressDtos) {
      this.addressDtos = addressDtos;
      return this;
    }


    public PaginatedAddressDto build() {
      PaginatedAddressDto paginatedAddressDto = new PaginatedAddressDto();
      paginatedAddressDto.setType(this.type);
      paginatedAddressDto.setTotalCount(this.totalCount);
      paginatedAddressDto.setPage(this.page);
      paginatedAddressDto.setKeyword(this.keyword);
      paginatedAddressDto.setFacets(this.facets);
      paginatedAddressDto.setCountPerPage(this.countPerPage);
      paginatedAddressDto.setAddressDtos(this.addressDtos);
      return paginatedAddressDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PaginatedAddressDtoBuilder {\n");
      
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
      sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
      sb.append("    page: ").append(toIndentedString(page)).append("\n");
      sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
      sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
      sb.append("    countPerPage: ").append(toIndentedString(countPerPage)).append("\n");
      sb.append("    addressDtos: ").append(toIndentedString(addressDtos)).append("\n");
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

