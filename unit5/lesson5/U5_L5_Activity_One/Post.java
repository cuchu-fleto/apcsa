public class Post{
    private String name, contents;
    private int favorites;
    
    public Post(String n, String c, int f){
      name = n;
      contents = c;
      favorites = f;
    }
    public String toString(){
      return (name + "\n" + contents + "\n\tFavorited by " + favorites + " users");
    }
  }