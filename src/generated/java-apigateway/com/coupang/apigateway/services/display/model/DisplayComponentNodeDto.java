package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import com.coupang.apigateway.services.display.model.DisplayComponentDto;
import com.coupang.apigateway.services.display.model.DisplayComponentNodeDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayComponentNodeDto   {
  
  private DisplayComponentNodeDto parent = null;
  private DisplayComponentDto displayComponentDto = null;
  private List<DisplayComponentNodeDto> children = new ArrayList<DisplayComponentNodeDto>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("parent")
  @com.fasterxml.jackson.annotation.JsonProperty("parent")
  public DisplayComponentNodeDto getParent() {
    return parent;
  }
  
  /**
   **/
  public void setParent(DisplayComponentNodeDto parent) {
    this.parent = parent;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("displayComponentDto")
  @com.fasterxml.jackson.annotation.JsonProperty("displayComponentDto")
  public DisplayComponentDto getDisplayComponentDto() {
    return displayComponentDto;
  }
  
  /**
   **/
  public void setDisplayComponentDto(DisplayComponentDto displayComponentDto) {
    this.displayComponentDto = displayComponentDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("children")
  @com.fasterxml.jackson.annotation.JsonProperty("children")
  public List<DisplayComponentNodeDto> getChildren() {
    return children;
  }
  
  /**
   **/
  public void setChildren(List<DisplayComponentNodeDto> children) {
    this.children = children;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayComponentNodeDto displayComponentNodeDto = (DisplayComponentNodeDto) o;
    return Objects.equals(this.parent, displayComponentNodeDto.parent) &&
        Objects.equals(this.displayComponentDto, displayComponentNodeDto.displayComponentDto) &&
        Objects.equals(this.children, displayComponentNodeDto.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, displayComponentDto, children);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayComponentNodeDto {\n");
    
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    displayComponentDto: ").append(toIndentedString(displayComponentDto)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

  public static DisplayComponentNodeDtoBuilder builder() {
    return new DisplayComponentNodeDtoBuilder();
  }

  public static class DisplayComponentNodeDtoBuilder {

    private DisplayComponentNodeDto parent = null;
    private DisplayComponentDto displayComponentDto = null;
    private List<DisplayComponentNodeDto> children = new ArrayList<DisplayComponentNodeDto>();
    

    DisplayComponentNodeDtoBuilder() {
    }

    /**
     **/
    public DisplayComponentNodeDtoBuilder parent(DisplayComponentNodeDto parent) {
      this.parent = parent;
      return this;
    }

    /**
     **/
    public DisplayComponentNodeDtoBuilder displayComponentDto(DisplayComponentDto displayComponentDto) {
      this.displayComponentDto = displayComponentDto;
      return this;
    }

    /**
     **/
    public DisplayComponentNodeDtoBuilder children(List<DisplayComponentNodeDto> children) {
      this.children = children;
      return this;
    }


    public DisplayComponentNodeDto build() {
      DisplayComponentNodeDto displayComponentNodeDto = new DisplayComponentNodeDto();
      displayComponentNodeDto.setParent(this.parent);
      displayComponentNodeDto.setDisplayComponentDto(this.displayComponentDto);
      displayComponentNodeDto.setChildren(this.children);
      return displayComponentNodeDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayComponentNodeDtoBuilder {\n");
      
      sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
      sb.append("    displayComponentDto: ").append(toIndentedString(displayComponentDto)).append("\n");
      sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

