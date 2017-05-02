package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.AdventurerGroupDto;
import com.coupang.apigateway.services.product_review.model.AdventurerStatusDto;
import com.coupang.apigateway.services.product_review.model.PagedResourcesOfAdventurerProductDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class AdventurerProductPageDto   {
  
  private AdventurerGroupDto nextAdventurerGroupDto = null;
  private AdventurerStatusDto adventurerStatusDto = null;
  private PagedResourcesOfAdventurerProductDto adventurerProductDtos = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("nextAdventurerGroupDto")
  @com.fasterxml.jackson.annotation.JsonProperty("nextAdventurerGroupDto")
  public AdventurerGroupDto getNextAdventurerGroupDto() {
    return nextAdventurerGroupDto;
  }
  
  /**
   **/
  public void setNextAdventurerGroupDto(AdventurerGroupDto nextAdventurerGroupDto) {
    this.nextAdventurerGroupDto = nextAdventurerGroupDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("adventurerStatusDto")
  @com.fasterxml.jackson.annotation.JsonProperty("adventurerStatusDto")
  public AdventurerStatusDto getAdventurerStatusDto() {
    return adventurerStatusDto;
  }
  
  /**
   **/
  public void setAdventurerStatusDto(AdventurerStatusDto adventurerStatusDto) {
    this.adventurerStatusDto = adventurerStatusDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("adventurerProductDtos")
  @com.fasterxml.jackson.annotation.JsonProperty("adventurerProductDtos")
  public PagedResourcesOfAdventurerProductDto getAdventurerProductDtos() {
    return adventurerProductDtos;
  }
  
  /**
   **/
  public void setAdventurerProductDtos(PagedResourcesOfAdventurerProductDto adventurerProductDtos) {
    this.adventurerProductDtos = adventurerProductDtos;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdventurerProductPageDto adventurerProductPageDto = (AdventurerProductPageDto) o;
    return Objects.equals(this.nextAdventurerGroupDto, adventurerProductPageDto.nextAdventurerGroupDto) &&
        Objects.equals(this.adventurerStatusDto, adventurerProductPageDto.adventurerStatusDto) &&
        Objects.equals(this.adventurerProductDtos, adventurerProductPageDto.adventurerProductDtos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextAdventurerGroupDto, adventurerStatusDto, adventurerProductDtos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdventurerProductPageDto {\n");
    
    sb.append("    nextAdventurerGroupDto: ").append(toIndentedString(nextAdventurerGroupDto)).append("\n");
    sb.append("    adventurerStatusDto: ").append(toIndentedString(adventurerStatusDto)).append("\n");
    sb.append("    adventurerProductDtos: ").append(toIndentedString(adventurerProductDtos)).append("\n");
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

  public static AdventurerProductPageDtoBuilder builder() {
    return new AdventurerProductPageDtoBuilder();
  }

  public static class AdventurerProductPageDtoBuilder {

    private AdventurerGroupDto nextAdventurerGroupDto = null;
    private AdventurerStatusDto adventurerStatusDto = null;
    private PagedResourcesOfAdventurerProductDto adventurerProductDtos = null;
    

    AdventurerProductPageDtoBuilder() {
    }

    /**
     **/
    public AdventurerProductPageDtoBuilder nextAdventurerGroupDto(AdventurerGroupDto nextAdventurerGroupDto) {
      this.nextAdventurerGroupDto = nextAdventurerGroupDto;
      return this;
    }

    /**
     **/
    public AdventurerProductPageDtoBuilder adventurerStatusDto(AdventurerStatusDto adventurerStatusDto) {
      this.adventurerStatusDto = adventurerStatusDto;
      return this;
    }

    /**
     **/
    public AdventurerProductPageDtoBuilder adventurerProductDtos(PagedResourcesOfAdventurerProductDto adventurerProductDtos) {
      this.adventurerProductDtos = adventurerProductDtos;
      return this;
    }


    public AdventurerProductPageDto build() {
      AdventurerProductPageDto adventurerProductPageDto = new AdventurerProductPageDto();
      adventurerProductPageDto.setNextAdventurerGroupDto(this.nextAdventurerGroupDto);
      adventurerProductPageDto.setAdventurerStatusDto(this.adventurerStatusDto);
      adventurerProductPageDto.setAdventurerProductDtos(this.adventurerProductDtos);
      return adventurerProductPageDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AdventurerProductPageDtoBuilder {\n");
      
      sb.append("    nextAdventurerGroupDto: ").append(toIndentedString(nextAdventurerGroupDto)).append("\n");
      sb.append("    adventurerStatusDto: ").append(toIndentedString(adventurerStatusDto)).append("\n");
      sb.append("    adventurerProductDtos: ").append(toIndentedString(adventurerProductDtos)).append("\n");
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

