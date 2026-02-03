Leetcode 1704: Determine if String Halves Are Alike
  //Time Complexity : O(n)
  //Space Complexity : O(n)
  
class StringsHalfAlike {
    public boolean halvesAreAlike(String s) {
        int mid = s.length()/2;
        String a = s.substring(0,mid);
        String b = s.substring(mid);
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < a.length();i++){
            char c = Character.toLowerCase(a.charAt(i));
            if(c == 'a'|| c == 'e' || c == 'i' || c == 'o'|| c == 'u'){
                countA++;
            }
        }

        for (int i = 0; i < b.length();i++){
            char c = Character.toLowerCase(b.charAt(i));
            if(c == 'a'|| c == 'e' || c == 'i' || c == 'o'|| c == 'u'){
                countB++;
            }
        }

        return countA == countB;
        
    }
}
