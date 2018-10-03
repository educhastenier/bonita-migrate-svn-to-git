package org.bonitasoft.examples.connector;

import java.util.Calendar;

import org.bonitasoft.engine.connector.ConnectorException;

public class MiniDueDateConnector extends AbstractMiniDueDateConnector {

    @Override
    protected void executeBusinessLogic() throws ConnectorException {
        final String model = getModel();
        final Calendar cal = Calendar.getInstance();
        if (model.equals("One")
                || model.equals("Cooper")
                || model.equals("Cooper S")) {
            cal.add(Calendar.MONTH, 1);
            setOutputParameter(this.DUEDATE_OUTPUT_PARAMETER, cal.getTime());
        } else {
            cal.add(Calendar.MONTH, 2);
            setOutputParameter(this.DUEDATE_OUTPUT_PARAMETER, cal.getTime());
        }

    }

}
