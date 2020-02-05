package com.ibm.garage.test.services.impl;
 
import java.util.*;
 
import com.ibm.garage.test.model.CreateFeedbackP;
import com.ibm.garage.test.model.CreateFeedbackResponseWrapper;
import com.ibm.garage.test.services.CreateFeedbackI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class CreateFeedbackImpl implements CreateFeedbackI {
 
    private static final Log logger = LogFactory.getLog(CreateFeedbackImpl.class);
   
    @Override
    public CreateFeedbackResponseWrapper execute(CreateFeedbackP requestParams){
        //TODO
        return new CreateFeedbackResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
