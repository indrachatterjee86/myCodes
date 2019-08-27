#include <iostream>
#include <thread>
#include <future>

void initiazer(std::promise<int> * promObj)
{
    std::cout<<"Inside Thread"<<std::endl;   
    sleep(5);
    promObj->set_value(35);
}

int main()
{
    std::promise<int> promiseObj;
    std::future<int> futureObj = promiseObj.get_future();
    /**
     * Pass the promise object to the thread to write date
     */
    std::thread th(initiazer, &promiseObj);
    /**
     * Main thread is blocked here until initiazer thread writes on promise object
     */
    std::cout<<futureObj.get()<<std::endl;
    std::cout<<"Here in main Thread"<<std::endl;
    th.join();
    return 0;
}
