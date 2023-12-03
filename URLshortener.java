import java.utl.HashMap;
import java.utl.Map;
import java.utl.*;
public class URLshortener {
 private Map<String, String> shortToLongMap;
 private Map<String, String> longToShortMap;
 private statc fnal String BASE_URL = "htp://short.url/";
 public URLshortener() {
 this.shortToLongMap = new HashMap<>();
 this.longToShortMap = new HashMap<>();
 }
 public String shortenUrl(String longUrl) {
 if (longToShortMap.containsKey(longUrl))
 {
 return BASE_URL + longToShortMap.get(longUrl);
 }
 String shortCode = generateShortCode();
 String shortUrl = BASE_URL + shortCode;
 shortToLongMap.put(shortCode, longUrl);
 longToShortMap.put(longUrl, shortCode);
 return shortUrl;
 }
 public String expandUrl(String shortUrl) {
 String shortCode = shortUrl.replace(BASE_URL, "");
 if (shortToLongMap.containsKey(shortCode))
 {
 return shortToLongMap.get(shortCode);
 }
 else
 {
 return "URL not found";
 }
 }
 private String generateShortCode() {
 // This is a simple example, in a real-world scenario, you might use a more sophistcated
algorithm
 return Integer.toString(shortToLongMap.size() + 1, 36);
 }
 public statc void main(String[] args) {
 String originalUrl = "htps://www.shorturl.at/ ";
 URLshortener urlShortener = new URLshortener();
 // Example usage
 String shortUrl = urlShortener.shortenUrl(originalUrl);
 System.out.println("Original URL: " + originalUrl);
 System.out.println("Shortened URL: " + shortUrl);
 String expandedUrl = urlShortener.expandUrl(shortUrl);
 System.out.println("Expanded URL: " + expandedUrl);
 }
}
