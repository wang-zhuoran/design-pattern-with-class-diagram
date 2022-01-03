public class ProxyExample {

}

interface AbstractPermission{
    public void modifyUserInfo();
    public void viewNote();
    public void modifyNote();
    public void setLevel(int level);
}

class PermissionProxy implements AbstractPermission{
    private RealPermission permission = new RealPermission();
    private int level = 0;
    public void modifyUserInfo(){}
    public void viewNote(){}
    public void modifyNote(){}
    public void setLevel(int level){}
}

class RealPermission implements AbstractPermission{
    public void modifyUserInfo(){}
    public void viewNote(){}
    public void modifyNote(){}
    public void setLevel(int level){}
}
