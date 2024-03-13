#!/usr/bin/env python
# coding: utf-8

# In[4]:


import tensorflow as tf
import pandas as pd


# In[5]:


# Load the dataset
df = pd.read_csv('../../dataset/TARP_preprocessed.csv')


# In[6]:


# Split the dataset into training and testing
train_dataset = df.sample(frac=0.8, random_state=0)
test_dataset = df.drop(train_dataset.index)
X_train = train_dataset.drop('Percentage', axis=1)
y_train = train_dataset['Percentage']
X_test = test_dataset.drop('Percentage', axis=1)
y_test = test_dataset['Percentage']


# In[7]:


# Create the model
model = tf.keras.models.Sequential([
    tf.keras.layers.Dense(64, activation='relu', input_shape=[len(X_train.keys())]),
    tf.keras.layers.Dense(64, activation='relu'),
    tf.keras.layers.Dense(1)
])

# Compile the model
model.compile(optimizer='adam', loss='mean_squared_error')

# Train the model
model.fit(X_train, y_train, epochs=200)

# Evaluate the model
model.evaluate(X_test, y_test, verbose=2)

