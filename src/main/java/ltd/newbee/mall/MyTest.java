package ltd.newbee.mall;


import ltd.newbee.mall.dao.NewBeeMallGoodsMapper;
import ltd.newbee.mall.entity.NewBeeMallGoods;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = NewBeeMallApplication.class)
public class MyTest {

    @Autowired
    NewBeeMallGoodsMapper goodsMapper;

    @Test
    public  void test01(){
        NewBeeMallGoods newBeeMallGoods = goodsMapper.selectByPrimaryKey(10266L);
        System.out.println("newBeeMallGoods = " + newBeeMallGoods);
    }

    @Test
    public void test02(){
        System.out.println("goodsMapper = ");
    }

}
