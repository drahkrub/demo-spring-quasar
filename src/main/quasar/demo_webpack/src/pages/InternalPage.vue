<template>
  <q-page style="max-width: 400px">
    <q-card>
      <q-card-section>
        <q-tabs>
          <q-route-tab label="tab1" to="/internal/tab1" />
          <q-route-tab label="tab2" to="/internal/tab2" />
          <q-route-tab label="tab3" to="/internal/tab3" />
        </q-tabs>
      </q-card-section>
      <q-card-section>
        <router-view />
      </q-card-section>
      <q-card-section> JSON: {{ json }} </q-card-section>
      <q-card-section>
        <q-btn icon="keyboard_arrow_left" label="back" to="/" />
        <q-btn icon="keyboard_double_arrow_left" label="home" href="/" />
      </q-card-section>
    </q-card>
  </q-page>
</template>

<script setup>
import { ref, onMounted } from "vue";

const json = ref(null);

const fetchJson = () => {
  console.log("MOUNTED!");
  fetch("/api")
    .then((response) => response.json())
    .then((data) => {
      json.value = data;
    })
    .catch((error) => console.error(error));
};

onMounted(fetchJson);
</script>
