import static spark.Spark.*;

public class HelloGuviGeek {
    public static void main(String[] args) {
        port(8080);
        get("/", (req, res) -> "Hello GUVI GEEK");
    }
}

