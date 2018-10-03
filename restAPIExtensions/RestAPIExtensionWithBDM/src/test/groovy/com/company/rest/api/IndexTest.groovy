package com.company.rest.api;

import groovy.json.JsonSlurper

import java.util.logging.Logger

import javax.servlet.http.HttpServletRequest

import org.bonitasoft.web.extension.rest.RestAPIContext;
import org.bonitasoft.web.extension.ResourceProvider
import org.bonitasoft.web.extension.rest.RestApiResponse
import org.bonitasoft.web.extension.rest.RestApiResponseBuilder

import spock.lang.Specification
    
class IndexTest extends Specification {

    def request = Mock(HttpServletRequest)
    def resourceProvider = Mock(ResourceProvider)
    def context = Mock(RestAPIContext)
    def responseBuilder = new RestApiResponseBuilder()

    def index = Spy(Index)

    def "should return a json representation as result"() {
        request.parameterNames >> (["p", "c", "newParameter1"] as Enumeration)
        request.getParameter("p") >> "aValue1"
        request.getParameter("c") >> "aValue2"
        request.getParameter("newParameter1") >> "aValue3"
        
        context.resourceProvider >> resourceProvider
        resourceProvider.getResourceAsStream("configuration.properties") >> index.class.classLoader.getResourceAsStream("configuration.properties")

        when:
        index.doHandle(request, responseBuilder, context)

        then:
        def returnedJson = new JsonSlurper().parseText(responseBuilder.build().response)
        //Assertions
        returnedJson.p == "aValue1"
        returnedJson.c == "aValue2"
        returnedJson.newParameter1 == "aValue3"
        returnedJson.hostName == "bonitasoft.com"
    }

    def "should return an error response if p is not set"() {
        request.parameterNames >> (["p", "c", "newParameter1"] as Enumeration)
        request.getParameter("p") >> null
        request.getParameter("c") >> "aValue2"
        request.getParameter("newParameter1") >> "aValue3"
        
        context.resourceProvider >> resourceProvider
        resourceProvider.getResourceAsStream("configuration.properties") >> index.class.classLoader.getResourceAsStream("configuration.properties")

        when:
        index.doHandle(request, responseBuilder, context)

        then:  
        RestApiResponse restApiResponse = responseBuilder.build()
        def returnedJson = new JsonSlurper().parseText(restApiResponse.response)
        //Assertions
        restApiResponse.httpStatus == 400
        returnedJson.error == "the parameter p is missing"
    }

    def "should return an error response if c is not set"() {
        request.parameterNames >> (["p", "c", "newParameter1"] as Enumeration)
        request.getParameter("c") >> null
        request.getParameter("p") >> "aValue1"
        request.getParameter("newParameter1") >> "aValue3"
        
        context.resourceProvider >> resourceProvider
        resourceProvider.getResourceAsStream("configuration.properties") >> index.class.classLoader.getResourceAsStream("configuration.properties")

        when:
        index.doHandle(request, responseBuilder, context)

        then:  
        RestApiResponse restApiResponse = responseBuilder.build()
        def returnedJson = new JsonSlurper().parseText(restApiResponse.response)
        //Assertions
        restApiResponse.httpStatus == 400
        returnedJson.error == "the parameter c is missing"
    }

    def "should return an error response if newParameter1 is not set"() {
        request.parameterNames >> (["p", "c", "newParameter1"] as Enumeration)
        request.getParameter("newParameter1") >> null
        request.getParameter("p") >> "aValue1"
        request.getParameter("c") >> "aValue2"
        
        context.resourceProvider >> resourceProvider
        resourceProvider.getResourceAsStream("configuration.properties") >> index.class.classLoader.getResourceAsStream("configuration.properties")

        when:
        index.doHandle(request, responseBuilder, context)

        then:  
        RestApiResponse restApiResponse = responseBuilder.build()
        def returnedJson = new JsonSlurper().parseText(restApiResponse.response)
        //Assertions
        restApiResponse.httpStatus == 400
        returnedJson.error == "the parameter newParameter1 is missing"
    }

}