package com.springboot.coffee;


import com.springboot.member.NotSpace;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class CoffeePatchDto {
    private long coffeeId;

//    @NotSpace
    private String korName;

    @Pattern( regexp = "^([a-zA-Z])(\\s?[a-zA-Z])*$", message = "영어이름이 잘못되었습니다.")
    private String engName;

    @Min( value = 100, message= "가격이 100 이상이어야 합니다.")
    @Max ( value = 50000, message = "가격이 50000 이하여야 합니다.")
    private int price;
}
