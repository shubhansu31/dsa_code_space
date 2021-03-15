public class Codec {

	Map<String, String> urlMap;

	public Codec() {
		urlMap = new HashMap<>();
	}

    public String encode(String originalUrl) {

        String newUrl = Long.toString(originalUrl.hashCode(), 16);

		urlMap.put(newUrl, originalUrl);
		
        return newUrl;
	}

    public String decode(String newUrl) {

		return urlMap.get(newUrl);
	
    }
}