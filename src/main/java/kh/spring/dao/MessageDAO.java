package kh.spring.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.spring.dto.MessageDTO;

@Repository
public class MessageDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public int insert(MessageDTO dto) throws Exception {
		return mybatis.insert("Message.insert",dto);
	}
	
	public int delete(int seq) throws Exception {
		return mybatis.delete("Message.delete",seq);
	}
	
	public int update(MessageDTO dto) throws Exception {;
	return mybatis.update("Message.update",dto);
	}
	
	public List<MessageDTO> select(int seq) throws Exception {
		return mybatis.selectList("Message.select",seq);
	}


}
