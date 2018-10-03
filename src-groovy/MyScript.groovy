/** Throw an exception if he script is interpreted when it should not
@author florine
**/
public static String testShow(boolean showed, String type){
	if(!showed){
		throw new IllegalStateException(type+" in Group : script should not be interpreted.");
	}
	return type+" in Group OK";
}

