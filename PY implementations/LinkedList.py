class Node:
    def __init__(self, item):
        self.item = item
        self.next = None


  
class Linked:

    def __init__(self):
        self.first = None
        self.last = None

    def is_empty(self):
        return self.first is None

    def appened(self, item):
        node = Node(item)
        if self.is_empty():
            self.first = self.last = node
        else:
            self.last.next = node
            self.last = node

    def prepend(self, item):
        node = Node(item)
        if self.is_empty():
            self.first = self.last = node
        else:
            node.next = self.first
            self.first = node

    def delete(self, item):
        if self.is_empty():
            return "No nodes to delete"
        else:
            if self.first.item == item:
                self.first = self.first.next
                return
            current = self.first
            while current.next.item != item:
                current = current.next
            
            current.next = current.next.next
            
    def display(self):
        node = self.first
        while node:
            print(node.item, end=" -> ")
            node = node.next

 
lists = Linked()
lists.appened(30)
lists.appened(40)
lists.appened(50)
lists.prepend(20)
lists.delete(40)
lists.display();
