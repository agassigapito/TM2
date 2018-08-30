/**
 * 
 */
package my.com.tm.portal.asset.dto;

import my.com.tm.portal.asset.model.ResponseStatus;

/**
 * Response wrapper for single return object
 *
 * @author ariel.bisnar
 *
 */
public class ResponseWrapperSingleDTO<T> {

	private ResponseStatus responseStatus;

	private T responseEntity;

	public ResponseStatus getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(final ResponseStatus responseStatus) {
		this.responseStatus = responseStatus;
	}

	public T getResponseEntity() {
		return responseEntity;
	}

	public void setResponseEntity(final T responseEntity) {
		this.responseEntity = responseEntity;
	}

}
