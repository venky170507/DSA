package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threesum(int[] arr)
    {
        List<List<Integer>> ans = new ArrayList<>();
        int n= arr.length;
        Arrays.sort(arr);

        for (int i=0;i<n-2;i++) 
        {
            if (i>0 && arr[i]==arr[i - 1]) continue;
            HashSet<Integer> set = new HashSet<>();
            for (int j=i+1;j<n;j++) 
            {
                int rq = -(arr[i] + arr[j]);
                if (set.contains(rq)) 
                {
                  List<Integer> temp = new ArrayList<>();
                  temp.add(arr[i]);
                  temp.add(rq);
                  temp.add(arr[j]);
                  ans.add(temp);
                    while (j+1<n && arr[j]==arr[j + 1]) 
                    {
                        j++;
                    }
                }
               set.add(arr[j]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};


        // Brute - Force (Time Limit Exceeded)
        // List<List<Integer>> res = new ArrayList<>();
        // Set<List<Integer>> st = new HashSet<>();

        // int n= arr.length;

        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         for(int k=j+1;k<n;k++)
        //         {
        //             if(arr[i]+arr[j]+arr[k]==0)
        //             {
        //                 List<Integer> temp = new ArrayList<>();
        //                 temp.add(arr[i]);
        //                 temp.add(arr[j]);
        //                 temp.add(arr[k]);


        //                 Collections.sort(temp);

        //                 st.add(temp);
        //             }
        //         }
        //     }
        // }

        // res.addAll(st);
        // System.out.println(res);

        // Set<List<Integer>> st = new HashSet<>();
        // List<List<Integer>> ans = new ArrayList<>();

        // int n=arr.length;

        // for(int i=0;i<n;i++)
        // {
        //     Set<Integer> hashset = new HashSet<>();
        //     for(int j=i+1;j<n;j++)
        //     {
        //         int third = -(arr[i]+arr[j]);
        //         if(hashset.contains(third))
        //         {
        //             List<Integer> temp = Arrays.asList(arr[i],arr[j],third);    
        //             Collections.sort(temp);
        //             st.add(temp);
        //         }
        //         hashset.add(arr[j]);
        //     }
        // }

        // ans.addAll(st);
        // System.out.println(ans);




        // Optimal Approach 

        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);

        for(int i=0;i<n;i++)
        {
            if(i>0 && arr[i]==arr[i-1])
            {
                continue;
            }
            int j=i+1;
            int k=n-1;

            while(j<k)
            {
                int sum = arr[i]+arr[j]+arr[k];

                if(sum<0)
                {
                    j++;
                }
                else if(sum>0)
                {
                    k--;
                }
                else
                {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    ans.add(temp);

                    j++;
                    k--;

                    while(j<k && arr[j]==arr[j-1]) j++;
                    while(j<k && arr[k]==arr[k+1]) k--;
                }
            }
        }
        System.out.println(ans);
    }
}



/*


#include <iostream>
#include <vector>
#include <algorithm>
#include <unordered_set>

using namespace std;

vector<vector<int>> threesum(vector<int>& arr)
{
    vector<vector<int>> ans;
    int n=arr.size();
    sort(arr.begin(),arr.end());
    for(int i=0;i<n-2;i++)
    {
        if(i>0 && arr[i]==arr[i-1])
            continue;
        unordered_set<int> set;
        for(int j=i+1;j<n;j++)
        {
            int rq=-(arr[i]+arr[j]);
            if(set.find(rq)!=set.end())
            {
                vector<int> temp;
                temp.push_back(arr[i]);
                temp.push_back(rq);
                temp.push_back(arr[j]);
                ans.push_back(temp);
                while(j+1<n && arr[j]==arr[j+1])
                    j++;
            }
            set.insert(arr[j]);
        }
    }
    return ans;
}

int main()
{
    int n;
    cout<<"Enter no of elements: ";
    cin>>n;
    vector<int> arr(n);
    cout<<"Enter the elements:"<<endl;
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    vector<vector<int>> ans=threesum(arr);
    cout<<"Triplets whose sum is 0:"<<endl;
    for(auto triplet:ans)
    {
        cout<<"[";
        for(int i=0;i<triplet.size();i++)
        {
            cout<<triplet[i];
            if(i!=triplet.size()-1)
                cout<<", ";
        }
        cout<<"]"<<endl;
    }
    return 0;
}
*/