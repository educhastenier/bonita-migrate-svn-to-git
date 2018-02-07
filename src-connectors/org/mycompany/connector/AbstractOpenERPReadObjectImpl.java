package org.mycompany.connector;

import org.bonitasoft.engine.connector.AbstractConnector;
import org.bonitasoft.engine.connector.ConnectorValidationException;

public abstract class AbstractOpenERPReadObjectImpl extends AbstractConnector {

	protected final static String SERVERURL_INPUT_PARAMETER = "serverUrl";
	protected final static String DATABASENAME_INPUT_PARAMETER = "databaseName";
	protected final static String USERNAME_INPUT_PARAMETER = "username";
	protected final static String PASSWORD_INPUT_PARAMETER = "password";
	protected final static String OBJECTNAME_INPUT_PARAMETER = "objectName";
	protected final static String FILTERCRITERIA_INPUT_PARAMETER = "filterCriteria";
	protected final static String FIELDSTORETRIEVE_INPUT_PARAMETER = "fieldsToRetrieve";
	protected final String VALUES_OUTPUT_PARAMETER = "values";

	protected final java.lang.String getServerUrl() {
		return (java.lang.String) getInputParameter(SERVERURL_INPUT_PARAMETER);
	}

	protected final java.lang.String getDatabaseName() {
		return (java.lang.String) getInputParameter(DATABASENAME_INPUT_PARAMETER);
	}

	protected final java.lang.String getUsername() {
		return (java.lang.String) getInputParameter(USERNAME_INPUT_PARAMETER);
	}

	protected final java.lang.String getPassword() {
		return (java.lang.String) getInputParameter(PASSWORD_INPUT_PARAMETER);
	}

	protected final java.lang.String getObjectName() {
		return (java.lang.String) getInputParameter(OBJECTNAME_INPUT_PARAMETER);
	}

	protected final java.util.List getFilterCriteria() {
		return (java.util.List) getInputParameter(FILTERCRITERIA_INPUT_PARAMETER);
	}

	protected final java.util.List getFieldsToRetrieve() {
		return (java.util.List) getInputParameter(FIELDSTORETRIEVE_INPUT_PARAMETER);
	}

	protected final void setValues(java.util.List values) {
		setOutputParameter(VALUES_OUTPUT_PARAMETER, values);
	}

	@Override
	public void validateInputParameters() throws ConnectorValidationException {
		try {
			getServerUrl();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("serverUrl type is invalid");
		}
		try {
			getDatabaseName();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException(
					"databaseName type is invalid");
		}
		try {
			getUsername();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("username type is invalid");
		}
		try {
			getPassword();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("password type is invalid");
		}
		try {
			getObjectName();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("objectName type is invalid");
		}
		try {
			getFilterCriteria();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException(
					"filterCriteria type is invalid");
		}
		try {
			getFieldsToRetrieve();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException(
					"fieldsToRetrieve type is invalid");
		}

	}

}
