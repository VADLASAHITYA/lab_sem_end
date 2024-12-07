package com.klef.springmvc;
import java.sql.SQLException; 
import java.util.List;
import java.sql.ResultSet;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;


public class DAO {
 JdbcTemplate jdbcTemplate;

public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
public int insert(Student s){  
    String sql="insert into Stu1 values("+s.getId()+",'"+s.getName()+"')";  
    return jdbcTemplate.update(sql);  
}  
public int update(Student s){  
    String sql="update into Stu1 name='"+s.getName()+"'where id="+s.getId()+"";  
    return jdbcTemplate.update(sql);  
}  
public int delete(int id){  
    String sql="delete from Stu1 where id="+id+"";  
    return jdbcTemplate.update(sql);  
}  

public Student getStuById(int id){  
    String sql="select * from Stu1 where id=?";  
    return jdbcTemplate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Student>(Student.class));
} 
public List<Student> getAllStudent(){  
    return jdbcTemplate.query("select * from Stu1",new RowMapper<Student>(){  
        public Student mapRow(ResultSet rs, int row) throws SQLException {  
            Student s=new Student();  
            s.setId(rs.getInt(1));
            s.setName(rs.getString(2));  
            return s;  
        }
    });
}
}
        
