package truedei;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MyTest {

    private static SqlSessionFactory sqlSessionFactory;

    public static void main(String[] args) throws IOException {
      //1、创建SqlSessionFactory
      String resource = "mybatis-config.xml";
      final Reader reader = Resources.getResourceAsReader(resource);
      sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
      reader.close();
      //2、获取sqlSession
      SqlSession sqlSession = sqlSessionFactory.openSession();
      //3、获取mapper
      StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
      //4、执行数据库操作，并处理结果集
      Student goods = mapper.selectById("1");
      System.out.println(goods);
    }

}
