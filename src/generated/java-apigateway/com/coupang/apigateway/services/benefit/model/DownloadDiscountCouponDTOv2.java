package com.coupang.apigateway.services.benefit.model;

import java.util.Objects;
import com.coupang.apigateway.services.benefit.model.DownloadSourceDTOv2;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.660+09:00")
public class DownloadDiscountCouponDTOv2   {
  
  private String updatedAt = null;


  public enum StatusEnum {
    RESERVED("RESERVED"),
    AVAILABLE("AVAILABLE"),
    USED("USED"),
    DISABLED("DISABLED"),
    DISUSE("DISUSE"),
    CANCEL("CANCEL"),
    ROLLBACK("ROLLBACK");

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
  private String startAt = null;
  private DownloadSourceDTOv2 source = null;
  private Long memberId = null;
  private Long id = null;
  private String endAt = null;
  private String createdAt = null;
  private Boolean autoPublished = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("updatedAt")
  @com.fasterxml.jackson.annotation.JsonProperty("updatedAt")
  public String getUpdatedAt() {
    return updatedAt;
  }
  
  /**
   **/
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
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
  @org.codehaus.jackson.annotate.JsonProperty("startAt")
  @com.fasterxml.jackson.annotation.JsonProperty("startAt")
  public String getStartAt() {
    return startAt;
  }
  
  /**
   **/
  public void setStartAt(String startAt) {
    this.startAt = startAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("source")
  @com.fasterxml.jackson.annotation.JsonProperty("source")
  public DownloadSourceDTOv2 getSource() {
    return source;
  }
  
  /**
   **/
  public void setSource(DownloadSourceDTOv2 source) {
    this.source = source;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("memberId")
  @com.fasterxml.jackson.annotation.JsonProperty("memberId")
  public Long getMemberId() {
    return memberId;
  }
  
  /**
   **/
  public void setMemberId(Long memberId) {
    this.memberId = memberId;
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
  @org.codehaus.jackson.annotate.JsonProperty("endAt")
  @com.fasterxml.jackson.annotation.JsonProperty("endAt")
  public String getEndAt() {
    return endAt;
  }
  
  /**
   **/
  public void setEndAt(String endAt) {
    this.endAt = endAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("createdAt")
  @com.fasterxml.jackson.annotation.JsonProperty("createdAt")
  public String getCreatedAt() {
    return createdAt;
  }
  
  /**
   **/
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("autoPublished")
  @com.fasterxml.jackson.annotation.JsonProperty("autoPublished")
  public Boolean getAutoPublished() {
    return autoPublished;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isAutoPublished() {
    return autoPublished == null ? false : autoPublished;
  }
  
  /**
   **/
  public void setAutoPublished(Boolean autoPublished) {
    this.autoPublished = autoPublished;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadDiscountCouponDTOv2 downloadDiscountCouponDTOv2 = (DownloadDiscountCouponDTOv2) o;
    return Objects.equals(this.updatedAt, downloadDiscountCouponDTOv2.updatedAt) &&
        Objects.equals(this.status, downloadDiscountCouponDTOv2.status) &&
        Objects.equals(this.startAt, downloadDiscountCouponDTOv2.startAt) &&
        Objects.equals(this.source, downloadDiscountCouponDTOv2.source) &&
        Objects.equals(this.memberId, downloadDiscountCouponDTOv2.memberId) &&
        Objects.equals(this.id, downloadDiscountCouponDTOv2.id) &&
        Objects.equals(this.endAt, downloadDiscountCouponDTOv2.endAt) &&
        Objects.equals(this.createdAt, downloadDiscountCouponDTOv2.createdAt) &&
        Objects.equals(this.autoPublished, downloadDiscountCouponDTOv2.autoPublished);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updatedAt, status, startAt, source, memberId, id, endAt, createdAt, autoPublished);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadDiscountCouponDTOv2 {\n");
    
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    autoPublished: ").append(toIndentedString(autoPublished)).append("\n");
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

  public static DownloadDiscountCouponDTOv2Builder builder() {
    return new DownloadDiscountCouponDTOv2Builder();
  }

  public static class DownloadDiscountCouponDTOv2Builder {

    private String updatedAt = null;
    private StatusEnum status = null;
    private String startAt = null;
    private DownloadSourceDTOv2 source = null;
    private Long memberId = null;
    private Long id = null;
    private String endAt = null;
    private String createdAt = null;
    private Boolean autoPublished = null;
    

    DownloadDiscountCouponDTOv2Builder() {
    }

    /**
     **/
    public DownloadDiscountCouponDTOv2Builder updatedAt(String updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     **/
    public DownloadDiscountCouponDTOv2Builder status(StatusEnum status) {
      this.status = status;
      return this;
    }

    /**
     **/
    public DownloadDiscountCouponDTOv2Builder startAt(String startAt) {
      this.startAt = startAt;
      return this;
    }

    /**
     **/
    public DownloadDiscountCouponDTOv2Builder source(DownloadSourceDTOv2 source) {
      this.source = source;
      return this;
    }

    /**
     **/
    public DownloadDiscountCouponDTOv2Builder memberId(Long memberId) {
      this.memberId = memberId;
      return this;
    }

    /**
     **/
    public DownloadDiscountCouponDTOv2Builder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public DownloadDiscountCouponDTOv2Builder endAt(String endAt) {
      this.endAt = endAt;
      return this;
    }

    /**
     **/
    public DownloadDiscountCouponDTOv2Builder createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     **/
    public DownloadDiscountCouponDTOv2Builder autoPublished(Boolean autoPublished) {
      this.autoPublished = autoPublished;
      return this;
    }


    public DownloadDiscountCouponDTOv2 build() {
      DownloadDiscountCouponDTOv2 downloadDiscountCouponDTOv2 = new DownloadDiscountCouponDTOv2();
      downloadDiscountCouponDTOv2.setUpdatedAt(this.updatedAt);
      downloadDiscountCouponDTOv2.setStatus(this.status);
      downloadDiscountCouponDTOv2.setStartAt(this.startAt);
      downloadDiscountCouponDTOv2.setSource(this.source);
      downloadDiscountCouponDTOv2.setMemberId(this.memberId);
      downloadDiscountCouponDTOv2.setId(this.id);
      downloadDiscountCouponDTOv2.setEndAt(this.endAt);
      downloadDiscountCouponDTOv2.setCreatedAt(this.createdAt);
      downloadDiscountCouponDTOv2.setAutoPublished(this.autoPublished);
      return downloadDiscountCouponDTOv2;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DownloadDiscountCouponDTOv2Builder {\n");
      
      sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
      sb.append("    status: ").append(toIndentedString(status)).append("\n");
      sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
      sb.append("    source: ").append(toIndentedString(source)).append("\n");
      sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
      sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
      sb.append("    autoPublished: ").append(toIndentedString(autoPublished)).append("\n");
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

