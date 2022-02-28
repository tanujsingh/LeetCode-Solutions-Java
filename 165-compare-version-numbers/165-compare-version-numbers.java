class Solution {
    public int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");
        int len1 = ver1.length;
        int len2 = ver2.length;
        
        int parseVer1, parseVer2;
        for(int i = 0; i < Math.max(len1, len2); ++i){
            parseVer1 = i < len1 ? Integer.parseInt(ver1[i]) : 0;
            parseVer2 = i < len2 ? Integer.parseInt(ver2[i]) : 0;
            
            if(parseVer1 != parseVer2)
                return parseVer1 > parseVer2 ? 1 : -1;
        }
        
        return 0;
    }
}