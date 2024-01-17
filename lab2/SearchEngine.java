import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    ArrayList<String> words = new ArrayList<String>();

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format("Welcome to my search engine! There are %d items: \n%s", words.size(), words);
        } else if (url.getPath().equals("/add")) {
            String[] addParameters = url.getQuery().split("=");
            if (addParameters[0].equals("s")) {
                words.add(addParameters[1]);
                return String.format("%s successfully added!", addParameters[1]);
            }
        } else {
            if (url.getPath().contains("/search")) {
                String[] parameters = url.getQuery().split("=");
                String output = "";
                if (parameters[0].equals("s")) {
                    for (int i = 0; i < words.size(); i++) {
                        if (words.get(i).contains(parameters[1]) == true) {
                            output = output + " " + words.get(i);
                        }
                    }
                    return String.format("The words containing \"%s\" are: %s ", parameters[1], output);
                }
            }
            
        }
        return "404 Not Found!";
    }
}

class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
