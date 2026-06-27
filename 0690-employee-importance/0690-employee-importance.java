/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int total = 0;
        Map<Integer, Employee> map = new HashMap<>();
        for(Employee employee: employees){
            map.put(employee.id, employee);
        }
        Queue<Employee> q = new LinkedList<>();
        q.offer(map.get(id));
        while(!q.isEmpty()){
            Employee curEmp = q.poll();
            total += curEmp.importance;
            for(int idSub: curEmp.subordinates){
                q.offer(map.get(idSub));
            }
        }
        return total;
    }
}