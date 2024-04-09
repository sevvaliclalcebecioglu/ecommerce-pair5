package com.tobeto.ecommercepair5.services.mappers;

import com.tobeto.ecommercepair5.entities.Order;
import com.tobeto.ecommercepair5.entities.OrderDetail;
import com.tobeto.ecommercepair5.entities.Product;
import com.tobeto.ecommercepair5.services.dtos.requests.orderdetail.AddOrderDetailRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.orderdetail.UpdateOrderDetailRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.orderdetail.AddOrderDetailResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.orderdetail.DeleteOrderDetailResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.orderdetail.GetOrderDetailResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.orderdetail.ListOrderDetailResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.orderdetail.UpdateOrderDetailResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-08T23:53:36+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
public class OrderDetailMapperImpl implements OrderDetailMapper {

    @Override
    public OrderDetail orderDetailFromAddRequest(AddOrderDetailRequest request) {
        if ( request == null ) {
            return null;
        }

        OrderDetail orderDetail = new OrderDetail();

        orderDetail.setOrder( addOrderDetailRequestToOrder( request ) );
        orderDetail.setProduct( addOrderDetailRequestToProduct( request ) );
        orderDetail.setQuantity( request.getQuantity() );
        orderDetail.setTotalPrice( request.getTotalPrice() );

        return orderDetail;
    }

    @Override
    public AddOrderDetailResponse addResponseFromOrderDetail(OrderDetail orderDetail, Product product, Order order) {
        if ( orderDetail == null && product == null && order == null ) {
            return null;
        }

        AddOrderDetailResponse addOrderDetailResponse = new AddOrderDetailResponse();

        if ( orderDetail != null ) {
            addOrderDetailResponse.setId( orderDetail.getId() );
            addOrderDetailResponse.setQuantity( orderDetail.getQuantity() );
            addOrderDetailResponse.setTotalPrice( orderDetail.getTotalPrice() );
        }
        if ( product != null ) {
            addOrderDetailResponse.setProductName( product.getName() );
        }
        addOrderDetailResponse.setOrder( order );

        return addOrderDetailResponse;
    }

    @Override
    public OrderDetail orderDetailFromUpdateRequest(UpdateOrderDetailRequest request) {
        if ( request == null ) {
            return null;
        }

        OrderDetail orderDetail = new OrderDetail();

        orderDetail.setOrder( updateOrderDetailRequestToOrder( request ) );
        orderDetail.setProduct( updateOrderDetailRequestToProduct( request ) );
        orderDetail.setId( request.getId() );
        orderDetail.setQuantity( request.getQuantity() );
        orderDetail.setTotalPrice( request.getTotalPrice() );

        return orderDetail;
    }

    @Override
    public UpdateOrderDetailResponse updateResponseFromOrderDetail(OrderDetail orderDetail, Product product, Order order) {
        if ( orderDetail == null && product == null && order == null ) {
            return null;
        }

        UpdateOrderDetailResponse updateOrderDetailResponse = new UpdateOrderDetailResponse();

        if ( orderDetail != null ) {
            updateOrderDetailResponse.setId( orderDetail.getId() );
            updateOrderDetailResponse.setQuantity( orderDetail.getQuantity() );
            updateOrderDetailResponse.setTotalPrice( orderDetail.getTotalPrice() );
        }
        if ( product != null ) {
            updateOrderDetailResponse.setProductName( product.getName() );
        }
        updateOrderDetailResponse.setOrder( order );

        return updateOrderDetailResponse;
    }

    @Override
    public DeleteOrderDetailResponse deleteResponseFromId(OrderDetail orderDetail) {
        if ( orderDetail == null ) {
            return null;
        }

        DeleteOrderDetailResponse deleteOrderDetailResponse = new DeleteOrderDetailResponse();

        deleteOrderDetailResponse.setId( orderDetail.getId() );
        deleteOrderDetailResponse.setOrder( orderDetail.getOrder() );
        deleteOrderDetailResponse.setQuantity( orderDetail.getQuantity() );
        deleteOrderDetailResponse.setTotalPrice( orderDetail.getTotalPrice() );

        return deleteOrderDetailResponse;
    }

    @Override
    public List<ListOrderDetailResponse> listOrderDetailResponse(List<OrderDetail> orderDetails) {
        if ( orderDetails == null ) {
            return null;
        }

        List<ListOrderDetailResponse> list = new ArrayList<ListOrderDetailResponse>( orderDetails.size() );
        for ( OrderDetail orderDetail : orderDetails ) {
            list.add( orderDetailToListOrderDetailResponse( orderDetail ) );
        }

        return list;
    }

    @Override
    public GetOrderDetailResponse getOrderDetailResponse(OrderDetail orderDetail, Product product, Order order) {
        if ( orderDetail == null && product == null && order == null ) {
            return null;
        }

        GetOrderDetailResponse getOrderDetailResponse = new GetOrderDetailResponse();

        if ( orderDetail != null ) {
            getOrderDetailResponse.setId( orderDetail.getId() );
            getOrderDetailResponse.setQuantity( orderDetail.getQuantity() );
            getOrderDetailResponse.setTotalPrice( orderDetail.getTotalPrice() );
        }
        if ( product != null ) {
            getOrderDetailResponse.setProductName( product.getName() );
        }
        getOrderDetailResponse.setOrder( order );

        return getOrderDetailResponse;
    }

    protected Order addOrderDetailRequestToOrder(AddOrderDetailRequest addOrderDetailRequest) {
        if ( addOrderDetailRequest == null ) {
            return null;
        }

        Order order = new Order();

        order.setId( addOrderDetailRequest.getOrderId() );

        return order;
    }

    protected Product addOrderDetailRequestToProduct(AddOrderDetailRequest addOrderDetailRequest) {
        if ( addOrderDetailRequest == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( addOrderDetailRequest.getProductId() );

        return product;
    }

    protected Order updateOrderDetailRequestToOrder(UpdateOrderDetailRequest updateOrderDetailRequest) {
        if ( updateOrderDetailRequest == null ) {
            return null;
        }

        Order order = new Order();

        order.setId( updateOrderDetailRequest.getOrderId() );

        return order;
    }

    protected Product updateOrderDetailRequestToProduct(UpdateOrderDetailRequest updateOrderDetailRequest) {
        if ( updateOrderDetailRequest == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( updateOrderDetailRequest.getProductId() );

        return product;
    }

    protected ListOrderDetailResponse orderDetailToListOrderDetailResponse(OrderDetail orderDetail) {
        if ( orderDetail == null ) {
            return null;
        }

        ListOrderDetailResponse listOrderDetailResponse = new ListOrderDetailResponse();

        listOrderDetailResponse.setId( orderDetail.getId() );
        listOrderDetailResponse.setOrder( orderDetail.getOrder() );
        listOrderDetailResponse.setQuantity( orderDetail.getQuantity() );
        listOrderDetailResponse.setTotalPrice( orderDetail.getTotalPrice() );

        return listOrderDetailResponse;
    }
}
