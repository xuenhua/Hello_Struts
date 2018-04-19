

/**
 * DemoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */

    package service;

    /*
     *  DemoService java interface
     */

    public interface DemoService {
          

        /**
          * Auto generated method signature
          * 
                    * @param getGreeting0
                
         */

         
                     public service.GetGreetingResponse getGreeting(

                        service.GetGreeting getGreeting0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getGreeting0
            
          */
        public void startgetGreeting(

            service.GetGreeting getGreeting0,

            final service.DemoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param queryStudents2
                
         */

         
                     public service.QueryStudentsResponse queryStudents(

                        service.QueryStudents queryStudents2)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param queryStudents2
            
          */
        public void startqueryStudents(

            service.QueryStudents queryStudents2,

            final service.DemoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    