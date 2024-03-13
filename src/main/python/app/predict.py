from flask import Flask, request, jsonify
import tensorflow as tf
import numpy as np


# Load the model
model = tf.keras.models.load_model('../ml_models/fungus_model.h5')

# Create the Flask app
app = Flask(__name__)

@app.route('/predict', methods=['POST'])
def predict():
    data = request.get_json()
    input_data = pd.DataFrame(data, index=[0])
    print(input_data)