package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayModulesDto   {
  
  private List<String> pageableModules = new ArrayList<String>();
  private List<String> modules = new ArrayList<String>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("pageableModules")
  @com.fasterxml.jackson.annotation.JsonProperty("pageableModules")
  public List<String> getPageableModules() {
    return pageableModules;
  }
  
  /**
   **/
  public void setPageableModules(List<String> pageableModules) {
    this.pageableModules = pageableModules;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("modules")
  @com.fasterxml.jackson.annotation.JsonProperty("modules")
  public List<String> getModules() {
    return modules;
  }
  
  /**
   **/
  public void setModules(List<String> modules) {
    this.modules = modules;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayModulesDto displayModulesDto = (DisplayModulesDto) o;
    return Objects.equals(this.pageableModules, displayModulesDto.pageableModules) &&
        Objects.equals(this.modules, displayModulesDto.modules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageableModules, modules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayModulesDto {\n");
    
    sb.append("    pageableModules: ").append(toIndentedString(pageableModules)).append("\n");
    sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
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

  public static DisplayModulesDtoBuilder builder() {
    return new DisplayModulesDtoBuilder();
  }

  public static class DisplayModulesDtoBuilder {

    private List<String> pageableModules = new ArrayList<String>();
    private List<String> modules = new ArrayList<String>();
    

    DisplayModulesDtoBuilder() {
    }

    /**
     **/
    public DisplayModulesDtoBuilder pageableModules(List<String> pageableModules) {
      this.pageableModules = pageableModules;
      return this;
    }

    /**
     **/
    public DisplayModulesDtoBuilder modules(List<String> modules) {
      this.modules = modules;
      return this;
    }


    public DisplayModulesDto build() {
      DisplayModulesDto displayModulesDto = new DisplayModulesDto();
      displayModulesDto.setPageableModules(this.pageableModules);
      displayModulesDto.setModules(this.modules);
      return displayModulesDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayModulesDtoBuilder {\n");
      
      sb.append("    pageableModules: ").append(toIndentedString(pageableModules)).append("\n");
      sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
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

