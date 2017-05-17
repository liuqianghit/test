package com.boottest.demo;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/5/17 0017.
 */
public class A extends Object {
    private int a;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        A a1 = (A) o;

        if (a != a1.a) return false;
        return b == a1.b;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        return result;
    }

    private int b;
    private static final long serialVersionUID = -3812182268865891643L;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
