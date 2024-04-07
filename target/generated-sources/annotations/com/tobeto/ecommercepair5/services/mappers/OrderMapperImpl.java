package com.tobeto.ecommercepair5.services.mappers;

import com.tobeto.ecommercepair5.entities.Order;
import com.tobeto.ecommercepair5.services.dtos.requests.orders.AddOrderRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.orders.UpdateOrderRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.orders.AddOrderResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.orders.DeleteOrderResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.orders.GetOrderResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.orders.ListOrderResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.orders.UpdateOrderResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-07T19:27:18+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order orderFromAddRequest(AddOrderRequest request) {
        if ( request == null ) {
            return null;
        }

        Order order = new Order();

        order.setDate( request.getDate() );

        return order;
    }

    @Override
    public AddOrderResponse addResponseFromOrder(Order order) {
        if ( order == null ) {
            return null;
        }

        AddOrderResponse addOrderResponse = new AddOrderResponse();

        addOrderResponse.setId( order.getId() );
        addOrderResponse.setDate( order.getDate() );
        addOrderResponse.setStatus( order.getStatus() );

        return addOrderResponse;
    }

    @Override
    public GetOrderResponse getOrderResponse(Order order) {
        if ( order == null ) {
            return null;
        }

        GetOrderResponse getOrderResponse = new GetOrderResponse();

        getOrderResponse.setId( order.getId() );
        getOrderResponse.setDate( order.getDate() );
        getOrderResponse.setStatus( order.getStatus() );

        return getOrderResponse;
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
    public Order orderFromUpdateRequest(UpdateOrderRequest request) {
        if ( request == null ) {
            return null;
        }

        Order order = new Order();

        order.setId( request.getId() );
        order.setDate( request.getDate() );
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
        updateOrderResponse.setDate( order.getDate() );
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
        deleteOrderResponse.setDate( order.getDate() );
        deleteOrderResponse.setStatus( order.getStatus() );

        return deleteOrderResponse;
    }

    protected ListOrderResponse orderToListOrderResponse(Order order) {
        if ( order == null ) {
            return null;
        }

        ListOrderResponse listOrderResponse = new ListOrderResponse();

        listOrderResponse.setId( order.getId() );
        listOrderResponse.setDate( order.getDate() );
        listOrderResponse.setStatus( order.getStatus() );

        return listOrderResponse;
    }
}
