package ch17.Ex11;

//Map<K,V> : K <= key, V <= value 형식으로 데이터를 저장
	//key는 중복될 수 없다. <=set으로 관리 (index 아님. index는 0부터 컴파일러(jvm)가 할당함)
	//value는 중복된 값을 넣을 수 있다.

	//HashMap: 랜덤하게 출력됨
	//HashTable: 모든 메소드가 동기화 되어 있다. 멀티스레드 환경에 적합함
				//모든 메소드는 hashMap과 동일

//HashMap VS LinkedHashMap
	//hashMap<K,V> : 입력과 출력이 다를 수 있다. 랜덤하게 출력됨
	//LinkedHashMap<K,V> : key는 링크되어있다. 앞의 값과 뒤의 값의 정보를 가진다. 입력 순서대로 출력됨


import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapMethod {
	public static void main(String[] args) {
		Map<Integer, String>linkedhashMap1=new LinkedHashMap<>();
		
		//1 put(K key,V value): 값을 넣을 때 
		linkedhashMap1.put(2, "나다라");
		linkedhashMap1.put(1, "가나다");
		linkedhashMap1.put(3, "다라마");
		linkedhashMap1.put(3, "다"); //키는 중복 저장될 수 없음. 중복값을 넣을 경우 기존의 값이 수정됨
		System.out.println(linkedhashMap1);
		
		//2 putAll(다른 맵 객체) : 다른 맵으로 복사해서 저장
		Map<Integer, String> linkedHashMap2=new LinkedHashMap<>();
		linkedHashMap2.putAll(linkedhashMap1);
		System.out.println(linkedHashMap2);
		
		//3 replace(K key,V value): 기존의 key에 저장된 value를 수정
		linkedHashMap2.replace(1, "가가가");
		linkedHashMap2.replace(4, "라라라");//key 4는 존재하지 않음. 예외는 발생하지 않음
		System.out.println(linkedHashMap2);
		
		//4 replace(K key, V oldValue, V newValue): oldValue를 newValue로 수정
		linkedHashMap2.replace(1, "가가가", "나나나"); //key나 oldValue값이 다르면 수정되지 않음(예외 발생되지 않음)
		linkedHashMap2.replace(2, "다다다", "라라라"); //정확히 일치해야 수정됨. 미동작
		System.out.println(linkedHashMap2);
		
		//5 get(Object key): Map의 값을 가져올 때 사용. key를 넣어야 key에 할당된 value를 가져옴
		System.out.println(linkedHashMap2.get(1)); //주의! index가 아니라 key
		System.out.println(linkedHashMap2.get(2));
		System.out.println(linkedHashMap2.get(3));
		
		//6 containsKey(Object key): 맵에 해당 키가 존재하는지 확인 true or false 리턴
		System.out.println(linkedHashMap2.containsKey(1)); //true
		System.out.println(linkedHashMap2.containsKey(4)); //false
		
		//7 containsValue(Object value): 맵에 해당 값이 존재하는지 확인. true or false
		System.out.println(linkedHashMap2.containsValue("나나나")); //true
		System.out.println(linkedHashMap2.containsValue("하하하")); //false
		
		//8 Set<K> keySet(): 키만 추출
		Set<Integer> keySet=linkedHashMap2.keySet(); //hashMap2에 저장된 key들을 추출
		System.out.println(keySet);
		
		//9 Set<Map.Entry<K,V>> entrySet(): 엔트리(set)를 추출(엔트리: 키와 값의 묶음)
		Set<Map.Entry<Integer, String>> entrySet=linkedHashMap2.entrySet();
		System.out.println(entrySet);
		
		//10 size() : 총 개수
		System.out.println(linkedHashMap2.size());
		
		//11 remove(Object key) : key를 넣어서 value를 삭제
		linkedHashMap2.remove(1);
		linkedHashMap2.remove(4); //미동작
		System.out.println(linkedHashMap2);
		
		//12 remove(Object key, Object value): key와 value가 정확히 일치할 때 삭제
		linkedHashMap2.remove(2, "나다라");
		linkedHashMap2.remove(3, "다다다"); //미동작. 
		System.out.println(linkedHashMap2);
		
		//13 clear(): 모두 삭제
		linkedHashMap2.clear();
		System.out.println(linkedHashMap2);
		
	}
}

