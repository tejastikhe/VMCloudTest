# VMCloudTest

Coding assignment for QA engineer

Assume you are the administrator of a cloud which hosts some finite number of Virtual Machines. Users
of your cloud can borrow or check-out VMs for use. Once they are done using it, they can check-in the VM
back. Once a VM is checked in, as an administrator, you should perform some cleanup on the VM and
then return it back to the pool of VMs. Some points to keep in mind:
• Implement a system that will allow your clients to check-out and check-in VMs from a pool of n
VMs (n <= 100) and help you administer usage of VMs in your cloud.
• When clients need a VM for use, they will call a checkout method provided by your VM
reservation system. They should get the IP of a VM they can use, along with any other details
you may need.
• When clients are done using the VM, they will call a check-in method provided by your VM
reservation system.
• If a client requests a VM and no VM is available to be checked out, then your system should let
your clients know accordingly, so they may retry after some time.
• The same VM cannot be checked out by two clients at the same time.
• A VM checked out by one client cannot be checked in by some other client.
• If your system stops running for some reason and needs to be restarted, then it should continue
to know all the information about VMs that have been already checked out and VMs that are
available.
• Make sure you write appropriate test cases for the assignment. It would be great if you could
indicate the code coverage achieved by these test cases.
• The program should be implemented as a server against which the user can use the functionality
with REST APIs.
• Please host the code in a Github repository with clear information on how to use as part of the
README.
• Note: You can mimic VMs in the form of objects.

-Maven Project.
-TestNG Integration.
-Logic to create the Cloud ENV (Since there is not application we need that first.)
-Extent Report Integration
-Code under GIT version control Tool and can be easily integrated under Jenkins on local or cloud.
