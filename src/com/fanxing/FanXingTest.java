package com.fanxing;

/**
 * @author wanghao
 * @version 1.0
 */
public interface FanXingTest<P,C> {

    void setName(P name);
    P getName();
    void setAge(C age);
    C getAge();

}
//interface If extends FanXingTest{
//
//}
class AA implements FanXingTest<String,Integer> {


    @Override
    public void setName(String name) {
        
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setAge(Integer age) {

    }

    @Override
    public Integer getAge() {
        return null;
    }
}


