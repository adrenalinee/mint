package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import com.coupang.apigateway.services.display.model.DisplayBrandAttributeDto;
import com.coupang.apigateway.services.display.model.DisplayBrandCodeDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayBrandCodeDto   {
  
  private Long parentId = null;
  private Integer ordering = null;
  private String name = null;
  private Long id = null;
  private String iconImagePath = null;
  private String description = null;
  private String code = null;
  private List<DisplayBrandCodeDto> children = new ArrayList<DisplayBrandCodeDto>();
  private List<DisplayBrandAttributeDto> attributes = new ArrayList<DisplayBrandAttributeDto>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("parentId")
  @com.fasterxml.jackson.annotation.JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }
  
  /**
   **/
  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("ordering")
  @com.fasterxml.jackson.annotation.JsonProperty("ordering")
  public Integer getOrdering() {
    return ordering;
  }
  
  /**
   **/
  public void setOrdering(Integer ordering) {
    this.ordering = ordering;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("name")
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  public String getName() {
    return name;
  }
  
  /**
   **/
  public void setName(String name) {
    this.name = name;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("id")
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  public Long getId() {
    return id;
  }
  
  /**
   **/
  public void setId(Long id) {
    this.id = id;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("iconImagePath")
  @com.fasterxml.jackson.annotation.JsonProperty("iconImagePath")
  public String getIconImagePath() {
    return iconImagePath;
  }
  
  /**
   **/
  public void setIconImagePath(String iconImagePath) {
    this.iconImagePath = iconImagePath;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("description")
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  public String getDescription() {
    return description;
  }
  
  /**
   **/
  public void setDescription(String description) {
    this.description = description;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("code")
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  public String getCode() {
    return code;
  }
  
  /**
   **/
  public void setCode(String code) {
    this.code = code;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("children")
  @com.fasterxml.jackson.annotation.JsonProperty("children")
  public List<DisplayBrandCodeDto> getChildren() {
    return children;
  }
  
  /**
   **/
  public void setChildren(List<DisplayBrandCodeDto> children) {
    this.children = children;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attributes")
  @com.fasterxml.jackson.annotation.JsonProperty("attributes")
  public List<DisplayBrandAttributeDto> getAttributes() {
    return attributes;
  }
  
  /**
   **/
  public void setAttributes(List<DisplayBrandAttributeDto> attributes) {
    this.attributes = attributes;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayBrandCodeDto displayBrandCodeDto = (DisplayBrandCodeDto) o;
    return Objects.equals(this.parentId, displayBrandCodeDto.parentId) &&
        Objects.equals(this.ordering, displayBrandCodeDto.ordering) &&
        Objects.equals(this.name, displayBrandCodeDto.name) &&
        Objects.equals(this.id, displayBrandCodeDto.id) &&
        Objects.equals(this.iconImagePath, displayBrandCodeDto.iconImagePath) &&
        Objects.equals(this.description, displayBrandCodeDto.description) &&
        Objects.equals(this.code, displayBrandCodeDto.code) &&
        Objects.equals(this.children, displayBrandCodeDto.children) &&
        Objects.equals(this.attributes, displayBrandCodeDto.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentId, ordering, name, id, iconImagePath, description, code, children, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayBrandCodeDto {\n");
    
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    iconImagePath: ").append(toIndentedString(iconImagePath)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

  public static DisplayBrandCodeDtoBuilder builder() {
    return new DisplayBrandCodeDtoBuilder();
  }

  public static class DisplayBrandCodeDtoBuilder {

    private Long parentId = null;
    private Integer ordering = null;
    private String name = null;
    private Long id = null;
    private String iconImagePath = null;
    private String description = null;
    private String code = null;
    private List<DisplayBrandCodeDto> children = new ArrayList<DisplayBrandCodeDto>();
    private List<DisplayBrandAttributeDto> attributes = new ArrayList<DisplayBrandAttributeDto>();
    

    DisplayBrandCodeDtoBuilder() {
    }

    /**
     **/
    public DisplayBrandCodeDtoBuilder parentId(Long parentId) {
      this.parentId = parentId;
      return this;
    }

    /**
     **/
    public DisplayBrandCodeDtoBuilder ordering(Integer ordering) {
      this.ordering = ordering;
      return this;
    }

    /**
     **/
    public DisplayBrandCodeDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public DisplayBrandCodeDtoBuilder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public DisplayBrandCodeDtoBuilder iconImagePath(String iconImagePath) {
      this.iconImagePath = iconImagePath;
      return this;
    }

    /**
     **/
    public DisplayBrandCodeDtoBuilder description(String description) {
      this.description = description;
      return this;
    }

    /**
     **/
    public DisplayBrandCodeDtoBuilder code(String code) {
      this.code = code;
      return this;
    }

    /**
     **/
    public DisplayBrandCodeDtoBuilder children(List<DisplayBrandCodeDto> children) {
      this.children = children;
      return this;
    }

    /**
     **/
    public DisplayBrandCodeDtoBuilder attributes(List<DisplayBrandAttributeDto> attributes) {
      this.attributes = attributes;
      return this;
    }


    public DisplayBrandCodeDto build() {
      DisplayBrandCodeDto displayBrandCodeDto = new DisplayBrandCodeDto();
      displayBrandCodeDto.setParentId(this.parentId);
      displayBrandCodeDto.setOrdering(this.ordering);
      displayBrandCodeDto.setName(this.name);
      displayBrandCodeDto.setId(this.id);
      displayBrandCodeDto.setIconImagePath(this.iconImagePath);
      displayBrandCodeDto.setDescription(this.description);
      displayBrandCodeDto.setCode(this.code);
      displayBrandCodeDto.setChildren(this.children);
      displayBrandCodeDto.setAttributes(this.attributes);
      return displayBrandCodeDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayBrandCodeDtoBuilder {\n");
      
      sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
      sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    iconImagePath: ").append(toIndentedString(iconImagePath)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
      sb.append("    code: ").append(toIndentedString(code)).append("\n");
      sb.append("    children: ").append(toIndentedString(children)).append("\n");
      sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

