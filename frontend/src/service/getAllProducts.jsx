
export const getAllProducts = async () => {
    try {
      const response = await fetch('http://localhost:9090/store/1/product', {
        method: 'GET',
        headers: {
          'Content-Type': 'application/json',
        },
      });
  
      if (!response.ok) {
        throw new Error('Failed to fetch products');
      }
  
      return response.json(); // Parse and return the JSON data
    } catch (error) {
      console.error('Error fetching products:', error);
      throw error; // Re-throw the error for handling in the calling component
    }
  };