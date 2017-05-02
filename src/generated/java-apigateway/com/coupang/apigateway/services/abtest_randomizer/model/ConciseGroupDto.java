package com.coupang.apigateway.services.abtest_randomizer.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.288+09:00")
public class ConciseGroupDto   {
  


  public enum NameEnum {
    A("A"),
    B("B"),
    C("C"),
    D("D"),
    E("E"),
    F("F"),
    G("G"),
    H("H"),
    I("I"),
    J("J");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private NameEnum name = null;
  private Integer allocation = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("name")
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  public NameEnum getName() {
    return name;
  }
  
  /**
   **/
  public void setName(NameEnum name) {
    this.name = name;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("allocation")
  @com.fasterxml.jackson.annotation.JsonProperty("allocation")
  public Integer getAllocation() {
    return allocation;
  }
  
  /**
   **/
  public void setAllocation(Integer allocation) {
    this.allocation = allocation;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConciseGroupDto conciseGroupDto = (ConciseGroupDto) o;
    return Objects.equals(this.name, conciseGroupDto.name) &&
        Objects.equals(this.allocation, conciseGroupDto.allocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, allocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConciseGroupDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    allocation: ").append(toIndentedString(allocation)).append("\n");
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

  public static ConciseGroupDtoBuilder builder() {
    return new ConciseGroupDtoBuilder();
  }

  public static class ConciseGroupDtoBuilder {

    private NameEnum name = null;
    private Integer allocation = null;
    

    ConciseGroupDtoBuilder() {
    }

    /**
     **/
    public ConciseGroupDtoBuilder name(NameEnum name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public ConciseGroupDtoBuilder allocation(Integer allocation) {
      this.allocation = allocation;
      return this;
    }


    public ConciseGroupDto build() {
      ConciseGroupDto conciseGroupDto = new ConciseGroupDto();
      conciseGroupDto.setName(this.name);
      conciseGroupDto.setAllocation(this.allocation);
      return conciseGroupDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ConciseGroupDtoBuilder {\n");
      
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    allocation: ").append(toIndentedString(allocation)).append("\n");
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

