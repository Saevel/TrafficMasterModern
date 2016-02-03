package prv.zielony.trafficmaster.course.tracker.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import prv.zielony.trafficmaster.course.tracker.dto.FaultDto;

/**
 * Created by zielony on 03.02.16.
 */
@ControllerAdvice
public class ApplicationExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = Throwable.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public FaultDto handleGenericException(Throwable e) {
        return new FaultDto(Error.UNKNOWN_ERROR);
    }
}
