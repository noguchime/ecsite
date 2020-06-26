//DBテーブルの１レコードを表すクラスを格納
package jp.co.internous.ecsite.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entityを付与するとSpring機能により当該クラスはEntityとして振る舞う
@Entity
//＠tableはDBにあるどのテーブルの実体なのかを指定
@Table(name="user")
public class User {
	
	//primary keyであることを指定
	@Id
	//テーブルのどのカラムとマッピングするかを指定
	@Column(name="id")
	//IDフィールドの振る舞いを指定。今回はAuto_increment。
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="full_name")
	private String fullName;
	
	@Column(name="is_admin")
	private int isAdmin;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id=id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName=fullName;
	}
	public int getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(int isAdmin) {
		this.isAdmin=isAdmin;
	}
}
