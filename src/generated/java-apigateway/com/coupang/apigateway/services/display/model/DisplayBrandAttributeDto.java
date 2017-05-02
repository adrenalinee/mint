package com.coupang.apigateway.services.display.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayBrandAttributeDto   {
  
  private Integer ordering = null;
  private String name = null;
  private Long id = null;
  private String groupCode = null;
  private String description = null;
  private String code = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("groupCode")
  @com.fasterxml.jackson.annotation.JsonProperty("groupCode")
  public String getGroupCode() {
    return groupCode;
  }
  
  /**
   **/
  public void setGroupCode(String groupCode) {
    this.groupCode = groupCode;
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayBrandAttributeDto displayBrandAttributeDto = (DisplayBrandAttributeDto) o;
    return Objects.equals(this.ordering, displayBrandAttributeDto.ordering) &&
        Objects.equals(this.name, displayBrandAttributeDto.name) &&
        Objects.equals(this.id, displayBrandAttributeDto.id) &&
        Objects.equals(this.groupCode, displayBrandAttributeDto.groupCode) &&
        Objects.equals(this.description, displayBrandAttributeDto.description) &&
        Objects.equals(this.code, displayBrandAttributeDto.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ordering, name, id, groupCode, description, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayBrandAttributeDto {\n");
    
    sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupCode: ").append(toIndentedString(groupCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

  public static DisplayBrandAttributeDtoBuilder builder() {
    return new DisplayBrandAttributeDtoBuilder();
  }

  public static class DisplayBrandAttributeDtoBuilder {

    private Integer ordering = null;
    private String name = null;
    private Long id = null;
    private String groupCode = null;
    private String description = null;
    private String code = null;
    

    DisplayBrandAttributeDtoBuilder() {
    }

    /**
     **/
    public DisplayBrandAttributeDtoBuilder ordering(Integer ordering) {
      this.ordering = ordering;
      return this;
    }

    /**
     **/
    public DisplayBrandAttributeDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public DisplayBrandAttributeDtoBuilder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public DisplayBrandAttributeDtoBuilder groupCode(String groupCode) {
      this.groupCode = groupCode;
      return this;
    }

    /**
     **/
    public DisplayBrandAttributeDtoBuilder description(String description) {
      this.description = description;
      return this;
    }

    /**
     **/
    public DisplayBrandAttributeDtoBuilder code(String code) {
      this.code = code;
      return this;
    }


    public DisplayBrandAttributeDto build() {
      DisplayBrandAttributeDto displayBrandAttributeDto = new DisplayBrandAttributeDto();
      displayBrandAttributeDto.setOrdering(this.ordering);
      displayBrandAttributeDto.setName(this.name);
      displayBrandAttributeDto.setId(this.id);
      displayBrandAttributeDto.setGroupCode(this.groupCode);
      displayBrandAttributeDto.setDescription(this.description);
      displayBrandAttributeDto.setCode(this.code);
      return displayBrandAttributeDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayBrandAttributeDtoBuilder {\n");
      
      sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    groupCode: ").append(toIndentedString(groupCode)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
      sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

