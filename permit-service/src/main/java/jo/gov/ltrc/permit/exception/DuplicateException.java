package jo.gov.ltrc.permit.exception;

import org.springframework.http.HttpStatus;

public class DuplicateException  extends BaseException {

    public DuplicateException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getStatusCode() {
        return HttpStatus.CONFLICT;
    }
}
