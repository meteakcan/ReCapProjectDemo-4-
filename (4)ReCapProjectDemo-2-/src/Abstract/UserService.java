package Abstract;

import Entity.User;

public interface UserService {
	public void register(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
}
