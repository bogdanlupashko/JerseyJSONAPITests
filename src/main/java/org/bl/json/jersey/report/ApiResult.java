package org.bl.json.jersey.report;

/**
 * @author Bogdan Lupashko
 */

public class ApiResult {
    private String docLink;
    private String description;
    private String responseJson;

    public String getDocLink() {
        return docLink;
    }

    public void setDocLink(String docLink) {
        this.docLink = docLink;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResponseJson() {
        return responseJson;
    }

    public void setResponseJson(String responseJson) {
        this.responseJson = responseJson;
    }

}
