package com.bj.zg.gmall.user.bean;
import lombok.Data;
/**
 * @作者:lizhen
 * @创作时间: 2021年 01月 28日 6:32分
 */

@Data
public class UserReceiveAddress {

    private  Long id;
    private  Long userId;
    private  String phoneNumber;
    private  Integer defaultStatus;
    private  String postCode;
    private  String province;
    private  String city;
    private  String region;
    private  String detailAddress;
    private  String name;

}
