package org.bonitasoft.qa.connector;

import org.bonitasoft.engine.connector.AbstractConnector;
import org.bonitasoft.engine.connector.ConnectorValidationException;

public abstract class AbstractCheckVariableImpl extends AbstractConnector {

    protected final static String INPUTVARIABLE_INPUT_PARAMETER = "inputVariable";

    protected final java.lang.Object getInputVariable() {
        return getInputParameter(INPUTVARIABLE_INPUT_PARAMETER);
    }

    public void validateInputParameters() throws ConnectorValidationException {
        try {
            getInputVariable();
        } catch (final ClassCastException cce) {
            throw new ConnectorValidationException("inputVariable type is invalid");
        }

    }

}
