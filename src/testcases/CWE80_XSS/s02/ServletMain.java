package testcases.CWE80_XSS.s02;

import javax.servlet.http.*;

public class ServletMain extends HttpServlet {

	private static final long serialVersionUID = 1L; /* needed since Servlets are serializable */
	
	

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		doGetCWE1(request, response);
		doGetCWE2(request, response);
		doGetCWE3(request, response);
		doGetCWE4(request, response);
		doGetCWE5(request, response);
		doGetCWE6(request, response);
		doGetCWE7(request, response);
		doGetCWE8(request, response);
		doGetCWE9(request, response);
	}
	
	private static void doGetCWE1(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-1 */

			/* END-AUTOGENERATED-SERVLET-TESTS-1 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE1 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}
		
	private static void doGetCWE2(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-2 */

			/* END-AUTOGENERATED-SERVLET-TESTS-2 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE2 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}
		
	private static void doGetCWE3(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-3 */

			/* END-AUTOGENERATED-SERVLET-TESTS-3 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE3 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}

	private static void doGetCWE4(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-4 */

			/* END-AUTOGENERATED-SERVLET-TESTS-4 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE4 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}
		
	private static void doGetCWE5(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-5 */

			/* END-AUTOGENERATED-SERVLET-TESTS-5 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE5 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {

				System.out.println("  " + ste.toString());
			} 
		}
	}		
		
	private static void doGetCWE6(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-6 */

			/* END-AUTOGENERATED-SERVLET-TESTS-6 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE6 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}

	private static void doGetCWE7(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-7 */

			/* END-AUTOGENERATED-SERVLET-TESTS-7 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE7 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}		
	
	private static void doGetCWE8(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-8 */
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_01()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_02()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_03()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_04()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_05()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_06()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_07()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_08()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_09()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_10()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_11()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_12()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_13()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_14()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_15()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_16()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_17()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_21()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_22a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_31()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_41()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_42()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_45()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_51a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_52a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_53a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_54a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_61a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_66a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_67a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_68a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_71a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_72a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_73a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_74a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_75a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_PropertiesFile_81a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_01()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_02()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_03()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_04()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_05()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_06()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_07()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_08()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_09()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_10()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_11()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_12()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_13()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_14()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_15()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_16()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_17()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_21()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_22a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_31()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_41()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_42()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_45()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_51a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_52a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_53a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_54a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_61a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_66a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_67a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_68a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_71a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_72a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_73a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_74a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_75a()).runTest(request, response);
			(new testcases.CWE80_XSS.s02.CWE80_XSS__Servlet_URLConnection_81a()).runTest(request, response);
			/* END-AUTOGENERATED-SERVLET-TESTS-8 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE8 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}	
	
	private static void doGetCWE9(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-9 */

			/* END-AUTOGENERATED-SERVLET-TESTS-9 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE9 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}		
}
