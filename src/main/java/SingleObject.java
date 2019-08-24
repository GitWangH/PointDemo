public class SingleObject {
    //创建SingleObject的一个对象；
    private  static  SingleObject instence = new SingleObject();
   //让构造函数私有，这样类就不会被实例化
    private  SingleObject(){

    }
    //获取唯一可用的对象
     private static SingleObject getInstence(){
        return instence;
     }
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
