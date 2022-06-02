public class Human01 {
  public String name;
  public int age;
  //引数なしのコンストラクタ
  public Human01() {
    name = "山田";
    age = 20;
  }
  //引数2つのコンストラクタ
  public Human01(String name, int age) {
    this.name = name;    //this=自分自身のインスタンスを指す変数
    this.age = age;
  }
}


/* アクセス修飾子publicを用いてどこからでもアクセスできるクラスHuman01を定義する
アクセス修飾子publicを用いてどこからでもアクセスできるメンバー変数nameとageを定義する
引数なしのコンストラクタを定義する。
これを用いて初期化した場合、nameは「山田」、ageは「20」という値で初期化される(それぞれ変数にセットされる)
引数2つ(String型とint型)のコンストラクタを定義する。
これを用いて初期化した場合、nameもageも引数として渡した値で初期化される。
初期化対象は生成したインスタンスのメンバー変数なので、thisキーワードを用いて指定する */