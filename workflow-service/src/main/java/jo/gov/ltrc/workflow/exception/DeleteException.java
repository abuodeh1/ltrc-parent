package jo.gov.ltrc.workflow.exception;

import org.springframework.http.HttpStatus;

public class DeleteException extends BaseException {

    public DeleteException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getStatusCode() {
        return HttpStatus.FORBIDDEN;
    }

}
