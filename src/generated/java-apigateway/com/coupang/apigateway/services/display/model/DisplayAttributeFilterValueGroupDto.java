package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import com.coupang.apigateway.services.display.model.DisplayAttributeFilterValueDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayAttributeFilterValueGroupDto   {
  
  private List<DisplayAttributeFilterValueDto> values = new ArrayList<DisplayAttributeFilterValueDto>();
  private Integer priority = null;
  private String name = null;
  private Long groupId = null;
  private String description = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("values")
  @com.fasterxml.jackson.annotation.JsonProperty("values")
  public List<DisplayAttributeFilterValueDto> getValues() {
    return values;
  }
  
  /**
   **/
  public void setValues(List<DisplayAttributeFilterValueDto> values) {
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
    DisplayAttributeFilterValueGroupDto displayAttributeFilterValueGroupDto = (DisplayAttributeFilterValueGroupDto) o;
    return Objects.equals(this.values, displayAttributeFilterValueGroupDto.values) &&
        Objects.equals(this.priority, displayAttributeFilterValueGroupDto.priority) &&
        Objects.equals(this.name, displayAttributeFilterValueGroupDto.name) &&
        Objects.equals(this.groupId, displayAttributeFilterValueGroupDto.groupId) &&
        Objects.equals(this.description, displayAttributeFilterValueGroupDto.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, priority, name, groupId, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayAttributeFilterValueGroupDto {\n");
    
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

  public static DisplayAttributeFilterValueGroupDtoBuilder builder() {
    return new DisplayAttributeFilterValueGroupDtoBuilder();
  }

  public static class DisplayAttributeFilterValueGroupDtoBuilder {

    private List<DisplayAttributeFilterValueDto> values = new ArrayList<DisplayAttributeFilterValueDto>();
    private Integer priority = null;
    private String name = null;
    private Long groupId = null;
    private String description = null;
    

    DisplayAttributeFilterValueGroupDtoBuilder() {
    }

    /**
     **/
    public DisplayAttributeFilterValueGroupDtoBuilder values(List<DisplayAttributeFilterValueDto> values) {
      this.values = values;
      return this;
    }

    /**
     **/
    public DisplayAttributeFilterValueGroupDtoBuilder priority(Integer priority) {
      this.priority = priority;
      return this;
    }

    /**
     **/
    public DisplayAttributeFilterValueGroupDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public DisplayAttributeFilterValueGroupDtoBuilder groupId(Long groupId) {
      this.groupId = groupId;
      return this;
    }

    /**
     **/
    public DisplayAttributeFilterValueGroupDtoBuilder description(String description) {
      this.description = description;
      return this;
    }


    public DisplayAttributeFilterValueGroupDto build() {
      DisplayAttributeFilterValueGroupDto displayAttributeFilterValueGroupDto = new DisplayAttributeFilterValueGroupDto();
      displayAttributeFilterValueGroupDto.setValues(this.values);
      displayAttributeFilterValueGroupDto.setPriority(this.priority);
      displayAttributeFilterValueGroupDto.setName(this.name);
      displayAttributeFilterValueGroupDto.setGroupId(this.groupId);
      displayAttributeFilterValueGroupDto.setDescription(this.description);
      return displayAttributeFilterValueGroupDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayAttributeFilterValueGroupDtoBuilder {\n");
      
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

