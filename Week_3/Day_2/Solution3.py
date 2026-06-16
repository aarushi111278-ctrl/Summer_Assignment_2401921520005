class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        values=[]
        while head:
            values.append(head.val)
            head=head.next
        left=0
        right=len(values)-1
        while left<right:
            if values[left]!=values[right]:
                return False
            left=left+1
            right=right-1
        return  True
