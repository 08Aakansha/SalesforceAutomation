package com.example;
import static io.restassured.RestAssured.*;

public class EstablishSalesforceConnection
{
    public String establishConnection()
    {
        return
        given().urlEncodingEnabled(true)
        .param("username", "08aakansha@gmail.com")
        .param("password", "@rimmi6GMyzUXRbB3B2GdO2DVInqJp")
        .param("client_id", "3MVG9fe4g9fhX0E6gJ2BTmtBsxz1WAIXEEe2xHIFjJxwW67m8pDUjLeOWK7X7_s0KRlm0uoSf6Y9d.pjqhHMe")
        .param("client_secret", "94989410C58FD0022DA3A1BBFE766FFF92C7F48739A539B63FA4E47770B351AA")
        .param("grant_type", "password")
        .header("Accept", "application/json")
        .when().
        post("https://login.salesforce.com/services/oauth2/token").
        then().
        assertThat().statusCode(200).log().body().extract().path("access_token");

    }
}
