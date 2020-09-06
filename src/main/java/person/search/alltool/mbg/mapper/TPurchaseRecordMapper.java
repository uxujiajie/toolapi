package person.search.alltool.mbg.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import person.search.alltool.mbg.model.TPurchaseRecord;
import person.search.alltool.mbg.model.TPurchaseRecordExample;

import java.util.List;
@Mapper
public interface TPurchaseRecordMapper {
    int countByExample(TPurchaseRecordExample example);

    int deleteByExample(TPurchaseRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TPurchaseRecord record);

    int insertSelective(TPurchaseRecord record);

    List<TPurchaseRecord> selectByExample(TPurchaseRecordExample example);

    TPurchaseRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TPurchaseRecord record, @Param("example") TPurchaseRecordExample example);

    int updateByExample(@Param("record") TPurchaseRecord record, @Param("example") TPurchaseRecordExample example);

    int updateByPrimaryKeySelective(TPurchaseRecord record);

    int updateByPrimaryKey(TPurchaseRecord record);
}