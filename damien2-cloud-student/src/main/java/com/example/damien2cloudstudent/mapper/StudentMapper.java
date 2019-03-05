package com.example.damien2cloudstudent.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;

import com.example.damien2cloudstudent.entitys.Student;

//@Mapper
public interface StudentMapper {

  @Insert("INSERT INTO STUDENT(ID, NAME, AGE) VALUES(#{0}, #{1}, #{2})")
  int insert(@Param("id") String id, @Param("name") String name, @Param("age") String age);
  
  //如下代码，通过Map<String, Object>对象来作为传递参数的容器：
  @Insert("INSERT INTO STUDENT(ID, NAME, AGE) VALUES(#{id,jdbcType=VARCHAR},#{name,jdbcType=VARCHAR}, #{age,jdbcType=VARCHAR})")
  int insertByMap(Map<String, Object> map);
  
  //除了Map对象，我们也可直接使用普通的Java对象来作为查询条件的传参，比如我们可以直接使用Student对象:
  @Insert("INSERT INTO STUDENT(ID, NAME, AGE) VALUES(#{id}, #{name}, #{age})")
  int insertByStudent(Student Student);
  
  //查询
  @Select("SELECT * FROM STUDENT WHERE name = #{name}")
  Student findByName(@Param("name") String name);

  //更新
  @Update("UPDATE STUDENT SET age=#{age} WHERE name=#{name}")
  void update(Student Student);

  //删除
  @Delete("DELETE FROM STUDENT WHERE id =#{id}")
  void delete(String id);
  
  //查询多结果返回list
  //往往需要返回一个与数据库实体不同的包装类，那么对于这类情况，就可以通过@Results和@Result注解来进行绑定，具体如下：
  @Results({
  	@Result(property = "id", column = "id"),
      @Result(property = "name", column = "name"),
      @Result(property = "age", column = "age")
  })
  @Select("SELECT * FROM STUDENT")
  List<Student> findAll();

}
