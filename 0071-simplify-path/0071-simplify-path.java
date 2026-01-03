class Solution {
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] str = path.split("/");  
        for (String s : str) {
            if (s.equals("") || s.equals(".")) {
                continue;
            } else if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(s);
            }
        }
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }
        return result.length() == 0 ? "/" : result.toString();
    }
}
