# Lab Report 2 <br/>
January 29, 2024 <br/>
Creating a Chat Server: <br/>
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
`/add-message` examples: <br/>
![Adding Messages][1] <br/>
[1]: https://github.com/blakenewhouse/cse15L-labreports/blob/main/addMessageExample2.png 
* The `/add-message` command references the `handle request` method
* It takes in an input of a url. The input here is "https://0-0-0-0-1212-5c7o9m6ioc4leds0r7eh4hrdj8.us.edusercontent.com/add-message?s=Hello&user=jpolitz".
* Then, we take the query of that link and seperate it into multiple parts in order to find the user and the message, parameters 1 and 2 respectively. In this case, those parguments are "jpolitz" and "Hello".
* Afterwards, we concatenate those two strigns together in order to print out a message in the form of <user>: <message>(jpolitz: Hello).
* The values changed are the values within `parameter1`, `parameter2`, and `mainThread`. Parameters 1 and 2 get replaced, while `mainThread` keeps getting added onto. 
---
![Adding Messages][2]
[2]: https://github.com/blakenewhouse/cse15L-labreports/blob/main/addMessageExample1.png
* The `/add-message` command references the `handle request` method
* It takes in an input of a url. The input here is "https://0-0-0-0-1212-5c7o9m6ioc4leds0r7eh4hrdj8.us.edusercontent.com/add-message?s=How%20are%20you&user=yash".
*  Next, we take the query of that link and seperate it into multiple parts in order to find the user and the message, parameters 1 and 2 respectively. In this case, those parguments are "yash" and "how are you".
* Afterwards, we concatenate those two strigns together in order to print out a message in the form of <user>: <message>(yash: how are you). In this case, the url query cannot handle spaces within it so it adds + signs between each of the words, making it look like this(yash: how+are+you).
* The values changed are the values within `parameter1`, `parameter2`, and `mainThread`. Parameters 1 and 2 get replaced, while `mainThread` keeps getting added onto.
---
This is the absolute path to the public directory: <br/>

![Public Directory][3]
⋮
[3]: https://github.com/blakenewhouse/cse15L-labreports/blob/main/Screenshot%202024-01-30%20at%2012.44.00%20PM.png
---
This is the absolute path to the private directory in the ieng6 syste: <br/>
![Private Directory][4]
[4]: https://github.com/blakenewhouse/cse15L-labreports/blob/main/pwdOfPrivateKeys.png
---
I have logged in to the ieng6 system without requiring a password: <br/>
![No Password Needed][5]
[5]: https://github.com/blakenewhouse/cse15L-labreports/blob/main/ieng6noPassword
---
In weeks 2 and 3 I learned amny new things that I didn't know before, but one of the biggest ones was the different elements of a url link, and how we can manipulate them to change a website. I thought that it was really interesting that we can use a url query as an input for our code, and how each element of the url has its own importance within the search. For both `ChatServer` and `SearchEngine` we used the query to append to lists and create text based websites that can be updated by th euser simply by typing in a different URL, which I thought was really cool.

