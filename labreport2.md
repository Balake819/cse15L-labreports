# Lab Report 1
January 10, 2024 <br/>
**Creating a Chat Server**
We are using the `/add-message` query within the url to generate a username and message within the website.
---
Chat Server:
```
import java.io.IOException;
import java.net.URI;


class Handler implements URLHandler {
    String mainThread = "";

    public String handleRequest(URI url) {
        if (url.getPath().equals("/add-message")) {
            String[] addParameters = url.getQuery().split("&");
            String[] parameter1 = addParameters[0].split("s=");
            String[] parameter2 = addParameters[1].split("=");
            mainThread += parameter2[1] + ": " + parameter1[1] + "\n";
            return mainThread;
        }
    }
}

class ChatServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
```
