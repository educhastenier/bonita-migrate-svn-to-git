package org.mycompany.connector;

import org.bonitasoft.engine.connector.AbstractConnector;
import org.bonitasoft.engine.connector.ConnectorValidationException;

public abstract class AbstractExcelReadCellRangeImpl extends AbstractConnector {

	protected final static String FILENAME_INPUT_PARAMETER = "fileName";
	protected final static String CELLRANGELIST_INPUT_PARAMETER = "cellRangeList";
	protected final static String SHEETNAME_INPUT_PARAMETER = "sheetName";
	protected final String DATA_OUTPUT_PARAMETER = "data";

	protected final java.lang.String getFileName() {
		return (java.lang.String) getInputParameter(FILENAME_INPUT_PARAMETER);
	}

	protected final java.lang.String getCellRangeList() {
		return (java.lang.String) getInputParameter(CELLRANGELIST_INPUT_PARAMETER);
	}

	protected final java.lang.String getSheetName() {
		return (java.lang.String) getInputParameter(SHEETNAME_INPUT_PARAMETER);
	}

	protected final void setData(java.util.List data) {
		setOutputParameter(DATA_OUTPUT_PARAMETER, data);
	}

	@Override
	public void validateInputParameters() throws ConnectorValidationException {
		try {
			getFileName();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("fileName type is invalid");
		}
		try {
			getCellRangeList();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException(
					"cellRangeList type is invalid");
		}
		try {
			getSheetName();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("sheetName type is invalid");
		}

	}

}
