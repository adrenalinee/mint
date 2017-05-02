package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.AdventurerProductDto;
import com.coupang.apigateway.services.product_review.model.AdventurerStatusDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class AdventurerStatusAndProductDto   {
  
  private AdventurerStatusDto adventurerStatusDto = null;
  private AdventurerProductDto adventurerProductDto = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("adventurerProductDto")
  @com.fasterxml.jackson.annotation.JsonProperty("adventurerProductDto")
  public AdventurerProductDto getAdventurerProductDto() {
    return adventurerProductDto;
  }
  
  /**
   **/
  public void setAdventurerProductDto(AdventurerProductDto adventurerProductDto) {
    this.adventurerProductDto = adventurerProductDto;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdventurerStatusAndProductDto adventurerStatusAndProductDto = (AdventurerStatusAndProductDto) o;
    return Objects.equals(this.adventurerStatusDto, adventurerStatusAndProductDto.adventurerStatusDto) &&
        Objects.equals(this.adventurerProductDto, adventurerStatusAndProductDto.adventurerProductDto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adventurerStatusDto, adventurerProductDto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdventurerStatusAndProductDto {\n");
    
    sb.append("    adventurerStatusDto: ").append(toIndentedString(adventurerStatusDto)).append("\n");
    sb.append("    adventurerProductDto: ").append(toIndentedString(adventurerProductDto)).append("\n");
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

  public static AdventurerStatusAndProductDtoBuilder builder() {
    return new AdventurerStatusAndProductDtoBuilder();
  }

  public static class AdventurerStatusAndProductDtoBuilder {

    private AdventurerStatusDto adventurerStatusDto = null;
    private AdventurerProductDto adventurerProductDto = null;
    

    AdventurerStatusAndProductDtoBuilder() {
    }

    /**
     **/
    public AdventurerStatusAndProductDtoBuilder adventurerStatusDto(AdventurerStatusDto adventurerStatusDto) {
      this.adventurerStatusDto = adventurerStatusDto;
      return this;
    }

    /**
     **/
    public AdventurerStatusAndProductDtoBuilder adventurerProductDto(AdventurerProductDto adventurerProductDto) {
      this.adventurerProductDto = adventurerProductDto;
      return this;
    }


    public AdventurerStatusAndProductDto build() {
      AdventurerStatusAndProductDto adventurerStatusAndProductDto = new AdventurerStatusAndProductDto();
      adventurerStatusAndProductDto.setAdventurerStatusDto(this.adventurerStatusDto);
      adventurerStatusAndProductDto.setAdventurerProductDto(this.adventurerProductDto);
      return adventurerStatusAndProductDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AdventurerStatusAndProductDtoBuilder {\n");
      
      sb.append("    adventurerStatusDto: ").append(toIndentedString(adventurerStatusDto)).append("\n");
      sb.append("    adventurerProductDto: ").append(toIndentedString(adventurerProductDto)).append("\n");
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

