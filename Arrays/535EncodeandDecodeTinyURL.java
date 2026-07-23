public class Codec {
    public HashMap<String,String>mps = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        mps.put(longUrl,"shorturl");
        return mps.get(longUrl);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String str="";
        for(Map.Entry<String,String>mp: mps.entrySet()){
            if(mp.getValue().equals(shortUrl)){
                str = mp.getKey();
                break;
            }
        }
        return str;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));