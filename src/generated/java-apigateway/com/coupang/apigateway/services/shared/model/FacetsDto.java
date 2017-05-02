package com.coupang.apigateway.services.shared.model;

import java.util.Objects;
import com.coupang.apigateway.services.shared.model.FacetDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.189+09:00")
public class FacetsDto   {
  
  private List<FacetDto> districts = new ArrayList<FacetDto>();
  private List<FacetDto> cities = new ArrayList<FacetDto>();
  private List<FacetDto> buildingNumbers = new ArrayList<FacetDto>();
  private List<FacetDto> addressNumbers = new ArrayList<FacetDto>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("districts")
  @com.fasterxml.jackson.annotation.JsonProperty("districts")
  public List<FacetDto> getDistricts() {
    return districts;
  }
  
  /**
   **/
  public void setDistricts(List<FacetDto> districts) {
    this.districts = districts;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("cities")
  @com.fasterxml.jackson.annotation.JsonProperty("cities")
  public List<FacetDto> getCities() {
    return cities;
  }
  
  /**
   **/
  public void setCities(List<FacetDto> cities) {
    this.cities = cities;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("buildingNumbers")
  @com.fasterxml.jackson.annotation.JsonProperty("buildingNumbers")
  public List<FacetDto> getBuildingNumbers() {
    return buildingNumbers;
  }
  
  /**
   **/
  public void setBuildingNumbers(List<FacetDto> buildingNumbers) {
    this.buildingNumbers = buildingNumbers;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("addressNumbers")
  @com.fasterxml.jackson.annotation.JsonProperty("addressNumbers")
  public List<FacetDto> getAddressNumbers() {
    return addressNumbers;
  }
  
  /**
   **/
  public void setAddressNumbers(List<FacetDto> addressNumbers) {
    this.addressNumbers = addressNumbers;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacetsDto facetsDto = (FacetsDto) o;
    return Objects.equals(this.districts, facetsDto.districts) &&
        Objects.equals(this.cities, facetsDto.cities) &&
        Objects.equals(this.buildingNumbers, facetsDto.buildingNumbers) &&
        Objects.equals(this.addressNumbers, facetsDto.addressNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(districts, cities, buildingNumbers, addressNumbers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacetsDto {\n");
    
    sb.append("    districts: ").append(toIndentedString(districts)).append("\n");
    sb.append("    cities: ").append(toIndentedString(cities)).append("\n");
    sb.append("    buildingNumbers: ").append(toIndentedString(buildingNumbers)).append("\n");
    sb.append("    addressNumbers: ").append(toIndentedString(addressNumbers)).append("\n");
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

  public static FacetsDtoBuilder builder() {
    return new FacetsDtoBuilder();
  }

  public static class FacetsDtoBuilder {

    private List<FacetDto> districts = new ArrayList<FacetDto>();
    private List<FacetDto> cities = new ArrayList<FacetDto>();
    private List<FacetDto> buildingNumbers = new ArrayList<FacetDto>();
    private List<FacetDto> addressNumbers = new ArrayList<FacetDto>();
    

    FacetsDtoBuilder() {
    }

    /**
     **/
    public FacetsDtoBuilder districts(List<FacetDto> districts) {
      this.districts = districts;
      return this;
    }

    /**
     **/
    public FacetsDtoBuilder cities(List<FacetDto> cities) {
      this.cities = cities;
      return this;
    }

    /**
     **/
    public FacetsDtoBuilder buildingNumbers(List<FacetDto> buildingNumbers) {
      this.buildingNumbers = buildingNumbers;
      return this;
    }

    /**
     **/
    public FacetsDtoBuilder addressNumbers(List<FacetDto> addressNumbers) {
      this.addressNumbers = addressNumbers;
      return this;
    }


    public FacetsDto build() {
      FacetsDto facetsDto = new FacetsDto();
      facetsDto.setDistricts(this.districts);
      facetsDto.setCities(this.cities);
      facetsDto.setBuildingNumbers(this.buildingNumbers);
      facetsDto.setAddressNumbers(this.addressNumbers);
      return facetsDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class FacetsDtoBuilder {\n");
      
      sb.append("    districts: ").append(toIndentedString(districts)).append("\n");
      sb.append("    cities: ").append(toIndentedString(cities)).append("\n");
      sb.append("    buildingNumbers: ").append(toIndentedString(buildingNumbers)).append("\n");
      sb.append("    addressNumbers: ").append(toIndentedString(addressNumbers)).append("\n");
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

