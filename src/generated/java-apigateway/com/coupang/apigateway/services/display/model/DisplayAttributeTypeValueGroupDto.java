package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import com.coupang.apigateway.services.display.model.DisplayAttributeTypeValueDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayAttributeTypeValueGroupDto   {
  
  private List<DisplayAttributeTypeValueDto> values = new ArrayList<DisplayAttributeTypeValueDto>();
  private Integer priority = null;
  private String name = null;
  private Long groupId = null;
  private String description = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("values")
  @com.fasterxml.jackson.annotation.JsonProperty("values")
  public List<DisplayAttributeTypeValueDto> getValues() {
    return values;
  }
  
  /**
   **/
  public void setValues(List<DisplayAttributeTypeValueDto> values) {
    this.values = values;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("priority")
  @com.fasterxml.jackson.annotation.JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  
  /**
   **/
  public void setPriority(Integer priority) {
    this.priority = priority;
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
  @org.codehaus.jackson.annotate.JsonProperty("groupId")
  @com.fasterxml.jackson.annotation.JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }
  
  /**
   **/
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayAttributeTypeValueGroupDto displayAttributeTypeValueGroupDto = (DisplayAttributeTypeValueGroupDto) o;
    return Objects.equals(this.values, displayAttributeTypeValueGroupDto.values) &&
        Objects.equals(this.priority, displayAttributeTypeValueGroupDto.priority) &&
        Objects.equals(this.name, displayAttributeTypeValueGroupDto.name) &&
        Objects.equals(this.groupId, displayAttributeTypeValueGroupDto.groupId) &&
        Objects.equals(this.description, displayAttributeTypeValueGroupDto.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, priority, name, groupId, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayAttributeTypeValueGroupDto {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

  public static DisplayAttributeTypeValueGroupDtoBuilder builder() {
    return new DisplayAttributeTypeValueGroupDtoBuilder();
  }

  public static class DisplayAttributeTypeValueGroupDtoBuilder {

    private List<DisplayAttributeTypeValueDto> values = new ArrayList<DisplayAttributeTypeValueDto>();
    private Integer priority = null;
    private String name = null;
    private Long groupId = null;
    private String description = null;
    

    DisplayAttributeTypeValueGroupDtoBuilder() {
    }

    /**
     **/
    public DisplayAttributeTypeValueGroupDtoBuilder values(List<DisplayAttributeTypeValueDto> values) {
      this.values = values;
      return this;
    }

    /**
     **/
    public DisplayAttributeTypeValueGroupDtoBuilder priority(Integer priority) {
      this.priority = priority;
      return this;
    }

    /**
     **/
    public DisplayAttributeTypeValueGroupDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public DisplayAttributeTypeValueGroupDtoBuilder groupId(Long groupId) {
      this.groupId = groupId;
      return this;
    }

    /**
     **/
    public DisplayAttributeTypeValueGroupDtoBuilder description(String description) {
      this.description = description;
      return this;
    }


    public DisplayAttributeTypeValueGroupDto build() {
      DisplayAttributeTypeValueGroupDto displayAttributeTypeValueGroupDto = new DisplayAttributeTypeValueGroupDto();
      displayAttributeTypeValueGroupDto.setValues(this.values);
      displayAttributeTypeValueGroupDto.setPriority(this.priority);
      displayAttributeTypeValueGroupDto.setName(this.name);
      displayAttributeTypeValueGroupDto.setGroupId(this.groupId);
      displayAttributeTypeValueGroupDto.setDescription(this.description);
      return displayAttributeTypeValueGroupDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayAttributeTypeValueGroupDtoBuilder {\n");
      
      sb.append("    values: ").append(toIndentedString(values)).append("\n");
      sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

