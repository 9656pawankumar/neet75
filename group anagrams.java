// Given an array of strings strs, group the anagrams together. You can return the answer in any order.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

// Example 1:

// Input: strs = ["eat","tea","tan","ate","nat","bat"]
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
// Example 2:

// Input: strs = [""]
// Output: [[""]]
// Example 3:

// Input: strs = ["a"]
// Output: [["a"]]
 

// Constraints:

// 1 <= strs.length <= 104
// 0 <= strs[i].length <= 100
// strs[i] consists of lowercase English letters.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> anagramGroups = new HashMap<>();

        // Iterate through each word in the array
        for (String word : strs) {
            // Convert the word to a char array, sort it, and convert it back to a string
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            // Check if the sorted word exists in the HashMap
            // If not, add it as a new entry with the original word as the first anagram
            if (!anagramGroups.containsKey(sortedWord)) {
                anagramGroups.put(sortedWord, new ArrayList<>());
            }

            // Add the original word to the list of anagrams for the sorted word
            anagramGroups.get(sortedWord).add(word);
        }

        // Convert the values of the HashMap (lists of anagrams) to a List of Lists and return it
        return new ArrayList<>(anagramGroups.values());
    }

    }
