class Link{
    private class Node{
        private Object data;
        private Node next;
        public Node(Object data)
        {
            this.data=data;
        }

        public void addNode(Node node)//添加节点
        {
            if(this.next==null)
            {
                this.next=node;
            }
            else
            {
                this.next.addNode(node);
            }
        }
        //查询是否有该节点
        public boolean searchNode(Object data)
        {
            if(data.equals(this.data))
            {
                return true;
            }
            else
            {
                if(this.next!=null)
                {
                    return this.next.searchNode(data);
                }
                else
                {
                    return false;
                }
            }
        }
        //根据索引查询
        public Object getIndex(int index){
            if(Link.this.foot++==index)
            {
                return this.data;
            }
            else
            {
                return this.next.getIndex(index);
            }
        }
        //修改数据
        public void setData(int index,Object data){
            if(Link.this.foot++==index)//Link.this.foot=index; Link.this.foot++;
            {
                this.data=data;
            }
            else
            {
                this.next.setData(index,data);
            }
        }
        //删除数据
        public void removeNode(Node pre,Object data)
        {
            if(data.equals(this.data))
            {
                pre.next=this.next;
            }else
            {
                this.next.removeNode(this,data);
            }
        }

        public void toArrayNode()
        {
            Link.this.retArray[Link.this.foot++]=this.data;//Link.this.retArray[Link.this.foot]=this.data;  Link.this.foot++;
            if(this.next!=null)
            {
                this.next.toArrayNode();
            }
        }
    }
    private Node root;//根节点
    private int count=0;//计数
    private int foot=0;
    private Object[] retArray;
    public void add(Object data)//添加节点
    {
        Node node=new Node(data);
        if(data==null) return;
        if(root==null)
        {
            this.root=node;
        }else{
            this.root.addNode(node);
        }
        this.count++;
    }

    public int size()//返回链表的长度
    {
        return this.count;
    }

    public boolean contains(Object data)//查询
    {
        if(data==null||this.root==null)
        {
            return false;
        }
        else
        {
            return this.root.searchNode(data);
        }
    }
    //根据索引查询
    public Object get(int index)
    {
        if(index>this.count)
        {
            return null;
        }
        this.foot=0;
        return this.root.getIndex(index);
    }

    //根据索引修改
    public void set(int index,Object data)
    {
        if(index>this.count)
        {
            return;
        }
        this.foot=0;
        this.root.setData(index,data);

    }

    //删除链表
    public void remove(Object data)
    {
        if(this.contains(data))
        {
            if(data.equals(this.root.data))//外部类可以直接对内部类私有属性进行直接访问 不用get set 方法
            {
                this.root=this.root.next;
            }
            else
            {
                this.root.next.removeNode(this.root,data);
            }
            this.count--;
        }
    }
    //将链表转化为对象数组输出
    public Object[] toArray()
    {
        if(this.root==null)
        {
            return null;
        }
        this.foot=0;
        this.retArray=new Object[this.count];
        this.root.toArrayNode();
        return this.retArray;
    }
}


