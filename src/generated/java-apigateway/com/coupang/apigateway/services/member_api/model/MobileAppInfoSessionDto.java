package com.coupang.apigateway.services.member_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.member_api.model.BasisMemberDTO;
import com.coupang.apigateway.services.member_api.model.MobileAppInfoDto;
import com.coupang.apigateway.services.member_api.model.SessionInfoDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.419+09:00")
public class MobileAppInfoSessionDto   {
  
  private SessionInfoDto sessionInfoDto = null;
  private MobileAppInfoDto mobileAppInfoDto = null;
  private BasisMemberDTO basisMemberDTO = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("sessionInfoDto")
  @com.fasterxml.jackson.annotation.JsonProperty("sessionInfoDto")
  public SessionInfoDto getSessionInfoDto() {
    return sessionInfoDto;
  }
  
  /**
   **/
  public void setSessionInfoDto(SessionInfoDto sessionInfoDto) {
    this.sessionInfoDto = sessionInfoDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("mobileAppInfoDto")
  @com.fasterxml.jackson.annotation.JsonProperty("mobileAppInfoDto")
  public MobileAppInfoDto getMobileAppInfoDto() {
    return mobileAppInfoDto;
  }
  
  /**
   **/
  public void setMobileAppInfoDto(MobileAppInfoDto mobileAppInfoDto) {
    this.mobileAppInfoDto = mobileAppInfoDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("basisMemberDTO")
  @com.fasterxml.jackson.annotation.JsonProperty("basisMemberDTO")
  public BasisMemberDTO getBasisMemberDTO() {
    return basisMemberDTO;
  }
  
  /**
   **/
  public void setBasisMemberDTO(BasisMemberDTO basisMemberDTO) {
    this.basisMemberDTO = basisMemberDTO;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileAppInfoSessionDto mobileAppInfoSessionDto = (MobileAppInfoSessionDto) o;
    return Objects.equals(this.sessionInfoDto, mobileAppInfoSessionDto.sessionInfoDto) &&
        Objects.equals(this.mobileAppInfoDto, mobileAppInfoSessionDto.mobileAppInfoDto) &&
        Objects.equals(this.basisMemberDTO, mobileAppInfoSessionDto.basisMemberDTO);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionInfoDto, mobileAppInfoDto, basisMemberDTO);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileAppInfoSessionDto {\n");
    
    sb.append("    sessionInfoDto: ").append(toIndentedString(sessionInfoDto)).append("\n");
    sb.append("    mobileAppInfoDto: ").append(toIndentedString(mobileAppInfoDto)).append("\n");
    sb.append("    basisMemberDTO: ").append(toIndentedString(basisMemberDTO)).append("\n");
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

  public static MobileAppInfoSessionDtoBuilder builder() {
    return new MobileAppInfoSessionDtoBuilder();
  }

  public static class MobileAppInfoSessionDtoBuilder {

    private SessionInfoDto sessionInfoDto = null;
    private MobileAppInfoDto mobileAppInfoDto = null;
    private BasisMemberDTO basisMemberDTO = null;
    

    MobileAppInfoSessionDtoBuilder() {
    }

    /**
     **/
    public MobileAppInfoSessionDtoBuilder sessionInfoDto(SessionInfoDto sessionInfoDto) {
      this.sessionInfoDto = sessionInfoDto;
      return this;
    }

    /**
     **/
    public MobileAppInfoSessionDtoBuilder mobileAppInfoDto(MobileAppInfoDto mobileAppInfoDto) {
      this.mobileAppInfoDto = mobileAppInfoDto;
      return this;
    }

    /**
     **/
    public MobileAppInfoSessionDtoBuilder basisMemberDTO(BasisMemberDTO basisMemberDTO) {
      this.basisMemberDTO = basisMemberDTO;
      return this;
    }


    public MobileAppInfoSessionDto build() {
      MobileAppInfoSessionDto mobileAppInfoSessionDto = new MobileAppInfoSessionDto();
      mobileAppInfoSessionDto.setSessionInfoDto(this.sessionInfoDto);
      mobileAppInfoSessionDto.setMobileAppInfoDto(this.mobileAppInfoDto);
      mobileAppInfoSessionDto.setBasisMemberDTO(this.basisMemberDTO);
      return mobileAppInfoSessionDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MobileAppInfoSessionDtoBuilder {\n");
      
      sb.append("    sessionInfoDto: ").append(toIndentedString(sessionInfoDto)).append("\n");
      sb.append("    mobileAppInfoDto: ").append(toIndentedString(mobileAppInfoDto)).append("\n");
      sb.append("    basisMemberDTO: ").append(toIndentedString(basisMemberDTO)).append("\n");
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

