package com.coupang.apigateway.services.abtest_randomizer.model;

import java.util.Objects;
import com.coupang.apigateway.services.abtest_randomizer.model.ConciseGroupDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.288+09:00")
public class TestDefinitionResponseDTO2   {
  


  public enum WinnerEnum {
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

    WinnerEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private WinnerEnum winner = null;


  public enum StatusEnum {
    NOT_STARTED("NOT_STARTED"),
    STARTED("STARTED"),
    COMPLETED("COMPLETED"),
    PAUSED("PAUSED"),
    CALCULATED("CALCULATED"),
    ARCHIVED("ARCHIVED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status = null;


  public enum OverriddenOptionEnum {
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

    OverriddenOptionEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private OverriddenOptionEnum overriddenOption = null;
  private String name = null;
  private List<String> locations = new ArrayList<String>();
  private Integer key = null;
  private List<ConciseGroupDto> groups = new ArrayList<ConciseGroupDto>();
  private String archivedDate = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("winner")
  @com.fasterxml.jackson.annotation.JsonProperty("winner")
  public WinnerEnum getWinner() {
    return winner;
  }
  
  /**
   **/
  public void setWinner(WinnerEnum winner) {
    this.winner = winner;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("status")
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  /**
   **/
  public void setStatus(StatusEnum status) {
    this.status = status;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("overriddenOption")
  @com.fasterxml.jackson.annotation.JsonProperty("overriddenOption")
  public OverriddenOptionEnum getOverriddenOption() {
    return overriddenOption;
  }
  
  /**
   **/
  public void setOverriddenOption(OverriddenOptionEnum overriddenOption) {
    this.overriddenOption = overriddenOption;
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
  @org.codehaus.jackson.annotate.JsonProperty("locations")
  @com.fasterxml.jackson.annotation.JsonProperty("locations")
  public List<String> getLocations() {
    return locations;
  }
  
  /**
   **/
  public void setLocations(List<String> locations) {
    this.locations = locations;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("key")
  @com.fasterxml.jackson.annotation.JsonProperty("key")
  public Integer getKey() {
    return key;
  }
  
  /**
   **/
  public void setKey(Integer key) {
    this.key = key;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("groups")
  @com.fasterxml.jackson.annotation.JsonProperty("groups")
  public List<ConciseGroupDto> getGroups() {
    return groups;
  }
  
  /**
   **/
  public void setGroups(List<ConciseGroupDto> groups) {
    this.groups = groups;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("archivedDate")
  @com.fasterxml.jackson.annotation.JsonProperty("archivedDate")
  public String getArchivedDate() {
    return archivedDate;
  }
  
  /**
   **/
  public void setArchivedDate(String archivedDate) {
    this.archivedDate = archivedDate;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestDefinitionResponseDTO2 testDefinitionResponseDTO2 = (TestDefinitionResponseDTO2) o;
    return Objects.equals(this.winner, testDefinitionResponseDTO2.winner) &&
        Objects.equals(this.status, testDefinitionResponseDTO2.status) &&
        Objects.equals(this.overriddenOption, testDefinitionResponseDTO2.overriddenOption) &&
        Objects.equals(this.name, testDefinitionResponseDTO2.name) &&
        Objects.equals(this.locations, testDefinitionResponseDTO2.locations) &&
        Objects.equals(this.key, testDefinitionResponseDTO2.key) &&
        Objects.equals(this.groups, testDefinitionResponseDTO2.groups) &&
        Objects.equals(this.archivedDate, testDefinitionResponseDTO2.archivedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(winner, status, overriddenOption, name, locations, key, groups, archivedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestDefinitionResponseDTO2 {\n");
    
    sb.append("    winner: ").append(toIndentedString(winner)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    overriddenOption: ").append(toIndentedString(overriddenOption)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    archivedDate: ").append(toIndentedString(archivedDate)).append("\n");
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

  public static TestDefinitionResponseDTO2Builder builder() {
    return new TestDefinitionResponseDTO2Builder();
  }

  public static class TestDefinitionResponseDTO2Builder {

    private WinnerEnum winner = null;
    private StatusEnum status = null;
    private OverriddenOptionEnum overriddenOption = null;
    private String name = null;
    private List<String> locations = new ArrayList<String>();
    private Integer key = null;
    private List<ConciseGroupDto> groups = new ArrayList<ConciseGroupDto>();
    private String archivedDate = null;
    

    TestDefinitionResponseDTO2Builder() {
    }

    /**
     **/
    public TestDefinitionResponseDTO2Builder winner(WinnerEnum winner) {
      this.winner = winner;
      return this;
    }

    /**
     **/
    public TestDefinitionResponseDTO2Builder status(StatusEnum status) {
      this.status = status;
      return this;
    }

    /**
     **/
    public TestDefinitionResponseDTO2Builder overriddenOption(OverriddenOptionEnum overriddenOption) {
      this.overriddenOption = overriddenOption;
      return this;
    }

    /**
     **/
    public TestDefinitionResponseDTO2Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public TestDefinitionResponseDTO2Builder locations(List<String> locations) {
      this.locations = locations;
      return this;
    }

    /**
     **/
    public TestDefinitionResponseDTO2Builder key(Integer key) {
      this.key = key;
      return this;
    }

    /**
     **/
    public TestDefinitionResponseDTO2Builder groups(List<ConciseGroupDto> groups) {
      this.groups = groups;
      return this;
    }

    /**
     **/
    public TestDefinitionResponseDTO2Builder archivedDate(String archivedDate) {
      this.archivedDate = archivedDate;
      return this;
    }


    public TestDefinitionResponseDTO2 build() {
      TestDefinitionResponseDTO2 testDefinitionResponseDTO2 = new TestDefinitionResponseDTO2();
      testDefinitionResponseDTO2.setWinner(this.winner);
      testDefinitionResponseDTO2.setStatus(this.status);
      testDefinitionResponseDTO2.setOverriddenOption(this.overriddenOption);
      testDefinitionResponseDTO2.setName(this.name);
      testDefinitionResponseDTO2.setLocations(this.locations);
      testDefinitionResponseDTO2.setKey(this.key);
      testDefinitionResponseDTO2.setGroups(this.groups);
      testDefinitionResponseDTO2.setArchivedDate(this.archivedDate);
      return testDefinitionResponseDTO2;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class TestDefinitionResponseDTO2Builder {\n");
      
      sb.append("    winner: ").append(toIndentedString(winner)).append("\n");
      sb.append("    status: ").append(toIndentedString(status)).append("\n");
      sb.append("    overriddenOption: ").append(toIndentedString(overriddenOption)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
      sb.append("    key: ").append(toIndentedString(key)).append("\n");
      sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
      sb.append("    archivedDate: ").append(toIndentedString(archivedDate)).append("\n");
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

