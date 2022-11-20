/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import org.openapitools.client.model.Order;

/**
 * OpenAPI Petstore
 *
 * <p>This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 */
@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("/store")
public interface StoreApi  {

    /**
     * Delete purchase order by ID
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     */
    @DELETE
    @Path("/order/{order_id}")
    void deleteOrder(@PathParam("order_id") String orderId) throws ApiException, ProcessingException;

    /**
     * Returns pet inventories by status
     * Returns a map of status codes to quantities
     */
    @GET
    @Path("/inventory")
    @Produces({ "application/json" })
    Map<String, Integer> getInventory() throws ApiException, ProcessingException;

    /**
     * Find purchase order by ID
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generate exceptions
     */
    @GET
    @Path("/order/{order_id}")
    @Produces({ "application/xml", "application/json" })
    Order getOrderById(@PathParam("order_id") Long orderId) throws ApiException, ProcessingException;

    /**
     * Place an order for a pet
     * 
     */
    @POST
    @Path("/order")
    @Consumes({ "application/json" })
    @Produces({ "application/xml", "application/json" })
    Order placeOrder(Order order) throws ApiException, ProcessingException;
}