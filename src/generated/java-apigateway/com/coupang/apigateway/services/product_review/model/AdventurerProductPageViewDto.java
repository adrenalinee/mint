package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.AdventurerGroupDto;
import com.coupang.apigateway.services.product_review.model.AdventurerViewBannerDto;
import com.coupang.apigateway.services.product_review.model.PagedResourcesOfAdventurerProductDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class AdventurerProductPageViewDto   {
  
  private AdventurerGroupDto nextGroupDto = null;
  private AdventurerGroupDto currentGroupDto = null;
  private PagedResourcesOfAdventurerProductDto adventurerProductDtos = null;
  private AdventurerViewBannerDto adventurerBannerDto = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("nextGroupDto")
  @com.fasterxml.jackson.annotation.JsonProperty("nextGroupDto")
  public AdventurerGroupDto getNextGroupDto() {
    return nextGroupDto;
  }
  
  /**
   **/
  public void setNextGroupDto(AdventurerGroupDto nextGroupDto) {
    this.nextGroupDto = nextGroupDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("currentGroupDto")
  @com.fasterxml.jackson.annotation.JsonProperty("currentGroupDto")
  public AdventurerGroupDto getCurrentGroupDto() {
    return currentGroupDto;
  }
  
  /**
   **/
  public void setCurrentGroupDto(AdventurerGroupDto currentGroupDto) {
    this.currentGroupDto = currentGroupDto;
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
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("adventurerBannerDto")
  @com.fasterxml.jackson.annotation.JsonProperty("adventurerBannerDto")
  public AdventurerViewBannerDto getAdventurerBannerDto() {
    return adventurerBannerDto;
  }
  
  /**
   **/
  public void setAdventurerBannerDto(AdventurerViewBannerDto adventurerBannerDto) {
    this.adventurerBannerDto = adventurerBannerDto;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdventurerProductPageViewDto adventurerProductPageViewDto = (AdventurerProductPageViewDto) o;
    return Objects.equals(this.nextGroupDto, adventurerProductPageViewDto.nextGroupDto) &&
        Objects.equals(this.currentGroupDto, adventurerProductPageViewDto.currentGroupDto) &&
        Objects.equals(this.adventurerProductDtos, adventurerProductPageViewDto.adventurerProductDtos) &&
        Objects.equals(this.adventurerBannerDto, adventurerProductPageViewDto.adventurerBannerDto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextGroupDto, currentGroupDto, adventurerProductDtos, adventurerBannerDto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdventurerProductPageViewDto {\n");
    
    sb.append("    nextGroupDto: ").append(toIndentedString(nextGroupDto)).append("\n");
    sb.append("    currentGroupDto: ").append(toIndentedString(currentGroupDto)).append("\n");
    sb.append("    adventurerProductDtos: ").append(toIndentedString(adventurerProductDtos)).append("\n");
    sb.append("    adventurerBannerDto: ").append(toIndentedString(adventurerBannerDto)).append("\n");
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

  public static AdventurerProductPageViewDtoBuilder builder() {
    return new AdventurerProductPageViewDtoBuilder();
  }

  public static class AdventurerProductPageViewDtoBuilder {

    private AdventurerGroupDto nextGroupDto = null;
    private AdventurerGroupDto currentGroupDto = null;
    private PagedResourcesOfAdventurerProductDto adventurerProductDtos = null;
    private AdventurerViewBannerDto adventurerBannerDto = null;
    

    AdventurerProductPageViewDtoBuilder() {
    }

    /**
     **/
    public AdventurerProductPageViewDtoBuilder nextGroupDto(AdventurerGroupDto nextGroupDto) {
      this.nextGroupDto = nextGroupDto;
      return this;
    }

    /**
     **/
    public AdventurerProductPageViewDtoBuilder currentGroupDto(AdventurerGroupDto currentGroupDto) {
      this.currentGroupDto = currentGroupDto;
      return this;
    }

    /**
     **/
    public AdventurerProductPageViewDtoBuilder adventurerProductDtos(PagedResourcesOfAdventurerProductDto adventurerProductDtos) {
      this.adventurerProductDtos = adventurerProductDtos;
      return this;
    }

    /**
     **/
    public AdventurerProductPageViewDtoBuilder adventurerBannerDto(AdventurerViewBannerDto adventurerBannerDto) {
      this.adventurerBannerDto = adventurerBannerDto;
      return this;
    }


    public AdventurerProductPageViewDto build() {
      AdventurerProductPageViewDto adventurerProductPageViewDto = new AdventurerProductPageViewDto();
      adventurerProductPageViewDto.setNextGroupDto(this.nextGroupDto);
      adventurerProductPageViewDto.setCurrentGroupDto(this.currentGroupDto);
      adventurerProductPageViewDto.setAdventurerProductDtos(this.adventurerProductDtos);
      adventurerProductPageViewDto.setAdventurerBannerDto(this.adventurerBannerDto);
      return adventurerProductPageViewDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AdventurerProductPageViewDtoBuilder {\n");
      
      sb.append("    nextGroupDto: ").append(toIndentedString(nextGroupDto)).append("\n");
      sb.append("    currentGroupDto: ").append(toIndentedString(currentGroupDto)).append("\n");
      sb.append("    adventurerProductDtos: ").append(toIndentedString(adventurerProductDtos)).append("\n");
      sb.append("    adventurerBannerDto: ").append(toIndentedString(adventurerBannerDto)).append("\n");
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

