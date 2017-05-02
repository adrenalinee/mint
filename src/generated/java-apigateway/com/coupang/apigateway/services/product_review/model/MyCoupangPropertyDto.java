package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class MyCoupangPropertyDto   {
  
  private Boolean visited = null;
  private Boolean showNewBadge = null;
  private String memberId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("visited")
  @com.fasterxml.jackson.annotation.JsonProperty("visited")
  public Boolean getVisited() {
    return visited;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isVisited() {
    return visited == null ? false : visited;
  }
  
  /**
   **/
  public void setVisited(Boolean visited) {
    this.visited = visited;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("showNewBadge")
  @com.fasterxml.jackson.annotation.JsonProperty("showNewBadge")
  public Boolean getShowNewBadge() {
    return showNewBadge;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isShowNewBadge() {
    return showNewBadge == null ? false : showNewBadge;
  }
  
  /**
   **/
  public void setShowNewBadge(Boolean showNewBadge) {
    this.showNewBadge = showNewBadge;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("memberId")
  @com.fasterxml.jackson.annotation.JsonProperty("memberId")
  public String getMemberId() {
    return memberId;
  }
  
  /**
   **/
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MyCoupangPropertyDto myCoupangPropertyDto = (MyCoupangPropertyDto) o;
    return Objects.equals(this.visited, myCoupangPropertyDto.visited) &&
        Objects.equals(this.showNewBadge, myCoupangPropertyDto.showNewBadge) &&
        Objects.equals(this.memberId, myCoupangPropertyDto.memberId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visited, showNewBadge, memberId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MyCoupangPropertyDto {\n");
    
    sb.append("    visited: ").append(toIndentedString(visited)).append("\n");
    sb.append("    showNewBadge: ").append(toIndentedString(showNewBadge)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
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

  public static MyCoupangPropertyDtoBuilder builder() {
    return new MyCoupangPropertyDtoBuilder();
  }

  public static class MyCoupangPropertyDtoBuilder {

    private Boolean visited = null;
    private Boolean showNewBadge = null;
    private String memberId = null;
    

    MyCoupangPropertyDtoBuilder() {
    }

    /**
     **/
    public MyCoupangPropertyDtoBuilder visited(Boolean visited) {
      this.visited = visited;
      return this;
    }

    /**
     **/
    public MyCoupangPropertyDtoBuilder showNewBadge(Boolean showNewBadge) {
      this.showNewBadge = showNewBadge;
      return this;
    }

    /**
     **/
    public MyCoupangPropertyDtoBuilder memberId(String memberId) {
      this.memberId = memberId;
      return this;
    }


    public MyCoupangPropertyDto build() {
      MyCoupangPropertyDto myCoupangPropertyDto = new MyCoupangPropertyDto();
      myCoupangPropertyDto.setVisited(this.visited);
      myCoupangPropertyDto.setShowNewBadge(this.showNewBadge);
      myCoupangPropertyDto.setMemberId(this.memberId);
      return myCoupangPropertyDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MyCoupangPropertyDtoBuilder {\n");
      
      sb.append("    visited: ").append(toIndentedString(visited)).append("\n");
      sb.append("    showNewBadge: ").append(toIndentedString(showNewBadge)).append("\n");
      sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
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

