/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sortservice.services;

import org.sortservice.aspects.Cacheable;

/**
 *
 * @author peta
 */
public class Count {

    
    @Cacheable
    public int Sum(int a, int b) {
        return a + b;
    }

}
