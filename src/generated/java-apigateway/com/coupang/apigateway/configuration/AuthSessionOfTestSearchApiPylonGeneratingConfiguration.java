package com.coupang.apigateway.configuration;

@javax.annotation.Generated(value = "", date = "")
@org.springframework.stereotype.Component
public class AuthSessionOfTestSearchApiPylonGeneratingConfiguration implements com.coupang.apigateway.pylon.configuration.generated.BuildConfiguration {
    private final String configurationFilePath;
    private final String pylonVersion;

    public AuthSessionOfTestSearchApiPylonGeneratingConfiguration() {
        this.configurationFilePath = "auth_session_of_test-search-api_configuration.json";
        this.pylonVersion = "1.3.5.RELEASE";
    }

    public String getProjectName() {
        return "test-search-api";
    }

    public String getPylonVersion() {
        return this.pylonVersion;
    }

    public String getConfigurationFilePath() {
        return configurationFilePath;
    }
}
