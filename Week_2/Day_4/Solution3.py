class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        result=[]
        def gen(s,open,close):
            if len(s)==2*n:
                result.append(s)
                return
            if open<n:
                gen(s+"(",open+1,close)
            if close<open:
                gen(s+")",open,close+1)
        gen("",0,0)
        return result
