/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos;

/**
 *
 * @author Abdul Moiz Chishti
 */
abstract class dash_interface_Fac {
    public abstract dash_interface enterdash();
}

class pos_facFactory extends dash_interface_Fac{
    @Override
    public dash_interface enterdash(){
//    creating a pos
    return new posale();
    }
    
}
class inv_facFactory extends dash_interface_Fac{
    @Override
    public dash_interface enterdash(){
//    creating a pos
    return new invfac();
    }
    
}