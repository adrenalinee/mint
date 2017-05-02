package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayDocumentPrevDto   {
  
  private Date startAt = null;
  private Date endAt = null;
  private Long documentId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("startAt")
  @com.fasterxml.jackson.annotation.JsonProperty("startAt")
  public Date getStartAt() {
    return startAt;
  }
  
  /**
   **/
  public void setStartAt(Date startAt) {
    this.startAt = startAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("endAt")
  @com.fasterxml.jackson.annotation.JsonProperty("endAt")
  public Date getEndAt() {
    return endAt;
  }
  
  /**
   **/
  public void setEndAt(Date endAt) {
    this.endAt = endAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("documentId")
  @com.fasterxml.jackson.annotation.JsonProperty("documentId")
  public Long getDocumentId() {
    return documentId;
  }
  
  /**
   **/
  public void setDocumentId(Long documentId) {
    this.documentId = documentId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayDocumentPrevDto displayDocumentPrevDto = (DisplayDocumentPrevDto) o;
    return Objects.equals(this.startAt, displayDocumentPrevDto.startAt) &&
        Objects.equals(this.endAt, displayDocumentPrevDto.endAt) &&
        Objects.equals(this.documentId, displayDocumentPrevDto.documentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startAt, endAt, documentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayDocumentPrevDto {\n");
    
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
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

  public static DisplayDocumentPrevDtoBuilder builder() {
    return new DisplayDocumentPrevDtoBuilder();
  }

  public static class DisplayDocumentPrevDtoBuilder {

    private Date startAt = null;
    private Date endAt = null;
    private Long documentId = null;
    

    DisplayDocumentPrevDtoBuilder() {
    }

    /**
     **/
    public DisplayDocumentPrevDtoBuilder startAt(Date startAt) {
      this.startAt = startAt;
      return this;
    }

    /**
     **/
    public DisplayDocumentPrevDtoBuilder endAt(Date endAt) {
      this.endAt = endAt;
      return this;
    }

    /**
     **/
    public DisplayDocumentPrevDtoBuilder documentId(Long documentId) {
      this.documentId = documentId;
      return this;
    }


    public DisplayDocumentPrevDto build() {
      DisplayDocumentPrevDto displayDocumentPrevDto = new DisplayDocumentPrevDto();
      displayDocumentPrevDto.setStartAt(this.startAt);
      displayDocumentPrevDto.setEndAt(this.endAt);
      displayDocumentPrevDto.setDocumentId(this.documentId);
      return displayDocumentPrevDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayDocumentPrevDtoBuilder {\n");
      
      sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
      sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
      sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
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

