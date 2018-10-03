/**
 * 
 */
package org.mycompany.connector;

import java.util.ArrayList;
import java.util.Arrays;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import java.net.URL;
import java.util.Vector;
import java.util.logging.Logger;

import org.bonitasoft.engine.connector.ConnectorException;

/**
 *The connector execution will follow the steps
 * 1 - setInputParameters() --> the connector receives input parameters values
 * 2 - validateInputParameters() --> the connector can validate input parameters values
 * 3 - connect() --> the connector can establish a connection to a remote server (if necessary)
 * 4 - executeBusinessLogic() --> execute the connector
 * 5 - getOutputParameters() --> output are retrieved from connector
 * 6 - disconnect() --> the connector can close connection to remote server (if any)
 */
public class OpenERPReadObjectImpl extends AbstractOpenERPReadObjectImpl {
    Logger logger  = Logger.getLogger("org.bonitasoft.test");

	@Override
	protected void executeBusinessLogic() throws ConnectorException{
		try{
			XmlRpcClient xmlrpcLogin = new XmlRpcClient();
	        XmlRpcClientConfigImpl xmlrpcConfigLogin = new XmlRpcClientConfigImpl();
	        xmlrpcConfigLogin.setEnabledForExtensions(true);
	        xmlrpcConfigLogin.setServerURL(new URL(getServerUrl() + "/common"));
	        xmlrpcLogin.setConfig(xmlrpcConfigLogin);
	        Object loginId = xmlrpcLogin.execute("login", new Object[]{getDatabaseName(), getUsername(), getPassword()});
		  	  
	        xmlrpcConfigLogin.setServerURL(new URL(getServerUrl() + "/object"));
	        xmlrpcLogin.setConfig(xmlrpcConfigLogin);

	        Vector<Object> filterParameter = new Vector<Object>();
	        filterParameter.addElement(getFilterCriteria().toArray());
	        Object[] searchRequest = {getDatabaseName(), loginId, getPassword(), getObjectName(), "search", filterParameter};
	        Object[] objectIds = (Object[]) xmlrpcLogin.execute("execute", searchRequest);

	        Object readRequest[] = {getDatabaseName(), loginId, getPassword(), getObjectName(), "read", objectIds, getFieldsToRetrieve().toArray()};
	        Object result[] = (Object[]) xmlrpcLogin.execute("execute", readRequest);
	        setValues(Arrays.asList(result));
		}catch(Exception e){
			setValues(new ArrayList());
			logger.severe(e.getMessage());
		}
	        
	 }

	@Override
	public void connect() throws ConnectorException{
		//[Optional] Open a connection to remote server
	
	}

	@Override
	public void disconnect() throws ConnectorException{
		//[Optional] Close connection to remote server
	
	}

}
