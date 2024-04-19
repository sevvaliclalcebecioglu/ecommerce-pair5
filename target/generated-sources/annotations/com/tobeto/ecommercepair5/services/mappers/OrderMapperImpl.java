package com.tobeto.ecommercepair5.services.mappers;

import com.tobeto.ecommercepair5.entities.Order;
import com.tobeto.ecommercepair5.entities.User;
import com.tobeto.ecommercepair5.services.dtos.requests.order.AddOrderRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.order.UpdateOrderRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.order.AddOrderResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.order.DeleteOrderResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.order.GetOrderResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.order.ListOrderResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.order.UpdateOrderResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-12T15:04:32+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order orderFromAddRequest(AddOrderRequest request) {
        if ( request == null ) {
            return null;
        }

        Order order = new Order();

        order.setUser( addOrderRequestToUser( request ) );
        order.setCreatedDate( request.getCreatedDate() );
        order.setShipmentDate( request.getShipmentDate() );
        order.setDeliveredDate( request.getDeliveredDate() );
        order.setReturnedDate( request.getReturnedDate() );
        order.setStatus( request.getStatus() );

        return order;
    }

    @Override
    public AddOrderResponse addResponseFromOrder(Order order) {
        if ( order == null ) {
            return null;
        }

        AddOrderResponse addOrderResponse = new AddOrderResponse();

        addOrderResponse.setUserId( orderUserId( order ) );
        addOrderResponse.setId( order.getId() );
        addOrderResponse.setCreatedDate( order.getCreatedDate() );
        addOrderResponse.setShipmentDate( order.getShipmentDate() );
        addOrderResponse.setDeliveredDate( order.getDeliveredDate() );
        addOrderResponse.setReturnedDate( order.getReturnedDate() );
        addOrderResponse.setStatus( order.getStatus() );

        return addOrderResponse;
    }

    @Override
    public Order orderFromUpdateRequest(UpdateOrderRequest request) {
        if ( request == null ) {
            return null;
        }

        Order order = new Order();

        order.setId( request.getId() );
        order.setShipmentDate( request.getShipmentDate() );
        order.setDeliveredDate( request.getDeliveredDate() );
        order.setReturnedDate( request.getReturnedDate() );
        order.setStatus( request.getStatus() );

        return order;
    }

    @Override
    public UpdateOrderResponse updateResponseFromOrder(Order order) {
        if ( order == null ) {
            return null;
        }

        UpdateOrderResponse updateOrderResponse = new UpdateOrderResponse();

        updateOrderResponse.setId( order.getId() );
        updateOrderResponse.setCreatedDate( order.getCreatedDate() );
        updateOrderResponse.setShipmentDate( order.getShipmentDate() );
        updateOrderResponse.setDeliveredDate( order.getDeliveredDate() );
        updateOrderResponse.setReturnedDate( order.getReturnedDate() );
        updateOrderResponse.setStatus( order.getStatus() );

        return updateOrderResponse;
    }

    @Override
    public DeleteOrderResponse deleteResponseFromId(Order order) {
        if ( order == null ) {
            return null;
        }

        DeleteOrderResponse deleteOrderResponse = new DeleteOrderResponse();

        deleteOrderResponse.setId( order.getId() );
        deleteOrderResponse.setCreatedDate( order.getCreatedDate() );
        deleteOrderResponse.setShipmentDate( order.getShipmentDate() );
        deleteOrderResponse.setDeliveredDate( order.getDeliveredDate() );
        deleteOrderResponse.setReturnedDate( order.getReturnedDate() );
        deleteOrderResponse.setStatus( order.getStatus() );

        return deleteOrderResponse;
    }

    @Override
    public List<ListOrderResponse> listOrderResponse(List<Order> orders) {
        if ( orders == null ) {
            return null;
        }

        List<ListOrderResponse> list = new ArrayList<ListOrderResponse>( orders.size() );
        for ( Order order : orders ) {
            list.add( orderToListOrderResponse( order ) );
        }

        return list;
    }

    @Override
    public GetOrderResponse getOrderResponse(Order order, User user) {
        if ( order == null && user == null ) {
            return null;
        }

        GetOrderResponse getOrderResponse = new GetOrderResponse();

        if ( order != null ) {
            getOrderResponse.setId( order.getId() );
            getOrderResponse.setCreatedDate( order.getCreatedDate() );
            getOrderResponse.setShipmentDate( order.getShipmentDate() );
            getOrderResponse.setDeliveredDate( order.getDeliveredDate() );
            getOrderResponse.setReturnedDate( order.getReturnedDate() );
            getOrderResponse.setStatus( order.getStatus() );
        }
        if ( user != null ) {
            getOrderResponse.setUserId( user.getId() );
        }

        return getOrderResponse;
    }

    protected User addOrderRequestToUser(AddOrderRequest addOrderRequest) {
        if ( addOrderRequest == null ) {
            return null;
        }

        User user = new User();

        user.setId( addOrderRequest.getUserId() );

        return user;
    }

    private int orderUserId(Order order) {
        User user = order.getUser();
        if ( user == null ) {
            return 0;
        }
        return user.getId();
    }

    protected ListOrderResponse orderToListOrderResponse(Order order) {
        if ( order == null ) {
            return null;
        }

        ListOrderResponse listOrderResponse = new ListOrderResponse();

        listOrderResponse.setId( order.getId() );
        listOrderResponse.setCreatedDate( order.getCreatedDate() );
        listOrderResponse.setShipmentDate( order.getShipmentDate() );
        listOrderResponse.setDeliveredDate( order.getDeliveredDate() );
        listOrderResponse.setReturnedDate( order.getReturnedDate() );
        listOrderResponse.setStatus( order.getStatus() );

        return listOrderResponse;
    }
}
