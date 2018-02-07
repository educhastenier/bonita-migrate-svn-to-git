package org.mycompany.connector;

import org.bonitasoft.engine.connector.AbstractConnector;
import org.bonitasoft.engine.connector.ConnectorValidationException;

public abstract class AbstractTwitterDirectMessageImpl extends
		AbstractConnector {

	protected final static String CONSUMERKEY_INPUT_PARAMETER = "consumerKey";
	protected final static String CONSUMERSECRET_INPUT_PARAMETER = "consumerSecret";
	protected final static String ACCESSTOKEN_INPUT_PARAMETER = "accessToken";
	protected final static String ACCESSSECRET_INPUT_PARAMETER = "accessSecret";
	protected final static String RECIPIENT_INPUT_PARAMETER = "recipient";
	protected final static String MESSAGE_INPUT_PARAMETER = "message";
	protected final String RESULT_OUTPUT_PARAMETER = "result";

	protected final java.lang.String getConsumerKey() {
		return (java.lang.String) getInputParameter(CONSUMERKEY_INPUT_PARAMETER);
	}

	protected final java.lang.String getConsumerSecret() {
		return (java.lang.String) getInputParameter(CONSUMERSECRET_INPUT_PARAMETER);
	}

	protected final java.lang.String getAccessToken() {
		return (java.lang.String) getInputParameter(ACCESSTOKEN_INPUT_PARAMETER);
	}

	protected final java.lang.String getAccessSecret() {
		return (java.lang.String) getInputParameter(ACCESSSECRET_INPUT_PARAMETER);
	}

	protected final java.lang.String getRecipient() {
		return (java.lang.String) getInputParameter(RECIPIENT_INPUT_PARAMETER);
	}

	protected final java.lang.String getMessage() {
		return (java.lang.String) getInputParameter(MESSAGE_INPUT_PARAMETER);
	}

	protected final void setResult(twitter4j.DirectMessage result) {
		setOutputParameter(RESULT_OUTPUT_PARAMETER, result);
	}

	@Override
	public void validateInputParameters() throws ConnectorValidationException {
		try {
			getConsumerKey();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException(
					"consumerKey type is invalid");
		}
		try {
			getConsumerSecret();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException(
					"consumerSecret type is invalid");
		}
		try {
			getAccessToken();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException(
					"accessToken type is invalid");
		}
		try {
			getAccessSecret();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException(
					"accessSecret type is invalid");
		}
		try {
			getRecipient();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("recipient type is invalid");
		}
		try {
			getMessage();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("message type is invalid");
		}

	}

}
