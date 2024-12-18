package animal;

public class Animal {

    // 名前
    private String name;
    // 年齢
    private int age;

    public Animal() {
        // デフォルトコンストラクタ
    }

    public Animal(String name, int age) {
        // 引数ありコンストラクタ
        this.name = name;
        this.age = age;
    }

    public void say() {
        // 自己紹介するメソッド
        System.out.println(name + "です。" + age + "歳です。");
    }

    // 以下はgetter, setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
