package jo.gov.ltrc.permit.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;
import java.util.Locale;


@ControllerAdvice
@Validated
public class ExceptionsHandler extends ResponseEntityExceptionHandler {

    @Autowired
    private MessageSource messageSource;

    @ExceptionHandler({javax.persistence.PersistenceException.class})
    public ResponseEntity<ErrorDetails> handlePersistenceException(javax.persistence.PersistenceException ex, WebRequest request, Locale locale) {

        ErrorDetails details = null;

        if (ex.getMessage().contains("Error extracting results")) {

            details = new ErrorDetails(messageSource.getMessage("EXTRACTING_RESULT", new Object[]{}, locale), request.getDescription(false));

        } else if (ex.getMessage().contains("Error calling CallableStatement.getMoreResults")) {

            details = new ErrorDetails(messageSource.getMessage("DB_METHOD_NOT_EXIST", new Object[]{}, locale), request.getDescription(false));

        } else {

            details = new ErrorDetails(ex.getMessage(), request.getDescription(false));
        }


        return new ResponseEntity<>(details, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        ValidationError validationError = new ValidationError();
        validationError.setUri(request.getDescription(false));

        List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();

        for (FieldError f : fieldErrors) {
            validationError.addError(f.getDefaultMessage());
        }


        return new ResponseEntity<>(validationError, HttpStatus.BAD_REQUEST);
    }

//    @ExceptionHandler(ConstraintViolationException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    ResponseEntity<String> handleConstraintViolationException(ConstraintViolationException e) {
//        return new ResponseEntity<>("not valid due to validation error: " + e.getMessage(), HttpStatus.BAD_REQUEST);
//    }

}
