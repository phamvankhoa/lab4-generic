/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

/**
 *
 * @author phamv
 */
class Gen<T>
{
    T ob; 
    Gen(T o)
    {
        ob = o;
    }
    T getObject()
    {
        System.out.println("Gen's getObject(): " );
        return ob;
    }
}
class Gen2<T> extends Gen<T>
{
    Gen2(T o)
    {
        super(o);
    }
    T getObject()
    {
        System.out.println("Gen2's getObject(): ");
        return ob;
    }
}
public class OverrideGenericMethods 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Gen<Integer> Intobject = new Gen<Integer>(88); 
        Gen2<Long> longObject = new Gen2<Long>(99L);
        Intobject.getObject(); 
        longObject.getObject();
    }
    
}
