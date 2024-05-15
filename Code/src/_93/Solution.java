package _93;

class Solution {
    List<String> results = new ArrayList<>();
    List<String> ip = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        backTrack(s, 0);
        return results;
    }
    public void backTrack(String s , int startIndex){
        if (ip.size() == 3) {
            if (isValid(s,startIndex,s.length()-1)) {
                StringBuilder sb = new StringBuilder();
                sb.append(ip.get(0)+'.'+ip.get(1)+'.'+ip.get(2)+'.'+s.substring(startIndex,s.length()));
                results.add(sb.toString());
            }
            return;
        }
        for (int i = startIndex ; i < s.length();i++){
            if (isValid(s,startIndex,i)) {
                ip.add(s.substring(startIndex, i+1));
                backTrack(s, i+1);
                ip.removeLast();
            }else{
                break;
            }
        }
    }
    // 判断字符串s在左闭⼜闭区间[start, end]所组成的数字是否合法
    private Boolean isValid(String s, int start, int end) {
        if (start > end) {
            return false;
        }
        if (s.charAt(start) == '0' && start != end) { // 0开头的数字不合法
            return false;
        }
        int num = 0;
        for (int i = start; i <= end; i++) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0') { // 遇到⾮数字字符不合法
                return false;
            }
            num = num * 10 + (s.charAt(i) - '0');
            if (num > 255) { // 如果⼤于255了不合法
                return false;
            }
        }
        return true;
    }
}