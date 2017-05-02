package com.coupang.apigateway.services.promotion_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.promotion_api.model.DownloadPromotionImageDTO;
import com.coupang.apigateway.services.promotion_api.model.DownloadPromotionSourceHolderDTO;
import java.util.*;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.975+09:00")
public class DownloadPromotionDTO   {
  
  private String updatedBy = null;
  private String updatedAt = null;
  private String title = null;


  public enum StatusEnum {
    INITIALIZED("INITIALIZED"),
    WAIT_FOR_APPROVAL("WAIT_FOR_APPROVAL"),
    APPROVED("APPROVED"),
    APPROVE_FAILED("APPROVE_FAILED"),
    DISABLED("DISABLED");

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
  private List<DownloadPromotionSourceHolderDTO> sourceHolders = new ArrayList<DownloadPromotionSourceHolderDTO>();
  private Boolean manualRegistered = null;
  private Map<String, DownloadPromotionImageDTO> images = new HashMap<String, DownloadPromotionImageDTO>();
  private Long id = null;
  private String endAt = null;
  private String createdBy = null;
  private String createdAt = null;
  private String approvedBy = null;
  private String approvedAt = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("updatedBy")
  @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
  public String getUpdatedBy() {
    return updatedBy;
  }
  
  /**
   **/
  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }
  
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
  @org.codehaus.jackson.annotate.JsonProperty("title")
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  public String getTitle() {
    return title;
  }
  
