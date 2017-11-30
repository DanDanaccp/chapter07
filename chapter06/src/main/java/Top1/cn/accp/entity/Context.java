package Top1.cn.accp.entity;

public class Context {
    private String name;
    private String context;

    public void setName(String name) {
        this.name = name;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Context(String name, String context) {
        this.name = name;
        this.context = context;
    }

    public Context() {
    }

    @Override
    public String toString() {
        return name+"说："+context;
    }
}
