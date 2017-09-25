package sait.cprg352;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 742227
 */
public class UserService {
    //temporary values untill values are passed
    //String userName= "";
    //String passWord= "";
    private boolean userPass= false;
    private String adam= "adam";
    private String betty= "betty";
    private String rightPass= "password";
    
    public boolean login (String userName, String passWord){
        //try send user back to mainPage becasue of right information
        try{
            if(userName.equals(adam) || userName.equals(betty)){
                if( passWord.equals(rightPass)){
                 userPass= true;
            }
            }
       
            return userPass;
                    
        }
        catch (Exception e){
            //send user back to login page becasue of wrong information
            return userPass;
        }


    

    }
}