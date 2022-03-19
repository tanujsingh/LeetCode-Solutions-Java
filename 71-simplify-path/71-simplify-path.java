class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] directories = path.split("/");
    
        for(String directory : directories) {
            if(directory == "" || directory.equals(".")) {
                continue;
            } else if (directory.equals("..")){
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(directory);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(String s : stack) {
            sb.append('/');
            sb.append(s);
        }
        
        return sb.length() > 0 ? sb.toString() : "/";
    }
}