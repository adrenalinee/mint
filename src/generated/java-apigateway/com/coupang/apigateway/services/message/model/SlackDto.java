package com.coupang.apigateway.services.message.model;

import java.util.Objects;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.171+09:00")
public class SlackDto   {
  
  private String teamName = null;
  private Date sentAt = null;
  private String message = null;
  private String identifier = null;
  private Boolean channelMessage = null;
  private String channel = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("teamName")
  @com.fasterxml.jackson.annotation.JsonProperty("teamName")
  public String getTeamName() {
    return teamName;
  }
  
  /**
   **/
  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("sentAt")
  @com.fasterxml.jackson.annotation.JsonProperty("sentAt")
  public Date getSentAt() {
    return sentAt;
  }
  
  /**
   **/
  public void setSentAt(Date sentAt) {
    this.sentAt = sentAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("message")
  @com.fasterxml.jackson.annotation.JsonProperty("message")
  public String getMessage() {
    return message;
  }
  
  /**
   **/
  public void setMessage(String message) {
    this.message = message;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("identifier")
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }
  
  /**
   **/
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("channelMessage")
  @com.fasterxml.jackson.annotation.JsonProperty("channelMessage")
  public Boolean getChannelMessage() {
    return channelMessage;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isChannelMessage() {
    return channelMessage == null ? false : channelMessage;
  }
  
  /**
   **/
  public void setChannelMessage(Boolean channelMessage) {
    this.channelMessage = channelMessage;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("channel")
  @com.fasterxml.jackson.annotation.JsonProperty("channel")
  public String getChannel() {
    return channel;
  }
  
  /**
   **/
  public void setChannel(String channel) {
    this.channel = channel;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlackDto slackDto = (SlackDto) o;
    return Objects.equals(this.teamName, slackDto.teamName) &&
        Objects.equals(this.sentAt, slackDto.sentAt) &&
        Objects.equals(this.message, slackDto.message) &&
        Objects.equals(this.identifier, slackDto.identifier) &&
        Objects.equals(this.channelMessage, slackDto.channelMessage) &&
        Objects.equals(this.channel, slackDto.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamName, sentAt, message, identifier, channelMessage, channel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlackDto {\n");
    
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
    sb.append("    sentAt: ").append(toIndentedString(sentAt)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    channelMessage: ").append(toIndentedString(channelMessage)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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

  public static SlackDtoBuilder builder() {
    return new SlackDtoBuilder();
  }

  public static class SlackDtoBuilder {

    private String teamName = null;
    private Date sentAt = null;
    private String message = null;
    private String identifier = null;
    private Boolean channelMessage = null;
    private String channel = null;
    

    SlackDtoBuilder() {
    }

    /**
     **/
    public SlackDtoBuilder teamName(String teamName) {
      this.teamName = teamName;
      return this;
    }

    /**
     **/
    public SlackDtoBuilder sentAt(Date sentAt) {
      this.sentAt = sentAt;
      return this;
    }

    /**
     **/
    public SlackDtoBuilder message(String message) {
      this.message = message;
      return this;
    }

    /**
     **/
    public SlackDtoBuilder identifier(String identifier) {
      this.identifier = identifier;
      return this;
    }

    /**
     **/
    public SlackDtoBuilder channelMessage(Boolean channelMessage) {
      this.channelMessage = channelMessage;
      return this;
    }

    /**
     **/
    public SlackDtoBuilder channel(String channel) {
      this.channel = channel;
      return this;
    }


    public SlackDto build() {
      SlackDto slackDto = new SlackDto();
      slackDto.setTeamName(this.teamName);
      slackDto.setSentAt(this.sentAt);
      slackDto.setMessage(this.message);
      slackDto.setIdentifier(this.identifier);
      slackDto.setChannelMessage(this.channelMessage);
      slackDto.setChannel(this.channel);
      return slackDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SlackDtoBuilder {\n");
      
      sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
      sb.append("    sentAt: ").append(toIndentedString(sentAt)).append("\n");
      sb.append("    message: ").append(toIndentedString(message)).append("\n");
      sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
      sb.append("    channelMessage: ").append(toIndentedString(channelMessage)).append("\n");
      sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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

