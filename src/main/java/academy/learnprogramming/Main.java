package academy.learnprogramming;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {

        try{
            URI baseUri = new URI("http://username:password@myserver.com:5000/");
            URI uri = new URI("catalogue/photos?os=android#samsung");
            URI resolveURI = baseUri.resolve(uri);
            URL url = resolveURI.toURL();
            System.out.println("URL : "+url);
//            URI uri = new URI("http://username:password@myserver.com:5000/catalogue/photos?os=android#samsung");
//            URL url = uri.toURL();
//            System.out.println("URL : "+url);
  //          URI uri = new URI("Hello");
//            System.out.println("Scheme : "+uri.getScheme());
//            System.out.println("Scheme Specific Part :"+uri.getSchemeSpecificPart());
//            System.out.println("Userid :" + uri.getUserInfo());
//            System.out.println("Host Info :"+ uri.getHost());
//            System.out.println("Port Info :"+ uri.getPort());
//            System.out.println("Path Info :"+ uri.getPath());
//            System.out.println("Query Info :"+ uri.getQuery());
//            System.out.println("Fragment Info :"+uri.getFragment());


        } catch (URISyntaxException e){
            System.out.println("Bad URI Syntax : " + e.getMessage());
        } catch (MalformedURLException e){
            System.out.println("Bad URL Formed : " + e.getMessage());

        }


    }

}
