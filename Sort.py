class Sort:
    def __init__(self, list):
        self.list=list
        
    def bubble(self):
        N = len (self.list)
        for i in range(N-1):
            for j in range(N-i-1):
                if self.list[j] > self.list[j+1]:
                    self.list[j], self.list[j+1] = self.list[j+1], self.list[j]
        for i in range(len(self.list)):
            self.list[i] = int(self.list[i])
        print(self.list)
      
sort = Sort(input().split())
sort.bubble()