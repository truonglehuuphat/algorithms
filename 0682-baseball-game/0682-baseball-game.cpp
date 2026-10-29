class Solution {
public:
    int calPoints(vector<string>& operations) {
        stack<int> st;
        for(string  c : operations){
            if(c == "C"){
                st.pop();
            } else if(c == "D"){
                int temp = st.top() * 2;
                st.push(temp);
            } else if (c == "+"){
                int sum_temp = 0;
                int first = st.top();
                st.pop();
                sum_temp += first;
                int second = st.top();
                sum_temp += second;
                st.push(first);
                st.push(sum_temp);
            } else {
                st.push(stoi(c));
            }
        }
        int ans = 0;
        while(!st.empty()){
            ans += st.top();
            st.pop();
        }
        return ans;
    }
};