package org.bonitasoft.qa.connector;

import org.bonitasoft.engine.connector.ConnectorException;

public class CheckVariableImpl extends AbstractCheckVariableImpl {

    @Override
    protected void executeBusinessLogic() throws ConnectorException {
        final String message = "Variable check failed";
        boolean ok = false;
        final Object o = getInputVariable();
        if (o == null) {
            throw new RuntimeException(message);
        } else {
            if (o instanceof String) {
                ok = ((String) o).length() > 0;
            }
            if (o instanceof Boolean) {
                ok = (Boolean) o;
            }
            if (o instanceof Integer || o instanceof Long || o instanceof Double) {
                ok = ((Number) o).intValue() > 0;
            }
        }
        if (!ok) {
            throw new RuntimeException(message);
        }
    }

}
