package webdeveloper_one.doitjava.present;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PresentDAO {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/hyejun_db?serverTimezone=UTC";
	private String username = "root";
	private String password = "1231";
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public PresentDAO() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void getConnection() {
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Map selectAllMember() {
		Map map = new HashMap();
		getConnection();
		String sql = "select * from membertbl";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberBean member = new MemberBean();
				member.setId(rs.getString("id"));
				member.setPwd(rs.getString("pwd"));
				member.setName(rs.getString("name"));
				map.put(member.getId(), member.getPwd());
			}
		}catch(SQLException e) {
			e.printStackTrace();
			map = null;
		}finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return map;
	}

	public void checkAttendance(String type, Object search, String status) {
		getConnection();
		String sql = "update studenttbl set " + status + "=now() where " + type + "=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setObject(1, search);

			pstmt.executeUpdate();// 실행

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public ArrayList<StudentBean> studentList() {
		ArrayList<StudentBean> array = new ArrayList<StudentBean>();
		getConnection();
		String sql = "select * from studenttbl";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				StudentBean student = new StudentBean();
				student.setStudentNumber(rs.getInt("studentnumber"));
				student.setName(rs.getString("name"));
				student.setAge(rs.getInt("age"));
				student.setAddress(rs.getString("address"));
				student.setEmail(rs.getString("email"));
				student.setPhone(rs.getString("phone"));
				student.setStartCheck(rs.getTime("startCheck"));
				student.setEndCheck(rs.getTime("endCheck"));
				student.setTodayq(rs.getInt("todayq"));
				student.setWeekq(rs.getInt("weekq"));
				student.setMprojectq(rs.getInt("mprojectq"));
				student.setProjectq(rs.getInt("projectq"));
				student.setPosition(rs.getString("position"));
				student.setPositionpoint(rs.getInt("positionpoint"));
				array.add(student);
			}
		}catch(SQLException e) {
			e.printStackTrace();
			array = null;
		}finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return array;
	}

	public int allStudentCount() {
		getConnection();
		String sql = "select count(*) from studenttbl";
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				result = rs.getInt("count(*)");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public int attendanceCount() {
		getConnection();
		String sql = "select count(*) from studenttbl where startCheck <= '09:00:00' and endCheck >= '18:00:00'";
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				result = rs.getInt("count(*)");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public int absenceCount() {
		getConnection();
		String sql = "select count(*) from studenttbl where startCheck is null or endCheck is null or timediff(endCheck, startCheck)<'04:30:00'";
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				result = rs.getInt("count(*)");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public int lateCount() {
		getConnection();
		String sql = "select count(*) from studenttbl where startCheck > '09:00:00' and timediff(endCheck, startCheck)>='04:30:00'";
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				result = rs.getInt("count(*)");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public int earlyLeaveCount() {
		getConnection();
		String sql = "select count(*) from studenttbl where endCheck < '18:00:00' and timediff(endCheck, startCheck)>='04:30:00'";
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				result = rs.getInt("count(*)");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public void resetData() {
		getConnection();
		String sql = "update studenttbl set startCheck = null, endCheck = null";
		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.executeUpdate();// 실행

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