  /**
   **/
  public void setTitle(String title) {
    this.title = title;
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
  @org.codehaus.jackson.annotate.JsonProperty("sourceHolders")
  @com.fasterxml.jackson.annotation.JsonProperty("sourceHolders")
  public List<DownloadPromotionSourceHolderDTO> getSourceHolders() {
    return sourceHolders;
  }
  
  /**
   **/
  public void setSourceHolders(List<DownloadPromotionSourceHolderDTO> sourceHolders) {
    this.sourceHolders = sourceHolders;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("manualRegistered")
  @com.fasterxml.jackson.annotation.JsonProperty("manualRegistered")
  public Boolean getManualRegistered() {
    return manualRegistered;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isManualRegistered() {
    return manualRegistered == null ? false : manualRegistered;
  }
  
  /**
   **/
  public void setManualRegistered(Boolean manualRegistered) {
    this.manualRegistered = manualRegistered;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("images")
  @com.fasterxml.jackson.annotation.JsonProperty("images")
  public Map<String, DownloadPromotionImageDTO> getImages() {
    return images;
  }
  
  /**
   **/
  public void setImages(Map<String, DownloadPromotionImageDTO> images) {
    this.images = images;
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
  @org.codehaus.jackson.annotate.JsonProperty("createdBy")
  @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }
  
  /**
   **/
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
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
  @org.codehaus.jackson.annotate.JsonProperty("approvedBy")
  @com.fasterxml.jackson.annotation.JsonProperty("approvedBy")
  public String getApprovedBy() {
    return approvedBy;
  }
  
  /**
   **/
  public void setApprovedBy(String approvedBy) {
    this.approvedBy = approvedBy;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("approvedAt")
  @com.fasterxml.jackson.annotation.JsonProperty("approvedAt")
  public String getApprovedAt() {
    return approvedAt;
  }
  
  /**
   **/
  public void setApprovedAt(String approvedAt) {
    this.approvedAt = approvedAt;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadPromotionDTO downloadPromotionDTO = (DownloadPromotionDTO) o;
    return Objects.equals(this.updatedBy, downloadPromotionDTO.updatedBy) &&
        Objects.equals(this.updatedAt, downloadPromotionDTO.updatedAt) &&
        Objects.equals(this.title, downloadPromotionDTO.title) &&
        Objects.equals(this.status, downloadPromotionDTO.status) &&
        Objects.equals(this.startAt, downloadPromotionDTO.startAt) &&
        Objects.equals(this.sourceHolders, downloadPromotionDTO.sourceHolders) &&
        Objects.equals(this.manualRegistered, downloadPromotionDTO.manualRegistered) &&
        Objects.equals(this.images, downloadPromotionDTO.images) &&
        Objects.equals(this.id, downloadPromotionDTO.id) &&
        Objects.equals(this.endAt, downloadPromotionDTO.endAt) &&
        Objects.equals(this.createdBy, downloadPromotionDTO.createdBy) &&
        Objects.equals(this.createdAt, downloadPromotionDTO.createdAt) &&
        Objects.equals(this.approvedBy, downloadPromotionDTO.approvedBy) &&
        Objects.equals(this.approvedAt, downloadPromotionDTO.approvedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updatedBy, updatedAt, title, status, startAt, sourceHolders, manualRegistered, images, id, endAt, createdBy, createdAt, approvedBy, approvedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadPromotionDTO {\n");
    
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    sourceHolders: ").append(toIndentedString(sourceHolders)).append("\n");
    sb.append("    manualRegistered: ").append(toIndentedString(manualRegistered)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    approvedBy: ").append(toIndentedString(approvedBy)).append("\n");
    sb.append("    approvedAt: ").append(toIndentedString(approvedAt)).append("\n");
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

  public static DownloadPromotionDTOBuilder builder() {
    return new DownloadPromotionDTOBuilder();
  }

  public static class DownloadPromotionDTOBuilder {

    private String updatedBy = null;
    private String updatedAt = null;
    private String title = null;
    private StatusEnum status = null;
    private String startAt = null;
    private List<DownloadPromotionSourceHolderDTO> sourceHolders = new ArrayList<DownloadPromotionSourceHolderDTO>();
    private Boolean manualRegistered = null;
    private Map<String, DownloadPromotionImageDTO> images = new HashMap<String, DownloadPromotionImageDTO>();
    private Long id = null;
    private String endAt = null;
    private String createdBy = null;
    private String createdAt = null;
    private String approvedBy = null;
    private String approvedAt = null;
    

    DownloadPromotionDTOBuilder() {
    }

    /**
     **/
    public DownloadPromotionDTOBuilder updatedBy(String updatedBy) {
      this.updatedBy = updatedBy;
      return this;
    }

    /**
     **/
    public DownloadPromotionDTOBuilder updatedAt(String updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     **/
    public DownloadPromotionDTOBuilder title(String title) {
      this.title = title;
      return this;
    }

    /**
     **/
    public DownloadPromotionDTOBuilder status(StatusEnum status) {
      this.status = status;
      return this;
    }

    /**
     **/
    public DownloadPromotionDTOBuilder startAt(String startAt) {
      this.startAt = startAt;
      return this;
    }

    /**
     **/
    public DownloadPromotionDTOBuilder sourceHolders(List<DownloadPromotionSourceHolderDTO> sourceHolders) {
      this.sourceHolders = sourceHolders;
      return this;
    }

    /**
     **/
    public DownloadPromotionDTOBuilder manualRegistered(Boolean manualRegistered) {
      this.manualRegistered = manualRegistered;
      return this;
    }

    /**
     **/
    public DownloadPromotionDTOBuilder images(Map<String, DownloadPromotionImageDTO> images) {
      this.images = images;
      return this;
    }

    /**
     **/
    public DownloadPromotionDTOBuilder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public DownloadPromotionDTOBuilder endAt(String endAt) {
      this.endAt = endAt;
      return this;
    }

    /**
     **/
    public DownloadPromotionDTOBuilder createdBy(String createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    /**
     **/
    public DownloadPromotionDTOBuilder createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     **/
    public DownloadPromotionDTOBuilder approvedBy(String approvedBy) {
      this.approvedBy = approvedBy;
      return this;
    }

    /**
     **/
    public DownloadPromotionDTOBuilder approvedAt(String approvedAt) {
      this.approvedAt = approvedAt;
      return this;
    }


    public DownloadPromotionDTO build() {
      DownloadPromotionDTO downloadPromotionDTO = new DownloadPromotionDTO();
      downloadPromotionDTO.setUpdatedBy(this.updatedBy);
      downloadPromotionDTO.setUpdatedAt(this.updatedAt);
      downloadPromotionDTO.setTitle(this.title);
      downloadPromotionDTO.setStatus(this.status);
      downloadPromotionDTO.setStartAt(this.startAt);
      downloadPromotionDTO.setSourceHolders(this.sourceHolders);
      downloadPromotionDTO.setManualRegistered(this.manualRegistered);
      downloadPromotionDTO.setImages(this.images);
      downloadPromotionDTO.setId(this.id);
      downloadPromotionDTO.setEndAt(this.endAt);
      downloadPromotionDTO.setCreatedBy(this.createdBy);
      downloadPromotionDTO.setCreatedAt(this.createdAt);
      downloadPromotionDTO.setApprovedBy(this.approvedBy);
      downloadPromotionDTO.setApprovedAt(this.approvedAt);
      return downloadPromotionDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DownloadPromotionDTOBuilder {\n");
      
      sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
      sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
      sb.append("    title: ").append(toIndentedString(title)).append("\n");
      sb.append("    status: ").append(toIndentedString(status)).append("\n");
      sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
      sb.append("    sourceHolders: ").append(toIndentedString(sourceHolders)).append("\n");
      sb.append("    manualRegistered: ").append(toIndentedString(manualRegistered)).append("\n");
      sb.append("    images: ").append(toIndentedString(images)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
      sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
      sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
      sb.append("    approvedBy: ").append(toIndentedString(approvedBy)).append("\n");
      sb.append("    approvedAt: ").append(toIndentedString(approvedAt)).append("\n");
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

