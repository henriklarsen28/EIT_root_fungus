import numpy as np
import pandas as pd
import tensorflow as tf
from flask import Flask, jsonify, request

# Load the model
model = tf.keras.models.load_model("../ml_models/fungus_model.h5")

# Create the Flask app
app = Flask(__name__)


@app.route("/predict", methods=["POST"])
def predict():
    data = request.get_json()
    # print(data)
    input_data = pd.DataFrame(data)
    # Rename the columns

    input_data.drop(columns=["timestamp", "deviceId"], inplace=True)
    input_data.rename(
        columns={
            "moisture": "Soil moisture (%)",
            "temperature": "Air temperature (C)",
            "humidity": "Air humidity (%)",
            "wind_speed": "Wind speed (Km/h)",
            "wind_speed_gust": "Wind gust (Km/h)",
        },
        inplace=True,
    )

    print(input_data.head(1))
    # print(input_data)
    output_data = model.predict(input_data.head(1))
    # output_data = 5.4
    output_data = output_data[0][0]
    rounded_output = round(output_data, 2)
    rounded_output = float(rounded_output)
    return jsonify(rounded_output)  # jsonify({"prediction": output_data.tolist()}


if __name__ == "__main__":
    app.run(debug=True)
