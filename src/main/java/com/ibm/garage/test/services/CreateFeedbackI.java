package com.ibm.garage.test.services;

import com.ibm.garage.test.model.CreateFeedbackP;
import com.ibm.garage.test.model.CreateFeedbackResponseWrapper;

public interface CreateFeedbackI {

    public CreateFeedbackResponseWrapper execute(CreateFeedbackP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
