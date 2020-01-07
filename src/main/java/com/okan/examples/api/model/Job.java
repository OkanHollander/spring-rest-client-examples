package com.okan.examples.api.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Author:   Okan Hollander
 * Date:     07/01/2020
 * Time:     11:08
 */
public class Job implements Serializable {

    private String title;
    private String company;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
