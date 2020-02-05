package com.ibm.garage.test.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

import java.util.List;


public class GetFeedbackResponseWrapper {

	private List<Feedback> response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public List<Feedback> getResponse(){
            return response;
	}
 
	public void setResponse(List<Feedback> response){
            this.response=response;
	} 
}
