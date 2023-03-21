package xml;

public class SimpleBean {
    private static final String DEFAULT_NAME = "Luke";
    private String name;

    private int age = Integer.MIN_VALUE;

    public void init() {
        System.out.println("Initialization of bean");
        if (name == null) {
            System.out.println("Used a default name");
            name = DEFAULT_NAME;
        }
        if (age == Integer.MIN_VALUE) {
            System.out.println("You must set age properties");
            throw new IllegalArgumentException("You must set age properties" + SimpleBean.class);
        }
    }





    public void destroy() {
        System.out.println("Into Destroy");
    }







    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SimpleBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
