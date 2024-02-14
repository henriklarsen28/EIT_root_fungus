package lab5e;

import com.lab5e.span.CollectionsApi;
import com.lab5e.span.model.Collection;
import com.lab5e.span.model.ListDataResponse;


public class CollectionDemo {
    public static void main(String args[]) {

        // Pull the token from the command line
        if (args.length == 1) {
            System.out.println("Must specify token on command line");
            return;
        }
        final String token = "0a5532bfb7a035c17692dc7285331e932b37fb18bb3793f3bef70898334a0977";

        // Create the API client class and set the API token for it.
        final ApiClient client = new ApiClient();
        client.setApiKey(token);

        // Use the ProfileApi class to retrieve the profile
        final CollectionsApi collApi = new CollectionsApi(client);

        try {
            // This will retrieve the profile. If there's an error retrieving
            // the profile an ApiException is thrown.
            //final ListCollectionResponse list = collApi.listCollections();
            Collection coll = collApi.retrieveCollection("17kn6b76ejd800", null, null);
            ListDataResponse data = collApi.listCollectionData("17kn6b76ejd800",10,"0","999999", null);
            System.out.println(coll);


        } catch (ApiException ex) {
            System.out.println("Got exception calling API: code = " + ex.getCode());
        }
    }
}
