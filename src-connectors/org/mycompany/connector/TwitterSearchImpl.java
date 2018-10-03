/**
 * 
 */
package org.mycompany.connector;
import org.bonitasoft.engine.connector.ConnectorException;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

/**
 *The connector execution will follow the steps
 * 1 - setInputParameters() --> the connector receives input parameters values
 * 2 - validateInputParameters() --> the connector can validate input parameters values
 * 3 - connect() --> the connector can establish a connection to a remote server (if necessary)
 * 4 - executeBusinessLogic() --> execute the connector
 * 5 - getOutputParameters() --> output are retrieved from connector
 * 6 - disconnect() --> the connector can close connection to remote server (if any)
 */
public class TwitterSearchImpl extends AbstractTwitterSearchImpl {

	@Override
	protected void executeBusinessLogic() throws ConnectorException{
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(getConsumerKey())
                .setOAuthConsumerSecret(getConsumerSecret())
                .setOAuthAccessToken(getAccessToken())
                .setOAuthAccessTokenSecret(getAccessSecret());
        // Connect
        TwitterFactory factory = new TwitterFactory(cb.build());
        Twitter twitter = factory.getInstance();
        try{
	        Query twitterQuery = new Query(getQuery());
	        QueryResult result = twitter.search(twitterQuery);
	        setTweets(result.getTweets());
        }catch (Exception e) {
           throw new ConnectorException(e); 
		}finally{
			twitter.shutdown();
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
