package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.BlockMemberMessageDto;
import java.util.*;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class BlockMemberDto   {
  
  private String recovererName = null;
  private String recovererId = null;
  private Date recoveredDate = null;
  private Boolean recovered = null;
  private String reason = null;
  private String modifiedBy = null;
  private Date modifiedAt = null;
  private List<BlockMemberMessageDto> messages = new ArrayList<BlockMemberMessageDto>();
  private String memberId = null;
  private String createdBy = null;
  private Date createdAt = null;
  private String clause = null;
  private String blockerName = null;
  private String blockerId = null;


  public enum BlockStatusEnum {
    NON_INFO("NON_INFO"),
    BLOCKED("BLOCKED"),
    RECOVERED("RECOVERED");

    private String value;

    BlockStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private BlockStatusEnum blockStatus = null;
  private String blockPeriod = null;


  public enum BlockLevelDtoEnum {
    LEVEL_1("LEVEL_1"),
    LEVEL_2("LEVEL_2"),
    LEVEL_3("LEVEL_3");

    private String value;

    BlockLevelDtoEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private BlockLevelDtoEnum blockLevelDto = null;
  private String blockLevel = null;
  private Date blockDate = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("recovererName")
  @com.fasterxml.jackson.annotation.JsonProperty("recovererName")
  public String getRecovererName() {
    return recovererName;
  }
  
  /**
   **/
  public void setRecovererName(String recovererName) {
    this.recovererName = recovererName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("recovererId")
  @com.fasterxml.jackson.annotation.JsonProperty("recovererId")
  public String getRecovererId() {
    return recovererId;
  }
  
  /**
   **/
  public void setRecovererId(String recovererId) {
    this.recovererId = recovererId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("recoveredDate")
  @com.fasterxml.jackson.annotation.JsonProperty("recoveredDate")
  public Date getRecoveredDate() {
    return recoveredDate;
  }
  
  /**
   **/
  public void setRecoveredDate(Date recoveredDate) {
    this.recoveredDate = recoveredDate;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("recovered")
  @com.fasterxml.jackson.annotation.JsonProperty("recovered")
  public Boolean getRecovered() {
    return recovered;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isRecovered() {
    return recovered == null ? false : recovered;
  }
  
  /**
   **/
  public void setRecovered(Boolean recovered) {
    this.recovered = recovered;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reason")
  @com.fasterxml.jackson.annotation.JsonProperty("reason")
  public String getReason() {
    return reason;
  }
  
  /**
   **/
  public void setReason(String reason) {
    this.reason = reason;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("modifiedBy")
  @com.fasterxml.jackson.annotation.JsonProperty("modifiedBy")
  public String getModifiedBy() {
    return modifiedBy;
  }
  
  /**
   **/
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("modifiedAt")
  @com.fasterxml.jackson.annotation.JsonProperty("modifiedAt")
  public Date getModifiedAt() {
    return modifiedAt;
  }
  
  /**
   **/
  public void setModifiedAt(Date modifiedAt) {
    this.modifiedAt = modifiedAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("messages")
  @com.fasterxml.jackson.annotation.JsonProperty("messages")
  public List<BlockMemberMessageDto> getMessages() {
    return messages;
  }
  
  /**
   **/
  public void setMessages(List<BlockMemberMessageDto> messages) {
    this.messages = messages;
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
  public Date getCreatedAt() {
    return createdAt;
  }
  
  /**
   **/
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("clause")
  @com.fasterxml.jackson.annotation.JsonProperty("clause")
  public String getClause() {
    return clause;
  }
  
  /**
   **/
  public void setClause(String clause) {
    this.clause = clause;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("blockerName")
  @com.fasterxml.jackson.annotation.JsonProperty("blockerName")
  public String getBlockerName() {
    return blockerName;
  }
  
  /**
   **/
  public void setBlockerName(String blockerName) {
    this.blockerName = blockerName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("blockerId")
  @com.fasterxml.jackson.annotation.JsonProperty("blockerId")
  public String getBlockerId() {
    return blockerId;
  }
  
  /**
   **/
  public void setBlockerId(String blockerId) {
    this.blockerId = blockerId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("blockStatus")
  @com.fasterxml.jackson.annotation.JsonProperty("blockStatus")
  public BlockStatusEnum getBlockStatus() {
    return blockStatus;
  }
  
  /**
   **/
  public void setBlockStatus(BlockStatusEnum blockStatus) {
    this.blockStatus = blockStatus;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("blockPeriod")
  @com.fasterxml.jackson.annotation.JsonProperty("blockPeriod")
  public String getBlockPeriod() {
    return blockPeriod;
  }
  
  /**
   **/
  public void setBlockPeriod(String blockPeriod) {
    this.blockPeriod = blockPeriod;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("blockLevelDto")
  @com.fasterxml.jackson.annotation.JsonProperty("blockLevelDto")
  public BlockLevelDtoEnum getBlockLevelDto() {
    return blockLevelDto;
  }
  
  /**
   **/
  public void setBlockLevelDto(BlockLevelDtoEnum blockLevelDto) {
    this.blockLevelDto = blockLevelDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("blockLevel")
  @com.fasterxml.jackson.annotation.JsonProperty("blockLevel")
  public String getBlockLevel() {
    return blockLevel;
  }
  
  /**
   **/
  public void setBlockLevel(String blockLevel) {
    this.blockLevel = blockLevel;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("blockDate")
  @com.fasterxml.jackson.annotation.JsonProperty("blockDate")
  public Date getBlockDate() {
    return blockDate;
  }
  
  /**
   **/
  public void setBlockDate(Date blockDate) {
    this.blockDate = blockDate;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockMemberDto blockMemberDto = (BlockMemberDto) o;
    return Objects.equals(this.recovererName, blockMemberDto.recovererName) &&
        Objects.equals(this.recovererId, blockMemberDto.recovererId) &&
        Objects.equals(this.recoveredDate, blockMemberDto.recoveredDate) &&
        Objects.equals(this.recovered, blockMemberDto.recovered) &&
        Objects.equals(this.reason, blockMemberDto.reason) &&
        Objects.equals(this.modifiedBy, blockMemberDto.modifiedBy) &&
        Objects.equals(this.modifiedAt, blockMemberDto.modifiedAt) &&
        Objects.equals(this.messages, blockMemberDto.messages) &&
        Objects.equals(this.memberId, blockMemberDto.memberId) &&
        Objects.equals(this.createdBy, blockMemberDto.createdBy) &&
        Objects.equals(this.createdAt, blockMemberDto.createdAt) &&
        Objects.equals(this.clause, blockMemberDto.clause) &&
        Objects.equals(this.blockerName, blockMemberDto.blockerName) &&
        Objects.equals(this.blockerId, blockMemberDto.blockerId) &&
        Objects.equals(this.blockStatus, blockMemberDto.blockStatus) &&
        Objects.equals(this.blockPeriod, blockMemberDto.blockPeriod) &&
        Objects.equals(this.blockLevelDto, blockMemberDto.blockLevelDto) &&
        Objects.equals(this.blockLevel, blockMemberDto.blockLevel) &&
        Objects.equals(this.blockDate, blockMemberDto.blockDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recovererName, recovererId, recoveredDate, recovered, reason, modifiedBy, modifiedAt, messages, memberId, createdBy, createdAt, clause, blockerName, blockerId, blockStatus, blockPeriod, blockLevelDto, blockLevel, blockDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockMemberDto {\n");
    
    sb.append("    recovererName: ").append(toIndentedString(recovererName)).append("\n");
    sb.append("    recovererId: ").append(toIndentedString(recovererId)).append("\n");
    sb.append("    recoveredDate: ").append(toIndentedString(recoveredDate)).append("\n");
    sb.append("    recovered: ").append(toIndentedString(recovered)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    clause: ").append(toIndentedString(clause)).append("\n");
    sb.append("    blockerName: ").append(toIndentedString(blockerName)).append("\n");
    sb.append("    blockerId: ").append(toIndentedString(blockerId)).append("\n");
    sb.append("    blockStatus: ").append(toIndentedString(blockStatus)).append("\n");
    sb.append("    blockPeriod: ").append(toIndentedString(blockPeriod)).append("\n");
    sb.append("    blockLevelDto: ").append(toIndentedString(blockLevelDto)).append("\n");
    sb.append("    blockLevel: ").append(toIndentedString(blockLevel)).append("\n");
    sb.append("    blockDate: ").append(toIndentedString(blockDate)).append("\n");
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

  public static BlockMemberDtoBuilder builder() {
    return new BlockMemberDtoBuilder();
  }

  public static class BlockMemberDtoBuilder {

    private String recovererName = null;
    private String recovererId = null;
    private Date recoveredDate = null;
    private Boolean recovered = null;
    private String reason = null;
    private String modifiedBy = null;
    private Date modifiedAt = null;
    private List<BlockMemberMessageDto> messages = new ArrayList<BlockMemberMessageDto>();
    private String memberId = null;
    private String createdBy = null;
    private Date createdAt = null;
    private String clause = null;
    private String blockerName = null;
    private String blockerId = null;
    private BlockStatusEnum blockStatus = null;
    private String blockPeriod = null;
    private BlockLevelDtoEnum blockLevelDto = null;
    private String blockLevel = null;
    private Date blockDate = null;
    

    BlockMemberDtoBuilder() {
    }

    /**
     **/
    public BlockMemberDtoBuilder recovererName(String recovererName) {
      this.recovererName = recovererName;
      return this;
    }

    /**
     **/
    public BlockMemberDtoBuilder recovererId(String recovererId) {
      this.recovererId = recovererId;
      return this;
    }

    /**
     **/
    public BlockMemberDtoBuilder recoveredDate(Date recoveredDate) {
      this.recoveredDate = recoveredDate;
      return this;
    }

    /**
     **/
    public BlockMemberDtoBuilder recovered(Boolean recovered) {
      this.recovered = recovered;
      return this;
    }

    /**
     **/
    public BlockMemberDtoBuilder reason(String reason) {
      this.reason = reason;
      return this;
    }

    /**
     **/
    public BlockMemberDtoBuilder modifiedBy(String modifiedBy) {
      this.modifiedBy = modifiedBy;
      return this;
    }

    /**
     **/
    public BlockMemberDtoBuilder modifiedAt(Date modifiedAt) {
      this.modifiedAt = modifiedAt;
      return this;
    }

    /**
     **/
    public BlockMemberDtoBuilder messages(List<BlockMemberMessageDto> messages) {
      this.messages = messages;
      return this;
    }

    /**
     **/
    public BlockMemberDtoBuilder memberId(String memberId) {
      this.memberId = memberId;
      return this;
    }

    /**
     **/
    public BlockMemberDtoBuilder createdBy(String createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    /**
     **/
    public BlockMemberDtoBuilder createdAt(Date createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     **/
    public BlockMemberDtoBuilder clause(String clause) {
      this.clause = clause;
      return this;
    }

    /**
     **/
    public BlockMemberDtoBuilder blockerName(String blockerName) {
      this.blockerName = blockerName;
      return this;
    }

    /**
     **/
    public BlockMemberDtoBuilder blockerId(String blockerId) {
      this.blockerId = blockerId;
      return this;
    }

    /**
     **/
    public BlockMemberDtoBuilder blockStatus(BlockStatusEnum blockStatus) {
      this.blockStatus = blockStatus;
      return this;
    }

    /**
     **/
    public BlockMemberDtoBuilder blockPeriod(String blockPeriod) {
      this.blockPeriod = blockPeriod;
      return this;
    }

    /**
     **/
    public BlockMemberDtoBuilder blockLevelDto(BlockLevelDtoEnum blockLevelDto) {
      this.blockLevelDto = blockLevelDto;
      return this;
    }

    /**
     **/
    public BlockMemberDtoBuilder blockLevel(String blockLevel) {
      this.blockLevel = blockLevel;
      return this;
    }

    /**
     **/
    public BlockMemberDtoBuilder blockDate(Date blockDate) {
      this.blockDate = blockDate;
      return this;
    }


    public BlockMemberDto build() {
      BlockMemberDto blockMemberDto = new BlockMemberDto();
      blockMemberDto.setRecovererName(this.recovererName);
      blockMemberDto.setRecovererId(this.recovererId);
      blockMemberDto.setRecoveredDate(this.recoveredDate);
      blockMemberDto.setRecovered(this.recovered);
      blockMemberDto.setReason(this.reason);
      blockMemberDto.setModifiedBy(this.modifiedBy);
      blockMemberDto.setModifiedAt(this.modifiedAt);
      blockMemberDto.setMessages(this.messages);
      blockMemberDto.setMemberId(this.memberId);
      blockMemberDto.setCreatedBy(this.createdBy);
      blockMemberDto.setCreatedAt(this.createdAt);
      blockMemberDto.setClause(this.clause);
      blockMemberDto.setBlockerName(this.blockerName);
      blockMemberDto.setBlockerId(this.blockerId);
      blockMemberDto.setBlockStatus(this.blockStatus);
      blockMemberDto.setBlockPeriod(this.blockPeriod);
      blockMemberDto.setBlockLevelDto(this.blockLevelDto);
      blockMemberDto.setBlockLevel(this.blockLevel);
      blockMemberDto.setBlockDate(this.blockDate);
      return blockMemberDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BlockMemberDtoBuilder {\n");
      
      sb.append("    recovererName: ").append(toIndentedString(recovererName)).append("\n");
      sb.append("    recovererId: ").append(toIndentedString(recovererId)).append("\n");
      sb.append("    recoveredDate: ").append(toIndentedString(recoveredDate)).append("\n");
      sb.append("    recovered: ").append(toIndentedString(recovered)).append("\n");
      sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
      sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
      sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
      sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
      sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
      sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
      sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
      sb.append("    clause: ").append(toIndentedString(clause)).append("\n");
      sb.append("    blockerName: ").append(toIndentedString(blockerName)).append("\n");
      sb.append("    blockerId: ").append(toIndentedString(blockerId)).append("\n");
      sb.append("    blockStatus: ").append(toIndentedString(blockStatus)).append("\n");
      sb.append("    blockPeriod: ").append(toIndentedString(blockPeriod)).append("\n");
      sb.append("    blockLevelDto: ").append(toIndentedString(blockLevelDto)).append("\n");
      sb.append("    blockLevel: ").append(toIndentedString(blockLevel)).append("\n");
      sb.append("    blockDate: ").append(toIndentedString(blockDate)).append("\n");
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

