package org.bonitasoft.examples.connector;

import org.bonitasoft.engine.connector.AbstractConnector;
import org.bonitasoft.engine.connector.ConnectorValidationException;

public abstract class AbstractMiniDueDateConnector extends AbstractConnector {

    protected final String MODEL_INPUT_PARAMETER = "model";

    protected final String DUEDATE_OUTPUT_PARAMETER = "dueDate";

    protected final java.lang.String getModel() {
        return (java.lang.String) getInputParameter(this.MODEL_INPUT_PARAMETER);
    }

    protected final void setDueDate(final java.util.Date dueDate) {
        setOutputParameter(this.DUEDATE_OUTPUT_PARAMETER, dueDate);
    }

    public void validateInputParameters() throws ConnectorValidationException {
        try {
            getModel();
        } catch (final ClassCastException cce) {
            throw new ConnectorValidationException("model type is invalid");
        }

    }

}
