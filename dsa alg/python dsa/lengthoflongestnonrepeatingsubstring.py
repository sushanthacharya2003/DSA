class Solution(object):
    def lengthOfLongestSubstring(self, s):
        start = 0  # Initialize the start of the window
        max_len = 0  # Variable to track the maximum length of the substring found
        hash_map = {}  # Dictionary to store the last seen index of each character
        
        for end in range(len(s)):
            # If the character at 'end' is already in the hash_map and its index is greater or equal to 'start'
            if s[end] in hash_map and hash_map[s[end]] >= start:
                # Move 'start' to the right of the previous occurrence of the character
                start = hash_map[s[end]] + 1
                
            # Update the last seen index of the character
            hash_map[s[end]] = end
            
            # Calculate the current length of the window and update max_len if necessary
            max_len = max(max_len, end - start + 1)
        
        return max_len

if __name__=="__main__":
    s=Solution()
    result=s.lengthOfLongestSubstring("abcabcbb")
    print(result)