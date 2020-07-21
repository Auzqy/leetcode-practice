-- 题目要求： https://leetcode-cn.com/problems/combine-two-tables/submissions/
select FirstName, LastName, City, State from Person p left join Address a  on p.PersonId = a.PersonId where p.PersonId;