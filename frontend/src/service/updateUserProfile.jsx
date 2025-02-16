export const updateUserProfile = async (userId, userProfileUpdateRequest) => {
  const response = await fetch(`http://localhost:8080/users/${userId}`, {
    method: 'PUT',
    headers: {
      'Content-Type': 'application/json',
    },
    body: JSON.stringify(userProfileUpdateRequest),
  });

  if (!response.ok) {
    throw new Error('Failed to update profile');
  }

  return response.json();
};
