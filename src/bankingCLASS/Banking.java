/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingCLASS;
import java.util.Scanner;
/**
 *
 * @author PC 11
 */
public class Banking {
    int accountNo = 10001;
    String name;
    float initialBalance = 0;
    int pin = 1234;
    
    public boolean verifyAccount(int acc, int pn){
        
            if(acc == accountNo && pn == pin){
                return true;
            }else{
                return false;
            }
    }
    
    public int setAccount(){
        return accountNo;
    }
    
    public void viewBalance(){
    
    
    }
    
}
