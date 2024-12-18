package animal;

public class Human extends Animal implements Thinkable {

    // 趣味
    private String hobby;

    public Human() {
        // デフォルトコンストラクタ
    }

    public Human(String name, int age, String hobby) {
        // 引数ありコンストラクタ
        super(name, age);
        this.hobby = hobby;
    }

    @Override
    public void think() {
        // インターフェース "Thinkable" のthinkメソッドの実装
        System.out.println("私は" + hobby + "について考えています。");
    }

    // 以下はgetter, setter
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
