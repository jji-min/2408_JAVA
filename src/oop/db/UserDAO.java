package oop.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private MyDAO myDAO;

    public UserDAO() {
        this.myDAO = new MyDAO();
    }

    public List<UserDTO> getUsers(int limit, int offset) {
        List<UserDTO> users = new ArrayList<>();
        String sql = "select * from users limit ? offset ?"; // prepare statement를 세팅하기 위해 '?' 사용

        try (
                Connection conn = this.myDAO.getConnection(); // connection 객체 획득
                PreparedStatement ps = conn.prepareStatement(sql); // PrepareStatement 세팅
                // 리소스를 획득하는 처리
                // try에 위와 같이 적으면 에러나서 catch로 가면 자동으로 커넥션 close됨
            ) {
            ps.setInt(1, limit); // 세팅할 데이터 타입
            ps.setInt(2, offset); // 1, 2는 물음표 순서

            try (ResultSet rs = ps.executeQuery()) { // 쿼리를 실행하고 결과를 ResultSet으로 가져옴
                while (rs.next()) {
                    UserDTO user = new UserDTO();
                    user.setUserId(rs.getLong("user_id")); // 데이터베이스의 컬럼명 이용해서 가져옴, 가져오는 데이터타입마다 달라짐
                    // BigInt라서 long으로 가져옴, int면 getInt()
                    user.setName(rs.getString("name"));
                    user.setPassword(rs.getString("password"));
                    user.setAccount(rs.getString("account"));
                    user.setProfile(rs.getString("profile"));
                    user.setGender(rs.getString("gender"));
                    user.setRefreshToken(rs.getString("refresh_token"));
                    user.setCreatedAt(rs.getString("created_at"));
                    user.setUpdatedAt(rs.getString("updated_at"));
                    user.setDeletedAt(rs.getString("deleted_at"));

                    users.add(user);
                    // 다음 데이터가 없으면 false를 return하고 종료됨
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return users;
    }
}
