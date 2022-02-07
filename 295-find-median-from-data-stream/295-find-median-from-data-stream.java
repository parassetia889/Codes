class MedianFinder {

    private PriorityQueue<Integer> minH = new PriorityQueue<Integer>();
    private PriorityQueue<Integer> maxH =  new PriorityQueue<Integer>(Collections.reverseOrder());
    
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        
        maxH.add(num);
        minH.add(maxH.poll());
        
        if(maxH.size() < minH.size())
            maxH.add(minH.poll());
    }
    
    public double findMedian() {
        
        if(maxH.size() == minH.size())
            return (maxH.peek() + minH.peek())/2.0;
        
        return maxH.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */