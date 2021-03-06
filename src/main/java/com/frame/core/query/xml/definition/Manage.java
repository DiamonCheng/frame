package com.frame.core.query.xml.definition;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Defferson.Cheng on 2017/1/8.
 */
public class Manage {
    private List<ManageField> field;
    private String beforeManage;
    private Method beforeManageMethod;
    private String AfterManage;
    private Method AfterManageMethod;

    public List<ManageField> getField() {
        return field;
    }
    public void setField(List<ManageField> field) {
        this.field = field;
    }
    @XmlAttribute
    public String getBeforeManage() {
        return beforeManage;
    }

    public void setBeforeManage(String beforeManage) {
        this.beforeManage = beforeManage;
    }
    @XmlTransient
    public Method getBeforeManageMethod() {
        return beforeManageMethod;
    }

    public void setBeforeManageMethod(Method beforeManageMethod) {
        this.beforeManageMethod = beforeManageMethod;
    }
    public List<ManageField> cloneFields() throws CloneNotSupportedException {
        ArrayList<ManageField> res=new ArrayList<ManageField>(field.size());
        for(ManageField manageField:field){
            res.add((ManageField) manageField.clone());
        }
        return res;
    }
    private List<String> requiredJsPath;
	private List<String> requiredCssPath;
	@XmlElement(name="path")
	@XmlElementWrapper(name = "js")
	public List<String> getRequiredJsPath() {
		return requiredJsPath;
	}
	public void setRequiredJsPath(List<String> requiredJsPath) {
		this.requiredJsPath = requiredJsPath;
	}
	@XmlElement(name="path")
	@XmlElementWrapper(name = "css")
	public List<String> getRequiredCssPath() {
		return requiredCssPath;
	}
	public void setRequiredCssPath(List<String> requiredCssPath) {
		this.requiredCssPath = requiredCssPath;
	}
	@XmlAttribute
	public String getAfterManage() {
		return AfterManage;
	}
	public void setAfterManage(String afterManage) {
		AfterManage = afterManage;
	}
	@XmlTransient
	public Method getAfterManageMethod() {
		return AfterManageMethod;
	}
	public void setAfterManageMethod(Method afterManageMethod) {
		AfterManageMethod = afterManageMethod;
	}
}
