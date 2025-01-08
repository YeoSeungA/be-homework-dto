package com.springboot.coffee;

import com.springboot.member.NotSpace;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
public class CoffeePostDto {
//    @NotBlank(message = "메뉴의 이름은 공백이 아니어야 합니다.")
//    NotSpace가 해당이 안된다. 왤까?
//    @NotSpace(message = "메뉴의 이름은 공백이 아니어야 합니다")
    @Pattern ( regexp = "^([가-힣])+$", message = "한글이름이 잘못되었습니다.")
    private String korName;


//    *$ 에서 *은 \s?[a-zA-Z] 요 패턴이 0번 이상 반보될 수 있다. 요거 확인해보자! 지워봐서
//    @NotSpace
    @Pattern ( regexp = "^([a-zA-Z])(\\s?[a-zA-Z])*$", message = "영어이름이 잘못되었습니다.")
    private String engName;

//    @DecimalMin ( value = "100", message = "가격이 최소 100 이상이어야 합니다.")
//    @DecimalMax ( value = "500000" , message = "가격이 최대 500000 이상이어야 합니다.")
    @Min(value = 100, message = "가격이 최소 100 이상이어야 합니다." )
    @Max ( value = 500000, message = "가격이 최대 500000 이상이어야 합니다.")
    private int price;
}
