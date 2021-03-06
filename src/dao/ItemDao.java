
package dao;

import connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Item;

public class ItemDao {
    private Connection connection;
    public ItemDao() {
        connection=DBConnection.getInstance().getConnection();
    }
    
    public boolean addItem(String description,long i_id,int c_id,int b_id,double taking_price,double thoga_price,double our_price,int warning,double quantity,double shown_price) throws SQLException{
        String sql="insert into item values("+i_id+","+b_id+","+c_id+",'"+description+"',"+taking_price+","+thoga_price+","+our_price+",'"+warning+"',"+quantity+","+shown_price+")";
        Statement stm= connection.createStatement();
        int res = stm.executeUpdate(sql);
        return res>0 ?true:false;
        
    }
    
    public boolean updateItem(Item item) throws SQLException{
        System.out.println("item id"+item.getI_id());
        String sql="update item set description='"+item.getDescription()+"',taking_price="+item.getTaking_price()+",thoga_price="+item.getThoga_price()+",ape_price="+item.getOur_price()+",warning_level="+item.getWarning()+",qty="+item.getQuantity()+" ,shown_price="+item.getShown_price()+" where i_id='"+item.getI_id()+"'";
        Statement stm=connection.createStatement();
        int res = stm.executeUpdate(sql);
        System.out.println("res"+res);
        return res>0 ?true:false;
        
    }
    
    public Item getItem(long id) throws SQLException{
        Item item=new Item();
        String sql="select * from item where i_id="+id+"";
        PreparedStatement stm=connection.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();
        while(rst.next()){
            item.setC_id(rst.getInt("c_id"));
            item.setB_id(rst.getInt("b_id"));
            item.setDescription(rst.getString("description"));
            item.setI_id(rst.getLong("i_id"));
            item.setOur_price(rst.getDouble("ape_price"));
            item.setTaking_price(rst.getDouble("taking_price"));
            item.setThoga_price(rst.getDouble("thoga_price"));
            item.setWarning(rst.getInt("warning_level"));
            item.setQuantity(rst.getDouble("qty"));
            item.setShown_price(rst.getDouble("shown_price"));
        }
        return item;
    }
    
    public List<Item> getAll() throws SQLException{
        List<Item> list=new ArrayList<>();
        String sql="select * from item ";
        PreparedStatement stm=connection.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();
        while(rst.next()){
            Item item=new Item();
            item.setC_id(rst.getInt("c_id"));
            item.setB_id(rst.getInt("b_id"));
            item.setDescription(rst.getString("description"));
            item.setI_id(rst.getLong("i_id"));
            item.setOur_price(rst.getDouble("ape_price"));
            item.setTaking_price(rst.getDouble("taking_price"));
            item.setThoga_price(rst.getDouble("thoga_price"));
            item.setWarning(rst.getInt("warning_level"));
            item.setQuantity(rst.getDouble("qty"));
            item.setShown_price(rst.getDouble("shown_price"));
            list.add(item);
        }
        return list;
    }
    
    public boolean deleteItem(long id) throws SQLException{
        String sql="delete from item where i_id="+id+"";
        Statement stm=connection.createStatement();
        int res = stm.executeUpdate(sql);
        if(res>0){
            return true;
        }else{
            return false;
        }
        
        
    }
    
     public List<Item> getAllByCategory(int id) throws SQLException{
        List<Item> list=new ArrayList<>();
        String sql="select * from item where c_id=? ";
        PreparedStatement stm=connection.prepareStatement(sql);
        stm.setInt(1, id);
        ResultSet rst = stm.executeQuery();
        while(rst.next()){
            Item item=new Item();
            item.setC_id(rst.getInt("c_id"));
            item.setB_id(rst.getInt("b_id"));
            item.setDescription(rst.getString("description"));
            item.setI_id(rst.getLong("i_id"));
            item.setOur_price(rst.getDouble("ape_price"));
            item.setTaking_price(rst.getDouble("taking_price"));
            item.setThoga_price(rst.getDouble("thoga_price"));
            item.setWarning(rst.getInt("warning_level"));
            item.setQuantity(rst.getDouble("qty"));
            item.setShown_price(rst.getDouble("shown_price"));
            list.add(item);
        }
        return list;
    }
    
}
