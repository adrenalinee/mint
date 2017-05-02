package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class AdventurerGroupDto   {
  
  private Date startedAt = null;
  private Boolean started = null;
  private Long groupNo = null;
  private Boolean deleted = null;
  private Date closedAt = null;
  private Boolean closed = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("startedAt")
  @com.fasterxml.jackson.annotation.JsonProperty("startedAt")
  public Date getStartedAt() {
    return startedAt;
  }
  
  /**
   **/
  public void setStartedAt(Date startedAt) {
    this.startedAt = startedAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("started")
  @com.fasterxml.jackson.annotation.JsonProperty("started")
  public Boolean getStarted() {
    return started;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isStarted() {
    return started == null ? false : started;
  }
  
  /**
   **/
  public void setStarted(Boolean started) {
    this.started = started;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("groupNo")
  @com.fasterxml.jackson.annotation.JsonProperty("groupNo")
  public Long getGroupNo() {
    return groupNo;
  }
  
  /**
   **/
  public void setGroupNo(Long groupNo) {
    this.groupNo = groupNo;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deleted")
  @com.fasterxml.jackson.annotation.JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isDeleted() {
    return deleted == null ? false : deleted;
  }
  
  /**
   **/
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("closedAt")
  @com.fasterxml.jackson.annotation.JsonProperty("closedAt")
  public Date getClosedAt() {
    return closedAt;
  }
  
  /**
   **/
  public void setClosedAt(Date closedAt) {
    this.closedAt = closedAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("closed")
  @com.fasterxml.jackson.annotation.JsonProperty("closed")
  public Boolean getClosed() {
    return closed;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isClosed() {
    return closed == null ? false : closed;
  }
  
  /**
   **/
  public void setClosed(Boolean closed) {
    this.closed = closed;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdventurerGroupDto adventurerGroupDto = (AdventurerGroupDto) o;
    return Objects.equals(this.startedAt, adventurerGroupDto.startedAt) &&
        Objects.equals(this.started, adventurerGroupDto.started) &&
        Objects.equals(this.groupNo, adventurerGroupDto.groupNo) &&
        Objects.equals(this.deleted, adventurerGroupDto.deleted) &&
        Objects.equals(this.closedAt, adventurerGroupDto.closedAt) &&
        Objects.equals(this.closed, adventurerGroupDto.closed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startedAt, started, groupNo, deleted, closedAt, closed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdventurerGroupDto {\n");
    
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    groupNo: ").append(toIndentedString(groupNo)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
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

  public static AdventurerGroupDtoBuilder builder() {
    return new AdventurerGroupDtoBuilder();
  }

  public static class AdventurerGroupDtoBuilder {

    private Date startedAt = null;
    private Boolean started = null;
    private Long groupNo = null;
    private Boolean deleted = null;
    private Date closedAt = null;
    private Boolean closed = null;
    

    AdventurerGroupDtoBuilder() {
    }

    /**
     **/
    public AdventurerGroupDtoBuilder startedAt(Date startedAt) {
      this.startedAt = startedAt;
      return this;
    }

    /**
     **/
    public AdventurerGroupDtoBuilder started(Boolean started) {
      this.started = started;
      return this;
    }

    /**
     **/
    public AdventurerGroupDtoBuilder groupNo(Long groupNo) {
      this.groupNo = groupNo;
      return this;
    }

    /**
     **/
    public AdventurerGroupDtoBuilder deleted(Boolean deleted) {
      this.deleted = deleted;
      return this;
    }

    /**
     **/
    public AdventurerGroupDtoBuilder closedAt(Date closedAt) {
      this.closedAt = closedAt;
      return this;
    }

    /**
     **/
    public AdventurerGroupDtoBuilder closed(Boolean closed) {
      this.closed = closed;
      return this;
    }


    public AdventurerGroupDto build() {
      AdventurerGroupDto adventurerGroupDto = new AdventurerGroupDto();
      adventurerGroupDto.setStartedAt(this.startedAt);
      adventurerGroupDto.setStarted(this.started);
      adventurerGroupDto.setGroupNo(this.groupNo);
      adventurerGroupDto.setDeleted(this.deleted);
      adventurerGroupDto.setClosedAt(this.closedAt);
      adventurerGroupDto.setClosed(this.closed);
      return adventurerGroupDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AdventurerGroupDtoBuilder {\n");
      
      sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
      sb.append("    started: ").append(toIndentedString(started)).append("\n");
      sb.append("    groupNo: ").append(toIndentedString(groupNo)).append("\n");
      sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
      sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
      sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
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

