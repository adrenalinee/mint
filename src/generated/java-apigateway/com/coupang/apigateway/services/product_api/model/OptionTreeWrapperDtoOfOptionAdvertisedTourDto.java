package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_api.model.OptionAdvertisedTourDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class OptionTreeWrapperDtoOfOptionAdvertisedTourDto   {
  
  private Integer totalDepth = null;
  private List<String> optionViewTypes = new ArrayList<String>();
  private List<OptionAdvertisedTourDto> optionDtos = new ArrayList<OptionAdvertisedTourDto>();
  private Boolean leaf = null;
  private String currentOptionViewType = null;
  private Integer currentDepth = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("totalDepth")
  @com.fasterxml.jackson.annotation.JsonProperty("totalDepth")
  public Integer getTotalDepth() {
    return totalDepth;
  }
  
  /**
   **/
  public void setTotalDepth(Integer totalDepth) {
    this.totalDepth = totalDepth;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("optionViewTypes")
  @com.fasterxml.jackson.annotation.JsonProperty("optionViewTypes")
  public List<String> getOptionViewTypes() {
    return optionViewTypes;
  }
  
  /**
   **/
  public void setOptionViewTypes(List<String> optionViewTypes) {
    this.optionViewTypes = optionViewTypes;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("optionDtos")
  @com.fasterxml.jackson.annotation.JsonProperty("optionDtos")
  public List<OptionAdvertisedTourDto> getOptionDtos() {
    return optionDtos;
  }
  
  /**
   **/
  public void setOptionDtos(List<OptionAdvertisedTourDto> optionDtos) {
    this.optionDtos = optionDtos;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("leaf")
  @com.fasterxml.jackson.annotation.JsonProperty("leaf")
  public Boolean getLeaf() {
    return leaf;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isLeaf() {
    return leaf == null ? false : leaf;
  }
  
  /**
   **/
  public void setLeaf(Boolean leaf) {
    this.leaf = leaf;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("currentOptionViewType")
  @com.fasterxml.jackson.annotation.JsonProperty("currentOptionViewType")
  public String getCurrentOptionViewType() {
    return currentOptionViewType;
  }
  
  /**
   **/
  public void setCurrentOptionViewType(String currentOptionViewType) {
    this.currentOptionViewType = currentOptionViewType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("currentDepth")
  @com.fasterxml.jackson.annotation.JsonProperty("currentDepth")
  public Integer getCurrentDepth() {
    return currentDepth;
  }
  
  /**
   **/
  public void setCurrentDepth(Integer currentDepth) {
    this.currentDepth = currentDepth;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionTreeWrapperDtoOfOptionAdvertisedTourDto optionTreeWrapperDtoOfOptionAdvertisedTourDto = (OptionTreeWrapperDtoOfOptionAdvertisedTourDto) o;
    return Objects.equals(this.totalDepth, optionTreeWrapperDtoOfOptionAdvertisedTourDto.totalDepth) &&
        Objects.equals(this.optionViewTypes, optionTreeWrapperDtoOfOptionAdvertisedTourDto.optionViewTypes) &&
        Objects.equals(this.optionDtos, optionTreeWrapperDtoOfOptionAdvertisedTourDto.optionDtos) &&
        Objects.equals(this.leaf, optionTreeWrapperDtoOfOptionAdvertisedTourDto.leaf) &&
        Objects.equals(this.currentOptionViewType, optionTreeWrapperDtoOfOptionAdvertisedTourDto.currentOptionViewType) &&
        Objects.equals(this.currentDepth, optionTreeWrapperDtoOfOptionAdvertisedTourDto.currentDepth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalDepth, optionViewTypes, optionDtos, leaf, currentOptionViewType, currentDepth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionTreeWrapperDtoOfOptionAdvertisedTourDto {\n");
    
    sb.append("    totalDepth: ").append(toIndentedString(totalDepth)).append("\n");
    sb.append("    optionViewTypes: ").append(toIndentedString(optionViewTypes)).append("\n");
    sb.append("    optionDtos: ").append(toIndentedString(optionDtos)).append("\n");
    sb.append("    leaf: ").append(toIndentedString(leaf)).append("\n");
    sb.append("    currentOptionViewType: ").append(toIndentedString(currentOptionViewType)).append("\n");
    sb.append("    currentDepth: ").append(toIndentedString(currentDepth)).append("\n");
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

  public static OptionTreeWrapperDtoOfOptionAdvertisedTourDtoBuilder builder() {
    return new OptionTreeWrapperDtoOfOptionAdvertisedTourDtoBuilder();
  }

  public static class OptionTreeWrapperDtoOfOptionAdvertisedTourDtoBuilder {

    private Integer totalDepth = null;
    private List<String> optionViewTypes = new ArrayList<String>();
    private List<OptionAdvertisedTourDto> optionDtos = new ArrayList<OptionAdvertisedTourDto>();
    private Boolean leaf = null;
    private String currentOptionViewType = null;
    private Integer currentDepth = null;
    

    OptionTreeWrapperDtoOfOptionAdvertisedTourDtoBuilder() {
    }

    /**
     **/
    public OptionTreeWrapperDtoOfOptionAdvertisedTourDtoBuilder totalDepth(Integer totalDepth) {
      this.totalDepth = totalDepth;
      return this;
    }

    /**
     **/
    public OptionTreeWrapperDtoOfOptionAdvertisedTourDtoBuilder optionViewTypes(List<String> optionViewTypes) {
      this.optionViewTypes = optionViewTypes;
      return this;
    }

    /**
     **/
    public OptionTreeWrapperDtoOfOptionAdvertisedTourDtoBuilder optionDtos(List<OptionAdvertisedTourDto> optionDtos) {
      this.optionDtos = optionDtos;
      return this;
    }

    /**
     **/
    public OptionTreeWrapperDtoOfOptionAdvertisedTourDtoBuilder leaf(Boolean leaf) {
      this.leaf = leaf;
      return this;
    }

    /**
     **/
    public OptionTreeWrapperDtoOfOptionAdvertisedTourDtoBuilder currentOptionViewType(String currentOptionViewType) {
      this.currentOptionViewType = currentOptionViewType;
      return this;
    }

    /**
     **/
    public OptionTreeWrapperDtoOfOptionAdvertisedTourDtoBuilder currentDepth(Integer currentDepth) {
      this.currentDepth = currentDepth;
      return this;
    }


    public OptionTreeWrapperDtoOfOptionAdvertisedTourDto build() {
      OptionTreeWrapperDtoOfOptionAdvertisedTourDto optionTreeWrapperDtoOfOptionAdvertisedTourDto = new OptionTreeWrapperDtoOfOptionAdvertisedTourDto();
      optionTreeWrapperDtoOfOptionAdvertisedTourDto.setTotalDepth(this.totalDepth);
      optionTreeWrapperDtoOfOptionAdvertisedTourDto.setOptionViewTypes(this.optionViewTypes);
      optionTreeWrapperDtoOfOptionAdvertisedTourDto.setOptionDtos(this.optionDtos);
      optionTreeWrapperDtoOfOptionAdvertisedTourDto.setLeaf(this.leaf);
      optionTreeWrapperDtoOfOptionAdvertisedTourDto.setCurrentOptionViewType(this.currentOptionViewType);
      optionTreeWrapperDtoOfOptionAdvertisedTourDto.setCurrentDepth(this.currentDepth);
      return optionTreeWrapperDtoOfOptionAdvertisedTourDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class OptionTreeWrapperDtoOfOptionAdvertisedTourDtoBuilder {\n");
      
      sb.append("    totalDepth: ").append(toIndentedString(totalDepth)).append("\n");
      sb.append("    optionViewTypes: ").append(toIndentedString(optionViewTypes)).append("\n");
      sb.append("    optionDtos: ").append(toIndentedString(optionDtos)).append("\n");
      sb.append("    leaf: ").append(toIndentedString(leaf)).append("\n");
      sb.append("    currentOptionViewType: ").append(toIndentedString(currentOptionViewType)).append("\n");
      sb.append("    currentDepth: ").append(toIndentedString(currentDepth)).append("\n");
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

