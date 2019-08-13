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

    /**
     * 通过序号增加序列
     * @param node
     */
    public void addByNo(HashNode node){
        HashNode temp = head;
        boolean flag = false;
        while(true){
            if (temp.next == null){
                break;
            }
            if(temp.next.no > node.no){
               break;
            }else if (temp.next.no == node.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag){
            System.out.println("添加编号存在"+node.no);
        }else{
            node.next = temp.next;
            temp.next = node;
        }
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
//        linkList.addNode(node1);
//        linkList.addNode(node2);
//        linkList.addNode(node3);
         linkList.addByNo(node2);
         linkList.addByNo(node3);
         linkList.addByNo(node1);

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


