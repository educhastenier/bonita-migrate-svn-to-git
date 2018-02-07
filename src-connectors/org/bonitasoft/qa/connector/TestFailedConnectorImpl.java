package org.bonitasoft.qa.connector;

import org.bonitasoft.engine.connector.ConnectorException;

public class TestFailedConnectorImpl extends AbstractTestFailedConnectorImpl {

    @Override
    protected void executeBusinessLogic() throws ConnectorException {
        final StringBuilder sb = new StringBuilder();
        sb.append("This is a test exception thrown to put step in FAILED state - ");
        sb.append("ProcessDefinitionId=" + getExecutionContext().getProcessDefinitionId() + ", ");
        sb.append("ActivityInstanceId=" + getExecutionContext().getActivityInstanceId());

        throw new RuntimeException(sb.toString());
    }

}
