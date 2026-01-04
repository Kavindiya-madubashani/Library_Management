/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author ASUS
 */
public class Member {
    private int member_id;
    private String full_name;
    private String nic;
    private String address;
    private String phone;
    private String register_date;
    private String status;
    
    public Member(){
    }
    
    public Member(int member_id, String full_name, String nic, String address, String phone, String register_date, String status){
    this.member_id = member_id;
    this.full_name = full_name;
    this.nic = nic;
    this.address = address;
    this.phone = phone;
    this.register_date = register_date;
    this.status = status;
    }
    
    public int getMember_id(){
        return member_id;
    }
    
    public void setMember_id(int member_id){
        this.member_id = member_id;
    }
    
    public String getFull_name(){
        return full_name;
    }
    
    public void setFull_name(String full_name){
        this.full_name = full_name;
    }
    
    public String getNic(){
        return nic;
    }
    
    public void setNic(String nic){
        this.nic = nic;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String getRegister_date(){
        return register_date;
    }
    
    public void setRegister_date(String register_date){
        this.register_date = register_date;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
   
    
}
