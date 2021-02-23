package file.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDAO {
	
	//존재하는 파일이 있는지 확인 후 반환
	public boolean checkName(String file) {
	return new File(file).exists();	
	}
	
	//매개변수로 받은 파일 명에 문자열 저장
	public void fileSave(String file,String s) {
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream(file))){
			dos.writeUTF(s);
		}catch(IOException e) {
			e.printStackTrace();
		}	
	}
	//매개변수로 받은 파일 명을 이용하여 저장 되어 있는 데이터 반환
	public StringBuilder fileOpen(String file) {
		StringBuilder sb= new StringBuilder();
		try(DataInputStream dis=new DataInputStream(new FileInputStream(file))){
			while(true) {
				sb.append(dis.readUTF());
			}
		}catch(IOException e) {			
		}
		return sb;
	}
	//매개변수로 받은 파일 명에 문자열 저장
	public void  fileEdit(String file,String s) {	
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream(file))){
			dos.writeUTF(s);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
