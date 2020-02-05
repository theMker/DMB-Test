package com.ibm.garage.test.api;

import com.ibm.garage.test.model.ErrorResponse;
import com.ibm.garage.test.model.Feedback;
import com.ibm.garage.test.model.FeedbackInput;
import com.ibm.garage.test.model.SuccessfulResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.ibm.garage.test.services.GetFeedbackI;
import com.ibm.garage.test.model.GetFeedbackP;
import com.ibm.garage.test.model.GetFeedbackResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.ibm.garage.test.services.CreateFeedbackI;
import com.ibm.garage.test.model.CreateFeedbackP;
import com.ibm.garage.test.model.CreateFeedbackResponseWrapper;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-05T18:28:20.131Z[GMT]")

@RestController
public class FeedbackApiController implements FeedbackApi {

	@Autowired
	CreateFeedbackI createFeedbackI;


	@Autowired
	GetFeedbackI getFeedbackI;


    public ResponseEntity<SuccessfulResponse> createFeedback(@ApiParam(value = "Pet object that needs to be added to the store" ,required=true )  @Valid @RequestBody FeedbackInput feedbackInput){
        
        CreateFeedbackResponseWrapper res  = createFeedbackI.execute(new CreateFeedbackP(feedbackInput));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<List<Feedback>> getFeedback(){
        
        GetFeedbackResponseWrapper res  = getFeedbackI.execute(new GetFeedbackP());

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

}
