class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> deque = new LinkedList<>();

        ArrayList<Integer> result = new ArrayList<>();
        int currIndex = 0;
        
        for(currIndex = 0; currIndex < k; currIndex++) {
            while (!deque.isEmpty() && nums[currIndex] >= nums[deque.peekLast()]) {
                deque.removeLast();
            }

            deque.addLast(currIndex);
        }
            for (; currIndex < nums.length; currIndex++){
                result.add(nums[deque.peek()]);

            //remove the elements which are outside of window
            if(!deque.isEmpty() && deque.peek() <= currIndex-k) {
                deque.removeFirst();
            }

            while (!deque.isEmpty() && nums[currIndex] >= nums[deque.peekLast()]) {
                deque.removeLast();
            }

            deque.addLast(currIndex);

        }
        result.add(nums[deque.peek()]);
            deque.clear();
            int [] resultant = new int[result.size()];
            for (int i = 0; i< result.size(); i++)
                resultant[i] = result.get(i);

            return resultant;
    }
}