package org.bonitasoft.examples.connector;

import org.bonitasoft.engine.connector.AbstractConnector;
import org.bonitasoft.engine.connector.ConnectorValidationException;

public abstract class AbstractMiniStockCheckConnector extends AbstractConnector {

    protected final String MODEL_INPUT_PARAMETER = "model";

    protected final String ISAVAILABLE_OUTPUT_PARAMETER = "isAvailable";

    protected final java.lang.String getModel() {
        return (java.lang.String) getInputParameter(this.MODEL_INPUT_PARAMETER);
    }

    protected final void setIsAvailable(final java.lang.Boolean isAvailable) {
        setOutputParameter(this.ISAVAILABLE_OUTPUT_PARAMETER, isAvailable);
    }

    public void validateInputParameters() throws ConnectorValidationException {
        try {
            getModel();
        } catch (final ClassCastException cce) {
            throw new ConnectorValidationException("model type is invalid");
        }

    }

}
