package nonlinear.trie;

class MyTrie {

    public String longestWord(String[] words) {
            // 1. Build the trie.
            TrieNode root = new TrieNode();
            for (String word : words) {
              System.out.println("Word:: "+word);
              TrieNode cur = root;
              for (char ch : word.toCharArray()) {
                  int id = ch - 'a';
                  if (cur.children[id] == null)
                      cur.children[id] = new TrieNode();
                  else
                    System.out.println("NOT NULL:: "+id);

                  cur = cur.children[id];
                  //System.out.println("Id:: "+id);
                  //System.out.println("Children@:: "+cur);
                  //System.out.println("Children#:: "+cur.word);
                  //System.out.println("Children$: "+cur.children);
              }

              cur.word = word;
              //System.out.println("Childrens:: "+cur.children.length);

            }

             printChilds(root);

            // 2. Run depth-first search from the root node.
            return dfs(root);
        }


        void printChilds(TrieNode node){
          for(int id = 0; id < 26; id++){
            if(node.children[id] != null){
              System.out.println("Child Word:: " + node.children[id].word);
              System.out.println("Child Position ID:: " + id);
              printChilds(node.children[id]);
            }
          }
        }

        String dfs(TrieNode root) {
            String res = root.word;
            for (TrieNode child : root.children) {
                if (child == null || child.word == null)
                    continue;
                String childRes = dfs(child);
                if (res == null)
                    res = childRes;
                else if (childRes != null && childRes.length() > res.length())
                    res = childRes;
            }
            return res;
        }

    class TrieNode{
      TrieNode[] children;
      String word;  // Not null if this word actually exists.
      TrieNode() {
        this.children = new TrieNode[26];
      }
    }

    public static void main(String[] args) {
      MyTrie trie = new MyTrie();
      //String[] words = {"a", "app", "apple"};
      //String[] words = {"w","wo","wor","worl", "world"};
      //String[] words = {"w","wo","wor","worl"};
      String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
      System.out.print(trie.longestWord(words));
    }
}
