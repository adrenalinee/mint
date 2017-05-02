package com.coupang.apigateway.services.auth_session.model;

import java.util.Objects;
import com.coupang.apigateway.services.auth_session.model.CookieInfo;
import com.coupang.apigateway.services.auth_session.model.MemberInfo;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.932+09:00")
public class AuthenticationResult   {
  
  private MemberInfo memberInfo = null;
  private String loginIp = null;
  private Boolean login = null;
  private List<CookieInfo> cookieInfos = new ArrayList<CookieInfo>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("memberInfo")
  @com.fasterxml.jackson.annotation.JsonProperty("memberInfo")
  public MemberInfo getMemberInfo() {
    return memberInfo;
  }
  
  /**
   **/
  public void setMemberInfo(MemberInfo memberInfo) {
    this.memberInfo = memberInfo;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("loginIp")
  @com.fasterxml.jackson.annotation.JsonProperty("loginIp")
  public String getLoginIp() {
    return loginIp;
  }
  
  /**
   **/
  public void setLoginIp(String loginIp) {
    this.loginIp = loginIp;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("login")
  @com.fasterxml.jackson.annotation.JsonProperty("login")
  public Boolean getLogin() {
    return login;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isLogin() {
    return login == null ? false : login;
  }
  
  /**
   **/
  public void setLogin(Boolean login) {
    this.login = login;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("cookieInfos")
  @com.fasterxml.jackson.annotation.JsonProperty("cookieInfos")
  public List<CookieInfo> getCookieInfos() {
    return cookieInfos;
  }
  
  /**
   **/
  public void setCookieInfos(List<CookieInfo> cookieInfos) {
    this.cookieInfos = cookieInfos;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationResult authenticationResult = (AuthenticationResult) o;
    return Objects.equals(this.memberInfo, authenticationResult.memberInfo) &&
        Objects.equals(this.loginIp, authenticationResult.loginIp) &&
        Objects.equals(this.login, authenticationResult.login) &&
        Objects.equals(this.cookieInfos, authenticationResult.cookieInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberInfo, loginIp, login, cookieInfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationResult {\n");
    
    sb.append("    memberInfo: ").append(toIndentedString(memberInfo)).append("\n");
    sb.append("    loginIp: ").append(toIndentedString(loginIp)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    cookieInfos: ").append(toIndentedString(cookieInfos)).append("\n");
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

  public static AuthenticationResultBuilder builder() {
    return new AuthenticationResultBuilder();
  }

  public static class AuthenticationResultBuilder {

    private MemberInfo memberInfo = null;
    private String loginIp = null;
    private Boolean login = null;
    private List<CookieInfo> cookieInfos = new ArrayList<CookieInfo>();
    

    AuthenticationResultBuilder() {
    }

    /**
     **/
    public AuthenticationResultBuilder memberInfo(MemberInfo memberInfo) {
      this.memberInfo = memberInfo;
      return this;
    }

    /**
     **/
    public AuthenticationResultBuilder loginIp(String loginIp) {
      this.loginIp = loginIp;
      return this;
    }

    /**
     **/
    public AuthenticationResultBuilder login(Boolean login) {
      this.login = login;
      return this;
    }

    /**
     **/
    public AuthenticationResultBuilder cookieInfos(List<CookieInfo> cookieInfos) {
      this.cookieInfos = cookieInfos;
      return this;
    }


    public AuthenticationResult build() {
      AuthenticationResult authenticationResult = new AuthenticationResult();
      authenticationResult.setMemberInfo(this.memberInfo);
      authenticationResult.setLoginIp(this.loginIp);
      authenticationResult.setLogin(this.login);
      authenticationResult.setCookieInfos(this.cookieInfos);
      return authenticationResult;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AuthenticationResultBuilder {\n");
      
      sb.append("    memberInfo: ").append(toIndentedString(memberInfo)).append("\n");
      sb.append("    loginIp: ").append(toIndentedString(loginIp)).append("\n");
      sb.append("    login: ").append(toIndentedString(login)).append("\n");
      sb.append("    cookieInfos: ").append(toIndentedString(cookieInfos)).append("\n");
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

