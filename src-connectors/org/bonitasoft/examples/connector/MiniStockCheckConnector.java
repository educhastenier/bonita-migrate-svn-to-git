package org.bonitasoft.examples.connector;

import org.bonitasoft.engine.connector.ConnectorException;

public class MiniStockCheckConnector extends AbstractMiniStockCheckConnector {

    @Override
    protected void executeBusinessLogic() throws ConnectorException {
        final String model = getModel();
        if (model.equals("One") || model.equals("Cooper")) {
            setOutputParameter(this.ISAVAILABLE_OUTPUT_PARAMETER, false);
        } else {
            setOutputParameter(this.ISAVAILABLE_OUTPUT_PARAMETER, true);
        }
    }

}
