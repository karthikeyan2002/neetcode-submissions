class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedValue = new StringBuilder();

        for(String str: strs){
            encodedValue.append(str.length());
            encodedValue.append("#");
            encodedValue.append(str);
        }

        return encodedValue.toString();
    }

    public List<String> decode(String str) {

        List<String> decodedValue = new ArrayList<>();

        int i = 0;

        while(i < str.length()){
             
            int j = i;

            while(str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i,j));

            i = j + 1;

            String s = str.substring(i, i+length);

            decodedValue.add(s);

            i = i + length;
        }

        return decodedValue;

    }

}
