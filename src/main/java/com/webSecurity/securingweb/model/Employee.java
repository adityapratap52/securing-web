package com.webSecurity.securingweb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
    private final String userId;
    private String jobTitleName;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;

    public Employee(@JsonProperty("userId") String userId, @JsonProperty("jobTitleName") String jobTitleName,
                    @JsonProperty("firstName") String firstName, @JsonProperty("lastName") String lastName,
                    @JsonProperty("phoneNumber")String phoneNumber, @JsonProperty("emailAddress") String emailAddress) {
        this.userId = userId;
        this.jobTitleName = jobTitleName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getUserId() {
        return userId;
    }

    public String getJobTitleName() {
        return jobTitleName;
    }

    public void setJobTitleName(String jobTitleName) { this.jobTitleName = jobTitleName; }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }
}
