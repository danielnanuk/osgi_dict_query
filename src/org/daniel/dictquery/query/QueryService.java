package org.daniel.dictquery.query;

/**
 * 字典查询服务接口
 * 
 * @author daniel
 *
 */
public interface QueryService {
	/**
	 * 根据输入的单词，查询结果
	 * 
	 * @param word
	 *            要查询的单词
	 * @return　查询结果
	 */
	String queryWord(String word);
}
