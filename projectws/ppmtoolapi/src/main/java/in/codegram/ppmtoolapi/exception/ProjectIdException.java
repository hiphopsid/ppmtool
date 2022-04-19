package in.codegram.ppmtoolapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProjectIdException extends RuntimeException 
{
		public ProjectIdException() {
			super();
			// TODO Auto-generated constructor stub
		}

		public ProjectIdException(String errMsg) {
			super(errMsg);
			// TODO Auto-generated constructor stub
		}
}
