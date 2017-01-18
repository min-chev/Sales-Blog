package softuniBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import softuniBlog.entity.Message;


public interface MsgRepository extends JpaRepository<Message,Integer>{
}
