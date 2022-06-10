package uz.pdp.fastfoodapp.entity.orderItem;

import lombok.*;
import lombok.experimental.PackagePrivate;
import uz.pdp.fastfoodapp.entity.food.Food;
import uz.pdp.fastfoodapp.entity.order.Order;
import uz.pdp.fastfoodapp.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@PackagePrivate
@Entity(name = "orderItems")
public class OrderItem extends AbsEntity {
    @OneToOne
    @JoinColumn(name = "food_id")
    Food food;
    @ManyToOne
    @JoinColumn(name = "order_id")
    Order order;

}

