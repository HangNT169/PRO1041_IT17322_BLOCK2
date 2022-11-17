/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17322.group1.custommodel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author hangnt
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ViewProductCustomModel {

    private Long id;
    private String categoryName;
    private String productName;
    private Float price;

}
