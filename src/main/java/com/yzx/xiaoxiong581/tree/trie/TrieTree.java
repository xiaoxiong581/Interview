package com.yzx.xiaoxiong581.tree.trie;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class TrieTree
{

    @Getter
    private TrieTreeNode rootNode = new TrieTreeNode();

    @Setter
    @Getter
    static class TrieTreeNode
    {
        private final int MAX_SIZE = 26;
        private int nCount;
        private boolean isWord;
        private char curChar;
        private TrieTreeNode[] childNodes;

        public TrieTreeNode()
        {
            this.nCount = 1;
            this.isWord = false;
            this.childNodes = new TrieTreeNode[26];
        }
    }

    public void addNode(TrieTreeNode node, String str)
    {
        if (StringUtils.isEmpty(str))
        {
            return;
        }

        char[] strChars = str.toCharArray();
        int count = 0;
        for (char strChar : strChars)
        {
            int pos = strChar - 'a';
            if (null == node.childNodes[pos])
            {
                node.childNodes[pos] = new TrieTreeNode();
            } else
            {
                int nCount = node.childNodes[pos].getNCount();
                node.childNodes[pos].setNCount(nCount + 1);
            }
            node = node.getChildNodes()[pos];
            node.setCurChar(strChar);
            count++;
            if (count == strChars.length)
            {
                node.setWord(true);
            }
        }
    }

    public int findPrefixCount(TrieTreeNode node, String prefix)
    {
        if (StringUtils.isEmpty(prefix))
        {
            return 0;
        }

        char[] prefixChars = prefix.toCharArray();
        for (char prefixChar : prefixChars)
        {
            int pos = prefixChar - 'a';
            if (null == node.getChildNodes()[pos])
            {
                return 0;
            }
            node = node.getChildNodes()[pos];
        }
        return node.getNCount();
    }

    public List<String> findPrefixWord(TrieTreeNode node, String prefix)
    {
        TrieTreeNode finalNode = null;
        List<String> result = new ArrayList<>();

        if (StringUtils.isEmpty(prefix))
        {
            finalNode = node;
            prefix = StringUtils.EMPTY;
        } else
        {
            char[] prefixChars = prefix.toCharArray();
            for (char prefixChar : prefixChars)
            {
                int pos = prefixChar - 'a';
                if (null == node.getChildNodes()[pos])
                {
                    return null;
                }
                node = node.getChildNodes()[pos];
            }
            finalNode = node;
            if (node.isWord)
            {
                result.add(prefix);
            }
        }

        processTrieTreeNode(node.getChildNodes(), prefix, result);
        return result;
    }

    private void processTrieTreeNode(TrieTreeNode[] trieTreeNodes, String prefix, List<String> result)
    {
        for (TrieTreeNode trieTreeNode : trieTreeNodes)
        {
            if (null == trieTreeNode)
            {
                continue;
            }
            String newPrefix = prefix + trieTreeNode.getCurChar();
            if (trieTreeNode.isWord)
            {
                result.add(newPrefix);
            }

            processTrieTreeNode(trieTreeNode.getChildNodes(), newPrefix, result);
        }
    }

    public static void main(String[] args)
    {
        TrieTree trieTree = new TrieTree();
        String[] words = new String[]{"abcd", "ffdd", "rdsf", "abed"};
        for (String word : words)
        {
            trieTree.addNode(trieTree.getRootNode(), word);
        }

        System.out.println(trieTree.findPrefixCount(trieTree.getRootNode(), "ab"));
        System.out.println(trieTree.findPrefixWord(trieTree.getRootNode(), "ff"));
    }
}
