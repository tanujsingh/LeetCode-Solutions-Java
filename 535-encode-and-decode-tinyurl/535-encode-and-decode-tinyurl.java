public class Codec {
    String chars = "0123456789abcdefghijklmnopqrstuvwxyz";
    Map<String, String> map = new HashMap<>();
    int count = 0;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String key = getKey();
        map.put(key, longUrl);
        count++;
        return "http://tinyurl.com/" + key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String decodedKey = shortUrl.replace("http://tinyurl.com/","");
        return map.get(decodedKey);
    }
    
    private String getKey() {
        StringBuilder sb = new StringBuilder();
        int i = count;
        while (i > 0) {
            sb.append(chars.charAt(i%36));
            i /= 36;
        }
        return sb.toString();
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));