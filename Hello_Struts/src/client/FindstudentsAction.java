package client;

import java.rmi.RemoteException;

import org.apache.struts2.ServletActionContext;

import service.DemoServiceStub;
import service.QueryStudents;
import service.QueryStudentsResponse;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.xsd.Student;

public class FindstudentsAction extends ActionSupport {
	public String execute() throws Exception {
		// 设置远程服务调用地址
		String target = "http://127.0.0.1:8080/axis2/services/DemoService";
		try { // 根据地址构造用户存根
			DemoServiceStub stub = new DemoServiceStub(target); // 调用查询学生列表方法
			QueryStudentsResponse qsr = stub.queryStudents(new QueryStudents()); // 返回学生类型对象数组
			Student[] sts = qsr.get_return(); // 将数组输出至前台页面
			ActionContext.getContext().getSession().put("username","username");
			ActionContext.getContext().getSession().put("sts", sts);
			ActionContext.getContext().put("sts2", sts);
			ServletActionContext.getRequest().setAttribute("sts3", sts);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

}
