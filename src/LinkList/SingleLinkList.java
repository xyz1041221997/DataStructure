package LinkList;

public class SingleLinkList {
   private HashNode head = new HashNode(0,"","");

    public void addNode(HashNode node){
         HashNode temp = head;
        while(true){
            // 找到链表的最后一个
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
    }

    public void showNode(){
        HashNode temp = head.next;
        if(temp == null){
            System.out.println("链表为kong");
            return;
        }
        while(true){
            System.out.println(temp);
             if(temp.next ==null){
                 break;
             }
             temp = temp.next;
        }
    }

    public static void main(String[] args) {
        HashNode node1 = new HashNode(1, "盖伦", "德玛西亚之力");
        HashNode node2 = new HashNode(2, "亚索", "疾风剑豪");
        HashNode node3 = new HashNode(3, "瑞兹", "流浪法师");
        SingleLinkList linkList = new SingleLinkList();
        linkList.addNode(node1);
        linkList.addNode(node2);
        linkList.addNode(node3);
        linkList.showNode();
    }
}

class HashNode{
    public int no;
    public String name;
    public String nikeName;
    public HashNode next;
    public HashNode(int no, String name, String nikeName) {
        this.no = no;
        this.name = name;
        this.nikeName = nikeName;
    }

    @Override
    public String toString() {
        return "HashNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nikeName='" + nikeName + '\'' +
                '}';
    }
}


