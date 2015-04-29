package uk.slamplug.test.app.db;

import uk.slamplug.test.app.model.CustomerDetails;

/**
 * Created by slamplug on 31/03/2015.
 */
public class CustomerDB {

    public CustomerDetails getCustomerDetails(final long id) {
        return new CustomerDetails(id, "Mr", "Peter", "Smith");
    }
}
