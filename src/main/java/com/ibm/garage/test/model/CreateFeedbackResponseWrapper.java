package com.ibm.garage.test.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;



public class CreateFeedbackResponseWrapper {

	private SuccessfulResponse response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public SuccessfulResponse getResponse(){
            return response;
	}
 
	public void setResponse(SuccessfulResponse response){
            this.response=response;
	} 
}
