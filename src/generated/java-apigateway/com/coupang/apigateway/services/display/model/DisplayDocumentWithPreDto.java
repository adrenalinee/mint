package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import com.coupang.apigateway.services.display.model.DisplayDocumentPrevDto;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayDocumentWithPreDto   {
  
  private Date startAt = null;
  private DisplayDocumentPrevDto prevDto = null;
  private Date endAt = null;


  public enum DocumentTypeEnum {
    HTML("HTML"),
    INPUT("INPUT"),
    TEXT("TEXT"),
    CSS("CSS"),
    JSON("JSON"),
    BOOLEAN("BOOLEAN");

    private String value;

    DocumentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private DocumentTypeEnum documentType = null;
  private Long documentId = null;
  private String documentContent = null;
  private String documentCode = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("prevDto")
  @com.fasterxml.jackson.annotation.JsonProperty("prevDto")
  public DisplayDocumentPrevDto getPrevDto() {
    return prevDto;
  }
  
  /**
   **/
  public void setPrevDto(DisplayDocumentPrevDto prevDto) {
    this.prevDto = prevDto;
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
  @org.codehaus.jackson.annotate.JsonProperty("documentType")
  @com.fasterxml.jackson.annotation.JsonProperty("documentType")
  public DocumentTypeEnum getDocumentType() {
    return documentType;
  }
  
  /**
   **/
  public void setDocumentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
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
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("documentContent")
  @com.fasterxml.jackson.annotation.JsonProperty("documentContent")
  public String getDocumentContent() {
    return documentContent;
  }
  
  /**
   **/
  public void setDocumentContent(String documentContent) {
    this.documentContent = documentContent;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("documentCode")
  @com.fasterxml.jackson.annotation.JsonProperty("documentCode")
  public String getDocumentCode() {
    return documentCode;
  }
  
  /**
   **/
  public void setDocumentCode(String documentCode) {
    this.documentCode = documentCode;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayDocumentWithPreDto displayDocumentWithPreDto = (DisplayDocumentWithPreDto) o;
    return Objects.equals(this.startAt, displayDocumentWithPreDto.startAt) &&
        Objects.equals(this.prevDto, displayDocumentWithPreDto.prevDto) &&
        Objects.equals(this.endAt, displayDocumentWithPreDto.endAt) &&
        Objects.equals(this.documentType, displayDocumentWithPreDto.documentType) &&
        Objects.equals(this.documentId, displayDocumentWithPreDto.documentId) &&
        Objects.equals(this.documentContent, displayDocumentWithPreDto.documentContent) &&
        Objects.equals(this.documentCode, displayDocumentWithPreDto.documentCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startAt, prevDto, endAt, documentType, documentId, documentContent, documentCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayDocumentWithPreDto {\n");
    
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    prevDto: ").append(toIndentedString(prevDto)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentContent: ").append(toIndentedString(documentContent)).append("\n");
    sb.append("    documentCode: ").append(toIndentedString(documentCode)).append("\n");
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

  public static DisplayDocumentWithPreDtoBuilder builder() {
    return new DisplayDocumentWithPreDtoBuilder();
  }

  public static class DisplayDocumentWithPreDtoBuilder {

    private Date startAt = null;
    private DisplayDocumentPrevDto prevDto = null;
    private Date endAt = null;
    private DocumentTypeEnum documentType = null;
    private Long documentId = null;
    private String documentContent = null;
    private String documentCode = null;
    

    DisplayDocumentWithPreDtoBuilder() {
    }

    /**
     **/
    public DisplayDocumentWithPreDtoBuilder startAt(Date startAt) {
      this.startAt = startAt;
      return this;
    }

    /**
     **/
    public DisplayDocumentWithPreDtoBuilder prevDto(DisplayDocumentPrevDto prevDto) {
      this.prevDto = prevDto;
      return this;
    }

    /**
     **/
    public DisplayDocumentWithPreDtoBuilder endAt(Date endAt) {
      this.endAt = endAt;
      return this;
    }

    /**
     **/
    public DisplayDocumentWithPreDtoBuilder documentType(DocumentTypeEnum documentType) {
      this.documentType = documentType;
      return this;
    }

    /**
     **/
    public DisplayDocumentWithPreDtoBuilder documentId(Long documentId) {
      this.documentId = documentId;
      return this;
    }

    /**
     **/
    public DisplayDocumentWithPreDtoBuilder documentContent(String documentContent) {
      this.documentContent = documentContent;
      return this;
    }

    /**
     **/
    public DisplayDocumentWithPreDtoBuilder documentCode(String documentCode) {
      this.documentCode = documentCode;
      return this;
    }


    public DisplayDocumentWithPreDto build() {
      DisplayDocumentWithPreDto displayDocumentWithPreDto = new DisplayDocumentWithPreDto();
      displayDocumentWithPreDto.setStartAt(this.startAt);
      displayDocumentWithPreDto.setPrevDto(this.prevDto);
      displayDocumentWithPreDto.setEndAt(this.endAt);
      displayDocumentWithPreDto.setDocumentType(this.documentType);
      displayDocumentWithPreDto.setDocumentId(this.documentId);
      displayDocumentWithPreDto.setDocumentContent(this.documentContent);
      displayDocumentWithPreDto.setDocumentCode(this.documentCode);
      return displayDocumentWithPreDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayDocumentWithPreDtoBuilder {\n");
      
      sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
      sb.append("    prevDto: ").append(toIndentedString(prevDto)).append("\n");
      sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
      sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
      sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
      sb.append("    documentContent: ").append(toIndentedString(documentContent)).append("\n");
      sb.append("    documentCode: ").append(toIndentedString(documentCode)).append("\n");
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

